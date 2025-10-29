package org.example;

import com.google.gson.Gson;
import org.example.dto.Forecast;
import org.example.dto.WeatherResponse;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class Main {
    // ключ изменен, если есть необходимость проверить работоспособность, то используйте свой
    private final static String API_KEY = "0ca2687a-52d6-403b";
    private final static String BASE_URL = "https://api.weather.yandex.ru/v2/forecast?lat=%1$s&lon=%2$s&limit=%3$s";

    public static void main(String[] args) {
        String url = preparedUrl(54.7104, 20.4522, 5);
//      делаем запрос
        String request = executeGet(url);
//        выводим результат "как есть"
        System.out.println(request);
        Gson gson = new Gson();
        WeatherResponse wr = gson.fromJson(request, WeatherResponse.class);
//        Выводим текущую температуру
        System.out.println(wr.getFact().getTemp());
//      выводим среднюю температуру
        System.out.println(tempAvg(wr.getForecasts()));

    }

    public static String preparedUrl(double lat, double lon, int limit) {
        return String.format(BASE_URL, lat, lon, limit);
    }

    public static double tempAvg(List<Forecast> forecasts) {
        if (forecasts == null || forecasts.isEmpty()) return 0;

        double avg = 0;

        for (Forecast forecast : forecasts) {
            avg += forecast.getParts().getDay().getTempAvg();
        }

        if (avg == 0)
            return 0;

        return avg / forecasts.size();
    }


    public static String executeGet(String targetURL) {
        HttpURLConnection connection = null;

        try {
            //Create connection
            URL url = new URL(targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            connection.setRequestProperty("X-Yandex-Weather-Key", API_KEY);

            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}

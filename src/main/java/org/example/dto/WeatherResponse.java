package org.example.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResponse {
    @SerializedName("now")
    private long now;

    @SerializedName("now_dt")
    private String nowDt;

    @SerializedName("info")
    private Info info;

    @SerializedName("fact")
    private Fact fact;

    @SerializedName("forecasts")
    private List<Forecast> forecasts;

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public String getNowDt() {
        return nowDt;
    }

    public void setNowDt(String nowDt) {
        this.nowDt = nowDt;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}

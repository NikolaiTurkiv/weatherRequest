package org.example.dto;

import com.google.gson.annotations.SerializedName;

public class Hour {
    @SerializedName("hour")
    private String hour;

    @SerializedName("hour_ts")
    private long hourTs;

    @SerializedName("cloudness")
    private double cloudness;

    @SerializedName("condition")
    private String condition;

    @SerializedName("feels_like")
    private int feelsLike;

    @SerializedName("humidity")
    private int humidity;

    @SerializedName("icon")
    private String icon;

    @SerializedName("prec_mm")
    private double precMm;

    @SerializedName("prec_period")
    private int precPeriod;

    @SerializedName("prec_prob")
    private int precProb;

    @SerializedName("prec_strength")
    private double precStrength;

    @SerializedName("prec_type")
    private int precType;

    @SerializedName("pressure_mm")
    private int pressureMm;

    @SerializedName("pressure_pa")
    private int pressurePa;

    @SerializedName("temp")
    private int temp;

    @SerializedName("uv_index")
    private int uvIndex;

    @SerializedName("temp_water")
    private int tempWater;

    @SerializedName("wind_angle")
    private int windAngle;

    @SerializedName("wind_dir")
    private String windDir;

    @SerializedName("wind_gust")
    private double windGust;

    @SerializedName("wind_speed")
    private double windSpeed;

    // Дополнительные поля (есть не во всех)
    @SerializedName("cloud_cover_high")
    private Integer cloudCoverHigh;

    @SerializedName("cloud_cover_middle")
    private Integer cloudCoverMiddle;

    @SerializedName("cloud_cover_low")
    private Integer cloudCoverLow;

    @SerializedName("is_thunder")
    private Boolean isThunder;


    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public long getHourTs() {
        return hourTs;
    }

    public void setHourTs(long hourTs) {
        this.hourTs = hourTs;
    }

    public double getCloudness() {
        return cloudness;
    }

    public void setCloudness(double cloudness) {
        this.cloudness = cloudness;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(int feelsLike) {
        this.feelsLike = feelsLike;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getPrecMm() {
        return precMm;
    }

    public void setPrecMm(double precMm) {
        this.precMm = precMm;
    }

    public int getPrecPeriod() {
        return precPeriod;
    }

    public void setPrecPeriod(int precPeriod) {
        this.precPeriod = precPeriod;
    }

    public int getPrecProb() {
        return precProb;
    }

    public void setPrecProb(int precProb) {
        this.precProb = precProb;
    }

    public double getPrecStrength() {
        return precStrength;
    }

    public void setPrecStrength(double precStrength) {
        this.precStrength = precStrength;
    }

    public int getPrecType() {
        return precType;
    }

    public void setPrecType(int precType) {
        this.precType = precType;
    }

    public int getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(int pressureMm) {
        this.pressureMm = pressureMm;
    }

    public int getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(int pressurePa) {
        this.pressurePa = pressurePa;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public int getTempWater() {
        return tempWater;
    }

    public void setTempWater(int tempWater) {
        this.tempWater = tempWater;
    }

    public int getWindAngle() {
        return windAngle;
    }

    public void setWindAngle(int windAngle) {
        this.windAngle = windAngle;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getCloudCoverHigh() {
        return cloudCoverHigh;
    }

    public void setCloudCoverHigh(int cloudCoverHigh) {
        this.cloudCoverHigh = cloudCoverHigh;
    }

    public int getCloudCoverMiddle() {
        return cloudCoverMiddle;
    }

    public void setCloudCoverMiddle(int cloudCoverMiddle) {
        this.cloudCoverMiddle = cloudCoverMiddle;
    }

    public int getCloudCoverLow() {
        return cloudCoverLow;
    }

    public void setCloudCoverLow(int cloudCoverLow) {
        this.cloudCoverLow = cloudCoverLow;
    }

    public boolean isThunder() {
        return isThunder;
    }

    public void setThunder(boolean thunder) {
        isThunder = thunder;
    }
}
package org.example.dto;

import com.google.gson.annotations.SerializedName;

public class Fact {
    @SerializedName("daytime")
    private String daytime;

    @SerializedName("obs_time")
    private long obsTime;

    @SerializedName("season")
    private String season;

    @SerializedName("source")
    private String source;

    @SerializedName("uptime")
    private long uptime;

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

    @SerializedName("is_thunder")
    private boolean isThunder;

    @SerializedName("polar")
    private boolean polar;

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

    @SerializedName("visibility")
    private int visibility;

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

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public long getObsTime() {
        return obsTime;
    }

    public void setObsTime(long obsTime) {
        this.obsTime = obsTime;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public long getUptime() {
        return uptime;
    }

    public void setUptime(long uptime) {
        this.uptime = uptime;
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

    public boolean isThunder() {
        return isThunder;
    }

    public void setThunder(boolean thunder) {
        isThunder = thunder;
    }

    public boolean isPolar() {
        return polar;
    }

    public void setPolar(boolean polar) {
        this.polar = polar;
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

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
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
}

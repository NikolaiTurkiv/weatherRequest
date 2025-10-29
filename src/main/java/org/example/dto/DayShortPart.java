package org.example.dto;

import com.google.gson.annotations.SerializedName;

public class DayShortPart {

    @SerializedName("daytime")
    private String daytime;

    @SerializedName("_source")
    private String _source;

    @SerializedName("biomet")
    private Biomet biomet;

    @SerializedName("cloudness")
    private double cloudness;

    @SerializedName("condition")
    private String condition;

    @SerializedName("fresh_snow_mm")
    private double freshSnowMm;

    @SerializedName("humidity")
    private int humidity;

    @SerializedName("icon")
    private String icon;

    @SerializedName("polar")
    private boolean polar;

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

    @SerializedName("temp_min")
    private int tempMin;

    @SerializedName("temp_water")
    private int tempWater;

    @SerializedName("feels_like")
    private int feelsLike;

    @SerializedName("uv_index")
    private int uvIndex;

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

    public String get_source() {
        return _source;
    }

    public void set_source(String _source) {
        this._source = _source;
    }

    public Biomet getBiomet() {
        return biomet;
    }

    public void setBiomet(Biomet biomet) {
        this.biomet = biomet;
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

    public double getFreshSnowMm() {
        return freshSnowMm;
    }

    public void setFreshSnowMm(double freshSnowMm) {
        this.freshSnowMm = freshSnowMm;
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

    public boolean isPolar() {
        return polar;
    }

    public void setPolar(boolean polar) {
        this.polar = polar;
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

    public int getTempWater() {
        return tempWater;
    }

    public void setTempWater(int tempWater) {
        this.tempWater = tempWater;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(int feelsLike) {
        this.feelsLike = feelsLike;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
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

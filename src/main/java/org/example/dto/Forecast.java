package org.example.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Forecast {
    @SerializedName("date")
    private String date;

    @SerializedName("date_ts")
    private long dateTs;

    @SerializedName("week")
    private int week;

    @SerializedName("sunrise")
    private String sunrise;

    @SerializedName("sunset")
    private String sunset;

    @SerializedName("rise_begin")
    private String riseBegin;

    @SerializedName("set_end")
    private String setEnd;

    @SerializedName("moon_code")
    private int moonCode;

    @SerializedName("moon_text")
    private String moonText;

    @SerializedName("parts")
    private ForecastParts parts;

    @SerializedName("hours")
    private List<Hour> hours;

    @SerializedName("biomet")
    private Biomet biomet;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getDateTs() {
        return dateTs;
    }

    public void setDateTs(long dateTs) {
        this.dateTs = dateTs;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getRiseBegin() {
        return riseBegin;
    }

    public void setRiseBegin(String riseBegin) {
        this.riseBegin = riseBegin;
    }

    public String getSetEnd() {
        return setEnd;
    }

    public void setSetEnd(String setEnd) {
        this.setEnd = setEnd;
    }

    public int getMoonCode() {
        return moonCode;
    }

    public void setMoonCode(int moonCode) {
        this.moonCode = moonCode;
    }

    public String getMoonText() {
        return moonText;
    }

    public void setMoonText(String moonText) {
        this.moonText = moonText;
    }

    public ForecastParts getParts() {
        return parts;
    }

    public void setParts(ForecastParts parts) {
        this.parts = parts;
    }

    public List<Hour> getHours() {
        return hours;
    }

    public void setHours(List<Hour> hours) {
        this.hours = hours;
    }

    public Biomet getBiomet() {
        return biomet;
    }

    public void setBiomet(Biomet biomet) {
        this.biomet = biomet;
    }
}

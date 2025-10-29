package org.example.dto;

import com.google.gson.annotations.SerializedName;

public class ForecastParts {
    @SerializedName("day")
    private DayPart day;

    @SerializedName("day_short")
    private DayShortPart dayShort;

    public DayShortPart getDayShort() {
        return dayShort;
    }

    public void setDayShort(DayShortPart dayShort) {
        this.dayShort = dayShort;
    }

    public DayPart getDay() {
        return day;
    }

    public void setDay(DayPart day) {
        this.day = day;
    }
// Геттеры и сеттеры
}

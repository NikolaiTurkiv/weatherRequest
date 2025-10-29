package org.example.dto;

import com.google.gson.annotations.SerializedName;

public class Biomet {
    @SerializedName("index")
    private int index;

    @SerializedName("condition")
    private String condition;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    // Геттеры и сеттеры
}
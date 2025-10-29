package org.example.dto;

import com.google.gson.annotations.SerializedName;

public class TzInfo {
    @SerializedName("name")
    private String name;

    @SerializedName("abbr")
    private String abbr;

    @SerializedName("dst")
    private boolean dst;

    @SerializedName("offset")
    private int offset;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public boolean isDst() {
        return dst;
    }

    public void setDst(boolean dst) {
        this.dst = dst;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}

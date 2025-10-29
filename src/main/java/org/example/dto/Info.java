package org.example.dto;

import com.google.gson.annotations.SerializedName;

public class Info {
    @SerializedName("n")
    private boolean n;

    @SerializedName("url")
    private String url;

    @SerializedName("lat")
    private double lat;

    @SerializedName("lon")
    private double lon;

    @SerializedName("tzinfo")
    private TzInfo tzinfo;

    @SerializedName("def_pressure_mm")
    private int defPressureMm;

    @SerializedName("def_pressure_pa")
    private int defPressurePa;

    @SerializedName("zoom")
    private int zoom;

    @SerializedName("nr")
    private boolean nr;

    @SerializedName("ns")
    private boolean ns;

    @SerializedName("nsr")
    private boolean nsr;

    @SerializedName("p")
    private boolean p;

    @SerializedName("f")
    private boolean f;

    @SerializedName("_h")
    private boolean _h;

    public boolean isN() {
        return n;
    }

    public void setN(boolean n) {
        this.n = n;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public TzInfo getTzinfo() {
        return tzinfo;
    }

    public void setTzinfo(TzInfo tzinfo) {
        this.tzinfo = tzinfo;
    }

    public int getDefPressureMm() {
        return defPressureMm;
    }

    public void setDefPressureMm(int defPressureMm) {
        this.defPressureMm = defPressureMm;
    }

    public int getDefPressurePa() {
        return defPressurePa;
    }

    public void setDefPressurePa(int defPressurePa) {
        this.defPressurePa = defPressurePa;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public boolean isNr() {
        return nr;
    }

    public void setNr(boolean nr) {
        this.nr = nr;
    }

    public boolean isNs() {
        return ns;
    }

    public void setNs(boolean ns) {
        this.ns = ns;
    }

    public boolean isNsr() {
        return nsr;
    }

    public void setNsr(boolean nsr) {
        this.nsr = nsr;
    }

    public boolean isP() {
        return p;
    }

    public void setP(boolean p) {
        this.p = p;
    }

    public boolean isF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }

    public boolean is_h() {
        return _h;
    }

    public void set_h(boolean _h) {
        this._h = _h;
    }
}

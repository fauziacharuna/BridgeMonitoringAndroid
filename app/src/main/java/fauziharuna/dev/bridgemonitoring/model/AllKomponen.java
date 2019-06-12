package fauziharuna.dev.bridgemonitoring.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllKomponen {

    @SerializedName("komponen_id")
    @Expose
    private Integer komponenId;
    @SerializedName("komponen_name")
    @Expose
    private String komponenName;
    @SerializedName("sistem_name")
    @Expose
    private String sistemName;

    public Integer getKomponenId() {
        return komponenId;
    }

    public void setKomponenId(Integer komponenId) {
        this.komponenId = komponenId;
    }

    public String getKomponenName() {
        return komponenName;
    }

    public void setKomponenName(String komponenName) {
        this.komponenName = komponenName;
    }

    public String getSistemName() {
        return sistemName;
    }

    public void setSistemName(String sistemName) {
        this.sistemName = sistemName;
    }

}




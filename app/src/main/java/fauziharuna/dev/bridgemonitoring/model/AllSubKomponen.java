package fauziharuna.dev.bridgemonitoring.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllSubKomponen {
    @SerializedName("subKomponen_id")
    @Expose
    private Integer subKomponenId;
    @SerializedName("komponen_name")
    @Expose
    private String komponenName;
    @SerializedName("subKomponen_name")
    @Expose
    private String subKomponenName;
    @SerializedName("sistem_name")
    @Expose
    private String sistemName;

    public Integer getSubKomponenId() {
        return subKomponenId;
    }

    public void setSubKomponenId(Integer subKomponenId) {
        this.subKomponenId = subKomponenId;
    }

    public String getKomponenName() {
        return komponenName;
    }

    public void setKomponenName(String komponenName) {
        this.komponenName = komponenName;
    }

    public String getSubKomponenName() {
        return subKomponenName;
    }

    public void setSubKomponenName(String subKomponenName) {
        this.subKomponenName = subKomponenName;
    }

    public String getSistemName() {
        return sistemName;
    }

    public void setSistemName(String sistemName) {
        this.sistemName = sistemName;
    }


}

package fauziharuna.dev.bridgemonitoring.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class KomponenModel {
    @SerializedName("allKomponen")
    @Expose
    private List<AllKomponen> allKomponen = null;

    public List<AllKomponen> getAllKomponen() {
        return allKomponen;
    }

    public void setAllKomponen(List<AllKomponen> allKomponen) {
        this.allKomponen = allKomponen;
    }
}

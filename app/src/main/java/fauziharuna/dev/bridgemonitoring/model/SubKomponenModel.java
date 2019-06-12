package fauziharuna.dev.bridgemonitoring.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubKomponenModel {


    @SerializedName("allSubKomponen")
    @Expose
    private List<AllSubKomponen> allSubKomponen = null;

    public List<AllSubKomponen> getAllSubKomponen() {
        return allSubKomponen;
    }

    public void setAllSubKomponen(List<AllSubKomponen> allSubKomponen) {
        this.allSubKomponen = allSubKomponen;
    }

}

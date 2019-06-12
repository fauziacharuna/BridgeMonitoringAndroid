package fauziharuna.dev.bridgemonitoring.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SistemModel {
    @SerializedName("allSistem")
    @Expose
    private List<AllSistem> allSistem = null;

    public List<AllSistem> getAllSistem() {
        return allSistem;
    }

    public void setAllSistem(List<AllSistem> allSistem) {
        this.allSistem = allSistem;
    }



}

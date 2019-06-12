package fauziharuna.dev.bridgemonitoring.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EngineerModel {
    @SerializedName("allEngineer")
    @Expose
    private List<AllEngineer> allEngineer = null;

    public List<AllEngineer> getAllEngineer() {
        return allEngineer;
    }

    public void setAllEngineer(List<AllEngineer> allEngineer) {
        this.allEngineer = allEngineer;
    }

}

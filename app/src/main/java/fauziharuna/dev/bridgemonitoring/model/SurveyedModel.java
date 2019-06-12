package fauziharuna.dev.bridgemonitoring.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SurveyedModel {

    @SerializedName("allSurveyed")
    @Expose
    private List<AllSurveyed> allSurveyed = null;

    public List<AllSurveyed> getAllSurveyed() {
        return allSurveyed;
    }

    public void setAllSurveyed(List<AllSurveyed> allSurveyed) {
        this.allSurveyed = allSurveyed;
    }

}
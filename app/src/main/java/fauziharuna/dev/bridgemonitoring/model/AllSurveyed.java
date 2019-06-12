package fauziharuna.dev.bridgemonitoring.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllSurveyed {

    @SerializedName("surveyor_name")
    @Expose
    private String surveyorName;
    @SerializedName("bridge_surveyed")
    @Expose
    private String bridgeSurveyed;
    @SerializedName("bridge_location")
    @Expose
    private String bridgeLocation;

    public String getSurveyorName() {
        return surveyorName;
    }

    public void setSurveyorName(String surveyorName) {
        this.surveyorName = surveyorName;
    }

    public String getBridgeSurveyed() {
        return bridgeSurveyed;
    }

    public void setBridgeSurveyed(String bridgeSurveyed) {
        this.bridgeSurveyed = bridgeSurveyed;
    }

    public String getBridgeLocation() {
        return bridgeLocation;
    }

    public void setBridgeLocation(String bridgeLocation) {
        this.bridgeLocation = bridgeLocation;
    }

}
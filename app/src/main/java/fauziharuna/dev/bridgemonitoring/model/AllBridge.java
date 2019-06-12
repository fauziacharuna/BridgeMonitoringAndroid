package fauziharuna.dev.bridgemonitoring.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllBridge {
    @SerializedName("bridge_location")
    @Expose
    private String bridgeLocation;
    @SerializedName("bridge_name")
    @Expose
    private String bridgeName;
    @SerializedName("kerusakan")
    @Expose
    private String kerusakan;

    public String getBridgeLocation() {
        return bridgeLocation;
    }

    public void setBridgeLocation(String bridgeLocation) {
        this.bridgeLocation = bridgeLocation;
    }

    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }
}

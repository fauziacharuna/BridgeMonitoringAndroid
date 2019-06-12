package fauziharuna.dev.bridgemonitoring.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BridgeModel {

    @SerializedName("allBridge")
    @Expose
    private List<AllBridge> allBridge = null;

    public List<AllBridge> getAllBridge() {
        return allBridge;
    }

    public void setAllBridge(List<AllBridge> allBridge) {
        this.allBridge = allBridge;
    }

}

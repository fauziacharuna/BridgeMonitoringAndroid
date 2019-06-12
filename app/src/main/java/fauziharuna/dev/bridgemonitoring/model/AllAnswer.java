package fauziharuna.dev.bridgemonitoring.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllAnswer {

    @SerializedName("answer_id")
    @Expose
    private Integer answerId;
    @SerializedName("bridge_location")
    @Expose
    private String bridgeLocation;
    @SerializedName("bridge_name")
    @Expose
    private String bridgeName;
    @SerializedName("sistem_name")
    @Expose
    private String sistemName;
    @SerializedName("komponen_name")
    @Expose
    private String komponenName;
    @SerializedName("subKomponen_name")
    @Expose
    private String subKomponenName;
    @SerializedName("surveyor_name")
    @Expose
    private String surveyorName;
    @SerializedName("bahan_name")
    @Expose
    private String bahanName;
    @SerializedName("kerusakan")
    @Expose
    private String kerusakan;
    @SerializedName("interval_kerusakan")
    @Expose
    private String intervalKerusakan;
    @SerializedName("luasan")
    @Expose
    private Integer luasan;
    @SerializedName("luasan2")
    @Expose
    private Integer luasan2;
    @SerializedName("nilai_pengurang")
    @Expose
    private String nilaiPengurang;
    @SerializedName("faktor_koreksi")
    @Expose
    private Double faktorKoreksi;
    @SerializedName("faktor_nilai1")
    @Expose
    private Double faktorNilai1;
    @SerializedName("faktor_nilai2")
    @Expose
    private Double faktorNilai2;
    @SerializedName("bobot_komponen")
    @Expose
    private Double bobotKomponen;
    @SerializedName("IKSK")
    @Expose
    private Double iKSK;
    @SerializedName("IKUS")
    @Expose
    private Double iKUS;
    @SerializedName("IKKJ")
    @Expose
    private Double iKKJ;
    @SerializedName("IKS")
    @Expose
    private Double iKS;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

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

    public String getSistemName() {
        return sistemName;
    }

    public void setSistemName(String sistemName) {
        this.sistemName = sistemName;
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

    public String getSurveyorName() {
        return surveyorName;
    }

    public void setSurveyorName(String surveyorName) {
        this.surveyorName = surveyorName;
    }

    public String getBahanName() {
        return bahanName;
    }

    public void setBahanName(String bahanName) {
        this.bahanName = bahanName;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getIntervalKerusakan() {
        return intervalKerusakan;
    }

    public void setIntervalKerusakan(String intervalKerusakan) {
        this.intervalKerusakan = intervalKerusakan;
    }

    public Integer getLuasan() {
        return luasan;
    }

    public void setLuasan(Integer luasan) {
        this.luasan = luasan;
    }

    public Integer getLuasan2() {
        return luasan2;
    }

    public void setLuasan2(Integer luasan2) {
        this.luasan2 = luasan2;
    }

    public String getNilaiPengurang() {
        return nilaiPengurang;
    }

    public void setNilaiPengurang(String nilaiPengurang) {
        this.nilaiPengurang = nilaiPengurang;
    }

    public Double getFaktorKoreksi() {
        return faktorKoreksi;
    }

    public void setFaktorKoreksi(Double faktorKoreksi) {
        this.faktorKoreksi = faktorKoreksi;
    }

    public Double getFaktorNilai1() {
        return faktorNilai1;
    }

    public void setFaktorNilai1(Double faktorNilai1) {
        this.faktorNilai1 = faktorNilai1;
    }

    public Double getFaktorNilai2() {
        return faktorNilai2;
    }

    public void setFaktorNilai2(Double faktorNilai2) {
        this.faktorNilai2 = faktorNilai2;
    }

    public Double getBobotKomponen() {
        return bobotKomponen;
    }

    public void setBobotKomponen(Double bobotKomponen) {
        this.bobotKomponen = bobotKomponen;
    }

    public Double getIKSK() {
        return iKSK;
    }

    public void setIKSK(Double iKSK) {
        this.iKSK = iKSK;
    }

    public Double getIKUS() {
        return iKUS;
    }

    public void setIKUS(Double iKUS) {
        this.iKUS = iKUS;
    }

    public Double getIKKJ() {
        return iKKJ;
    }

    public void setIKKJ(Double iKKJ) {
        this.iKKJ = iKKJ;
    }

    public Double getIKS() {
        return iKS;
    }

    public void setIKS(Double iKS) {
        this.iKS = iKS;
    }

}



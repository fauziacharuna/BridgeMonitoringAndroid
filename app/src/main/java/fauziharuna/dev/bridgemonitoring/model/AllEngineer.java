package fauziharuna.dev.bridgemonitoring.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class AllEngineer {
    @SerializedName("surveyor_id")
    @Expose
    private Integer surveyorId;

    @SerializedName("surveyor_name")
    @Expose
    private String surveyorName;

    @SerializedName("surveyor_work")
    @Expose
    private String surveyorWork;

    public Integer getSurveyorId() {
        return surveyorId;
    }

    public void setSurveyorId(Integer surveyorId) {
        this.surveyorId = surveyorId;
    }

    public String getSurveyorName() {
        return surveyorName;
    }

    public void setSurveyorName(String surveyorName) {
        this.surveyorName = surveyorName;
    }

    public String getSurveyorWork() {
        return surveyorWork;
    }

    public void setSurveyorWork(String surveyorWork) {
        this.surveyorWork = surveyorWork;
    }

}


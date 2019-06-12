package fauziharuna.dev.bridgemonitoring.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AnswerModel {
    @SerializedName("allAnswer")
    @Expose
    private List<AllAnswer> allAnswer = null;

    public List<AllAnswer> getAllAnswer() {
        return allAnswer;
    }

    public void setAllAnswer(List<AllAnswer> allAnswer) {
        this.allAnswer = allAnswer;
    }

}

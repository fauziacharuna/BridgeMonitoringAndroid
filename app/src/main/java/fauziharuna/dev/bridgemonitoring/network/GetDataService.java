package fauziharuna.dev.bridgemonitoring.network;


import fauziharuna.dev.bridgemonitoring.model.AnswerModel;
import fauziharuna.dev.bridgemonitoring.model.BridgeModel;
import fauziharuna.dev.bridgemonitoring.model.EngineerModel;
import fauziharuna.dev.bridgemonitoring.model.KomponenModel;
import fauziharuna.dev.bridgemonitoring.model.AllSistem;
import fauziharuna.dev.bridgemonitoring.model.SubKomponenModel;
import fauziharuna.dev.bridgemonitoring.model.SurveyedModel;
import okhttp3.ResponseBody;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface GetDataService {
    /*GET METHOD*/
    @GET("/sistem")
    Call<AllSistem> getAllSistem();

    @GET("/komponen")
    Call<KomponenModel> getAllKomponen();

    @GET("/subkomponen")
    Call<SubKomponenModel> getAllSubKomponen();

    @GET("/surveyorbridge")
    Call<SurveyedModel> getAllSurveyed();

    /*ENGINEER METHOD*/

    @GET("/engineer")
    Call<EngineerModel> getAllEngineer();

    @FormUrlEncoded
    @POST("/addengineer")
    Call<ResponseBody> addNewEngineer(
            @Field("surveyor_name") String engineerName,
            @Field("surveyor_work") String surveyorWork

    );

    @FormUrlEncoded
    @PUT("edit/engineer/")
    Call<ResponseBody> updateEngineer(
            @Path("surveyor_id") int engineerId,
            @Field("surveyor_name") String engineerName,
            @Field("surveyor_work") String surveyorWork

    );

    @DELETE("engineer/{surveyor_id")
    Call<ResponseBody> deleteEngineer(@Path("surveyor_id") int engineerId);


    /*answer method*/
    @GET("/answer")
    Call<AnswerModel> getAllAnswer();

    @FormUrlEncoded
    @POST("/addanswer")
    Call<ResponseBody> addAnswer(
            @Field("surveyor_id") int engineerId,
            @Field("bridge_id") int bridgeId,
            @Field("subKomponen_id") int subKomponenId,
            @Field("komponen_id") int komponenID,
            @Field("sistem_id") int sistemId,
            @Field("bahan_id") int bahanId,
            @Field("kerusakan") String kerusakan,
            @Field("interval_kerusakan") Double interval,
            @Field("luasan") Double luasan1,
            @Field("luasan2") Double luasan2,
            @Field("nilai_pengurang") Double nilaiPengurang,
            @Field("faktor_koreksi") Double faktorKoreksi,
            @Field("faktor_nilai1") Double faktorNilai1,
            @Field("faktor_nilai2") Double faktorNilai2,
            @Field("bobot_komponen") String bobotKomponen,
            @Field("IKSK") String iksk,
            @Field("IKUS") String ikus,
            @Field("IKKJ") String ikkj,
            @Field("IKS") String iks
    );

    @PUT("edit/answer/")
    @FormUrlEncoded
    Call<ResponseBody> updateAnswer(@Path("answer_id") long answerId,
                                    @Field("surveyor_id") int engineerId,
                                    @Field("bridge_id") int bridgeId,
                                    @Field("subKomponen_id") int subKomponenId,
                                    @Field("komponen_id") int komponenID,
                                    @Field("sistem_id") int sistemId,
                                    @Field("bahan_id") int bahanId,
                                    @Field("kerusakan") String kerusakan,
                                    @Field("interval_kerusakan") Double interval,
                                    @Field("luasan") Double luasan1,
                                    @Field("luasan2") Double luasan2,
                                    @Field("nilai_pengurang") Double nilaiPengurang,
                                    @Field("faktor_koreksi") Double faktorKoreksi,
                                    @Field("faktor_nilai1") Double faktorNilai1,
                                    @Field("faktor_nilai2") Double faktorNilai2,
                                    @Field("bobot_komponen") String bobotKomponen,
                                    @Field("IKSK") String iksk,
                                    @Field("IKUS") String ikus,
                                    @Field("IKKJ") String ikkj,
                                    @Field("IKS") String iks

    );
    /* BRIDGE METHOD */

    @DELETE("answer/{answer_id")
    Call<ResponseBody> deleteAnswer(@Path("answer_id") int answerId);

    @GET("/bridge")
    Call<BridgeModel> getAllBridge();

    @POST("/addbridge")
    Call<ResponseBody> addBridge(@Field("bridge_name") String bridgeName,
                                 @Field("bridge_location") String bridgeLocation);

    @PUT("/edit/bridge")
    Call<ResponseBody> editBridge(@Path("bridge_id") int bridgeId,
                                  @Field("bridge_name") String bridgeName,
                                  @Field("bridge_location") String bridgeLocation);

    @DELETE("/delete/bridge")
    Call<ResponseBody> deleteBridge(@Path("bridge_id") int bridgeId);


//
//    @GET("/getiksk")
//    Call<Float> getIksk(
//
//            pengurang,
//
//            koreksi);
//


}

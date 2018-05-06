package com.mobitribe.wheelsonfire.network;


import com.mobitribe.wheelsonfire.model.Category;
import com.mobitribe.wheelsonfire.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Author: Muhammad Shahab
 * Date: 5/5/17.
 * Description: Interface that contains the services
 */

public interface WebServices {

    @GET(ApiEndPoints.LIST_ALL_PRODUCT)
    Call<ArrayList<Product>> getListOfProducts(@QueryMap HashMap<String, String> queries);
    @GET(ApiEndPoints.LIST_ALL_CATEGORIES)
    Call<ArrayList<Category>> getListOfCategory(@QueryMap HashMap<String, String> queries);

//    @GET(ApiEndPoints.LICENCE_TYPE)
//    Call<LicenceType> getLicenceTypes();
//
//    @POST(ApiEndPoints.JOBSEEKER)
//    Call<SignUpResponse> createJobSeeker(@Body SignUpJobSeeker signUpJobSeeker);
//
//    @GET(ApiEndPoints.RESENT_CODE)
//    Call<SignUpResponse> resentCode(@Path("id") String id);
//
//    @POST(ApiEndPoints.SET_JOBSEEKER_STATUS)
//    Call<Response> setJobSeekerStatus(@Path("id") String id, @Body VerifyStatus verifyStatus);
//
//    @PUT(ApiEndPoints.JOBSEEKER)
//    Call<Response> updateJobSeeker(@Body JobSeeker jobSeeker);
//
//    @POST(ApiEndPoints.LICENCE_DETAIL)
//    Call<Response> updateLicenceDetail(@Body SignUpJobSeeker licenceDetail);
//
//    @PUT(ApiEndPoints.LICENCE_DETAIL)
//    Call<Response> updateLicenceDetail(@Body JobSeeker licenceDetail);
//    @PUT(ApiEndPoints.LICENCE_DETAIL)
//    Call<Response> updateLicence(@Body LicenseBody licenceDetail);
//
//    @POST(ApiEndPoints.GCV_TEXT_DETECTION)
//    Call<CVAResponse> detectText(@Body CVARequestBody licenceDetail, @Query("key") String key);
//
//    @POST(ApiEndPoints.PAYMENT_DETAILS)
//    Call<Response> updatePaymentDetails(@Body SignUpJobSeeker paymentDetails);
//
//    @PUT(ApiEndPoints.PAYMENT_DETAILS)
//    Call<Response> updatePaymentDetails(@Body JobSeeker paymentDetails);
//
//    @POST(ApiEndPoints.UPLOAD_IMAGE)
//    Call<Response> updateProfileImage(@Body SignUpJobSeeker profileImage);
//
//    @PUT(ApiEndPoints.UPLOAD_IMAGE)
//    Call<Response> updateProfileImage(@Body JobSeeker profileImage);
//
//    @GET(ApiEndPoints.APPOINTMENT_SLOTS)
//    Call<AppointmentSlot> getAppointmentSlots(@Path("id") String jobSeekerId);
//
//    @POST(ApiEndPoints.APPOINTMENT_SLOTS)
//    Call<Response> assignAppointmentSlot(@Body SignUpJobSeeker signUpJobSeeker, @Path("id") String jobSeekerId);
//
//    /* check the jobseeker sign up status*/
//    @GET(ApiEndPoints.JOB_SEEKER_STATUS)
//    Call<JobseekerStatus> checkStatus(@Path("id") String id);
//
//    @FormUrlEncoded
//    /*Employer login*/
//    @POST(ApiEndPoints.LOGIN)
//    Call<LoginResponse> loginUser(@FieldMap HashMap<String, String> login);
//
//    @POST(ApiEndPoints.SHIFTS)
//    Call<Shifts> getNearByShift(@Body ShiftFilter filter);
//
//    @GET(ApiEndPoints.All_SHIFTS)
//    Call<Shifts> getAppliedAllShifts();
//
//    @GET(ApiEndPoints.SHIFTS)
//    Call<Shifts> getAppliedUpcommingShifts();
//    @GET(ApiEndPoints.PENDING_SHIFTS)
//    Call<Shifts> getAppliedPendingShifts();
//
//
//    @GET(ApiEndPoints.SHIFTS_DETAIL)
//    Call<Shifts> getShiftsDetail(@Path("shift_id") String shiftId);
//
//    @PUT(ApiEndPoints.SHIFTS_OPT)
//    Call<Shifts> cancelShift(@Path("id") int shiftId);
//
//
//    @POST(ApiEndPoints.SHIFTS_OPT)
//    Call<Shifts> applyShift(@Path("id") int shiftId);
//
//    @GET(ApiEndPoints.JOBSEEKER)
//    Call<JobSeekerServerResponse> getJobSeekerProfile();
//
//
//    @POST(ApiEndPoints.SHIFT_CHECK_IN)
//    Call<Response> checkIn(@Body HashMap<String, String> map, @Path("id") Integer id);
//
//
//    @PUT(ApiEndPoints.JOBSEEKER_AVAILABILITY)
//    Call<Response> availableJobSeeker(@Body JobSeeker jobSeeker);
//
//    @POST(ApiEndPoints.EMPLOYER_RATING)
//    Call<Response> postEmployeeRating(@Body EmployerRating jobseekerRating);
//
//
//    @FormUrlEncoded
//    @POST(ApiEndPoints.REFERESH_TOKEN)
//    Call<LoginResponse>  getRefreshToken(@FieldMap HashMap<String, String> refresh_token);
//
//    @PUT(ApiEndPoints.DEVICE_TOKEN)
//    Call<Response> updateDeviceToken(@Body Map<String, String> deviceToken);
//
//    @POST(ApiEndPoints.CANCEL_APPOINTMENT)
//    Call<Response> cancelAppointment(@Body Map<String, String> bodyMap);
//
//    @PUT(ApiEndPoints.ENABLE_PUSH_NOTIFICATION)
//    Call<Response> enable_push_notification(@Body JobSeeker jobSeeker);
//
//
//    @GET(ApiEndPoints.CONTRACT_OF_EMPLOYMENT)
//    Call<Contract> getEmployerContact(@Path("shift_id") Integer id);
//
//    @POST(ApiEndPoints.SIGN_CONTRACT)
//    Call<Response> signContract(@Path("shift_id") Integer id, @Body HashMap<String, String> signature);
//
//    @POST(ApiEndPoints.FORGET_PASSWORD)
//    Call<Response> sendForgottenPassword(@Body HashMap<String, String> email);
//
//    @FormUrlEncoded
//    @POST(ApiEndPoints.POST_CODE_ANYWHERE_GEOCODE)
//    Call<ArrayList<PCAResponse>> getGeoCode(@FieldMap HashMap<String, String> queries);
//
//
//    @FormUrlEncoded
//    @POST(ApiEndPoints.POST_CODE_ANYWHERE_FIND)
//    Call<ArrayList<AutocompleteAdapter.PlaceAutocomplete>> findAddress(@FieldMap HashMap<String, String> queries);
}

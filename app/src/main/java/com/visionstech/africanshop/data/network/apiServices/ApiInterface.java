package com.visionstech.africanshop.data.network.apiServices;


import com.visionstech.africanshop.data.network.requests.CompleteDataRequest;
import com.visionstech.africanshop.data.network.requests.LoginRequest;
import com.visionstech.africanshop.data.network.responses.AdsResponse;
import com.visionstech.africanshop.data.network.responses.AuthResponse;
import com.visionstech.africanshop.data.network.responses.ClassificationsResponse;
import com.visionstech.africanshop.data.network.responses.CompaniesResponse;
import com.visionstech.africanshop.data.network.responses.CompleteProfileResponse;
import com.visionstech.africanshop.data.network.responses.CountriesResponse;
import com.visionstech.africanshop.data.network.responses.DestinationResponse;
import com.visionstech.africanshop.data.network.responses.IntroResponse;
import com.visionstech.africanshop.data.network.responses.OffersResponse;
import com.visionstech.africanshop.data.network.responses.TermsResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("guest-api/on-boarding")
    Observable<IntroResponse> requestIntro();

    @POST("auth-api/user/register")
    Observable<AuthResponse> requestLogin(@Body LoginRequest request);

    @POST("auth-api/user/countries")
    Observable<CountriesResponse> requestCountries();

    @POST("guest-api/terms-conditions")
    Observable<TermsResponse> requestTerms();

    @POST("auth-api/user/complete-register")
    Observable<CompleteProfileResponse> requestCompleteData(@Body CompleteDataRequest request);

    @FormUrlEncoded
    @POST("user-api/sliders")
    Observable<AdsResponse> requestAds(@Field("country_id") int countryId);

    @FormUrlEncoded
    @POST("user-api/classifications")
    Observable<ClassificationsResponse> requestClassifications(@Field("country_id") int countryId);

    @POST("user-api/destination")
    Observable<DestinationResponse> requestDestination();

    @FormUrlEncoded
    @POST("user-api/vouchers")
    Observable<OffersResponse> requestOffers(@Field("country_id") int countryId);

    @FormUrlEncoded
    @POST("user-api/companies-under-classification")
    Observable<CompaniesResponse> requestCompaniesUnderClassification(@Field("classification_id") int classificationId);
}

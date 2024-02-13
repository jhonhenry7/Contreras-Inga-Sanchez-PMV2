package retrofit;

import com.example.uberclone.models.FCMBody;
import com.example.uberclone.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {


    @Headers({
            "Content-Type.application/json",
            "Authorization:key=AAAASxf_XbA:APA91bE8CeXL8LbyWWmIOqHugzFS4dflyCFOaDWh1sQa-BoBXIvxQcspgbdX9L3lClgjMK1qi0TylZEopEkMVm5sngoAzKXiEr1hhmJ7VLJeXrYG4F4yseXAnBUFJBrAQNJWzraRuqr1"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);

}

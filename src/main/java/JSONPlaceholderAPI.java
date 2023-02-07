import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JSONPlaceholderAPI {

    static void getInstance() {
    }

    @GET("posts")
    Call<List<Photos>> getPosts();

    @GET("photos")
    Call<List<Photos>> getPhotos();
}

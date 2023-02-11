import org.junit.jupiter.api.Test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class PhotosAPITest {

    @Test
    public void testGetPhotos() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();

        var api = retrofit.create(JSONPlaceholderAPI.class);
        var photos = api.getPhotos().execute().body();

        assertNotNull(photos);
        assertEquals(5000,photos.size(),"There should be 5000 records");
    }

    @Test
    public void testGetPosts() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();

        var api = retrofit.create(JSONPlaceholderAPI.class);
        var posts = api.getPosts().execute().body();

        assertNotNull(posts);
        assertEquals(100,posts.size(),"There should be 100 records");
    }
}
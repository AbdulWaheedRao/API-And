package com.example.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AlbumAPIService {
    public static final String API_URL="/Albums";
    @GET(API_URL)
    Call<List<Album>> fetchAlbums();

    @POST(API_URL)
    Call<Void>insertAlbum(@Body Album album);

    @PUT(API_URL+"/{id}")
    Call<Void> updateAlbum(@Path("id")int id,@Body Album album);

    @DELETE(API_URL+"/{id}")
    Call<Void> deleteAlbum(@Path("id")int id);
}


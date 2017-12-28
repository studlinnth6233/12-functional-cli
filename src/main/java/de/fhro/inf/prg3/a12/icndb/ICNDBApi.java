package de.fhro.inf.prg3.a12.icndb;

import de.fhro.inf.prg3.a12.model.JokeDto;
import de.fhro.inf.prg3.a12.model.ResponseWrapper;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.concurrent.CompletableFuture;

/**
 * @author Peter Kurfer
 * Created on 12/28/17.
 */
public interface ICNDBApi {

    @GET("/jokes/count")
    CompletableFuture<ResponseWrapper<Integer>> getJokeCount();

    @GET("/jokes/random")
    CompletableFuture<ResponseWrapper<JokeDto>> getRandomJoke();

    @GET("/jokes/random")
    CompletableFuture<ResponseWrapper<JokeDto>> getRandomJoke(@Query("firstName") String firstName, @Query("lastName") String lastName);

    @GET("/jokes/{id}")
    CompletableFuture<ResponseWrapper<JokeDto>> getJoke(@Path("id") int number);

}

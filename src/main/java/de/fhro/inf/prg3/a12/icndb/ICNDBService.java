package de.fhro.inf.prg3.a12.icndb;

import de.fhro.inf.prg3.a12.model.JokeDto;
import de.fhro.inf.prg3.a12.model.ResponseWrapper;
import retrofit2.Retrofit;
import retrofit2.adapter.java8.Java8CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.CompletableFuture;

/**
 * @author Peter Kurfer
 * Created on 12/28/17.
 */
public final class ICNDBService implements ICNDBApi {

    private static final ICNDBService instance = new ICNDBService();

    private final ICNDBApi icndbApi;

    public static ICNDBService getInstance() {
        return instance;
    }

    private ICNDBService() {
        /* Initialize Retrofit */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.icndb.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(Java8CallAdapterFactory.create())
                .build();

        icndbApi = retrofit.create(ICNDBApi.class);
    }

    @Override
    public CompletableFuture<ResponseWrapper<Integer>> getJokeCount() {
        return icndbApi.getJokeCount();
    }

    @Override
    public CompletableFuture<ResponseWrapper<JokeDto>> getRandomJoke() {
        return icndbApi.getRandomJoke();
    }

    @Override
    public CompletableFuture<ResponseWrapper<JokeDto>> getRandomJoke(String firstName, String lastName) {
        return icndbApi.getRandomJoke(firstName, lastName);
    }

    @Override
    public CompletableFuture<ResponseWrapper<JokeDto>> getJoke(int number) {
        return icndbApi.getJoke(number);
    }
}

package de.fhro.inf.prg3.a12.icndb.suppliers;

import java.util.function.Supplier;

import de.fhro.inf.prg3.a12.icndb.ICNDBApi;
import de.fhro.inf.prg3.a12.icndb.ICNDBService;
import de.fhro.inf.prg3.a12.model.JokeDto;
import de.fhro.inf.prg3.a12.model.ResponseWrapper;
import org.apache.commons.lang3.NotImplementedException;

/**
 * @author Peter Kurfer
 */

public final class AllJokesSupplier implements Supplier<ResponseWrapper<JokeDto>> {

    private final ICNDBApi icndbApi;

    public AllJokesSupplier() {
        icndbApi = ICNDBService.getInstance();
        /* TODO fetch the total count of jokes the API is aware of
         * to determine when all jokes are iterated and the counters have to be reset */
    }

    @Override
    public ResponseWrapper<JokeDto> get() {
        /* TODO retrieve the next joke
         * note that there might be IDs that are not present in the database
         * you have to catch an exception and continue if no joke was retrieved to an ID
         * if you retrieved all jokes (count how many jokes you successfully fetched from the API)
         * reset the counters and continue at the beginning */
        throw new NotImplementedException("Method `get()` is not implemented");
    }

}

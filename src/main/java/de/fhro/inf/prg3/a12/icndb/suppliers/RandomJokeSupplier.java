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

public final class RandomJokeSupplier implements Supplier<ResponseWrapper<JokeDto>> {

    private final ICNDBApi icndbApi;

    public RandomJokeSupplier() {
        icndbApi = ICNDBService.getInstance();
    }

    @Override
    public ResponseWrapper<JokeDto> get() {
        /* TODO fetch a random joke synchronously
         * if an exception occurs return null */
        throw new NotImplementedException("Method `get()` is not implemented");
    }
}

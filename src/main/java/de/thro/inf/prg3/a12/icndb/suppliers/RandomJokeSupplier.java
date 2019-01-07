package de.thro.inf.prg3.a12.icndb.suppliers;

import de.thro.inf.prg3.a12.icndb.ICNDBApi;
import de.thro.inf.prg3.a12.icndb.ICNDBService;
import de.thro.inf.prg3.a12.model.JokeDto;
import de.thro.inf.prg3.a12.model.ResponseWrapper;
import org.apache.commons.lang3.NotImplementedException;

/**
 * @author Peter Kurfer
 */

public final class RandomJokeSupplier {

    /* ICNDB API proxy to retrieve jokes */
    private final ICNDBApi icndbApi;

    public RandomJokeSupplier() {
        icndbApi = ICNDBService.getInstance();
    }

    public ResponseWrapper<JokeDto> get() {
        /* TODO fetch a random joke synchronously
         * if an exception occurs return null */
        throw new NotImplementedException("Method `get()` is not implemented");
    }
}

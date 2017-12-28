package de.fhro.inf.prg3.a12.icndb;

import de.fhro.inf.prg3.a12.model.JokeDto;
import de.fhro.inf.prg3.a12.model.ResponseWrapper;
import org.apache.commons.lang3.NotImplementedException;

import java.util.stream.Stream;

/**
 * @author Peter Kurfer
 */

public final class JokeGenerator {

    public Stream<ResponseWrapper<JokeDto>> randomJokesStream() {
        /* TODO create new Stream of random jokes */
        throw new NotImplementedException("Method `randomJokeStream()` is not implemented");
    }

    public Stream<ResponseWrapper<JokeDto>> jokesStream() {
        /* TODO create a new Stream of all jokes */
        throw new NotImplementedException("Method `jokesStream()` is not implemented");
    }
}

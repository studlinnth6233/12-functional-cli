package de.fhro.inf.prg3.a12.icndb;

import de.fhro.inf.prg3.a12.model.JokeDto;
import de.fhro.inf.prg3.a12.model.ResponseWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

/**
 * @author Peter Kurfer
 * Created on 12/28/17.
 */
class JokesGeneratorTests {

    private JokeGenerator jokeGenerator = new JokeGenerator();

    @Test
    void testRandomStream() {
        /* timeout to ensure that stream does not loop forever */
        /* TODO implement a test for the random joke stream */
    }


    @Test
    void testJokesStream() {
        /* TODO implement a test for the linear jokes generator */
    }

}

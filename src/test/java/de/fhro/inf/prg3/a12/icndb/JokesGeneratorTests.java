package de.fhro.inf.prg3.a12.icndb;

import de.fhro.inf.prg3.a12.model.JokeDto;
import de.fhro.inf.prg3.a12.model.ResponseWrapper;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;

/**
 * @author Peter Kurfer
 * Created on 12/28/17.
 */
class JokesGeneratorTests {

    private JokeGenerator jokeGenerator = new JokeGenerator();

    @Test
    void testRandomStream() {
        assertTimeout(Duration.ofSeconds(5L), () -> {
            Stream<ResponseWrapper<JokeDto>> randomJokesStream = jokeGenerator.randomJokesStream();

            randomJokesStream
                    .filter(Objects::nonNull)
                    .map(ResponseWrapper::getValue)
                    .skip(3)
                    .limit(5)
                    .forEach(j -> {
                        assertNotNull(j.getJoke());
                        System.out.println(j.getJoke());
                    });
        });
    }


    @Test
    void testJokesStream() {
        assertTimeout(Duration.ofMinutes(1L), () -> {
            jokeGenerator.jokesStream()
                    .filter(Objects::nonNull)
                    .map(ResponseWrapper::getValue)
                    .skip(200L)
                    .limit(400L)
                    .forEach(j -> {
                        assertNotNull(j.getJoke());
                        System.out.println(j.getJoke());
                    });
        });
    }

}

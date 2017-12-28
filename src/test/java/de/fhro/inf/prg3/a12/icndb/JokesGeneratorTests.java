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
        assertTimeout(Duration.ofSeconds(5L), () -> {
            Stream<ResponseWrapper<JokeDto>> randomJokesStream = jokeGenerator.randomJokesStream();

            randomJokesStream
                    .filter(Objects::nonNull)
                    .skip(3)
                    .limit(5)
                    .map(ResponseWrapper::getValue)
                    .map(JokeDto::getJoke)
                    .forEach(Assertions::assertNotNull);
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
                    .map(JokeDto::getJoke)
                    .forEach(Assertions::assertNotNull);
        });
    }

}

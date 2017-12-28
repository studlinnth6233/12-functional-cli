package de.fhro.inf.prg3.a12;

import de.fhro.inf.prg3.a12.icndb.JokeGenerator;
import de.fhro.inf.prg3.a12.model.JokeDto;
import de.fhro.inf.prg3.a12.model.ResponseWrapper;

import java.util.Scanner;
import java.util.stream.Stream;

public abstract class App {

    private static final Scanner inputScanner = new Scanner(System.in);
    private static final JokeGenerator jokeGenerator = new JokeGenerator();

    public static void main(String[] args) {
        boolean shouldQuit = false;
        int jokeCount;
        int skipCount;
        do {
            jokeCount = readInt("How many jokes do you want?");
            skipCount = readInt("How many jokes do you want to skip");

            Stream<ResponseWrapper<JokeDto>> jokesSource;
            switch (readJokeSource()) {
                case Random:
                    jokesSource = jokeGenerator.randomJokesStream();
                    break;
                default:
                    jokesSource = jokeGenerator.jokesStream();
            }

            /* TODO consume the `jokesSource`
             * filter it for non null objects
             * use `skip` and `limit` to retrieve the required elements
             * use `map` to unwrap the ResponseWrapper value
             * and print the jokes to the STDOUT */

            System.out.println("If you want to quit press [Q] otherwise press [C] to continue.");
            String input = inputScanner.next();
            if (input.equals("q") || input.equals("Q")) {
                shouldQuit = true;
            }
        } while (!shouldQuit);
        System.exit(0);
    }

    private static int readInt(String message) {
        System.out.println(message);
        do {
            try {
                int input = inputScanner.nextInt();
                if (input >= 0) return input;
            } catch (Exception e) {
                System.out.println("Error while reading integer.");
            }
        } while (true);
    }

    private static JokeSource readJokeSource() {
        System.out.println("Which joke source do you want to use?");
        System.out.println("1) Random jokes");
        System.out.println("2) Linear by id");

        do {
            try {
                int selection = inputScanner.nextInt();
                switch (selection) {
                    case 1:
                        return JokeSource.Random;
                    default:
                        return JokeSource.Linear;
                }
            } catch (Exception e) {
                System.out.println("No valid selection");
            }
        } while (true);
    }

    enum JokeSource {
        Random,
        Linear
    }
}

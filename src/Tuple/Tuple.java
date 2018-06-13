package Tuple;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Tuple Object Class <br>
 *     This class contains a basic adaptation of tuples found in other languages.
 *     This is created to ease the return of multiple values of a function at once.
 * */
public class Tuple {
    private LinkedList<Integer> ints;
    private LinkedList<Float> floats;
    private LinkedList<Double> doubles;
    private LinkedList<Long> longs;
    private LinkedList<Character> chars;
    private LinkedList<String> strings;

    /**
     * Default constructor of the class.
     * */
    public Tuple() {
        this.ints = new LinkedList<Integer>();
        this.floats = new LinkedList<Float>();
        this.doubles = new LinkedList<Double>();
        this.longs = new LinkedList<Long>();
        this.chars = new LinkedList<Character>();
        this.strings = new LinkedList<String>();
    }

    /**
     * Constructor that populates the tuple with integers.
     * */
    public Tuple(int... integers) {
        this();
        for (int i : integers) {
            this.ints.add(i);
        }

    }

    /**
     * Constructor that populates the tuple with floats.
     * */
    public Tuple(float... floats) {
        this();
        for (float f : floats) {
            this.floats.add(f);
        }
    }

    /**
     * Constructor that populates the tuple with doubles.
     * */
    public Tuple(double... doubles) {
        this();
        for (double d : doubles) {
            this.doubles.add(d);
        }

    }

    /**
     * Constructor that populates the tuple with longs.
     * */
    public Tuple(long... longs) {
        this();
        for (long l : longs) {
            this.longs.add(l);
        }
    }

    /**
     * Constructor that populates the tuple with characters.
     * */
    public Tuple(char... chars) {
        this();
        for (char c : chars) {
            this.chars.add(c);
        }
    }

    /**
     * Constructor that populates the tuple with strings.
     * */
    public Tuple(String... strings) {
        this();
        this.strings.addAll(Arrays.asList(strings));
    }
}

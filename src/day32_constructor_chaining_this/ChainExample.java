package day32_constructor_chaining_this;

public class ChainExample {


    public ChainExample () {
        System.out.println("First");
    }

    public ChainExample (int i) {
        this();
        System.out.println("Second");
    }

    public ChainExample (String str) {
        this(4);
        System.out.println("Third");
    }

    public ChainExample (double d) {
        this();
        System.out.println("Fourth");
    }

}
/**
 -Rules for chaining:
 -this ( ) keyword should always be the first line of the constructor
 -only one constructor can be called at a time in the same constructor. Can NOT do more than one
 -The constructor should not call itself or contain itself
 -The constructor should not contain itself (The current constructor should not be called at any point by another constructor.
 -The constructor that is called should NOT call back to current constructor
 */
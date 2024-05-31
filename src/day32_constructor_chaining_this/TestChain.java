package day32_constructor_chaining_this;

public class TestChain {
    public static void main(String[] args) {

        new ChainExample();
        new ChainExample(3);
        new ChainExample("Hello");
        new ChainExample(4.3);

    }
}
/*
First
Second
//Third
 */
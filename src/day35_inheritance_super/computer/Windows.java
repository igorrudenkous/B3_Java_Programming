package day35_inheritance_super.computer;

public class Windows extends Computer {
    String os;
    String edge;


    public Windows (String os, int memory) {
        super(os, memory);
//        super.os = os; //link to variable in another class
//        this.memory = memory;
    }
    public Windows (String os, int memory, String edge) {
        this(os, memory);
        this.edge = edge;
    }

}

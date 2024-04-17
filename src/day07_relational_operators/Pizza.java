package day07_relational_operators;
/*
    create a class Pizza
    add a main method
    declare and assign these variables:

       type of pizza,  the number of slices,  the number of people eating

    calculate how many slices each person will get
    calculate how many slices are left over

    Sample print statement:

       We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */
public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "3 Cheese";
        int numberOfSlices = 10, numberOfPeople = 4;


        int amountSlicesEachPerson = numberOfSlices / numberOfPeople;
        int slicesLeft = numberOfSlices % numberOfPeople;

        System.out.println("We ordered " + typeOfPizza + " pizza with " + numberOfSlices + " slices. " + numberOfPeople + " people ate " + amountSlicesEachPerson + " for each and " + slicesLeft + " is left.");
        

    }
}

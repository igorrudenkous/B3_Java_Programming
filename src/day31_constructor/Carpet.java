package day31_constructor;

public class Carpet {
    double width;
    double lenght;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(double inputWidth, double inputLenght, boolean inputPersian, double inputUnit) {

        width = inputWidth;
        lenght = inputLenght;
        isPersian = inputPersian;
        unitPrice = inputUnit;
        calculatePrice();
    }

    public void calculatePrice () {
        totalPrice = width * lenght * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        return "Carpet Info: " +
                "\nwidth = " + width +
                "\nlenght = " + lenght +
                "\nisPersian = " + isPersian +
                "\nunitPrice = $" + unitPrice +
                "\ntotalPrice = $" + totalPrice;
    }
}

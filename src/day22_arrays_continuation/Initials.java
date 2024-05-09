package day22_arrays_continuation;

public class Initials {
    public static void main(String[] args) {

        String [] names = {"James Bond", "Eve Rell", "Anna Jonson"};

        for (int i = 0; i < names.length; i++) {
            String eachFull = names[i].trim();
            String eachLastName = eachFull.substring(eachFull.indexOf(" ")).trim();
            eachFull = eachFull+ " ";

//            System.out.println(eachLastName);
//            System.out.println(eachFull);

            String initials = (eachFull.charAt(0)+"").toUpperCase() + (eachLastName.charAt(0)+"").toUpperCase();
            System.out.println(initials);
        }
    }
}
//
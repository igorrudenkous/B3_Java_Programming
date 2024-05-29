package day29_bulk_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList<String> allJobs = new ArrayList<>();

        // addAll()
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO", "DevOps", "QA", "QE", "BA", "Dr"));
        System.out.println("Original: " + allJobs);


        // removeAll()
        ArrayList<String> allJobs1 = new ArrayList<>(allJobs);
        allJobs1.removeAll(Arrays.asList("QA", "QE", "BA"));
        System.out.println("After romove: " + allJobs1);


        // removeAll()
        ArrayList<String> allJobs2 = new ArrayList<>(allJobs);
        allJobs2.removeAll(Arrays.asList("SDET", "Dr"));
        System.out.println("After romove 2: " + allJobs2);

    }
}
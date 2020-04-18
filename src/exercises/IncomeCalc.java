package src.exercises;

import java.util.ArrayList;

public class IncomeCalc {

    public ArrayList<Integer> incomeCalc(int x) {
        ArrayList<Integer> noTaxArray = new ArrayList<>();
        int incomeUpTo = 100000;
        int incomeIncrementor = 1000;
        for (int i = x; i <= x + incomeUpTo; i+=incomeIncrementor) {
            noTaxArray.add(i);
        }
        System.out.println(noTaxArray);
        return noTaxArray;
    }


}

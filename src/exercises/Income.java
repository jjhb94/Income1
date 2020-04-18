package src.exercises;

import java.util.ArrayList;
public class Income {

    public static void main(String[] args) {
        IncomeCalc grossPay = new IncomeCalc(); // create an instance of the class

        IncomeTaxCalc taxesOnPay = new IncomeTaxCalc();

        ArrayList<Integer> incomeList = grossPay.incomeCalc(80000);

        taxesOnPay.incomeTax(incomeList);


    }
}

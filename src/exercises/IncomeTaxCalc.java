package src.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IncomeTaxCalc {

    public ArrayList<Integer> incomeTax(ArrayList<Integer> x) {
        ArrayList<Integer> incomeTaxResult = new ArrayList<>();
        x.forEach(income -> incomeTaxResult.add((int)doTaxes(income)));
//        for (int i : x) {
//            incomeTaxResult.add(doTaxes(i));
//        }
        System.out.println(incomeTaxResult);
        return incomeTaxResult;
    }

    public double doTaxes(double taxable) {
        double taxResult = 0.00;
        if (taxable <= 9_875) { // first bracket for filing single
            taxResult = (taxable * .10);

        } else if (taxable > 9_875 && taxable <= 40_125) { // second bracket for filing single
            taxResult = (9_875 * .10);
            taxResult += ((taxable - 9_875) * .12);
            System.out.println(taxResult);

        } else if (taxable > 40_125 && taxable <= 85_525) { // second bracket for filing single
            taxResult = (9_875 * .10);
            taxResult += ((40_125 - 9_875) *  .12);
            taxResult += ((taxable - 40_125) *  .22);
            System.out.println(taxResult);

        } else if (taxable > 85_525 && taxable <= 163_300 ) {
            taxResult = (9_875 *  .10);
            taxResult += ((40_125 - 9_875) *  .12);
            taxResult += ((85_525 - 40_125) *  .22);
            taxResult += ((taxable - 85_525) * .24);
            System.out.println(taxResult);

        } else if (taxable > 163_300 && taxable <= 207_350) {
            taxResult = (9_875 *  .10);
            taxResult += ((40_125 - 9_875) *  .12);
            taxResult += ((85_525 - 40_125) *  .22);
            taxResult += ((163_300 - 85_525) * .24);
            taxResult += ((taxable - 163_300) * .32);
            System.out.println(taxResult);

        } else if (taxable > 207_350 && taxable <= 518_400 ) {
            taxResult = (9_875 *  .10);
            taxResult += ((40_125 - 9_875) *  .12);
            taxResult += ((85_525 - 40_125) *  .22);
            taxResult += ((163_300 - 85_525) * .24);
            taxResult += ((207_350 - 163_300) * .32);
            taxResult += ((taxable - 207_350) * .35);
            System.out.println(taxResult);

        } else if (taxable > 518_400) {
            taxResult = (9_875 *  .10);
            taxResult += ((40_125 - 9_875) *  .12);
            taxResult += ((85_525 - 40_125) *  .22);
            taxResult += ((163_300 - 85_525) * .24);
            taxResult += ((207_350 - 163_300) * .32);
            taxResult += ((518_400 - 207_350) * .35);
            taxResult += ((taxable - 518_400) * .37);
            System.out.println(taxResult);
        } return taxResult;

    }

}

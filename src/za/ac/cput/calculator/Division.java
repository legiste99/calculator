package za.ac.cput.calculator;

/**
 * @author Legiste
 */

public class Division {

    /**
     * Returns result of integer division
     *
     * @param numerator
     * @param denominator
     * @return
     */

    public static int integrerDivision(int numerator, int denominator){

        if (denominator < 1) return 0;
        else return numerator / denominator;

    }

}

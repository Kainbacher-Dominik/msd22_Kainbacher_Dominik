//Kainbacher Dominik
//Calculator object to add,subtract,divide, multiply and calculate the fakulty
package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    /**
     * Creates the sum of two numbers
     * @param num1
     * @param num2
     * @return the sum of parameters
     */

    public static double add(double num1, double num2) {
        logger.debug("add " + num1 + " and " + num2);
        return num1 + num2;
    }

    /**
     * Creates the diffrence of two numbers
     * @param num1
     * @param num2
     * @return the difference of num1 -num2
     */
    public static double minus(double num1, double num2) {
        logger.debug("subtract " + num1 + " and " + num2);
        return num1 - num2;
    }

    /**
     * Creates the divition of two numbers
     * @param num1
     * @param num2
     * @return the devition of num1 devided by num2
     * @throws ArithmeticExeption if num2 is 0
     */
    public static double divide(double num1, double num2) {
        logger.debug("divide " + num1 + " by " + num2);
        if (num2 == 0.0) {
            logger.error("divide by 0");
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

    /**
     * Creates the product of two numbers
     * @param num1
     * @param num2
     * @return the product of parameter
     */
    public static double multiply(double num1, double num2) {
        logger.debug("multipy " + num1 + " and " + num2);
        return num1 * num2;
    }

    /**
     * Creates the fakulty
     * @param num1
     * @return the product of all numbers between 1 and the parameter num1
     */
    public static double falty(double num1) {
        logger.debug("get faculty of " + num1);
        int res = 1;
        for (int i = 2; i <= num1; i++) {
            res *= i;
        }
        return res;
    }

}

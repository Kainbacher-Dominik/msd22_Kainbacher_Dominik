//Kainbacher Dominik
//Reads runtime arguments and uses the calculator class

package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static Logger logger=LogManager.getLogger();
    public static void main(String[] args) {
        double num1= Double.parseDouble(args[0]);
        double num2= Double.parseDouble(args[1]);
        System.out.println(Calculator.add(num1,num2));
        System.out.println(Calculator.minus(num1,num2));
        System.out.println(Calculator.divide(num1,num2));
        System.out.println(Calculator.multiply(num1,num2));

        logger.info("It is an info logger");
        logger.error("It is an error logger");

    }
}

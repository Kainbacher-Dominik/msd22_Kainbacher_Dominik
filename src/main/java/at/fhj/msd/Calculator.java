package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger=LogManager.getLogger();

    public static double add(double num1,double num2){
        logger.debug("add "+num1+" and "+num2);
        return num1+num2;
    }
    public static double minus(double num1,double num2){
        logger.debug("subtract "+num1+" and "+num2);
        return num1-num2;
    }
    public static double divide(double num1,double num2){
        logger.debug("divide "+num1+" by "+num2);
        if(num2==0.0){
            logger.error("divide by 0");
            throw new ArithmeticException();
        }
        return num1/num2;
    }
    public static double multiply(double num1,double num2){
        logger.debug("multipy "+num1+" and "+num2);
        return num1*num2;
    }
    public static double falty(double num1){
        logger.debug("get faculty of "+num1);
        int res=1;
        for (int i=2;i<=num1;i++){
            res*=i;
        }
        return res;
    }

}

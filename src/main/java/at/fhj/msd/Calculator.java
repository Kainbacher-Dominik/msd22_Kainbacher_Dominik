package at.fhj.msd;

public class Calculator {
    public static double add(double num1,double num2){
        return num1+num2;
    }
    public static double minus(double num1,double num2){
        return num1-num2;
    }
    public static double divide(double num1,double num2){
        return num1/num2;
    }
    public static double multiply(double num1,double num2){
        return num1*num2;
    }
    public static double falty(double num1){
        int res=1;
        for (int i=2;i<=num1;i++){
            res*=i;
        }
        return res;
    }

}

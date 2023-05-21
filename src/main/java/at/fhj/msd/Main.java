package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        double num1= Double.parseDouble(args[0]);
        double num2= Double.parseDouble(args[1]);
        System.out.println(Calculator.add(num1,num2));
        System.out.println(Calculator.minus(num1,num2));
        System.out.println(Calculator.divide(num1,num2));
        System.out.println(Calculator.multiply(num1,num2));
    }
}

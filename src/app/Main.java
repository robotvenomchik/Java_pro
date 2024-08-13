package app;


public class Main {
    private static final double CONV_K=2.20462;
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        double kgs =5;
        double pounds= convKgsToPounds(kgs);
        System.out.println("Result: " + pounds + " pounds.");
    }

    private static double convKgsToPounds(double kgs){
        return kgs* CONV_K;
    }
}

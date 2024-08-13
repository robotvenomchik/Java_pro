package app;


public class Main {
    private static final double CONV_K=2.20462;
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        double kgs =5;
        double pounds= convKgsToPounds(kgs);
        System.out.println("Result: " + pounds + " pounds.");

        double pnds =12;
        double kilos= convPoundsToKgs(pnds);
        System.out.println("Result: " + kilos+ " kgs.");
    }

    private static double convKgsToPounds(double kgs){
        return kgs* CONV_K;
    }

    private static double convPoundsToKgs(double pnds){
        return pnds / CONV_K;
    }
}

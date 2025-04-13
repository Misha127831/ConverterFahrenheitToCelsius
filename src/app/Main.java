package app;

public class Main {

    public static void main(String[] args){
        System.out.println("App to convert fahrenheit to celsius.");
        double C = 7;
        double cel = convFahrenheitToCelsius(C);
        System.out.println("Result " + cel + " celsius.");
    }
    private static double convFahrenheitToCelsius(double C){
        return (C-32)/1.8;
    }
}

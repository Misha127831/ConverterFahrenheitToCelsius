package app;

public class Main {

    public static void main(String[] args){
        System.out.println("App to convert fahrenheit to celsius and vice versa.");
        double F = 7;
        double C = 15;
        double cel = convFahrenheitToCelsius(F);
        double fah = convCelsiusToFahrenheit(C);
        System.out.println("Result " + cel + " celsius " + fah + " fahrenheit.");
    }
    private static double convFahrenheitToCelsius(double F){
        return (F-32)/1.8;
    }
    private static double convCelsiusToFahrenheit(double C){
        return (C * 1.8) + 32;
    }
}

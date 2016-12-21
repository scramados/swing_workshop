package Model;

/**
 * Created by jasper on 14/12/2016.
 */
public class Fahrenheit implements Temperature {
    @Override
    public double convertFromKelvin(double kelvin) {
        return kelvin * 9/5 - 459.67;
    }

    @Override
    public double convertToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }
}

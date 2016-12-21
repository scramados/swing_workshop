package Model;

/**
 * Created by jasper on 14/12/2016.
 */
public class Celsius implements Temperature {
    @Override
    public double convertFromKelvin(double celcius) {
        return celcius - 273.15;
    }

    @Override
    public double convertToKelvin(double kelvin) {
        return kelvin + 273.15;
    }
}

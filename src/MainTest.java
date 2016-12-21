import Model.Celsius;
import Model.Fahrenheit;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by jasper on 14/12/2016.
 */
public class MainTest {
    private static Celsius celsius = new Celsius();
    private static Fahrenheit fahrenheit = new Fahrenheit();
    public static void main(String[] args) {
        double temp;
        temp = celsius.convertToKelvin(23);
        System.out.println(temp);
        temp = fahrenheit.convertFromKelvin(temp);
        System.out.println(temp);
        NumberFormat formatter = new DecimalFormat("#0.0");
        System.out.println(formatter.format(temp));
    }
}

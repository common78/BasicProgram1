public class GrassHopper {
    public static String WeatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0) {
            return c + " температура замерзания";
        } else {
            return c + " температура выше точки замерзания";
        }
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * 5 / 9.0;
        return celsius;
    }
}

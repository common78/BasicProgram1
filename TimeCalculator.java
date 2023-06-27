public class TimeCalculator {
    public static int timeSinceMidnight(int h, int m, int s) {
        int milliseconds = ((h * 60 * 60) + (m * 60) + s) * 1000;
        return milliseconds;
    }

    public static void main(String[] args) {
        int hours = 0;
        int minutes = 1;
        int seconds = 1;
        int result = timeSinceMidnight(hours, minutes, seconds);
        System.out.println("Time since midnight: " + result + " milliseconds");
    }
}

public class NumberNegator {
    public static int makeNegative(int number) {

        return (number <= 0) ? number : -number;
    }

    public static void main(String[] args) {
        int number1 = 1;
        System.out.println("Number: " + number1 + " --> Negated Number: " + makeNegative(number1));

        int number2 = -5;
        System.out.println("Number: " + number2 + " --> Negated Number: " + makeNegative(number2));

        int number3 = 0;
        System.out.println("Number: " + number3 + " --> Negated Number: " + makeNegative(number3));
    }
}

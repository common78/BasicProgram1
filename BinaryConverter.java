public class BinaryConverter {
    public static String toBinary(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            binary.insert(0, remainder);
            number /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int number1 = 1;
        System.out.println("toBinary(1) = " + toBinary(number1));

        int number2 = 5;
        System.out.println("toBinary(5) = " + toBinary(number2));

        int number3 = 11;
        System.out.println("toBinary(11) = " + toBinary(number3));
    }
}

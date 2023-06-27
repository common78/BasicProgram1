public class DoubleInteger {
    public static int doubleInteger(int num){
        return num * 2;
    }

    public static void main(String[] args){
        int number = 5;
        int doubledNumber = doubleInteger(number);
        System.out.println("The doubled number is: " + doubledNumber);
    }
}

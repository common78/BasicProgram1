public class DatingRuleCalculator {
    public static String ageRange(int age) {
        int min, max;
        if (age <= 14) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
        } else {
            min = (int) ((age / 2) + 7);
            max = (age - 7) * 2;
        }
        return min + "-" + max;
    }

    public static void main(String[] args) {
        int age1 = 27;
        System.out.println("Age: " + age1 + " => Age Range: " + ageRange(age1));

        int age2 = 5;
        System.out.println("Age: " + age2 + " => Age Range: " + ageRange(age2));

        int age3 = 17;
        System.out.println("Age: " + age3 + " => Age Range: " + ageRange(age3));
    }
}


public class CenturyCalculator {
    public static int getCentury(int year) {

        return (year % 100 == 0) ? (year / 100) : (year / 100) + 1;
    }

    public static void main(String[] args) {
        int year1 = 1705;
        System.out.println("Year: " + year1 + " --> Century: " + getCentury(year1));

        int year2 = 1900;
        System.out.println("Year: " + year2 + " --> Century: " + getCentury(year2));

        int year3 = 1601;
        System.out.println("Year: " + year3 + " --> Century: " + getCentury(year3));

        int year4 = 2000;
        System.out.println("Year: " + year4 + " --> Century: " + getCentury(year4));
    }
}


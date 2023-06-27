public class Greeter {
    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }

    public static void main(String[] args) {
        String greeting1 = greet("Alice");
        System.out.println(greeting1);

        String greeting2 = greet("Johnny");
        System.out.println(greeting2);
    }
}


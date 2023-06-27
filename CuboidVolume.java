public class CuboidVolume {
    public static int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        int length = 5;
        int width = 4;
        int height = 3;
        int volume = calculateVolume(length, width, height);
        System.out.println("The volume of the cuboid is: " + volume);
    }
}

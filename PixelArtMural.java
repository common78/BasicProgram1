public class PixelArtMural {
    public static boolean isDivisible(int wallLength, int pixelLength) {
        return wallLength % pixelLength == 0;
    }

    public static void main(String[] args) {
        int wallLength1 = 4050;
        int pixelLength1 = 27;
        boolean result1 = isDivisible(wallLength1, pixelLength1);
        System.out.println("is_divisible(4050, 27) = " + result1);

        int wallLength2 = 4066;
        int pixelLength2 = 27;
        boolean result2 = isDivisible(wallLength2, pixelLength2);
        System.out.println("is_divisible(4066, 27) = " + result2);
    }
}

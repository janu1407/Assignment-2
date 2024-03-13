public class DivisibleBy5&2 {
    public static void main(String[] args) {
        int[] arr = {100, 52, 43, 99, 42, 40, 91};
        int s = 0;

        for (int value : arr) {
            if (value % 5 == 0 && value % 2 == 0) {
                s += value;
            }
        }

        System.out.println("Sum of numbers divisible by 5 and 2: " + s);
    }
}
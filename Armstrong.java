public class Armstrong {

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Find the number of digits in the number
        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        // Calculate the sum of the nth power of its digits
        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        return result == number;
    }

    public static void main(String[] args) {
        int num = 153;
        if(isArmstrong(num))
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}

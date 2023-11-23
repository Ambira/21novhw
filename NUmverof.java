import java.util.Scanner;
public class NUmverof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter a number: ");
        long no = sc.nextLong();  //int is replaced with long so that it can take longer integers

        if (no < 0) {
            System.out.println("Please enter a non-negative number.");

        } else {
            long sum = 0;

            while (no!=0) {
                sum = sum+ no%10;
                no = no /10;

            }

            System.out.println("THe sum is :"+sum);


        }
    }
}
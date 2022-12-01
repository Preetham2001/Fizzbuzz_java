import java.util.Scanner;
public class FizzBuzz {
    public static void main(String args[])
    {
        // input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        // read an integer from the user
        int n = sc.nextInt();
        System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");


        for (int i = 1; i <= n; i++)
        {
            // Print "FizzBuzz" if the number is divisible by both 3 and 5
            if (i%3==0 && i%5==0)
                System.out.print("FizzBuzz");

            // Print "Fizz" if the number is divisible by 3 only
            else if (i%3==0)
                System.out.print("Fizz");

            // Print "Buzz" if the number is divisible by 5 only
            else if (i%5==0)
                System.out.print("Buzz");

            // Print the number itself if it does not satisfy any of the above conditions
            else
                System.out.print(i);

            System.out.print(","+" ");
        }

    }
}  
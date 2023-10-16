package AH3.AH3;

public class AH3 {
    public static void fizzBuzz(int n)
    {
        System.out.print("Input: n = " + n + "\nOutput: ");
        for (int i = 1; i<=n; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            System.out.print("FizzBuzz ");
            else if (i % 3 == 0)
                System.out.print("Fizz ");
            else if (i % 5 == 0)
                System.out.print("Buzz ");
            else
                System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static void fizzBuzzRecStart(int n)
    {
        System.out.print("Input: n = " + n + "\nOutput: ");
        System.out.println(fizzRec(n,1, ""));
    }
    public static String fizzRec(int n, int x, String string)
    {
        if (x > n)
            return string;
        if (x % 3 == 0 && x % 5 == 0)
            return (string + "FizzBuzz " + fizzRec(n, x+1, string));
        else if (x % 3 == 0)
            return (string + "Fizz " + fizzRec(n, x+1, string));
        else if (x % 5 == 0)
            return (string + "Fizz " + fizzRec(n, x+1, string));
        else
            return (string + x + " " + fizzRec(n, x+1, string));
    }

    public static void main(String[] args)
    {
        fizzBuzz(15);
        fizzBuzzRecStart(15);
    }
}

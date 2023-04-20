package com.bl.Logical_Programs;
import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        long num = sc.nextLong();
        int sum = 0, i = 1;

        System.out.print("Divisors:");
        //executes until the condition becomes false
        while (i <= num/2)
        {
            if (num % i == 0)
            {
                    System.out.print(i + " + ");
                //executes until the condition becomes false
                    sum += i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Sum Of Divisors:" + sum);
        //compares sum with the number
        if (sum == num)
        {
            System.out.println(num + " is a perfect number.");
        }
        else
        {
            System.out.println(num + " is Not a perfect number.");
        }
    }
}

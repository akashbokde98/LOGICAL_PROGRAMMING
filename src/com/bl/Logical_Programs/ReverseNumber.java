package com.bl.Logical_Programs;
import java.util.Scanner;
public class ReverseNumber
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Number:");
            long num = sc.nextLong();
            long reverse = 0;
            while(num != 0)
            {
                long remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num/10;
            }
            System.out.println("The reverse of the number is: " + reverse);
        }
}

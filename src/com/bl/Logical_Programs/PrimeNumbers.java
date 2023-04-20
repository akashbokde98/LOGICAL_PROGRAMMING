package com.bl.Logical_Programs;
import java.util.Scanner;
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Check Prime Number:");
        int num = sc.nextInt();

        int i, m = 0, flag = 0;
        //the number to be checked
        m = num / 2;
        if(num == 0 || num == 1)
        {
            System.out.println(num+" is not prime number");
        }
        else
        {
            for(i = 2; i <= m; i++)
            {
                if(num % i == 0){
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println(num + " is prime number");
            }
        }
    }
}

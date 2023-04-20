package com.bl.Logical_Programs;
import java.util.Scanner;

public class CouponNumbers
{
    static String[] generateCoupon(int n, int range, String[] strArr)
    {
        //Loop for Generating Specefied Number of Coupon
        int i = 0;
        while (i < n)
        {
            String str = "";// Declared Empty String to Store Random Number.
            //Loop Generating Random Number.
            for (int j = 0; j < range; j++)
            {
                int randNum = (int) (Math.random() * 10);//Generating Random Numbers to Generate Coupon.
                String s = String.valueOf(randNum);//Converts The Int Value to string Value.
                str += s;
            }
            strArr[i] = str;//Assigning String of Coupon to Array.
            i++;
        }
        return strArr;
    }
    //Checking Repeated coupon and Printing Coupon.
    static void printCoupon(String[] couponArr)
    {
        //Retrieving Array of Coupon.
        for (int i = 0; i < couponArr.length; i++)
        {
            System.out.println(couponArr[i]);
            for (int j = i + 1; j < couponArr.length; j++)
            {
                //Condition For Checking Repeated Coupon.
                if (couponArr[i] != couponArr[j])
                {
                    continue;
                }
                else
                {
                    System.out.println("Repeated Coupon Code is:" + couponArr[i]);
                }

            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Generate Number of Coupon:");//Taking Input For Generating Numbers of Coupon.
        int N = sc.nextInt();
        System.out.println("Enter Range For Coupon Code:");
        int r = sc.nextInt();
        String[] couponArr = new String[N];//Array For Store Coupon Code.
        String[] couponList = generateCoupon(N,r,couponArr);
        System.out.println("Coupon Code is:");
        printCoupon(couponList);//Displaying Coupon Code.
    }
}

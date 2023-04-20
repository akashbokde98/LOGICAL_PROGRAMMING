package com.bl.Logical_Programs;
import java.util.Scanner;
import java.lang.System;

public class StopWatchEx
{
    long start;
    public double startTime(Scanner sc)
    {
        System.out.println("Type any character to start the stopwatch");
        char s = sc.next().charAt(0);
        double start = System.currentTimeMillis();
        return start;
    }
    public double endTime(Scanner sc)
    {
        System.out.println("Type any character to stop the stopwatch");
        char m = sc.next().charAt(0);
        double end = System.currentTimeMillis();
        return end;
    }
    public double elapsedTimeInSecond(double start, double end)
    {
        double t = ((end - start) / 1000.0);
        return t;
    }
    public double elapsedTimeInMinute(double start, double end)
    {
        double t = ((end - start) / 1000.0 / 60);
        return t;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StopWatchEx obj = new StopWatchEx();

        double start = obj.startTime(sc);
        System.out.println(start);

        double end = obj.endTime(sc);
        System.out.println(end);

        double time1 = obj.elapsedTimeInSecond(start, end);
        System.out.println("Elapsed Time In Second = " + time1);

        double time2 = obj.elapsedTimeInMinute(start, end);
        System.out.println("Elapsed Time In Minute = " + time2);
    }
}

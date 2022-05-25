package geekster.Day_16;

import java.util.Scanner;

public class Day_16_home_work
{
    void fact(int[] num)
    {
        int fac = 1;
        num[0] = fac;
        for (int i = 1; i<num.length; i++)
        {
            fac *= i;
            num[i] = fac;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Day_16_home_work obj = new Day_16_home_work();

        int num = sc.nextInt();
        int[] arr = new int[num+1];

        obj.fact(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}

package geekster.Day_16;

import java.util.Scanner;

public class Day_16_class
{

    /*boolean prime(int num)
    {
        int i;
        for (i =2; i<num;i++)
        {
            if (num%i==0)
                break;
        }
        if (i==num)
            return true;
        else
            return false;
    }*/


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*int[] arr = {1,3,4,6,7};
        int num = 5;
        for (int i =0; i<arr.length-1;i++)
        {
            if (arr[i] < num && arr[i+1] > num)
                arr[i] = num;
        }
        for (int i : arr)
            System.out.print(i + " ");
*/

//      last Number to use to take correct sorting

        /*int[] arr = {1,3,5,6,7,4};

        int j = arr.length-2;

        while (j>0 && arr[j] > arr[j+1])
        {
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;

            j--;
        }
        for (int i : arr)
        {
            System.out.print(i + " ");
        }*/

        /*int[] arr = {5,4,10,3,2,9,1};

        for (int j = 0; j<arr.length;j++)
        {
            for (int i = 0; i<arr.length;i++)
            {
                int fix = j;
                if (arr[fix] < arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[fix];
                    arr[fix] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
*/

//        Selection sort with Reverse


        /*int[] arr = {5,4,10,3,2,9,1};

        for (int j = 0; j< arr.length;j++)
        {
            for (int i = arr.length-2; i>=0;i--)
            {
                int fix = i;
                if (arr[fix] > arr[i+1])
                {
                    int temp = arr[i+1];
                    arr[i+1] = arr[fix];
                    arr[fix] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");*/

//      Fibonacci Numbers

        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =1;
        int a = 0, b=1;
        int[] arr = new int[n];
        for (int i = 0; i<n;i++)
        {
            arr[i] = sum;

            sum = a+b;
            a = b;
            b = sum;
        }
        for (int i : arr)
        {
            System.out.print(i + " ");
        }*/

        /*Day_16_class obj = new Day_16_class();

        int n = sc.nextInt();


        int count = 0;
        for (int i = 0; i<n; i++)
        {
            boolean result = obj.prime(i);
            if (result==true)
                ++count;
        }
        System.out.print(count);
*/

//        Factorial




    }
}

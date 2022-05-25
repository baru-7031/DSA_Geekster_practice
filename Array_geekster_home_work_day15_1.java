package GeekSter_Array;

import java.util.Scanner;

public class Array_geekster_home_work_day15_1
{
    void bubbleSort(int[] n)
    {
        for (int i = 0; i<n.length-1;i++)
        {
            for (int j = 0;j<n.length-1-i;j++)
            {
                if (n[j]>n[j+1])
                {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
    }
    void selectionSort(int[] n)
    {
        for (int i = 0; i<n.length;i++)
        {
            int fix = i;
            for (int j = i+1;j<n.length;j++)
            {
                if (n[fix]>n[j])
                {
                    int temp = n[fix];
                    n[fix] = n[j];
                    n[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Range : ");
        int range = sc.nextInt();

        System.out.println("Insert Array Values : " + range + " Times : ");
        int[] n = new int[range];
        for (int i =0; i<n.length;i++)
        {
            n[i] = sc.nextInt();
        }
        Array_geekster_home_work_day15_1 obj = new Array_geekster_home_work_day15_1();
        int[] n1 = n.clone();
        System.out.println("Bubble Sorting Running...");
        System.out.print("Before Sorting -> ");
        for (int i : n)
            System.out.print(i + " ");
        obj.bubbleSort(n);
        System.out.print("After Sorting -> ");
        for (int i : n)
            System.out.print(i + " ");
        System.out.println("\n----------------------------------------\n");
        System.out.println("Selection Sorting Running...");
        System.out.print("Before Sorting -> ");
        for (int i : n1)
            System.out.print(i+" ");
        obj.selectionSort(n1);
        System.out.print("After Sorting -> ");
        for (int i : n1)
            System.out.print(i + " ");
    }
}

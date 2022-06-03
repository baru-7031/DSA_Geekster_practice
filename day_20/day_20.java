package geekster.day_20;

import java.util.Scanner;

public class day_20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int i =0;


        while(i<n)
        {
            arr[i]= sc.nextInt();
            i++;
        }
//        Mountain array

        boolean ans = true;

        if (n<3)
        {
            ans = false;
        }
        else
        {

            for (i=1;i<n;i++)
                if (arr[i]<=arr[i-1])
                    break;
            if (i == n)
                ans = false;
            else
            {
                for (;i<n;i++)
                    if (arr[i]>=arr[i-1])
                        break;
                if (i==n)
                    ans = true;
                else
                    ans = false;
            }

        }
        System.out.print(ans);

//        i=0;
//        boolean count = true;
//        while(i<=j)
//        {
//            if (arr[i]!=arr[j])
//            {
//                count = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//        System.out.println(count);

//
//        i=0;
//        while(i<=j)
//        {
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//            i++;
//            j--;
//        }
//
//        i=0;
//        while (i<n)
//        {
//            System.out.print(arr[i] + " ");
//            i++;
//        }

//        int j = 1;
//        i=0;
//        while (i<n/2)
//        {
//            int temp = arr[i];
//            arr[i] = arr[n-j];
//            arr[n-j] = temp;
//            j++;
//            i++;
//        }
//        i=0;
//        while (i<n)
//        {
//            System.out.print(arr[i] + " ");
//            i++;
//        }


//        for (int i = 0; i<n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//
//        int j = 1;
//        for (int i =0; i<(n/2);i++)
//        {
//            int temp = arr[i];;
//            arr[i] = arr[n-j];
//            arr[n-j] = temp;
//            j++;
//        }
//        for (int x : arr)
//            System.out.print(x + " ");

    }
}

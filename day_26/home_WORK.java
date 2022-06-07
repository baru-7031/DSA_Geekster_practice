package geekster.day_26;

import java.sql.SQLOutput;

public class home_WORK
{
    static boolean checkArray(int[][] arr,int n, int n1)
    {
        int sum =0,p=0;
        if (n != n1)
        {
            System.out.println("Columns are not same :(");
            return false;
        }
        for (int i =0; i<n;i++)
        {
            for (int j =0; j<n1;j++)
            {
                sum += arr[i][j];
            }


            if (i == 0)
            {
                p = sum;
                sum =0;
            }
            else
            {
                if (p != sum)
                {
                    return false;
                }
                p = sum;
                sum =0;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},{1,2,3},{1,2,9}};

        int n = arr.length;

        for (int i =0; i<n;i++)
        {
            if (arr[i].length != n)
            {
                System.out.println("Sorry Some Think Wrong :(");
                System.exit(0);
            }
        }
        int n1 = arr[0].length;
        System.out.println(checkArray(arr, n, n1) + " Not Same");

    }
}

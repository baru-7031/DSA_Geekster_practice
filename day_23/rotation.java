package geekster.day_23;

public class rotation
{
    public static void main(String[] args)
    {
        int[] arr = {20,13,60,12,2,6};
        int n = arr.length;
        for (int i =0; i<n;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }
        for (int x : arr)
        {
            System.out.print(x + " ");
        }


    }
}

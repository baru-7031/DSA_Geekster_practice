package geekster.day_22;

public class home_work_1
{
    public static void main(String[] args)
    {
//        Sort by parity (Odds first then evens)

        int[] arr = {1,2,4,3,6,7,8,9};

        int n = arr.length;

        for (int i =0; i<n;i++)
            if (arr[i]%2 != 0)
            {
                System.out.print(arr[i] + " ");
            }
        for (int i =0; i<n;i++)
        {
            if (arr[i]%2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }

    }
}

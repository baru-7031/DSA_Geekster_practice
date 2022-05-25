package GeekSter_Array;

public class array_day15_geekster
{
    static boolean isDublicat(int[] num)
    {
        for (int i =0; i<num.length-1;i++)
            if (num[i] == num[i+1])
                return true;
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 11,12,13,14,15,15};
        Buffer Sorting Code
        int[] arr = {20,10,11,18,14,55};
        int team = 0;
        for (int j = 0; j<arr.length-1;j++)
        {
            for (int i = 0; i<arr.length-1;i++)
            {
                if (arr[i]>arr[i+1])
                {
                    team = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = team;
                }
            }
        }
        for (int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        Selection Sort
        for (int j =0; j<arr.length;j++)
        {
            int fix = i;
        }

        int max =0;
        for (int i = 0; i<arr.length;i++)
        {
            if (max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);

        boolean result = isDublicat(arr);

        System.out.println(result);




    }
}

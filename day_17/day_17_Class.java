package geekster.Day_17;

public class day_17_Class
{
    int search(int[] n, int x)
    {
        for (int i =0; i<n.length;i++)
        {
            if (n[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        day_17_Class obj = new day_17_Class();
        int[] arr = {1,2,3,4,5};
        int x =4;
        System.out.print(obj.search(arr,x));

    }
}
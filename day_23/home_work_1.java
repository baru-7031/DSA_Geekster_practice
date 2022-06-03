package geekster.day_23;

public class home_work_1
{
    public static void main(String[] args)
    {
        int[] arr = {4,3,7,10,20,5};
        int n = arr.length;
        int target = 12;

//        3 sum O(n)
        int i =1;
        int j =n-1;
        target = target- arr[0];
        while(i<j)
        {
            if ((arr[i]+arr[j]) == target)
            {
                System.out.println(arr[0]+ " " +arr[i] + " " + arr[j]);
                i++;
                j--;
            }
            else if ((arr[i]+arr[j]) > target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }


    }
}

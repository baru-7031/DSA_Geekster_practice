package GeekSter_Array;

public class Array_geekster_home_work_day15_2
{
    public static void main(String[] args)
    {
        int[] num = {1,1,2,2,3,4,5,6,7,7,7};
        int count = 0;
            for (int j =0; j<num.length-1;j++)
            {
                if (num[j] == num[j + 1])
                    ++count;
            }
        System.out.print("Copy element " + count + " Times");

    }
}

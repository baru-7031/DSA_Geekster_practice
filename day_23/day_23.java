package geekster.day_23;

public class day_23
{
    static void twoSum(int[] arr,int sum)
    {
        int i =0;
        int j = arr.length-1;

        while(i<j)
        {
            if (arr[i]+arr[j] == sum)
            {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }
            else if (arr[i]+arr[j] > sum)
                j--;
            else
                i++;
        }
    }

    static void threeSum(int[] arr, int sum)
    {

    }

    static void rotation(int[] arr)
    {

        int n = arr.length;
        int x = arr[n - 1];

        for (int i = n - 1; i >=0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
        for (int x1 : arr)
        {
            System.out.print(x1 + " ");
        }


//        int n = arr.length;
//        int temp = arr[0];
//        arr[0] = arr[n-1];
//        arr[n-1] = temp;
//
//        for (int i =1; i<n;i++)
//        {
//            for (int j =1;j<n-1;j++)
//            {
//                if (arr[j]>arr[j+1])
//                {
//                    temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int x : arr)
//        {
//            System.out.print(x + " ");
//        }
    }

    static void square(int[] arr)
    {
        int n = arr.length;
        for (int i =0; i<n;i++)
        {
            arr[i] = arr[i] * arr[i];
        }
        int[] start = new int[n/2];


    }


    public static void main(String[] args)
    {
        int[] arr = {1,2,6,7,9,10};
        int[] arr1 = {-6,-3,-1,2,4,5};
        int sum = 11;

        twoSum(arr,sum);
        rotation(arr);
        square(arr1);

    }
}

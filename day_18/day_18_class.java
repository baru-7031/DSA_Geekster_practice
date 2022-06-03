package geekster.day_18;

public class day_18_class
{
//    static int linearSearch1(int[] num,int n)
//    {
//        for (int i = 0; i<num.length;i++)
//        {
//            if (n==num[i])
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
//    static int linearSearch2(int[] num, int n)
//    {
//        for (int i = num.length-1; i>=0;i--)
//        {
//            if (n==num[i])
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    static void linearSearch(int[] num, int n)
//    {
//        int first = -1;
//        int last = -1;
//        for (int i = 0; i<num.length;i++)
//        {
//            if (n==num[i])
//            {
//                first = i;
//                break;
//            }
//        }
//        for (int i = 0; i<num.length;i++)
//            if (n==num[i])
//                last = i;
//
//        System.out.print(first + ","+ last);
//    }

    public static void main(String[] args)
    {
//        int[] num = {1,2,3,3,4,5,3,6,7};
//
//        int n = 3;
//
//        System.out.print(linearSearch1(num,n) +" , " + linearSearch2(num,n));

//        int[] arr = {5,6,7,1,9,8};
//
//        int max =Integer.MIN_VALUE;
//        int min =Integer.MAX_VALUE;
//        for (int i =0; i<arr.length;i++)
//        {
//            if (arr[i]>max)
//            {
//                max = arr[i];
//            }
//            if (arr[i]<min)
//            {
//                min = arr[i];
//            }
//        }
//        System.out.print(max-min);

//        int[] arr = {1,3,20,4,1,0};
//
//        for (int i = 1; i<arr.length-1; i++)
//        {
//            if (arr[i-1] < arr[i] && arr[i] > arr[i+1])
//            {
//                System.out.print(arr[i] + " ");
//            }
//        }

        int[] arr = {4,4,4,4,4};

        if (arr.length == 1)
            System.out.print(arr[0] + " ");
        else if (arr[0]>=arr[1])
            System.out.print(arr[0] + " ");
        if (arr[arr.length-1] >= arr[arr.length-2])
            System.out.print(arr[arr.length-1] + " ");

        for (int i = 1; i<arr.length-1;i++)
        {
            if (arr[i-1]<arr[i] && arr[i]>arr[i+1])
            System.out.print(arr[i] + " ");
        }


    }
}

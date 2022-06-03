package geekster.day_22;

public class day_22
{
    public static void main(String[] args)
    {
//        int[] arr = {2,3,5,8};
//        int[] arr1 = {1,5,7,8,9};
////
//        int i=0;
//        int j=0;
//
//        while(i<arr.length && j<arr1.length)
//        {
//            if (arr[i]<arr1[j])
//                i++;
//            else if (arr[i]>arr1[j])
//                j++;
//            else
//            {
//                System.out.print(arr[i] + " ");
//                i++;
//                j++;
//
//            }
//
//
//        }

//        int[] arr1 = {2,3,5,8};
//        int[] arr2 = {1,5,7,8,9};
//        int i = 0;
//        int j = 0;
//        int k =0;
//        int[] arr3 = new int[arr1.length+arr2.length];
//        while(i<arr1.length && j<arr2.length)
//        {
//            if (arr1[i]<arr2[j])
//            {
//                arr3[k] = arr1[i];
//                i++;
//                k++;
//            }
//            else
//            {
//                arr3[k] = arr2[j];
//                j++;
//                k++;
//            }
//
//        }
//        while(i<arr1.length)
//        {
//            arr3[k] = arr1[i];
//            i++;
//            k++;
//        }
//        while(j<arr2.length)
//        {
//            arr3[k] = arr2[j];
//            j++;
//            k++;
//        }
//
//        for (int x : arr3)
//            System.out.print(x + " ");

        int[] arr = {1,2,6,7,9,10};

        int n =11;


            for (int i =0;i<arr.length;i++)
            {
                for (int j =i+1; j<arr.length-1;j++)
                {
                    if ((arr[i]+arr[j]) == n)
                        System.out.println(arr[i] + " " + arr[j]);
                }
            }

            int i =0;
            while(i<arr.length)
            {
                int j =0;
                while(j<arr.length)
                {
                    if ((arr[i]+arr[j]) == n)
                        System.out.println(arr[i] + " " + arr[j]);
                    j++;
                }
                i++;

            }

    }
}

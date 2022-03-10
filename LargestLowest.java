class LargestLowest{
    public static void main(string[], args)
    {
        int arr[] = {1,2,3,4,5,6};

        int largest= 0, smallest = 99999;

        for(int i= 0; i< arr.lenght; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(smallest);
    }
}
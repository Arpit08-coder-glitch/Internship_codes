class Sum_of_all_subsets_of_XORS {
     
    static int xorSum(int arr[], int n)
    {
         
        int bits = 0;
     
        for (int i = 0; i < n; ++i)
            bits |= arr[i];
     
        int ans = bits * (int)Math.pow(2, n-1);
     
        return ans;
    }
    public static void main(String[] args)
    {
         
        int arr[] = {1, 3};
        int size = arr.length;
         
        System.out.print(xorSum(arr, size));
    }
}
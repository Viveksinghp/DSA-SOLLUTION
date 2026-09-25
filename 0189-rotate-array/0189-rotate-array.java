class Solution {
    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] arr, int k) {
      int n = arr.length;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7};
        
        int k=3;
        rotate(arr,k);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
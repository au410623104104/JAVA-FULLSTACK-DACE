public class ZerosToRight {
    public static void main(String[] args) {
        int[]arr={1,0,3,0,5,0,2};
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<n)
        {
            arr[index]=0;
            index++;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]);
    }
    
}

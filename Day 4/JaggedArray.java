import java.util.Scanner;

public class JaggedArray{
    public static void main(String[] args) {
        int[][] a={
            {1,2,3},
            {4,5} ,
            {6,7,8,9}
             };
             for(int i=0;i<a.length;i++)
             {
                for(int j=0;j<a[i].length;j++)
                {
                    System.out.println(a[i][j]+" ");
                }
             }
             int[][] arr =new int[3][];
             arr[0]=new int[3];
             arr[1]=new int[2]; 
             arr[2]=new int[1];
            Scanner sc =new Scanner(System.in); 
        for(int i=0;i<arr.length;i++)
        {
           for(int j=0;j<a[i].length;j++)
           {
            arr[i][j]=sc.nextInt();
           }
        }        
        for(int row[]:arr)  
            {

                for(int val:row)
                {
                    System.out.println(val+" ");
                }
            }  
            System.out.println();
     }

}
    


public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int dup=n;
        int sum=0;
        while(dup!=0)
        {
            int rem=dup%10;//3
            sum=sum+(int)Math.pow(rem,3);
            dup=dup/10;
        }
        if(n==sum)
        {
            System.out.println("Amstrong");
        }
    }
    
}

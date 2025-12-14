public class Swap {
    public static void main(String[] args) {
        int a=20, b=30;
        int temp = a;
        a =b ;
        b = temp;
        System.out.println(a+ " " +b);
        //without third variable 
        a=a+b;//50
        b=a-b;//20
        a=a-b;//30
    }

    
}
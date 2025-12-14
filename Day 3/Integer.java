
public class Integer {
    public static void main(String[] args) {
        int a[] = {90,23,45,67,25};
        int first = Integer .MIN_VALUE;
        int second = Integer .MIN_VALUE;
        //iterate
        for(int i=0;i < a.length;i++)
        {
            if(a[i] < first)
            {
                second = first;
                first = a[i];
            } 
            else if (a[i] < second)
            {
                second = a[i];
            }
        }
        System.out.println(second);

    }
    
}

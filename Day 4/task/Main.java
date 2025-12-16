import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int a[] = new int[n1];
        for (int i = 0; i < n1; i++)4
            a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int b[] = new int[n2];
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            if (i < n2)
                System.out.print(a[i] * b[i] + " ");
            else
                System.out.print(a[i] + " ");
        }
    }
}


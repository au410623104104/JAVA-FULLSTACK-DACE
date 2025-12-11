public class Kpattern {
    public static void main(String[] args) {
        int n = 7; // height of K (you can change this)

        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            System.out.print("* ");  // Left vertical line of K

            if (i < mid) {
                // Upper diagonal
                for (int j = 0; j < mid - i; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            } else if (i > mid) {
                // Lower diagonal
                for (int j = 0; j < i - mid; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            } else {
                // Middle point (only one star)
                System.out.println("*");
            }
        }
    }
}

public class pattern_22 {
    public static void main(String[] args) {
        
        int n = 4;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                System.out.print(Math.max(Math.abs(n - i), Math.abs(n - j)) + 1);
            }

            System.out.println();
        }
    }
}

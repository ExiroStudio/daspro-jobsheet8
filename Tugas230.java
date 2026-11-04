import java.util.Scanner;

public class Tugas230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int total = 0;
        int n = sc.nextInt();
        sc.close();
        if (n < 3) {
            System.out.println("Nilai n minimal harus 3");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int k = i * j;
                    System.out.printf("%4d", k);
                    total += k;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + total);
        }
    }
}

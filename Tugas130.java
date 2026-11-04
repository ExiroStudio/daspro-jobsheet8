import java.util.Scanner;

public class Tugas130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Nilai n minimal harus lebih dari 0");
        } else {
            sc.close();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    total++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
        }
    }
}

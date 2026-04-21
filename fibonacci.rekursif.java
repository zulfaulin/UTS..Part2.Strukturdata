import java.util.Scanner;

public class fibonacciuts {

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static String buatOutput(int n) {
        String hasil = "";
        for (int i = 0; i < n; i++) {
            hasil += fibonacci(i);
            if (i != n - 1) hasil += ", ";
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah suku Fibonacci: ");
        int n = sc.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah:");
        System.out.print(buatOutput(n));

        sc.close();
    }
}

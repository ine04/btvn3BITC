import java.util.Scanner;
public class Calculator {
    
    //Bài 1: Tỉnh tổng số nguyên nhập vào đến khi dừng
    public int calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter an integer (or 'n/N' to stop): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'n/N' to stop.");
            }
        }

        scanner.close();
        return sum;
    }

    // Bài 2: Tính tổng của các tích số và in ra biểu thức
    public int calculateSumofProduct(int n) {
        int sum = 0;
        StringBuilder expression = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int product = 1;
            for (int j = 1; j <= i; j++) {
                product *= j;
                expression.append(j);
                if (j < i) {
                    expression.append("*");
                }
            }
            sum += product;
            if (i < n) {
                expression.append(" + ");
            }
        }

        System.out.println("Expression: " + expression.toString());
        return sum;
    }

    // Bài 3: In ra các thừa số nguyên tố của n
    public void printPrimeFactors(int n) {
        System.out.print("Cac thua so nguyen to cua " + n + " la: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.println();
    }
}

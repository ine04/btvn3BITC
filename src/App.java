public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        //Bai 1
        int sum = calculator.calculateSum();
        System.out.println("Tong la" + sum);

        
        //Bai 2
        int sumOfProduct = calculator.calculateSumofProduct(5); 
        System.out.printf("Tong cua tich la %d", sumOfProduct);
        


        //Bai 3
        calculator.printPrimeFactors (12);
        //Output: cac thua so nguyen to cua 12 la: 2 23
        calculator.printPrimeFactors (35);
        //Output: cac thua so nguyen to cua 35 la: 5 7
        calculator.printPrimeFactors(86);
        //Output: cac thua so nguyen to cua 86 la: 2 43
    
    }
}

public class CalculatorDriver {
 public static void main(String[]args) {
	 
	 
	 double [] num = new double [3];
	 num[0] = 27.1;
	 num[1] = 27.2;
	 num[2] = 27.3;
	 int [] array2 = new int [2];
	 array2[0] =7;
	 array2[1] =8;
	 
	System.out.println("Average1" + Calculator.getAverage(num));
	System.out.println("Sum1" + Calculator.getSum1(num));
	System.out.println("product1" +Calculator.Product(array2));
	System.out.println("Factorial" +Calculator.factorial(5));
	System.out.println("Average2" +Calculator.getAvarage(4,3));
	System.out.println("Sum2" +Calculator.getSum(3,5,1));
	System.out.println("product2" +Calculator.getPraduct(5,7));
	 
 }
}
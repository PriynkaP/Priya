package week1.day1;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quotient = 1, remainder = 0;
		int sum = 0;
		int number = 123;
		System.out.println("sum of digits :");
		System.out.println("----------");
        while (quotient != 0) {
        	quotient = number / 10;
        	remainder = number % 10;
        	System.out.println("Sum is : " + sum);
        	number = quotient;
        	System.out.println("Quotient is : " + quotient + "\n");
        	
        }
        
        System.out.println("sum of the given digit is : " + sum);
        System.out.println("remainder is : " + remainder + "\n");
	}

}

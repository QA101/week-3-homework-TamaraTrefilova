import java.util.Scanner;

public class CodingMethods {
	
	//1. Write a method which takes as input as a one number and returns first five even numbers.
	public static void printFirstEvenNumbers(int num) {
		int i = 1;
		while(i<=num) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
	}
	//2. Write a method which takes as input as a one number and returns first ten odd	numbers.
	
	public static void printFirstOddNumbers(int num) {
		int i = 1;
		while(i<=num) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
	}
	
//	3. Write a method which takes as input as a one number and returns first seven
//	square numbers.
	public static void printFirstSquareNumbers(int num) {
		int i = 1;
		while(i<=num) {
				System.out.print(i*i+" ");
			i++;
		}
		System.out.println();
	}
	
//	4. Write a method which takes as input as a one number and returns the sum of a
//	number.
	
	public static void printSumNumbers(int num) {
		int i = 1;
		int sum = 0;
		while(i<num) {
			System.out.print(i+" + ");
			sum+=i;
			i++;
		}
		System.out.println(num+" = "+(sum+num));
	}
	
	
//	5. Write a method which takes as input as a one number and returns the product of
//	a number.
	public static void printProductNumbers(int num) {
		int i = 1;
		int sum = 0;
		while(i<num) {
			System.out.print(i+" * ");
			sum*=i;
			i++;
		}
		System.out.println(num+" = "+(sum*num));
	}
	
//	6. Write a method which takes as input as a one number and returns the reverse of
//	a number.
	
	
	public static void findReverse(int num) {
		while(num!=0) {
			System.out.print(num%10);
			num = num/10;
		}
	}
//	7. Write a method which takes as input as a two number and returns swape of
//	numbers.
	
	public static void swipe(int numA, int numB) {
		System.out.println(numA+"  and "+numB );
		System.out.println(numB+"  and "+numA );
	}
	
	
//	8. Write a method which takes as input as a two number and returns the maximum
//	of the two.
	public static int returnMax(int numA, int numB) {
		return Math.max(numA, numB);
	}
	
//	9. Write a method which takes as input as a two number and returns the minimum
//	of the two.
	
	public static int returnMin(int numA, int numB) {
		return Math.min(numA, numB);
	}
	
//	10. Write a method which takes as input as a one number and returns the factorial of
//	a number.
	
	public static int findFactorial(int num) {
		if(num<0) {
			return 1;
		}
		return num*findFactorial(num-1);
	}
	
//	11. Write a method which takes as input as a three number and returns the
//	maximum of the three.
	
	public static int returnMaxOfThree(int numA, int numB, int numC) {
		return Math.max(Math.max(numA, numB),numC);
	}
	
//	12. Write a method which takes as input as a three number and returns the minimum
//	of the three.
	
	public static int returnMinOfThree(int numA, int numB, int numC) {
		return Math.min(Math.min(numA, numB),numC);
	}
	public static void main(String[] args) {
		findReverse(12345);
	    System.out.println(findFactorial(5));

	}

}

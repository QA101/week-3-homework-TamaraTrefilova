import java.util.Scanner;

public class WhileLoops {

	/*
	 * 1) 10 first
	 */
	
	public static void printFirstTenNumbers() {
		int i = 1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
	}
	
	/*
	 * 5n even numbers
	 */
	
	public static void printFirstEvenNumbers() {
		int i = 1;
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
	}
	
	/*
	 * 5n odd numbers
	 */
	
	public static void printFirstOddNumbers() {
		int i = 1;
		while(i<=10) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
	}
	
	
	/*
	 * first 10 square numbers
	 */
	
	public static void printFirstSquareNumbers() {
		int i = 1;
		while(i<=10) {
				System.out.print(i*i+" ");
			i++;
		}
		System.out.println();
	}
	/*
	 * first 10 cube numbers
	 */
	public static void printFirstcubeNumbers() {
		int i = 1;
		while(i<=10) {
				System.out.print(i*i*i+" ");
			i++;
		}
		System.out.println();
	}
	
	
	/*
	 * Print sum
	 */
	
	public static void printSumNumbers() {
		int i = 1;
		int sum = 0;
		while(i<5) {
			System.out.print(i+" + ");
			sum+=i;
			i++;
		}
		System.out.println("5 = "+(sum+5));
	}
	
	/*
	 * Write a java program to find sum of a number and take input from the user.
	 */
	
	public static void findSumFromInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of numbers ");
		int num = scanner.nextInt();
		int numA = 0;
		int i = 0;
		while(i<num) {
			System.out.println("Enter number ");
			numA+= scanner.nextInt();
			i++;
		}
		System.out.println("The sum is : "+ numA);	
		scanner.close();
	}
	
	
	/*
	 * Write a java program to find product of a number and take input from the user.
	 */
	public static void findProdFromInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of numbers ");
		int num = scanner.nextInt();
		int numA = 0;
		int i = 0;
		while(i<num) {
			System.out.println("Enter number ");
			numA*= scanner.nextInt();
			i++;
		}
		System.out.println("The sum is : "+ numA);	
		scanner.close();
	}
	
	/*
	 * Write a java program to find reverse a number and take input from the user.
	 */
	public static void findReverseFromInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of numbers ");
		int[]arr = new int[scanner.nextInt()];
		int i = 0;
		while( i<arr.length) {
			System.out.println("Enter number ");
			arr[i]=scanner.nextInt();
			i++;
		}
		i = arr.length-1;
		while( i>=0) {
			System.out.print(arr[i]+" ");	
			i--;
		}		
		scanner.close();
	}
	
	/*
	 * Write a java program to find sum of first 5 even numbers. Ex: 2+4+6+8+10 = 30
	 */
	public static void printSumFirstEvenNumbers() {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("Sum of first 5 even numbers is "+ sum);
	}
	
	//Write a program using Do- while Loop.
	
	/*
	 * Write a java program to print first 10 numbers.
	 */
	public static void printFirstTenNumbersDo() {
		int i = 1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		System.out.println();
	}
	
	/*
	 *  Write a java program to print first 5 odd numbers. EX: 1 3 5 7 9
	 */
	public static void printFirstOddNumbersDo() {
		int i = 1;
		do {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=10);
		System.out.println();
	}
//	Write a java program to print first 10 square numbers.
	public static void printFirstSquareNumbersDo() {
		int i = 1;
		do {
			System.out.print(i*i+" ");
			i++;
		} while(i<=10);
		System.out.println();
	}
	
	
//	5) Write a java program to print first 10 cube numbers.
	
	public static void printFirstcubeNumbersDo() {
		int i = 1;
		 do{
			System.out.print(i*i*i+" ");
			i++;
		}while(i<=10);
		System.out.println();
	}
	
	
//	6) Write a java program to print sum of first 5 numbers.
	public static void printSumNumbersDo() {
		int i = 1;
		int sum = 0;
		 do{
			System.out.print(i+" + ");
			sum+=i;
			i++;
		}while(i<5);
		System.out.println("5 = "+(sum+5));
	}
	
//	Example: 1+2+3+4+5 = 15
//	7) Write a java program to find sum of a number and take input from the user.
	public static void findSumFromInputDo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of numbers ");
		int num = scanner.nextInt();
		int numA = 0;
		int i = 0;
		do{
			System.out.println("Enter number ");
			numA+= scanner.nextInt();
			i++;
		}while(i<num); 
		System.out.println("The sum is : "+ numA);	
		scanner.close();
	}
	
//	8) Write a java program to find product of a number and take input from the user.\
	public static void findProdFromInputDo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of numbers ");
		int num = scanner.nextInt();
		int numA = 0;
		int i = 0;
		do{
			System.out.println("Enter number ");
			numA*= scanner.nextInt();
			i++;
		}while(i<num) ;
		System.out.println("The sum is : "+ numA);	
		scanner.close();
	}
	
//	9) Write a java program to find reverse a number and take input from the user.
	public static void findReverseFromInputDo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of numbers ");
		int[]arr = new int[scanner.nextInt()];
		int i = 0;
		do{
			System.out.println("Enter number ");
			arr[i]=scanner.nextInt();
			i++;
		}while( i<arr.length); 
		
		i = arr.length-1;
		do{
			System.out.print(arr[i]+" ");	
			i--;
		}while( i>=0); 	
		scanner.close();
	}
	
//	10) Write a java program to find sum of first 5 even numbers. Ex: 2+4+6+8+10 = 30
	public static void printSumFirstEvenNumbersDo() {
		int i = 1;
		int sum = 0;
		do{
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}while(i<=10); 
		System.out.println("Sum of first 5 even numbers is "+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
	
//		printFirstTenNumbers();
//		printFirstEvenNumbers(); 
//		printFirstOddNumbers();
//		printFirstSquareNumbers();
//		printFirstcubeNumbers();
//		printSumNumbers();
//		findSumFromInput();
//		findReverseFromInput();
//		printSumFirstEvenNumbers();
//		printFirstTenNumbersDo();
//		printFirstOddNumbersDo();
//		printSumNumbersDo();
//		findSumFromInputDo();
//		findReverseFromInput();
		printSumFirstEvenNumbersDo();
	}

}

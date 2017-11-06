
public class Advanced_arrays {
	/*
	 * Write a program which takes as input 1D- array and finds maximum number , it’s index value.
	 */
	public static void maxNumber(int arr[]) {
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				idx=i;
			}
		}
		System.out.println("Max number is: "+ max+" at idx: "+idx);
	}
	/*
	 * Write a program which takes as input 2D- array and finds maximum number , it's index value.
	 */
	public static void maxNumber2D(int arr[][]) {
		int max = Integer.MIN_VALUE;
		int idxR = 0;
		int idxC = 0;
		for(int r = 0; r<arr.length;r++) {
			for(int c =0; c<arr[r].length;c++) {
				if(arr[r][c]>max) {
					max = arr[r][c];
					idxR= r;
					idxC = c;
				}
			}
		}
		System.out.println("Max number is: "+ max+" at row: "+idxR+ " and column "+idxC);
	}
	/*
	 * Write a program which takes as input 1D- array and finds minimum number, it’s index value
	 */
	public static void minNumber(int arr[]) {
		int min = Integer.MAX_VALUE;
		int idx = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				idx=i;
			}
		}
		System.out.println("Max number is: "+ min+" at idx: "+idx);
	}
	/*
	 *  Write a program which takes as input 2D- array and finds minimum number, it's index value.
	 */
	public static void minNumber2D(int arr[][]) {
		int min = Integer.MAX_VALUE;
		int idxR = 0;
		int idxC = 0;
		for(int r = 0; r<arr.length;r++) {
			for(int c =0; c<arr[r].length;c++) {
				if(arr[r][c]<min) {
					min = arr[r][c];
					idxR= r;
					idxC = c;
				}
			}
		}
		System.out.println("Min number is: "+ min+" at row: "+idxR+ " and column "+idxC);
	}
	
	/*
	 *  Write a program which takes as input 1D- array and reverse an array.
	 */
	public static void reverseArray(int[]arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<= end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	/*
	 * Write a program which takes as input two 1D- array and find the sum of two array and store results in new array.
	 */
	
	public static int[] sumTwoArrays(int[]arr, int[]bar){
	  if(arr.length!=bar.length) {
		  throw new RuntimeException();
	  }
	  int []foo = new int[bar.length];
	  for(int i = 0; i<bar.length;i++) {
		  foo[i]=arr[i]+bar[i];
	  }
	  return foo;
	}
	/*
	 * Write a program which takes as input two 1D- array and find the difference of two array and store results in new array.
	 */
	public static int[] difTwoArrays(int[]arr, int[]bar){
		  if(arr.length!=bar.length) {
			  throw new RuntimeException();
		  }
		  int []foo = new int[bar.length];
		  for(int i = 0; i<bar.length;i++) {
			  foo[i]=arr[i]-bar[i];
		  }
		  return foo;
		}
	/*
	 *  Write a program which takes as input 1D- array and prints even numbers in the array
	 */
	
	public static void printEvenNum(int[]arr) {
		for(int i:arr) {
			if(i%2==0) {
				System.out.print(i+" ");
			}		
		}
		System.out.println();
	}
	
	/*
	 *  Write a program which takes as input 1D- array and prints odd numbers in the array.
	 */
	
	public static void printOddNum(int[]arr) {
		for(int i:arr) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}		
		}
		System.out.println();
	}
	
/*
 *  Write a program which takes as input 1D- array and prints positive numbers in the array.
 */
	public static void printPositiveNum(int[]arr) {
		for(int i:arr) {
			if(i>0) {
				System.out.print(i+" ");
			}		
		}
		System.out.println();
	}
	
	/*
	 *  Write a program which takes as input 1D- array and prints negative numbers in the array.
	 */
	public static void printNegativeNum(int[]arr) {
		for(int i:arr) {
			if(i<0) {
				System.out.print(i+" ");
			}		
		}
		System.out.println();
	}
	
	/*
	 * Write a program which takes as input 1D- array which contains first 25 numbers and prints prime numbers in the array.
	 */
	
	public static void printPrimeNum(int[]arr) {
		for(int i:arr) {
			if(isPrime(i)&&i!=1) {
				System.out.print(i+" ");
			}		
		}
		System.out.println();
	}
	
	/**
	 * Returns true if an integer is a prime number
	 * @param i - integer
	 * @return true or false
	 */
	public static boolean isPrime(int i) {
		boolean prime = true;
		int idx = 2;
		while(idx<i) {
			if(i%idx==0) {
				return false;
			}
			idx++;
		}	
		return prime;
	}
	/*
	 * Prints array
	 */
	public static void printArray(int[]arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
//		int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int bar[] = new int[]{7,9,-2,16,10,11,15};
		int arr2D [][] = {{1,2,3,4},{1,10,3,4},{4,5,6,7},{123,-4,5,6}};
//		maxNumber( arr); 
//		minNumber( arr); 
//		maxNumber2D(arr2D);
//		minNumber2D(arr2D);
//		printArray(arr);
//		reverseArray(arr);
//		printArray(bar);
//		printArray(sumTwoArrays(arr, bar));
//		printArray(difTwoArrays(arr, bar));
//		printEvenNum(arr);
//		printNegativeNum(arr);
//		printPositiveNum(arr);
		int arr[]=new int[1000];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = i;
		}
		printPrimeNum(arr);
//		System.out.println(1%2);
	}
}

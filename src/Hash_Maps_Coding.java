import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sun.javafx.collections.MapAdapterChange;

public class Hash_Maps_Coding {

	/* 
	 * Write a program which takes input as 7 students and their score.
	 */
	public static Map<String,Integer> studentScore() {
		Map<String,Integer> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		for(int i =0;i<7;i++) {
			System.out.println("Enter your name");
			String name = scanner.nextLine();
			System.out.println("Enter your score");
			int score = scanner.nextInt();
			map.put(name, score);
		}
		scanner.close();
		return map;
	}
	
	/*
	 * Write a program which takes input as first name and last name of 10	students.
	 */
	
	public static Map<String,String> studentName() {
		Map<String,String> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		for(int i =0;i<10;i++) {
			System.out.println("Enter your first name");
			String firstName = scanner.next();
			System.out.println("Enter your last name");
			String lastName = scanner.next();
			map.put(firstName, lastName);
		}
		scanner.close();
		return map;
	}
	
	/*
	 *  Write a program which takes input as 5 numbers and their occurrence.
       Such as number 34 appears 5 times. (34,5).
	 */
	
	public static Map<Integer,Integer> takeNumbers() {
		Map<Integer,Integer> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			System.out.println("Enter a number");
			Integer number = scanner.nextInt();
			System.out.println("Enter number's occurence");
			Integer numberOccurence = scanner.nextInt();
			map.put(number, numberOccurence);
		}
		scanner.close();
		return map;
	}
	
	/*
	 * Write a program which takes input as 15 numbers and find which
		number appears the most.
		Input:- int[] a ={12,45,25,67,98,12,45,45,67,89,45,90,45,67,45}.
		Output:- Number : 45
		MaxCount : 6
	 */
	public static void findMaxNumber(int arr[]) {
		int max = Integer.MIN_VALUE;
		int number = 0;
		int count = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {	
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i]);
				map.put(arr[i], count+1);	
				if(count+1>max) {
					max = count+1;
					number = arr[i];
				}
			} else {
				map.put(arr[i], 1);
			}			
		}
		System.out.println("Number :"+ number+" MaxCount : "+max );
	}
	
	/*
	 * Write a program which takes input as 15 numbers and find which
	number appears the least.
	Input:- int[] a ={12,45,25,67,98,12,45,45,67,12,45,98,45,67,45}.
	Output:- Number : 25
	MaxCount : 1
	 */
	public static void findMinNumber(int arr[]) {
		int min = Integer.MAX_VALUE;
		int number = 0;
		int count = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {	
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i]);
				map.put(arr[i], count+1);	
			} else {
				map.put(arr[i], 1);
			}
			if(map.get(arr[i])<min) {
				min = map.get(arr[i]);
				number = arr[i];
			}
		}
		System.out.println("Number :"+ number+" MinCount : "+min );
	}
 
	
	/*
	 * find which number appears even number times
	 */
	public static void findEvenAppearNumbers(int arr[]) {
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {	
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);	
			} else {
				map.put(arr[i], 1);
			}			
		}
		for(Integer i: map.keySet()) {
			int count = map.get(i);
			if(count%2==0) {
				System.out.println(i+"="+count);
			}			
		}
	}
	
	/*
	 * find which number appears odd number times
	 */
	public static void findOddAppearNumbers(int arr[]) {
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {	
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);	
			} else {
				map.put(arr[i], 1);
			}			
		}
		for(Integer i: map.keySet()) {
			int count = map.get(i);
			if(count%2!=0) {
				System.out.println(i+"="+count);
			}			
		}
	}
	
	/*
	 * find which number appears odd number times
	 */
	public static void findThreeTimesNumbers(int arr[]) {
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {	
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);	
			} else {
				map.put(arr[i], 1);
			}			
		}
		for(Integer i: map.keySet()) {
			int count = map.get(i);
			if(count==3) {
				System.out.println(i+"="+count);
			} 
		}
	}
	
	
	/*
	 * Strings
	 */
	public static void findCharacters(String string) {
		Map<Character,Integer> map =  createMap( string);	
		for(char ch: map.keySet()) {
			int count = map.get(ch);
			System.out.print(ch+""+count);	
		}
		System.out.println();
	}
	
	public static Map<Character,Integer> createMap(String str){
		char []arr = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {	
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);	
			} else {
				map.put(arr[i], 1);
			}			
		}
		return map;
	}
	
	public static boolean isAnargam(String strA,String strB ) {
		boolean check = false;
		Map<Character,Integer> mapA = createMap(strA);
		Map<Character,Integer> mapB = createMap(strB);
		for(Character ch: mapA.keySet()) {
			if(mapB.containsKey(ch)){
				if(mapA.get(ch).equals(mapB.get(ch))){
					check = true;
				} else {
					check = false;
				}
			} else {
				check = false;
			}
		}	
		return check;	
	}
	public static void main(String[] args) {
		
		studentScore();
		studentName();
		System.out.println(isAnargam("amae","mama"));
		findCharacters( "aaaaasssdddddffff");
		findThreeTimesNumbers(new int[]{1,2,4,1,5,3,1});
		findOddAppearNumbers(new int[]{1,2,4,1,5,5,5,3,1});
		findEvenAppearNumbers(new int[]{2,4,1,4,5,5,5,3,1});
	}

}

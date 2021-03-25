import java.lang.*;
import java.util.*;

//Jordan Ashe 03-23-21

class tenDashThree{
	//main
	public static void main(String[] args) {
		MyInteger myInt = new MyInteger(24);
		char[] a = new char[4];
		
		a[0] = '1';
		a[1] = '2';
		a[2] = '3';
		a[3] = '4';
		
		String b = "5678";
		
		System.out.println("the MyInteger named myInt has a value of " + myInt.getValue());
		System.out.println();
		
		System.out.println("is myInt odd? " + myInt.isOdd());
		System.out.println("is myInt even? " + myInt.isEven());
		System.out.println("is myInt a prime number? " + myInt.isPrime());
		System.out.println();
		
		System.out.println("is the number 37 odd? " + MyInteger.isOdd(37));
		System.out.println("is the number 37 even? " + MyInteger.isEven(37));
		System.out.println("is the number 37 a prime number? " + MyInteger.isPrime(37));
		System.out.println();
		
		System.out.println("is the MyInteger myInt odd? " + MyInteger.isOdd(myInt));
		System.out.println("is the MyInteger myInt even? " + MyInteger.isEven(myInt));
		System.out.println("is the MyInteger myInt a prime number? " + MyInteger.isPrime(myInt));
		System.out.println();
		
		System.out.println("is the MyInteger myInt equal to 37? " + myInt.equals(37));
		System.out.println("is the MyInteger myInt equal to myInt? " + myInt.equals(myInt));
		System.out.println();
		System.out.print("char array a = ");
		
		for (int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println("What is the total of char array a? " + MyInteger.parseInt(a));
		
		System.out.println();
		System.out.println("the String named b has a value of " + b);
		System.out.println("What is the total of b? " + MyInteger.parseInt(b));
	}		
}
	
//account class set
class MyInteger{
	private int value;

	MyInteger(int v) {
		value=v;
	}
	
	int getValue(){
		return value;
	}

	//self explanitory
	boolean isEven() {
		if (this.value%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//self explanitory
	boolean isOdd() {
		if (this.value%2==1){
			return true;
		}
		else{
			return false;
		}
	}
	
	//self explanitory
	boolean isPrime() {
		boolean test = true;
		for (int i=2; i<=this.value/2; i++){
			if (this.value%i==0){
				test=false;
				break;
			}	
		}
		return test;
	}
	
	//self explanitory
	static boolean isEven(int newInt) {
		if (newInt%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//self explanitory
	static boolean isOdd(int newInt) {
		if (newInt%2==1){
			return true;
		}
		else{
			return false;
		}
	}
	
	//self explanitory
	static boolean isPrime(int newInt) {
		boolean test = true;
		for (int i=2; i<=newInt/2; i++){
			if (newInt%i==0){
				test=false;
				break;
			}	
		}
		return test;
	}
	
	//self explanitory
	static boolean isEven(MyInteger newMI) {
		if (newMI.value%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//self explanitory
	static boolean isOdd(MyInteger newMI) {
		if (newMI.value%2==1){
			return true;
		}
		else{
			return false;
		}
	}
	
	//self explanitory
	static boolean isPrime(MyInteger newMI) {
		boolean test = true;
		for (int i=2; i<=newMI.value/2; i++){
			if (newMI.value%i==0){
				test=false;
				break;
			}	
		}
		return test;
	}
	
	boolean equals(int newInt){
		if (newInt == this.value){
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean equals(MyInteger newMI){
		if (newMI.value == this.value){
			return true;
		}
		else{
			return false;
		}
	}
	
	static int parseInt(char[] a){
		int result = 0; 	
		for(int i=0; i < a.length; i++){
			result += Character.getNumericValue(a[i]);
		}	
		return result;
	}
	
	static int parseInt(String a){
		int result = 0; 	
		char temp = ' ';
		
		for(int i=0; i < a.length(); i++){
			temp = a.charAt(i);
		
			result += Character.getNumericValue(temp);
		}	
			
		return result;
	}
}
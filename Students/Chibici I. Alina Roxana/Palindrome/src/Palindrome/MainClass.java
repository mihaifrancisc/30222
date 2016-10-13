package Palindrome;
import Palindrome.GetPalindrome;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Palindrom de cate cifre? ");
		int cifre = keyboard.nextInt();
		GetPalindrome n = new GetPalindrome(cifre);
		int number;
		number = n.highestPalindrome();
		System.out.println(number);
	}
}

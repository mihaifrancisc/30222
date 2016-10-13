package Palindrome;

public class Palindrome {
	public static Boolean isPalindrome(int n) {
			 int copie,nrNou;
			 nrNou = 0;
			 copie = n;
			 while(n > 0){
				 nrNou= (nrNou * 10) + (n % 10);
				 n = n / 10;
			 }
			 if(nrNou == copie){
			 	return true;
			 }
			 else{
			 	return false;
			 }
		}
	}

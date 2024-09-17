package Practice;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int n){
        int rev=0,r,temp=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        Palindrome p = new Palindrome();
        boolean res = p.isPalindrome(num);

        System.out.println(res);

        sc.close();
    }
}

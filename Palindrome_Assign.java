import java.util.Scanner;

public class Palindrome_Assign {
    public static void main(String[] args) {
        String s1="2552";
        String s2="";
        int len=0;
        boolean flag=false;


        len=s1.length();
        //s2=s1;
        for(int i=len-1;i>=0;i--) {
            s2=s2+s1.charAt(i);

        }
        System.out.println(s2);

        int i=0;
        while(i<len-1) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
                flag = true;
                break;

            }
            else {
                flag = false;
                break;

            }

        }

        if(flag==true)
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");

    }
}

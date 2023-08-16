import java.util.Scanner;

public class Duplicate_Char {

    public static void main(String[] args) {
        String str1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String to find the Duplicate Characters");
        str1=scan.nextLine();
        //String str1 = "ramasubramanian";
        String str3 = "";

        char[] str2 = str1.toCharArray();
        char[] str4 = str3.toCharArray();
        int len = str1.length() - 1;

        for (int i = 0; i <= len; i++) {

            for (int j = i + 1; j <= len; j++) {
                if (str2[i] == str2[j]) {

                    str3 = str3 + str2[j];

                    break;
                }
            }
        }






            System.out.println("The Duplicate Characters are  :" +str3);




            //System.out.println(str2);
        }
    }





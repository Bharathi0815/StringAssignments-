import java.util.Scanner;
public class RemoveDuplicate_Char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Word to remove duplicate characters");

        String str1 = scan.nextLine();
        char[] str2 = str1.toCharArray();
        String str3="";
        String str4="";
        boolean flag=false;
        char ch=' ';
       int len=str1.length()-1;

        for(int i=0;i<=len;i++) {

            for (int j = i + 1; j <= len; j++) {
                if (str2[i] == str2[j]) {
                    str4=str4+str2[j];
                    flag = false;
                    break;
                } else {
                    flag = true;

                }


            }
            if(flag)
            {
                str3=str3+str2[i];
            }
        }

        System.out.println("The Duplicate characters are  :" +str4  +" are removed");
      System.out.println("The String without duplicate characters  :"+str3);


    }
}

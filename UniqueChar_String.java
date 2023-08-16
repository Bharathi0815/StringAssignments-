import java.util.Scanner;

public class UniqueChar_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String to Check  unique or not  :");
               String str1=scan.nextLine();
      //String str1="menu";
       char c[]=str1.toCharArray();
        int len=str1.length();
        boolean flag=false;
        for(int i=0;i<=len-1;i++) {
            for (int j = i + 1; j <= len - 1; j++) {
                if(c[i]==c[j])
                {
                    flag=true;
                    break;
                }
            }
        }


       if( flag==true)
           System.out.println("string is not unique");
       else
           System.out.println("string is  unique");






    }
}

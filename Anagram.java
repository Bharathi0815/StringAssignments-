import java.util.Scanner;

class Function
{
    public String removespace(String userstr1)
    {
        String str1="";
        for(int i=0;i<=userstr1.length()-1;i++)
            if(userstr1.charAt(i)!=' ')
            {
                str1=str1+userstr1.charAt(i);
            }
        return str1;
    }

    public String casechange(String str1)
    {
        char c1;
        String s1="";
        for(int i=0;i<str1.length();i++)

        {
            if(str1.charAt(i)>=97 && str1.charAt(i)<=122)
            {
                c1  =(char)(str1.charAt(i));
                s1=s1+c1;

            }
            else

                s1=s1+(char)(str1.charAt(i)+32);
        }
        return s1;
    }



}



public class Anagram {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        String userstr1;
        String str1="";
        String s1="";
        char c1;
        String dupstr1="";
        String dupstr2="";
        String remdup1="";
        String remdup2="";
        String userstr2;
        String str2="";
        String s2="";
        char c2;
        boolean flag=false;

        System.out.println("Enter the first string");
        userstr1=scan.nextLine();

        System.out.println("Enter the second string");
        userstr2=scan.nextLine();
        Function f1=new Function();
        str1=f1.removespace(userstr1);
        str2=f1.removespace(userstr2);
        s1=f1.casechange(str1);
        s2=f1.casechange(str2);

        //Sorting first string
        char [] dstr1=s1.toCharArray();

        for(int i=0;i<s1.length()-1;i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (dstr1[i] > dstr1[j]) {

                    char  c = dstr1[j];
                    dstr1[j] =dstr1[i];
                    dstr1[i] = c;

                }

            }
        }
        //sorting second String
        char [] dstr2=s2.toCharArray();

        for(int i=0;i<s2.length()-1;i++) {
            for (int j = i + 1; j < s2.length(); j++) {
                if (dstr2[i] > dstr2[j]) {

                    char  c = dstr2[j];
                    dstr2[j] = dstr2[i];
                    dstr2[i] = c;

                }
            }
        }


        //finding Anagram or not
        dstr1=s1.toCharArray();
        dstr2=s2.toCharArray();
        if(s1.length()!=s2.length()) {
            flag = false;

        }
        else if (s1.length()==s2.length())
        {

            for (int i = 0; i <= s1.length() - 1; i++) {
                for (int j = 0; j <= s2.length() - 1; j++) {

                    if (dstr1[i] == dstr2[j])
                        flag = true;


                }
            }
        }




        if(flag==true)
        {
            System.out.println("It is Anagram");
        } else
        {
            System.out.println("It is not Anagram");
        }



    }
}

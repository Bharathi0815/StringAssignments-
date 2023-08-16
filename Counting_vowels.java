import java.util.Scanner;
public class Counting_vowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
                String str1;
        System.out.println("Eneter the String to check number of Vowels,Consonents and Special Characters");
        str1=scan.nextLine();
        //String str1="Ramasubramanian*^$";
        int len1=str1.length()-1;
        int len2=str1.length();
        int count_vow=0;
        int count_spl=0;
        int count_num=0;
        int consonents=0;
        int c1;

        for(int i=0;i<=len1;i++)
        {  c1=str1.charAt(i);
            if(c1==65 ||  c1==69||c1==73||c1==79||c1==85|| c1==97||c1==101||c1==105||c1==111||c1==117)

            {
                count_vow=count_vow+1;
            }
            else if(c1>=32 && c1<=47 ||
                    c1>=58 && c1<=64||c1>=91 && c1<=96||c1>=123 && c1<=126)
                count_spl=count_spl+1;
            else if(c1>=48 && c1<=57)
                count_num=count_num+1;

        }
        consonents=len2-(count_vow+count_spl+count_num);
        System.out.println("Number of Vowels  :" +count_vow);
        System.out.println("Number of Consonents :" +consonents);
        System.out.println("Number of Special Characters :" + count_spl);
        System.out.println("Count of Numbers  :" +count_num);
    }
}

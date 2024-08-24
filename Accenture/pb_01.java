import java.util.Scanner;

public class pb_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pwd=sc.nextLine();
        if(isvalidate(pwd)){
            System.out.println("valid pwd");
        }
        else{
            System.out.println("invalid");
        }
    }

    public static Boolean isvalidate(String pwd)
    {
        if(pwd.length()<6)
        {
            return false;
        }

        Boolean upperCase=false;
        Boolean lowerCase=false;
        Boolean hasDigit=false;
        Boolean hasNoInvalidChar=true;

        for(char ch:pwd.toCharArray())
        {
            if(Character.isDigit(ch)){
                 hasDigit=true;
            }
            else if(Character.isUpperCase(ch))
            {
                upperCase=true;
            }
            else if(Character.isLowerCase(ch))
            {
                lowerCase=true;
            }
            else if(ch==' '||ch=='/')
            {
                hasNoInvalidChar=false;
                break;
            }
        }
        return upperCase && lowerCase && hasDigit && hasNoInvalidChar;


    }
}

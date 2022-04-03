import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 10
// ********
public class Password {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (new File("password.dat"));
        int account = 1;
        while (sc.hasNextLine())
        {
            String user = sc.nextLine();
            String pass = sc.nextLine();
            boolean userCap = Character.isUpperCase(user.charAt(0));
            boolean twoDig = user.length() >= 2 && Character.isDigit(user.charAt(user.length() - 1)) && Character.isDigit(user.charAt(user.length() - 2));
            boolean isTen = user.length() == 10;
            boolean alphaNumeric = true;
            for (int i = 0; i < user.length(); i++)
            {
                if (!Character.isLetterOrDigit(user.charAt(i)))
                    alphaNumeric = false;
            }
            String userVal = "";
            if (userCap && twoDig && isTen && alphaNumeric)
                userVal = "VALID";
            else
                userVal = "INVALID";
            boolean matchesUser = !user.equals(pass);
            boolean noSpace = true;
            boolean longerEight = pass.length() >= 8;
            boolean hasCap = false;
            boolean hasDig = false;
            boolean hasSpec = false;
            for (int i = 0; i < pass.length(); i++)
            {
                if (Character.isUpperCase(pass.charAt(i)))
                    hasCap = true;
                else if (Character.isDigit(pass.charAt(i)))
                    hasDig = true;
                else if ("!@#$%^&*".indexOf(pass.charAt(i)) != -1)
                    hasSpec = true;
                else if (pass.substring(i,i+1).equals(" "))
                    noSpace = false;
            }
            String passVal = "";
            if (matchesUser && noSpace && longerEight && hasCap && hasDig && hasSpec)
                passVal = "VALID";
            else
                passVal = "INVALID";
            System.out.println("ACCOUNT " + account + ":");
            System.out.println("USERNAME " + userVal);
            System.out.println("PASSWORD " + passVal);
            account++;
        }
    }
}

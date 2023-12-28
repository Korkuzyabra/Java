import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isCorrect(String str)
    {
        Pattern VALID_EMAIL=Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
        Matcher matcher=VALID_EMAIL.matcher(str);
        return matcher.matches();
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean b=false;
        int i=0;
        while (i<10) {
            String str = in.next();
            b = isCorrect(str);
            if (b)
                System.out.println("yes");
            else
                System.out.println("no");
            i++;
        }
        in.close();
    }
}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String pattern = "((?:0[1-9]|[12][0-9]|3[01])/(?:0?[1-9]|1[0-2])/(?:19[0-9][0-9]|[0-9][0-9][0-9][0-9]))";
        String pattern_1 = "((?:0[1-9]|[12][0-9]|3[01]).(?:0?[1-9]|1[0-2]).(?:19[0-9][0-9]|[0-9][0-9][0-9][0-9]))";
        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        Pattern p = Pattern.compile(pattern);
        Pattern p_1 = Pattern.compile(pattern_1);
        Matcher m = p.matcher(phrase);
        Matcher s = p_1.matcher(phrase);
        if (m.matches()) {
            System.out.print("Введенное выражение является датой и соответствует формату");
        }
        else  if(s.matches())
        {
            System.out.print("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy. ");
        }
        else
        {
            System.out.print("Введенное выражение не является датой. ");
        }
        sc.close();
    }
}
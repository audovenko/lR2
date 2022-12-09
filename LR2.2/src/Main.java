import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String pattern = "^(?=\\w*\\d)(?=\\w*[a-z])(?=\\w*[A-Z]).{8,}$";
        System.out.println("Введите пароль минимум 8 символов. Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру, а также нижнее подчеркивание. ");
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(phrase);
        while (true) {
            if (m.matches()) {
                System.out.println("Введенное выражение является надежным паролем. ");
                break;
            } else {
                System.out.println("Вы ввели простой пароль. Повторите ввод. ");
                phrase = sc.nextLine();
                m = p.matcher(phrase);
            }
        }
        sc.close();
    }
}
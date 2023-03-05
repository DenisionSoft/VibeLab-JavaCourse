import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.MM.yyyy");
        String date = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        try {
            Date d = sdf.parse(date);
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
            int year = Integer.parseInt(sdf2.format(d));
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Високосный год");
            } else {
                System.out.println("Обычный год");
            }
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
        }
    }
}

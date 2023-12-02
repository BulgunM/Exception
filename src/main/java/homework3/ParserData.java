package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserData {

    public static void checkInputData(String newItem) {
        checkFullname(newItem);
        checkDate(newItem);
        checkPhoneNumber(newItem);
        checkGender(newItem);
    }

    private static void checkGender(String newItem) {
        String gender = newItem.split(" ")[5].trim();
        if (!gender.equals("f") && !gender.equals("m")) {
            throw new IllegalArgumentException("Некорректно введен пол");
        }
    }

    private static void checkPhoneNumber(String newItem) {
        String phoneNumber = newItem.split(" ")[4].trim();

        if (!phoneNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Некорректно введен номер телефона");
        }

    }

    private static void checkDate(String newItem) {
        String date = newItem.split(" ")[3].trim();
        String day = date.split("\\.")[0];
        String month = date.split("\\.")[1];
        String year = date.split("\\.")[2];

        if (!day.matches("\\d{2}")) {
            throw new IllegalArgumentException("Некорректно введена дата - день!");
        }

        if (!month.matches("\\d{2}")) {
            throw new IllegalArgumentException("Некорректно введена дата - месяц!");
        }
        // для года конечно можно не делать ограничение в 4 цифры, но применим такую условность
        if (!year.matches("\\d{4}")) {
            throw new IllegalArgumentException("Некорректно введена дата - год!");
        }

    }

    private static void checkFullname(String newItem) {
        String lastname = newItem.split(" ")[0].trim();
        String firstname = newItem.split(" ")[1].trim();
        String middlename = newItem.split(" ")[2].trim();

        if (!isAlpha(lastname) || !isAlpha(firstname) || !isAlpha(middlename)) {
            throw new IllegalArgumentException("ФИО должно состоять только из букв.");
        }
    }

    private static boolean isAlpha(String input) {
        Pattern pattern = Pattern.compile("^[а-яА-Я]+$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private static String inputByUser() {
        System.out.println("Введите одной строкой через пробел следущие данные:");
        System.out.println("Фамилия Имя Отчество");
        System.out.println("дата рождения в формате dd.mm.yyyy");
        System.out.println("номер телефона - число без 8 и без +7");
        System.out.println("пол - символ латиницей f или m");
        return checkInputSize(new Scanner(System.in).nextLine());
    }

    private static String checkInputSize(String newItem) {
        String[] newItemArr = newItem.trim().split(" ");
        if (newItemArr.length != 6) {
            throw new IllegalArgumentException("Введено не верное количество данных, " +
                    "ожидается 6, введено " + newItemArr.length);
        }
        return newItem;
    }
}



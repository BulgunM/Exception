package homework3;

import java.util.Scanner;

import static homework3.ParserData.checkInputData;

public class Main {

    public static void main(String[] args) {
        getUserDataAndWriteToFile();
    }

    private static void getUserDataAndWriteToFile() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите данные (Фамилия Имя Отчество, дата рождения, номер телефона, пол):");
            String userData = scanner.nextLine();
            checkInputData(userData);

            UserFileWriter.saveToFile(userData);
        } finally {
            scanner.close();
        }
    }
}
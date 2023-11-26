package homework2;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {

    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }

    private static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введите дробное число: ");
                String input = scanner.nextLine();
                result = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное дробное число.");
            }
        }
        return result;
    }
}


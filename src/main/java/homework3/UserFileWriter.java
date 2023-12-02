package homework3;

import java.io.*;

public class UserFileWriter {

    public static void saveToFile(String newItem) {
        try {
            String lastName = newItem.split(" ")[0].trim();
            String fileName = lastName + ".txt";
            File itemFile = new File(fileName);
            boolean isItemExist = false;

            if (itemFile.createNewFile()) {
                System.out.println("Создание нового файла " + fileName);
            }

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String str;
                while ((str = br.readLine()) != null) {
                    if (str.trim().equals(newItem.trim())) {
                        isItemExist = true;
                        break;
                    }
                }
            }

            if (!isItemExist) {
                try (FileWriter fw = new FileWriter(fileName, true)) {
                    fw.write(newItem + System.lineSeparator());
                    System.out.println("Данные успешно записаны в файл.");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

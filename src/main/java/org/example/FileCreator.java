package org.example;
import java. io.*;

public class FileCreator {
    public static void createFile(PersonalInfo info) {
        try  {
            // Создаем новый файл с фамилией
            File file = new File(info.getSurname() + ".txt");
            FileWriter writer = new FileWriter(file, true); // Режим аппендикса

            // Запись данных в указанном формате

            String line = String.format("%s %s %s %s %s %s %n %n", info.getSurname(), info.getFirstName(), info.getMiddleName(), info.getDateOfBirth(), info.getPhoneNumber(), info.getGender());
            writer.write(line);
            // закрываем FileWriter
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
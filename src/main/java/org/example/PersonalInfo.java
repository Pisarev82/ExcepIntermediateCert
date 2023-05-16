package org.example;

import java.util. Scanner;

public class PersonalInfo {
    private String surname;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public PersonalInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вашу личную информацию в случайном порядке, разделяя пробелом:");

        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for (String token : tokens) {
            System.out.println(token);
            String regDate = "\\d{2}\\.\\d{2}\\.\\d{4}";
            String regPhone = "\\d{10}";
            String regName = "[А-ЯA-Z][а-яa-z]*";

            if (token.matches(regDate)) {
                dateOfBirth = token;
            } else if (token.matches(regPhone)) {
                phoneNumber = token;
            } else if (token.equalsIgnoreCase("m") || token.equalsIgnoreCase("f")) {
                gender = token.toLowerCase();
            } else if (token.matches(regName)) {
                if (surname == null) {
                    surname = token;
                } else if (firstName == null) {
                    firstName = token;
                } else if (middleName == null) {
                    middleName = token;
                }
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Фамилия: " + surname +
                "\nИмя: " + firstName +
                "\nОтчество: " + middleName +
                "\nДата рождения: " + dateOfBirth +
                "\nНомер телефона: " + phoneNumber +
                "\nПол: " + gender;
    }
}




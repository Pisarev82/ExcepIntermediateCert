package org.example;


public class PersonalInfo {
    private String surname;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;


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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public boolean fullfill () throws CustomExeption{
        if (surname != null &
                firstName != null &
                middleName != null &
                dateOfBirth != null &
                phoneNumber != null &
                gender != null
        ) {
            return true;
        }
        new CustomExeption("Введены некорректные даныые, попробуйте еще раз");
        return false;
    }
}

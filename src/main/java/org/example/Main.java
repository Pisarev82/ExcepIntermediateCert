package org.example;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        PersonalInfo info = userInput.UserInput();
        FileCreator.createFile(info);
    }
}





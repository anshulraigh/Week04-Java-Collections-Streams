package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputReader {
    public static String[] readUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine().trim();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine().trim());

        System.out.print("Enter your favorite programming language: ");
        String language = reader.readLine().trim();

        return new String[]{name, String.valueOf(age), language};
    }
}

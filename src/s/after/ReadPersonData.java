package s.after;

import java.util.Scanner;

public class ReadPersonData {

    public static Person personData() {
        Scanner reader = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter firstname: ");
        person.setFirstName(reader.next());
        System.out.print("Enter lastname: ");
        person.setLastName(reader.next());
        return person;
    }
}

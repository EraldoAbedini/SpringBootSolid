package s.after;

public class ShowPersonData {
    public static void displayPerson(Person person) {
        System.out.println(String.format("Your username is %s %s", person.getFirstName(), person.getLastName()));
    }
}

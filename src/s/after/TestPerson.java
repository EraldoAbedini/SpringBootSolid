package s.after;


public class TestPerson {
    public static void main(String[] args) {
        System.out.println("Welcome to my application");
            Person person = ReadPersonData.personData();
        boolean isPersonValid = PersonValidator.isValidPerson(person);
        if (isPersonValid) {
            ShowPersonData.displayPerson(person);
        } else System.out.printf("Your username is %s %s%n", person.getFirstName(), person.getLastName());
        System.out.println("End of application");
    }
}

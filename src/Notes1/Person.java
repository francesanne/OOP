package Notes1;

public class Person {
    // Fields (Instance Variables)
    String firstName;
    String lastName;
    char sex;
    int age;

    // Constructors - Initialize objects
    Person(String firstName, String lastName, char sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;

        System.out.println(firstName + " Created");
    }
}
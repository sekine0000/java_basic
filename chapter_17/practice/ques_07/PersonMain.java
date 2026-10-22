package chapter_17.practice.ques_07;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 20;

        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 25;

        person1.display();
        person2.display();
    }
}

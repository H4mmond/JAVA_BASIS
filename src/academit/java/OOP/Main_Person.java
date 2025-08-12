package academit.java.OOP;

public class Main_Person {
    public static void main(String[] args) {
        String name = "Ivan";
        String middleName = "Ivanovich";
        String familyName = "Ivanov";
        int age = 2002;

        Person person = new Person(name, middleName, familyName, age);
        System.out.println("toString:");
        System.out.println(person);

        System.out.println("Имя человека: " + person.getName());
        person.setName("");
        System.out.println("Новое имя человека: " + person.getName());

        System.out.println("Год рождения человека: " + person.getAge());
        person.setAge(2001);
        System.out.println("Новый год рождения человека: " + person.getAge());
    }
}

package academit.java.OOP;

import java.security.PublicKey;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;
    public static final int MIN_AGE = 15;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public static int getMinAge() {
        return MIN_AGE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
            System.out.println("Имя было изменено");
        }
        else {
            System.out.println("Имя не было изменено, передано пустое имя");
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middleName;
            System.out.println("Отчество было изменено");
        }
        else {
            System.out.println("Отчество не было изменено, передано пустое отчество");
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
            System.out.println("Фамилия была изменена");
        }
        else {
            System.out.println("Фамилия не была изменена, передана пустая фамилия");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age != 0) {
            this.age = age;
            System.out.println("Год рождения был изменён");
        }
        else {
            System.out.println("Год рождения не был изменён, передан пустой год");
        }
    }

    @Override
    public String toString() {
        return "{ " + familyName + " " + name + " " + middleName + " " + age + " }";
    }

    public void printName() {
        System.out.println("Name = " + name);
    }
}

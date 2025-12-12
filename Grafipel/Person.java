package Grafipel;

public class Person {
    // Attributes
    private String name;
    private int age;
    private String sex;

    // Constructor
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return this.age;}
    public void setAge(int age) {this.age = age;}

    public String getSex() {return this.sex;}
    public void setSex(String sex) {this.sex = sex;}
    
    // Methods
    public void makeBirthday() {
        this.age += 1;
    }
}

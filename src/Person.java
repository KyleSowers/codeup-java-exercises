import java.awt.*;

public class Person {

    private String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name + "!");
    }
    public Person(String name) {
        this.name = name;
    }
    public Person() {

    }



    public static void main(String[] args) {

        Person person1 = new Person("Person A");
        System.out.println(person1.getName());

        Person person2 = new Person();
        person2.setName("Person B");
        System.out.println(person2.getName());

        person2.sayHello();



    }
}

import java.awt.*;

public class Person {

//    Problem 1
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


//    Problem 2



    public static void main(String[] args) {

//      Problem 1
            Person personName1 = new Person("Person A");
            System.out.println(personName1.getName());

            Person personName2 = new Person();
            personName2.setName("Person B");
            System.out.println(personName2.getName());

            personName2.sayHello();


//      Problem 2
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());


    }
}

import java.util.Arrays;

public class ArrayExercises {

    public static Person[] addPerson(Person[] oldArray, Person addP) {
        int length = oldArray.length + 1;
        Person[] newArray = Arrays.copyOf(oldArray, length);
        newArray[length -1] = addP;
        return newArray;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

       Person[] personArray = new Person[3];

       Person p1 = new Person("Abra");
       Person p2 = new Person("Kadabra");
       Person p3 = new Person("Alakazam");
       Person p4 = new Person("Hypno");

        personArray[0] = p1;
        personArray[1] = p2;
        personArray[2] = p3;

       for (Person individual : personArray) {
           System.out.println(individual.getName());
       }

       Person[] secondPersonArray = addPerson(personArray, p4);
       for (Person individual : secondPersonArray) {
           System.out.println(individual.getName());
       }


    }
}

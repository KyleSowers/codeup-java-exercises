import util.Input;

public class InputTest {


    public static void main(String[] args) {

        Input myInput = new Input();

        myInput.getString();

        System.out.println(myInput.yesNo());

        System.out.println(myInput.getInt(1, 10));

        System.out.println(myInput.getInt());

        System.out.println(myInput.getDouble());

        System.out.println(myInput.getDouble());

    }
}

public class Clothing {

    public String type;
    public String color;
    public String size;

    public String sayClothesType() {
        return String.format("The %s is %s, in the size %s.", type, color, size);
    }


    public static void main(String[] args) {

        Clothing shirt = new Clothing();
        shirt.type = "shirt";
        shirt.color = "blue";
        shirt.size = "medium";
        System.out.println(shirt.sayClothesType());

        Clothing pant = new Clothing();
        pant.type = "pant";
        pant.color = "dark blue";
        pant.size = "32";
        System.out.println(pant.sayClothesType());
    }
}

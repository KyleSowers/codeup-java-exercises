public class ServerNameGenerator {

    public static String randomAdjective(String[] array) {
        int random = (int)(Math.random()*array.length);
        return array[random];
    }

    public static String randomNoun(String[] array) {
        int random = (int)(Math.random()*array.length);
        return array[random];
    }

    public static void main(String[] args) {

//        Adjectives Array
        String[] adjectivesArray = new String[10];

        String a1 = new String("chubby");
        String a2 = new String("bald");
        String a3 = new String("clumsy");
        String a4 = new String("unsightly");
        String a5 = new String("scruffy");
        String a6 = new String("unkept");
        String a7 = new String("helpless");
        String a8 = new String("panicky");
        String a9 = new String("lazy");
        String a10 = new String("obnoxious");

        adjectivesArray[0] = a1;
        adjectivesArray[1] = a2;
        adjectivesArray[2] = a3;
        adjectivesArray[3] = a4;
        adjectivesArray[4] = a5;
        adjectivesArray[5] = a6;
        adjectivesArray[6] = a7;
        adjectivesArray[7] = a8;
        adjectivesArray[8] = a9;
        adjectivesArray[9] = a10;

//      Noun Array
        String[] nounArray = new String[10];

        String n1 = new String("agent");
        String n2 = new String("brain");
        String n3 = new String("chicken");
        String n4 = new String("daughter");
        String n5 = new String("eye");
        String n6 = new String("football");
        String n7 = new String("grandfather");
        String n8 = new String("hobbit");
        String n9 = new String("insect");
        String n10 = new String("king");

        nounArray[0] = n1;
        nounArray[1] = n2;
        nounArray[2] = n3;
        nounArray[3] = n4;
        nounArray[4] = n5;
        nounArray[5] = n6;
        nounArray[6] = n7;
        nounArray[7] = n8;
        nounArray[8] = n9;
        nounArray[9] = n10;

        System.out.println(randomAdjective(adjectivesArray));

        System.out.println(randomNoun(nounArray));

        System.out.printf("You are a %s %s!%n", randomAdjective(adjectivesArray), randomNoun(nounArray));



    }
}

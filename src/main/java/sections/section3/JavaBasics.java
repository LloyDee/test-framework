package sections.section3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBasics {
    public static void main(String[] args) {

    }

    private static void stringsInJava() {
        String s = "Lloyd Jayson Pintac";
        String s1 = "Lloyd Jayson Pintac";

        String cc = new String("Hello");
        String cbc = new String("World");


        //print string in reverse
        for (int i = s.length()-1; i >= 0 ; i--) {
            System.out.printf("%s",s.charAt(i));
        }
        System.out.println("");
        //split method will return an array based of the regex
        String[] b = s.split(" ");
        for (String str : b
        ) {
            System.out.println(str);
        }
        List<String> newString = Arrays.asList(b);
        System.out.println(newString);

        //using the array
        String[] newB = b[0].split("");
        for (String str: newB
             ) {
            System.out.println(str);
        }
        //using the arrayList
        String[] newA = newString.get(0).split("");
        for (String str:newA
             ) {
            System.out.println(str);
        }
    }

    public static void variablesAndDataTypesInJava() {

        String myString = "This is my String variable";
        char myCharacter = 'f';

        byte myByte = 127;
        short myShort = 32569;
        int myInteger = 5;
        double myDouble = 45.65d;
        float myFloat = 9562.23f;

        boolean myBoolean = true;

        System.out.printf("""
                String\t%s
                Char\t%s
                Byte\t%s
                Short\t%s
                Integer\t%s
                Double\t%s
                Float\t%s
                Boolean\t%s
                """, myString, myCharacter, myByte, myShort, myInteger, myDouble, myFloat, myBoolean);
    }

    public static void arraysInJava() {
        int[] myIntegers = {1, 2, 3, 4, 5};
//        myIntegers = new int[]{1, 2, 3, 4};
        myIntegers[myIntegers.length - 1] = 100;

        String[] myString = {"Lloyd", "Jayson", "Pintac"};
        myString[2] = "Edith";
        for (String str : myString) {
            System.out.printf("%s ", str);
        }
        System.out.println(Arrays.toString(myIntegers));

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void arrayListInJava() {
        List<String> names = new ArrayList<>(List.of("Lloyd", "Jayson", "Pintac"));
        names.add("Selenium");
        names.removeIf(name -> name.contains("a"));
        for (String name : names
        ) {
            System.out.println(name);
        }
    }
}

package pl.javastart;

public class App {

    public static void main(String[] args) {
        String string = "string 1";
        String[] tableOfStrings = string.split(" ");

        for (String s: tableOfStrings
             ) {
            System.out.println(s);

        }
    }
}



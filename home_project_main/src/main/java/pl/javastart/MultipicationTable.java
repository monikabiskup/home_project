package pl.javastart;
import java.util.Scanner;

public class MultipicationTable {

    public static void main(String[] args) {
        int counter = 0;
        int input = 0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number to print it's multipicationTable");

        do
        {
            try {
                input = scanner.nextInt();
                counter++;
            }
            catch (Exception e){
                System.out.println("Please enter a number");
                scanner.nextLine(); //wyczyszczenie bufora
            }
            finally {}

        } while(counter !=1);

        for (int i= 0; i < 10; i++) {
            System.out.println(input + " * " + i + " = " + input*i);
        }
    }
}

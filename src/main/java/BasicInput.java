import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        // TODO Define char and string variables similarly
        char userChar = ' ';
       // String userString1 = "";
        String userString = "";

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        //userChar = scnr.next();
        System.out.println("Enter string:");
        userString = scnr.next();
        userChar = userString.charAt(0);
        userString = scnr.next();



        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        System.out.print(userInt+" "+userDouble+" "+userChar+" "+userString+"\n");

        // TODO (2): Output the four values in reverse

        System.out.print(userString+" "+userChar+" "+userDouble+" "+userInt+"\n");

        // TODO (3): Cast the double to an integer, and output that integer

        int typeCastedDouble = (int) userDouble;
        System.out.println(userDouble+" cast to an integer is "+typeCastedDouble);

        return;
    }
}
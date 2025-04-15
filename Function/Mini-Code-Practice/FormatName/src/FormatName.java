import java.util.Scanner;
import java.util.function.Function;

public class FormatName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // capitalizeName returns a formatted String (joHnaTHAN -> Johnathan)
        Function<String,String> capitalizeName = name -> {
            name = name.trim().toLowerCase();
            boolean isInteger;

            try {
                Integer.parseInt(name);
                System.out.println("Name cannot be an Integer");

                return "";

            } catch(NumberFormatException e) {
                isInteger = false;
            }

            if(name.isEmpty()) {
                return name;
            }

            if(name.length() == 1) {
                return name.toUpperCase();
            }

          char firstLetterCapital = Character.toUpperCase(name.charAt(0));
          String restOfName = name.substring(1);

          return firstLetterCapital + restOfName;
        };


        Function<String, String> applyGreeting = e -> {
          return "Greetings, " + e;
        };

        while(true) {
            System.out.println("Enter Name (QUIT to exit)");
            String name = input.next();

            if(name.equals("QUIT")) {
                break;
            }

            System.out.println(capitalizeName.andThen(applyGreeting).apply(name));
        }
        input.close();
    }
}

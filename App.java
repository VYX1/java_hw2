import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program can convert between: seconds & minutes, kg & lb, farenheight & celsius, between feet & meters ");
        double firstInputValue;
        String firstType;

        while (true) { 
            System.out.println("input value:");
            firstInputValue = scanner.nextInt();

            System.out.println("input origin type (sec, min, kg, lb, f, c, ft, m):");
            firstType = scanner.next();
            
            if ("exit".equals(firstInputValue) || "exit".equals(firstType)) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if ("sec".equals(firstType)) {
                int mins = (int) firstInputValue/60;
                double secs = firstInputValue%60;
                System.out.println("" + firstInputValue + " seconds is equal to " + mins + " minutes and " + secs + " seconds.");
            } else if ("min".equals(firstType)) {
                double secs = firstInputValue*60;
                System.out.println("" + firstInputValue + " minutes is equal to " + secs + " seconds.");
            }  else if ("kg".equals(firstType)) {
                double lb = firstInputValue*2.20462;
                System.out.println("" + firstInputValue + " kg is equal to " + lb + " pounds.");
            } else if ("lb".equals(firstType)) {
                double kg = firstInputValue/2.20462;
                System.out.println("" + firstInputValue + " kg is equal to " + kg + " kilos.");
            } else if ("f".equals(firstType)) {
                double c = (firstInputValue-32)*5/9;
                System.out.println("" + firstInputValue + "f is equal to " + c + "c.");
            } else if ("c".equals(firstType)) {
                double f = (firstInputValue*9/5)+32;
                System.out.println("" + firstInputValue + "c is equal to " + f + "f.");
            } else if ("m".equals(firstType)) {
                double ft = firstInputValue*3.28084;
                System.out.println("" + firstInputValue + "m is equal to " + ft + "ft.");
            } else if ("ft".equals(firstType)) {
                double m = firstInputValue/3.28084;
                System.out.println("" + firstInputValue + "ft is equal to " + m + "m.");
            } else 
                System.out.println("error! try to input again.");
                continue;
        } 
    }
}
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            int inputValue = 0;
            Printer printer;
            Scanner scanner = new Scanner(System.in);
            do
            {
                System.out.println("[1] Colored Printer");
                System.out.println("[2] Black and White Printer");
                System.out.print("Input (1 or 2 to print or 3 to exit): ");
                inputValue = scanner.nextInt();
                switch (inputValue)
                {
                    case 1:
                        printer = new ColorPrinter();
                        printer.Printing();
                        break;
                    case 2:
                        printer = new BWPrinter();
                        printer.Printing();
                        break;
                    case 3:
                        System.out.println("\nExiting...");
                        break;
                    default:
                        System.out.println("\nWrong input!");
                        break;
                }
                System.out.println();
            } while (inputValue != 3);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}

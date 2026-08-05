import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndianNumberFormatter {
    public static String formatIndianNumber(Integer number) {
        if (number == null || number == 0) {
            return "0";
        }
        boolean isNegative = number < 0;
        String strNumber = String.valueOf(Math.abs(number));
        
        if (strNumber.length() <= 3) {
            return isNegative ? "-" + strNumber : strNumber;
        }
        
        List<String> formattedParts = new ArrayList<>();
        
        formattedParts.add(strNumber.substring(strNumber.length() - 3));
        
        String remaining = strNumber.substring(0, strNumber.length() - 3);
        while (!remaining.isEmpty()) {
            if (remaining.length() >= 2) {
                formattedParts.add(0, remaining.substring(remaining.length() - 2));
                remaining = remaining.substring(0, remaining.length() - 2);
            } else {
                formattedParts.add(0, remaining);
                remaining = "";
            }
        }
        
        String result = String.join(",", formattedParts);
        
        return isNegative ? "-" + result : result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("\nEnter a number to format (or type 'exit' to quit):");
                
                String input = scanner.nextLine().trim();
                
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the Indian Number Formatter. Goodbye!");
                    break;
                }
                
                Integer number = input.isEmpty() ? null : Integer.parseInt(input);
                
                String formattedNumber = formatIndianNumber(number);
                System.out.println("Formatted Number: " + formattedNumber);
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'exit'.");
            }
        }
        scanner.close();
    }
}
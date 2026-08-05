import java.util.Scanner;

public class IndianNumberFormatterQwen {

    public static String formatIndianNumber(Integer number) {
        if (number == null) {
            return "0";
        }
        
        // Convert the number to string
        String numberStr = number.toString();
        int length = numberStr.length();
        
        // If the number has less than or equal to 3 digits, no formatting is needed
        if (length <= 3) {
            return numberStr;
        }

        StringBuilder formattedNumber = new StringBuilder();
        int firstGroupLength = length % 3;
        
        // Append the first group if it exists
        if (firstGroupLength != 0) {
            formattedNumber.append(numberStr.substring(0, firstGroupLength));
            formattedNumber.append(",");
        }

        // Process the remaining digits in groups of two
        for (int i = firstGroupLength; i < length; i += 2) {
            formattedNumber.append(numberStr.substring(i, Math.min(i + 2, length)));
            if (i + 2 < length) {
                formattedNumber.append(",");
            }
        }

        return formattedNumber.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (or type 'exit' to quit):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                Integer number = "".equals(input) ? null : Integer.parseInt(input);
                String formattedNumber = formatIndianNumber(number);
                System.out.println("Formatted Number: " + formattedNumber);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'exit' to quit.");
            }
        }

        scanner.close();
    }
}

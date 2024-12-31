import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        float totalKwh = calculateTotalKwh();
        System.out.println("Your total reading since last month is: " + totalKwh + " kWh");
        
        float totalCharge = calculateEnergyCharge(totalKwh);
        System.out.println("Your total charge is: " + totalCharge + " currency units");
        
        generateBill(totalCharge);
    }

    static float calculateTotalKwh() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your current meter reading (kWh): ");
        float current = input.nextFloat();
        
        System.out.print("Enter your previous meter reading (kWh): ");
        float previous = input.nextFloat();
        
        if (current < previous) {
            System.out.println("Error: Current reading cannot be less than previous reading.");
            System.exit(0);
        }
        
        return current - previous;
    }

    static float calculateEnergyCharge(float totalKwh) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your charge per kWh (from your electricity tariff): ");
        float chargePerKwh = input.nextFloat();
        
        return totalKwh * chargePerKwh;
    }

    static void generateBill(float totalCharge) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your address: ");
        String address = input.nextLine();

        long phone = 0;
        System.out.print("Enter your phone number: ");
        phone = input.nextLong();
        
        // Validate phone number length
        while (String.valueOf(phone).length() != 10) {
            System.out.println("Error: Phone number should be 10 digits.");
            System.out.print("Please re-enter your phone number: ");
            phone = input.nextLong();
        }
        input.nextLine(); // Consume the newline character

        System.out.print("Enter your email: ");
        String email = input.nextLine();
        
        int meterNumber = 0;
        System.out.print("Enter your meter number: ");
        meterNumber = input.nextInt();
        
        // Validate meter number length
        while (String.valueOf(meterNumber).length() != 10) {
            System.out.println("Error: Meter number must be 10 digits.");
            System.out.print("Please re-enter your meter number: ");
            meterNumber = input.nextInt();
        }
        input.nextLine(); // Consume the newline character
        
        // Print bill summary
        System.out.println("\n--- Bill Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Meter Number: " + meterNumber);
        System.out.println("Total Bill: " + totalCharge + " currency units");
    }
}

# Electricity Bill Calculator

## Overview

The Electricity Bill Calculator is a Java application that allows users to calculate their electricity bill based on meter readings and electricity tariff rates. The program collects user input, validates it, and generates a summary of the bill.

## Features

- Input current and previous meter readings.
- Calculate total kWh consumed.
- Input electricity charge per kWh.
- Validate phone number and meter number formats.
- Generate a summary of the bill including user details.

## Requirements

- Java Development Kit (JDK) 8 or higher
- A terminal or command prompt for running the application

## Installation

1. Clone the repository or download the source code.
2. Open a terminal or command prompt.
3. Navigate to the directory containing the `ElectricityBill.java` file.

## Compilation

To compile the program, run the following command:

```bash
javac ElectricityBill.java
```

## Running the Application

After compiling, you can run the application with the following command:

```bash
java ElectricityBill
```

## Usage

1. The program will prompt you to enter the following details:
   - Current meter reading (in kWh)
   - Previous meter reading (in kWh)
   - Charge per kWh (from your electricity tariff)
   - Your name
   - Your address
   - Your phone number (must be 10 digits)
   - Your email address
   - Your meter number (must be 10 digits)

2. After entering the required information, the program will display a summary of your electricity bill.

## Validation

- Phone numbers must be exactly 10 digits.
- Meter numbers must also be exactly 10 digits.
- The current meter reading cannot be less than the previous reading.

## Example

```
Enter your current meter reading (kWh): 150
Enter your previous meter reading (kWh): 100
Enter your charge per kWh (from your electricity tariff): 0.15
Enter your name: John Doe
Enter your address: 123 Main St, Cityville
Enter your phone number: 1234567890
Enter your email: john.doe@example.com
Enter your meter number: 1234567890

--- Bill Summary ---
Name: John Doe
Address: 123 Main St, Cityville
Phone Number: 1234567890
Email: john.doe@example.com
Meter Number: 1234567890
Total Bill: 7.5 currency units

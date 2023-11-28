package neu.edu.controller;

import neu.edu.model.Car;
import neu.edu.model.Customer;
import neu.edu.model.Rental;
import neu.edu.util.DateUtil;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private static CustomerController customerController;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> availableCars = new ArrayList<>();
    private static Rental rental = null;
    //private static Customer customer = null;
    //private static Car car = null;
    public static void initializaCustomerController() throws ParseException {
        customerController = new CustomerController();
        displayOptions();


        int choice = scanner.nextInt();

        while (choice != 6) {
            switch (choice) {
                case 1:
                    displayAvailableCars();
                    break;
                case 2:
                    rentCar();
                    break;
                case 3:
                    rental = cancelBooking(rental);
                    break;
                case 4:
                    rental = returnCar(rental);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Display options again
            displayOptions();
            choice = scanner.nextInt();

            System.out.println("Exiting the Car Rental System. Thank you!");
        }
    }
    private static void displayOptions(){
        System.out.println("\nPlease select an option: ");
        System.out.println("1. Display Available Cars");
        System.out.println("2. Rent a Car");
        System.out.println("3. Cancel Booking");
        System.out.println("4. Return a Car");
        System.out.println("5. Generate Invoice");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayAvailableCars() {
        System.out.println("Displaying Available Cars");

        // Get the list of available cars
        availableCars.add(new Car(1, "Honda", "Civic", 2022));
        availableCars.add(new Car(2, "Toyota", "Camry", 2023));
        availableCars.add(new Car(3, "Ford", "Mustang", 2021));
        availableCars.add(new Car(4, "Chevrolet", "Malibu", 2022));
        availableCars.add(new Car(5, "Nissan", "Altima", 2023));

        System.out.println("\nAvailable Cars:");
        for (Car car : availableCars) {
            System.out.println(car.getCarId() + " - " + car.getMake() + " " + car.getModel());
        }

    }

    private static void rentCar() throws ParseException {
        System.out.println("Rent a car");

        System.out.print("Enter your customer ID: ");
        String customerId = scanner.next();

        // Assume you have a method in CarRentalSystem to display available cars
        displayAvailableCars();

        System.out.print("Enter the ID of the car you want to rent: ");
        int carId = scanner.nextInt();

        System.out.print("Enter the start date of the rental (format: yyyy-mm-dd): ");
        String startDateString = scanner.next();
        // Parse the start date into a Date object
        Date startDate = DateUtil.parseDateString(startDateString);

        System.out.print("Enter the end date of the rental (format: yyyy-mm-dd): ");
        String endDateString = scanner.next();
        Date endDate = DateUtil.parseDateString(endDateString);

        try {
            Customer customer = new Customer(Integer.parseInt(customerId), "Srinivas", 1234567890, null);
            Car car = getCarById(carId);
            rental = createRental(customer, car, startDate, endDate);
            System.out.println("Rental successful. Rental ID: " + rental);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    private static Rental cancelBooking(Rental rental) {
        System.out.println("Cancel car Booking");
        System.out.println(rental);
        if(rental != null){
            System.out.println("Are you sure want to cancel Booking: Y/N");
            String customerInput = scanner.next();
            if(customerInput.equals("Y")){
                rental = null;
                System.out.println("Cancellation Successful!");
            }
        }

        return rental;
    }

    private static Rental returnCar(Rental rental) {
        System.out.println("Renting a car");
        System.out.println(rental);
        if(rental != null){
            System.out.println("Are you sure want to Return Car: Y/N");
            String customerInput = scanner.next();
            if(customerInput.equals("Y")){
                if(generateInvoice()){
                    rental = null;
                    System.out.println("Return Successful!");
                }

            }
        }
        return rental;
    }

    private static Boolean generateInvoice(){
        boolean isPaymentSuccess = false;
        System.out.println("Generate Invoice");
        System.out.println("Please pay the amount $150, Press 1 to complete");
        int customerInput = scanner.nextInt();
        if(customerInput == 1){
            isPaymentSuccess = false;
            System.out.println("Payment Successful");
        }else {
            System.out.println("Please try again!");
        }
        return isPaymentSuccess;
    }

    private static Rental createRental(Customer customer, Car car, Date startDate, Date endDate){
        Rental rental;
        try {
            rental = new Rental(1,customer, car, startDate, endDate, "Booked", 150.0);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return rental;
    }

    public static Car getCarById(int carId) {
        for (Car car : availableCars) {
            if (car.getCarId() == carId) {
                return car; // Found the car with the specified ID
            }
        }
        return null;
    }


}

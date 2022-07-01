package de.wumpe.carrental.command;

public class ArgumentsCommand {
    public void executeCommand() {
        System.out.println("""
                CarRental: Argumente
                 CABRIOLET - String:licensePlate String:produces long:productID float:topSpeed float:mileageRate String:color float:kilowatt float:rentalPrice boolean:rented byte:seats byte:people String:roof boolean:open
                 VAN       - String:licensePlate String:produces long:productID float:topSpeed float:mileageRate String:color float:kilowatt float:rentalPrice boolean:rented byte:seats byte:people bollean:roofBox
                 PICKUP    - String:licensePlate String:produces long:productID float:topSpeed float:mileageRate String:color float:kilowatt float:rentalPrice boolean:rented byte:seats byte:people boolean:allWheel
                 TRUCK     - String:licensePlate String:produces long:productID float:topSpeed float:mileageRate String:color float:kilowatt float:rentalPrice boolean:rented byte:axles double:maxLoad""");
    }
}

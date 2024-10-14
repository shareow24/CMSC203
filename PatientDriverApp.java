public class PatientDriverApp {
    public static void main(String[] args) {
        // Create a Patient instance
    	 Patient patient = new Patient("Yann","L", "ro", "1 harvin St", "sintown", "MA", "10045", "240-122-2227", "shut lan", "240-777-7789");

        // Create Procedure instances
        Procedure procedure1 = new Procedure();
        procedure1.setProcedureName("X-Ray");
        procedure1.setProcedureDate("09/30/2024");
        procedure1.setPractitionerName("Dr. Martha");
        procedure1.setCharges(100.00);

        Procedure procedure2 = new Procedure("MRI", "10/03/2024");
        procedure2.setPractitionerName("Dr. Reta");
        procedure2.setCharges(1250.00);

        Procedure procedure3 = new Procedure("Blood Test", "09/30/2024", "Dr. Marsela", 220.00);

        // Display patient information
        displayPatient(patient);

        // Display procedure information
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges: $" + String.format("%.2f", totalCharges));
    }

    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }

    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
}
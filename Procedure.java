// Procedure class
class Procedure {
    // Attributes
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    // No-arg constructor
    public Procedure() {
        procedureName = "";
        procedureDate = "";
        practitionerName = "";
        charges = 0.0;
    }

    // Constructor with procedure name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        practitionerName = "";
        charges = 0.0;
    }

    // Constructor with all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Getters
    public String getProcedureName() {
    	return procedureName; 
    }
    public String getProcedureDate() { 
    	return procedureDate; 
    }
    public String getPractitionerName() { 
    	return practitionerName; 
    }
    public double getCharges() { 
    	return charges; 
    }

    // Setters
    public void setProcedureName(String procedureName) { 
    	this.procedureName = procedureName; 
    }
    public void setProcedureDate(String procedureDate) { 
    	this.procedureDate = procedureDate; 
    }
    public void setPractitionerName(String practitionerName) {
    	this.practitionerName = practitionerName; 
    }
    public void setCharges(double charges) { 
    	this.charges = charges; 
    }

    // Method to display procedure info
    public String toString() {
        return procedureName + "\t" + procedureDate + "\t" + practitionerName + "\t" + charges;
    }
}
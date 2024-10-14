
// Patient class
class Patient {
    // Attributes
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // No-arg constructor
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhone = "";
    }

    // Constructor with first, middle, and last name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhone = "";
    }

    // Constructor with all attributes
    public Patient(String firstName, String middleName, String lastName,
                   String streetAddress, String city, String state, String zipCode,
                   String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Getters (Accessors)
    public String getFirstName() { 
    	return firstName; 
    }
    public String getMiddleName() {
    	return middleName; 
    }
    public String getLastName() { 
    	return lastName; 
    }
    public String getStreetAddress() {
    	return streetAddress; 
    }
    public String getCity() { 
    	return city; 
    }
    public String getState() { 
    	return state; 
    }
    public String getZipCode() { 
    	return zipCode; 
    }
    public String getPhoneNumber() { 
    	return phoneNumber; 
    }
    public String getEmergencyContactName() {
    	return emergencyContactName; 
    }
    public String getEmergencyContactPhone() {
    	return emergencyContactPhone; 
    }

    // Setters (Mutators)
    public void setFirstName(String firstName) {
    	this.firstName = firstName; 
    }
    public void setMiddleName(String middleName) {
    	this.middleName = middleName; 
    }
    public void setLastName(String lastName) {
    	this.lastName = lastName; 
    }
    public void setStreetAddress(String streetAddress) { 
    	this.streetAddress = streetAddress;
    }
    public void setCity(String city) {
    	this.city = city; 
    }
    public void setState(String state) { 
    	this.state = state;
    }
    public void setZipCode(String zipCode) { 
    	this.zipCode = zipCode; 
    }
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber; 
    }
    public void setEmergencyContactName(String emergencyContactName) {
    	this.emergencyContactName = emergencyContactName; 
    }
    public void setEmergencyContactPhone(String emergencyContactPhone) { 
    	this.emergencyContactPhone = emergencyContactPhone; 
    }

    // Method to build full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build address
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // Method to build emergency contact info
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // Method to display patient info
    public String toString() {
        return "Patient: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "Phone: " + phoneNumber + "\n" +
               "Emergency Contact: " + buildEmergencyContact();
    }
}
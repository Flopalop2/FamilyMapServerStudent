package Result;

import Model.Person;

/**
 * saves result of person service
 */
public class PersonResult {
    private String personID;
    private String associatedUser;
    private String firstName;
    private String lastName;
    private String gender;
    private String fatherID;
    private String motherID;
    private String spouseID;
    private String result;
    private boolean success;

    /**
     * null constructor
     */
    public PersonResult() {
    }

    /**
     * constructor sets values to those found in person param
     * @param person
     */
    public PersonResult(Person person) {
        personID = person.getPersonID();
        associatedUser = person.getAssociatedUser();
        firstName = person.getFirstName();
        lastName = person.getLastName();
        gender = person.getGender();
        fatherID = person.getFatherID();
        motherID = person.getMotherID();
        spouseID = person.getSpouseID();
    }

    /**
     * error message to set
     * @param result
     */
    public PersonResult(String result) {
        this.result = result;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getAssociatedUser() {
        return associatedUser;
    }

    public void setAssociatedUser(String associatedUser) {
        this.associatedUser = associatedUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherID() {
        return fatherID;
    }

    public void setFatherID(String fatherID) {
        this.fatherID = fatherID;
    }

    public String getMotherID() {
        return motherID;
    }

    public void setMotherID(String motherID) {
        this.motherID = motherID;
    }

    public String getSpouseID() {
        return spouseID;
    }

    public void setSpouseID(String spouseID) {
        this.spouseID = spouseID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

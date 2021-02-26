package Result;

import Model.Person;

/**
 * returns result of getting all persons from database
 */
public class AllPersonResults {
    private Person[] personList;
    private String result;
    private boolean success;

    /**
     * empty null constructor
     */
    public AllPersonResults() {
    }

    /**
     * constructor for errors
     * @param message error message
     */
    public AllPersonResults(String message) {
        this.result = message;
    }

    /**
     * constructor that sets result of finding all persons
     * @param personList
     */
    public AllPersonResults(Person[] personList) {
        this.personList = personList;
    }

    public Person[] getPersonList() {
        return personList;
    }

    public void setPersonList(Person[] personList) {
        this.personList = personList;
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

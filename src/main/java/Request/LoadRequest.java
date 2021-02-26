package Request;

import Model.*;

/**
 * saves values in request
 */
public class LoadRequest {
    private User[] users;
    private Person[] persons;
    private Event[] events;

    /**
     * default constructor
     * sets null values
     */
    public LoadRequest() {
    }

    /**
     * constructor that passes in arrays to load
     * @param userArray
     * @param personArray
     * @param eventArray
     */
    public LoadRequest(User[] userArray, Person[] personArray, Event[] eventArray) {
        this.users = userArray;
        this.persons = personArray;
        this.events = eventArray;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }
}

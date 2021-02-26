package Result;

import Model.Event;

/**
 * returns result of getting all events from database
 */
public class AllEventResults {
    private Event[] eventList;
    private String message;
    private boolean success;

    /**
     * empty null constructor
     */
    public AllEventResults() {
    }

    /**
     * constructor for errors
     * @param message error message
     */
    public AllEventResults(String message) {
        this.message = message;
    }

    /**
     * constructor that sets result of finding all events
     * @param eventList
     */
    public AllEventResults(Event[] eventList) {
        this.eventList = eventList;
    }

    public Event[] getEventList() {
        return eventList;
    }

    public void setEventList(Event[] eventList) {
        this.eventList = eventList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

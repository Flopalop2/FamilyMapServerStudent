package Services;

import Result.AllEventResults;
import Result.EventResult;

/**
 * Returns ALL events for ALL family members of the current user. or
 * Returns the single Event object with the specified ID.
 * The current user is determined from the provided auth token.
 */
public class EventService {

    /**
     * finds one event in database
     * @param eventID event to find
     * @param authToken
     * @return EventResult result of finding one event
     */
    public EventResult getSingleEvent(String eventID, String authToken) {
        return new EventResult(null);
    }

    /**
     * returns all events found in database
     * @param authToken
     * @return AllEventResults results of returning all events
     */
    public AllEventResults getAllEvents(String authToken) {
        return new AllEventResults();
    }
}

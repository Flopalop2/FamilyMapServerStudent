package Services;

import Result.AllPersonResults;
import Result.PersonResult;

/**
 * Returns the single Person object with the specified ID. or
 * Returns ALL family members of the current user.
 * The current user is determined from the provided auth token.
 */
public class PersonService {
    /**
     * null constructor
     */
    public PersonService() {
    }

    /**
     * finds one Person in database
     * @param personID person to find
     * @param authToken current user
     * @return PersonResult result of find
     */
    public PersonResult personResult(String personID, String authToken) {
        return new PersonResult();
    }

    /**
     * finds all persons in database
     * @param authToken current user
     * @return AllPersonResults results of find
     */
    public AllPersonResults allPersonResults(String authToken) {
        return new AllPersonResults();
    }

}

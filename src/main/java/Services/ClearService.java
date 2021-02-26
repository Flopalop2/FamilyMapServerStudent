package Services;

import Result.ClearResult;

/**
 * Deletes ALL data from the database, including user accounts, auth tokens, and generated person and event data.
 */
public class ClearService {
    public ClearService() {
    }

    /**
     * clears tables in database
     * @return ClearResult result of clear
     */
    public ClearResult clearDB() {
        return new ClearResult(null);
    }
}

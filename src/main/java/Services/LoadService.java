package Services;

import Request.LoadRequest;
import Result.LoadResult;

/**
 * Clears all data from the database (just like the /clear API),
 * and then loads the posted user, person, and event data into the database.
 */
public class LoadService {
    public LoadService() {
    }

    /**
     * clears data and loads new user person and event data
     * @param request
     * @return LoadResult result of load
     */
    public LoadResult load(LoadRequest request) {
        return new LoadResult(null);
    }
}

package Services;

import Result.FillResult;

/**
 * Populates the server's database with generated data for the specified user name.
 * The required "username" parameter must be a user already registered with the server.
 * If there is any data in the database already associated with the given user name, it is deleted.
 * The optional "generations" parameter lets the caller specify the number of generations
 * of ancestors to be generated, and must be a non-negative integer
 * (the default is 4, which results in 31 new persons each with associated events).
 */
public class FillService {

    /**
     * null constructor
     */
    public FillService() {
    }

    /**
     * fills users generations as specified in input
     * @param userName
     * @param generations
     * @return FillResult result of fill
     */
    public FillResult fillService(String userName, int generations) {
        String result = null;
        FillResult fill = new FillResult(result);
        return fill;
    }
}

package Result;

/**
 * result of loading data into database (load service)
 */
public class LoadResult {
    private String result;

    /**
     * null constructor
     */
    public LoadResult() {
    }

    /**
     * sets result of load
     * @param result
     */
    public LoadResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

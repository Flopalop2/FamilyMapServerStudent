package Result;

/**
 * result of filling user data
 */
public class FillResult {
    private String result;

    /**
     * sets result
     * @param r result message
     */
    public FillResult(String r) {
        this.result = r;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

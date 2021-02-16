import java.text.ParseException;

public class BigChungus {
    private String memeStatus = "";

    public void setMarketValue(Integer marketValue) throws ParseException {
        if(marketValue<0){
            throw new ParseException("Market value cant be negative",0);
        }
        this.marketValue = marketValue;

    }

    public int getMarketValue() {
        return marketValue;
    }

    private int marketValue= -1;

    public String getMemeStatus() {
        return memeStatus;
    }

    public void setMemeStatus(String memeStatus) {
        this.memeStatus = memeStatus;
    }

    public BigChungus(String memeStatus) {
        this.memeStatus = memeStatus;
    }
}
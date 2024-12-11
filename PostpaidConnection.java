public class PostpaidConnection extends Connection {
    private int lineRent;
    private int creditLimit;

    public PostpaidConnection(String connectionId, String name, String MobileNo, int lineRent, int creditLimit) {
        super(connectionId, name, MobileNo); 
        setLineRent(lineRent);
        setCreditLimit(creditLimit);
    }

    public void setLineRent(int lineRent) {
        this.lineRent = lineRent;
    }

    public int getLineRent() {
        return lineRent;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
    public void displayinfo(){
        System.out.println("The Line Rent is : " + lineRent);
        System.out.println("Credit Limit is : " + creditLimit);
    }
}

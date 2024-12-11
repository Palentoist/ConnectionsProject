public class PrepaidConnection extends Connection{
    private int balanca;
    private int ExpiryDate;

    public PrepaidConnection(String connectionId, String name, String MobileNo, int balance, int expiryDate) {
        super(connectionId, name , MobileNo); 
        setBal(balance);
        setEx(expiryDate);
    }
    public void setBal(int balanca){
        this.balanca = balanca;
    }
    public int getBal(){
        return balanca;
    }

    public void setEx(int ExpiryDate){
        this.ExpiryDate = ExpiryDate;
    }
    public int getEx(){
        return ExpiryDate;
    }

    public void displayInfo(){
        System.out.println("The Balance is : " + balanca);
        System.out.println("The Expiry Date is : " + ExpiryDate);
    }
}

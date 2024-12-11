public class Connection {
    private String  connectionId;
    private String name;
    private String MobileNo;

    public Connection(){
        connectionId = "";
        name = "";
        MobileNo = "";
    }
    public Connection(String name , String connectionId , String MobileNo){
        setName(name);
        setId(connectionId);
        setNo(MobileNo);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(String connectionId){
        this.connectionId = connectionId;
    }
    public String getId(){
        return connectionId;
    }

    public void setNo(String MobileNo){
        this.MobileNo = MobileNo;
    }
    public String getNo(){
        return MobileNo;
    }

    public void displayInfo(){
        System.out.println("The ConnectionID is : " + connectionId);
        System.out.println("The Mobile No is : " + MobileNo);
        System.out.println("The Name is : " + name);
    }
}

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What type is your Connection?");
        System.out.println("1. Postpaid");
        System.out.println("2. Prepaid");
        System.out.println("3. Exit");

        int choice = input.nextInt();
        input.nextLine(); 

        System.out.println("Enter the Name of the Customer: ");
        String Name_cus = input.nextLine();
        System.out.println("Enter the Connection ID: ");
        String Conn_ID = input.nextLine();
        System.out.println("Enter the Mobile Number: ");
        String Moob_No = input.nextLine();

        switch (choice) {
            case 1:
                System.out.println("POSTPAID!");
                System.out.println("Enter the Line Rent: ");
                int line_rent = input.nextInt();
                System.out.println("Enter the Credit Limit: ");
                int credit_limit = input.nextInt();
                PostpaidConnection postpaid = new PostpaidConnection(Name_cus, Conn_ID, Moob_No, line_rent, credit_limit);
                postpaid.displayInfo();
                break;
            case 2:
                System.out.println("PREPAID!");
                System.out.println("Enter the Balance: ");
                int balance = input.nextInt();
                System.out.println("Enter the Expiry Date: ");
                int Expiry_date = input.nextInt();
                PrepaidConnection prepaid = new PrepaidConnection(Conn_ID, Name_cus, Moob_No, balance, Expiry_date);
                prepaid.displayInfo();
                break;
            case 3:
                System.out.println("Exiting The Program!");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        input.close();
    }
}

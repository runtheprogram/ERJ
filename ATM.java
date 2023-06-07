import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {

        int accountNumber; 
        int pin; 
        int choice; 
        double balance = 50000.0;
        double transactionAmount;

        Scanner scanner = new Scanner(System.in); // Ipang input ang mga details.

        System.out.println(" *** Welcome to Bank of ERJ! *** ");
        System.out.println("");

        System.out.print("Please enter your account number: ");
        accountNumber = scanner.nextInt();
        System.out.println(""); // this means new line. Para dili mag dikit ang mga ouput.


        System.out.print("Please enter your PIN: ");
        pin = scanner.nextInt();

       

    while (true) { // ga gamit og while loop para dili na mag sige balik balik og 'java ATM' sa cmd. It will automatically go back sa 'Please select an option:' kung ganahan mag exit, you just need to select the option 4.

        System.out.println("");

        System.out.println("Please select an option:"); // You will select sa option. 
        System.out.println("");


        System.out.println("1 Check balance");
        System.out.println("2 Withdraw funds");
        System.out.println("3 Deposit funds");
        System.out.println("4 Exit");
        System.out.println("");
    

        choice = scanner.nextInt(); // You need to select the options, its either 1,2, 3, or 4.

        switch (choice) { //Dire na ang choices. Each case mao na ang choice. Case 1 is choice 1 and the same sad sa uban na choices mao sad ang case(s).

            case 1:
                // Para mabal-an ang balance sa imoha account. The account has 50,000 balance.

                System.out.println("");

                System.out.printf("Your current balance is: " + balance); // E output ang balance.

                System.out.println(""); // Para naay next line dili mag digkit ang output.


                System.out.println("*****************************************************");
                System.out.println("");

                break;

            case 2: // Kung ganahan ka mo withdraw og money. 


                System.out.println("");

                System.out.print("Please enter the amount you would like to withdraw: ");
                
   

                transactionAmount = scanner.nextDouble(); // Ang 'transactionAmount' is ang amount na imoha e withdraw, then the balance will automatically update.

                if (transactionAmount > balance) {
                    System.out.println("Processing your withdrawal request.");
                } 

                else { // If kaigo ra ang balance, mao ni ang mo gawas. You can take the cash and the balance will update automatically.

                    balance -= transactionAmount;
                    System.out.println("Please take your cash.");
                    System.out.println("Your current balance is: " + balance);
                }

                System.out.println("*****************************************************");
                System.out.println("");

                break;

            case 3: // If gusto naman ka ma deposit or ganahan ka pun-an ang inyuha money. 

                System.out.print("");

                System.out.print("Please enter the amount you would like to deposit: ");
                transactionAmount = scanner.nextDouble();

                // ang plus and equal sign (+=) is mao na ang mag add sa balance. This is one of the example sa assignment operator. The 'transactionAmount' is mao na ang variable sa money nga imoha e deposit.

                balance += transactionAmount;
                System.out.println("Your deposit has been accepted.");
                System.out.println("Your current balance is: " + balance);

                System.out.println("*****************************************************");
                System.out.println("");

                break;

            case 4: // The exit option is wala nay buhaton ang user. This will automatically close. Mo balik nasad kay javac if you want to run the program again.

                System.out.println("");
                System.out.println(" *** Thank you for choosing ERJ Bank! We are happy to serve you. Please come again. ***");
                System.exit(0); // 'System.exit' means mo exit na ang program. 

            default:
                System.out.println("Invalid selection."); // This is optional. 
                break;
            }
        }
    }
}

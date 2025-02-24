package ATMproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu  extends Account{
	public int selection;
	Scanner menuInput=new Scanner (System.in);
	DecimalFormat money=new DecimalFormat("'$'###,##0.00");//It is a class-DecimalFormat
	
	HashMap<Integer,Integer> data = new HashMap<>();
	// validate login info customer number and pin
	public void getLogin() {
		int x=1;
		do {
			try {
				data.put(1234567, 1234);
				data.put(8897270, 8897);
				
				System.out.println(" Welcome to the ATM Project! ");
				
				System.out.println("Enter your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your Pin Number: ");
				setPinNumber(menuInput.nextInt());

				
			}catch (Exception e) {
			System.out.println("Invalid Characters . only Numbers");
			x = 2;
			
			}
			for(Entry<Integer, Integer> entry: data.entrySet()) {
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getpinNumber()) {
					getAccountType();
				}
				
			}
			System.out.println(" Wrong Customer Number or Pin ");
		}while(x ==1);
		
	
	}
	
	

	//Display Account Type menu with Selection--------
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1 - Checking Account ");
		System.out.println("Type 2 - Saving Account ");
		System.out.println("Type 3 - Exit ");
		System.out.println("Choice: ");
		
		selection = menuInput.nextInt();
		switch(selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println(" Thank you for using this ATM, Bye ");
			break;
		default:
			System.out.println("Invalid choice ");
			getAccountType(); 
			
		}
	}
	//Display Checking Account Menu with selections
	
		public void getChecking() {
			System.out.println(" Checking Account");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Balance");
			System.out.println("Type 4 - Exit");
			System.out.println("choice: ");
			
			selection = menuInput.nextInt();
			switch(selection) {
			case 1:
				System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println(" Thank you for using this ATM, Bye ");
			default:
				System.out.println("Invalid choice ");
				getChecking(); 
				
		}
	}
		//Display Saving Account Menu with selections
		
			public void getSaving() {
				System.out.println(" Saving Account");
				System.out.println("Type 1 - View Balance");
				System.out.println("Type 2 - Withdraw Funds");
				System.out.println("Type 3 - Deposit Balance");
				System.out.println("Type 4 - Exit");
				System.out.println("choice: ");
				
				selection = menuInput.nextInt();
				switch(selection) {
				case 1:
					System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
					getAccountType();
					break;
				case 2:
					getSavingWithdrawInput();
					getAccountType();
					break;
				case 3:
					getSavingDepositInput();
					getAccountType();
					break;
				case 4:
					System.out.println(" Thank you for using this ATM, Bye ");
				default:
					System.out.println("Invalid choice ");
					getSaving(); 
					
			}
		}
			
}


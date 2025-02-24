package ATMproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
	Scanner input=new Scanner (System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");//It is a class
	
	//set the customer Number
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	//get the customer number
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	//set the pin Number
		public int setPinNumber(int pinNumber) {
			this.pinNumber=pinNumber;
			return pinNumber;
		}
		
		//get the pin number
		public int getpinNumber() {
			return pinNumber;
		}
		
		//get checking Account Balance
		public double getCheckingBalance() {
			return checkingBalance;
		}
		
		//get saving Account Balance
		public double getSavingBalance() {
			return savingBalance;
		}
		 
		//calculating checking Account WithDrawal 
		public double calcCheckingWithdraw(double amount) {
			checkingBalance = (checkingBalance-amount);
			return checkingBalance;
		}
		
		//calculating saving Account withDrawal
		public double calcSavingWithdraw(double amount) {
			savingBalance = (savingBalance-amount);
			return savingBalance;
		}
		//calculating checking Account Deposit 
		public double calcCheckingDeposit(double amount) {
			checkingBalance = (checkingBalance+amount);
			return checkingBalance;
		}
		
		//calculating saving Account Deposit
		public double calcSavingDeposit(double amount) {
			savingBalance = (savingBalance+amount);
			return savingBalance;
		}
		
		//Customer Checking Account withdraw Input
		public void getCheckingWithdrawInput() {
			System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
			System.out.println("Amount you want to deposit from Checking Account: ");
			double amount = input.nextDouble();
			
			if((checkingBalance-amount)>=0){
				calcCheckingWithdraw(amount);
				System.out.println("New  checking Account balance: "+moneyFormat.format(checkingBalance));
			}
			else
				System.out.println("Balance cannot be negative. "+ "\n");
		
		}
		
		       //Customer Saving Account withdraw Input
		      public void getSavingWithdrawInput() {
			  System.out.println("Checking Account Balance: " + moneyFormat.format(savingBalance));
			  System.out.println("Amount you want to deposit from saving Account: ");
			  double amount = input.nextDouble();
					
					if((savingBalance-amount) >= 0){
						calcSavingWithdraw(amount);
						System.out.println("New  checking Account balance: "+moneyFormat.format(savingBalance));
					}
					else
						System.out.println("Balance cannot be negative. "+ "\n");
				
				}
		            
		            //Customer Checking Account Deposit Input
		            public void getCheckingDepositInput() {
		            	System.out.println("checking Account Balance: " + moneyFormat.format(checkingBalance));
		            	System.out.println("Amount you want to deposit from checking Account: ");
		            	double amount = input.nextDouble();
		            	
		            	if((checkingBalance+amount) >= 0){
		            		calcCheckingDeposit(amount);
		            		System.out.println("New  saving Account balance: "+moneyFormat.format(checkingBalance));
		            	}
		            	else
		            		System.out.println("Balance cannot be negative. "+ "\n");
		            	
		            }
		            
		            //Customer Saving Account Deposit Input
		            public void getSavingDepositInput() {
		            	System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		            	System.out.println("Amount you want to deposit from Saving Account: ");
		            	double amount = input.nextDouble();
		            	
		            	if((savingBalance+amount) >= 0){
		            		calcSavingDeposit(amount);
		            		System.out.println("New  saving Account balance: "+ moneyFormat.format(savingBalance));
		            	}
		            	else
		            		System.out.println("Balance cannot be negative. "+ "\n");
		            	
		            }

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


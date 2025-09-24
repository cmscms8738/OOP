package Bank;

import java.util.Scanner;

public class BankAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int bank_balance = 0;
		boolean run = true;
		
		while(run)
		{
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			String choice = scanner.nextLine();
			
			if(choice.equals("1"))
			{
				System.out.print("예금액>");
				String deposit = scanner.nextLine();
				bank_balance += Integer.parseInt(deposit);
			}
			else if(choice.equals("2"))
			{
				System.out.print("출금액>");
				String withdrawal = scanner.nextLine();
				bank_balance -= Integer.parseInt(withdrawal);
			}
			else if(choice.equals("3"))
			{
				System.out.println(bank_balance);
			}
			else if(choice.equals("4"))
			{
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}

}

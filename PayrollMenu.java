package payroll;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sabertooth
 */
import java.util.Scanner;


public class PayrollMenu
{
	private Scanner scanner;


	public PayrollMenu(Scanner scanner)
	{
		this.scanner = scanner;
	}


	public void show()
	{
		System.out.println();
		System.out.println("Main Menu");
		System.out.println("---------");
		System.out.println("[A]dd Employee");
		System.out.println("[R]emove Employee");
		System.out.println("[S]how Employees");
		System.out.println("[D]o Weekly Payroll");
		System.out.println("[Q]uit");
		System.out.println();
	}


	public PayrollCommand getNextCommand()
	{
		PayrollCommand command = null;

		do
		{
			//System.out.print("Enter command: ");
			if (scanner.hasNext() == false)
			{
				System.out.println("");
				System.out.println("**END OF INPUT FILE**");
				System.exit(1);
			}
			String s = scanner.nextLine();

			if (s.length() > 0)
			{
				switch (s.toUpperCase().charAt(0))
				{
				case 'A':
					command = PayrollCommand.ADD_EMPLOYEE;
					break;

				case 'R':
					command = PayrollCommand.REMOVE_EMPLOYEE;
					break;

				case 'S':
					command = PayrollCommand.SHOW_EMPLOYEES;
					break;

				case 'D':
					command = PayrollCommand.DO_WEEKLY_PAYROLL;
					break;

				case 'Q':
					command = PayrollCommand.QUIT;
					break;

				default:
					System.out.println("  invalid command; try again");
				}
			}
		}
		while (command == null);

		System.out.println();

		return command;
	}
}

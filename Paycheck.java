package payroll;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sabertooth
 */
public class Paycheck
{
	
	int grossPay;
	Employee e;
	int tax;
	int hoursWorked;
	int netPay;

	public Paycheck(Employee employee, int hoursWorked, int grossPay, int tax)
	{
		this.grossPay = grossPay;
		this.e = employee;
		this.tax = tax;
		this.hoursWorked = hoursWorked;
		this.netPay = this.grossPay - this.tax;
	}

    @Override
	public String toString()
	{
	     String s = "";
	        s += String.format("%-10s: %s\n", "Paycheck for", e.toString());
	        s += String.format("%5s%12s: %s\n", "     ", "Hours Worked", this.hoursWorked);
	        s += String.format("%5s%12s: %4s\n", "    ", "Gross Pay", CurrencyFormat.format(this.grossPay));
	        s += String.format("%5s%12s: %4s\n", "     ", "Tax", CurrencyFormat.format(this.tax));
	        s += String.format("%5s%12s: %4s\n", "     ", "Net Pay", CurrencyFormat.format(this.netPay));
	        
	        return s;   
	}
}

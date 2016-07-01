/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Sabertooth
 */

public class contractEmployee extends Employee 
{

	private int fixedHourlyRate; 
	
	public contractEmployee(String name, int wage) 
	{
		super(name); 
		fixedHourlyRate = wage; 
	}

	
    @Override
	public Paycheck createWeeklyPaycheck(int hoursWorked) 
	{
		try 
		{
			if (hoursWorked < 0 || hoursWorked > 200) {
                        throw new Exception();
                    }
		}
		catch (Exception e)
		{
			System.out.println("Invalid amount of hours.  Please try again.");
			System.exit(1);
		}
		int grossPay = fixedHourlyRate * hoursWorked; 
		
		Paycheck p = new Paycheck((Employee)this, hoursWorked, grossPay, 0); return p;
	}

	
    @Override
    public String toString()
    {
    	return getName() +" (Contract, " + CurrencyFormat.format(fixedHourlyRate) + "/hr)";
   

    }
}
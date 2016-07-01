/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Sabertooth
 */

//NAME: Danish Khan
//STUDENT ID: 47324012
//NAME: Adam Su
//STUDENT ID: 23628358

//This is the subclass for the salaried employee that extends the Employee class
public class salariedEmployee extends Employee 
{
	private int AnnualRate;
	
	// The constructor takes a name as a parameter and uses it to initialize
	// the employee's name.
	public salariedEmployee(String name, int wage)
	{
		super(name);
		AnnualRate = wage;
	}

	// createWeeklyPaycheck() creates and returns a weekly paycheck for this
	// employee, given the number of hours that were worked this week.  
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
		int grossPay = (int)(0.019230769 * AnnualRate);
		
		int tax = (int)(grossPay * 0.20);
		
		Paycheck p = new Paycheck((Employee)this, hoursWorked, grossPay, tax);
		
		//This returns the pay check of the salaried employee
		return p;
	}

	// toString() returns a String representation of this employee.  Different
	// kinds of employees will have somewhat different String representations.
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
    	return getName() +" (Salaried, " + CurrencyFormat.format(AnnualRate) + "/yr)";
   

    }
}
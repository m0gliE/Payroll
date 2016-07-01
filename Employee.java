package payroll;


import payroll.Paycheck;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sabertooth
 */
public abstract class Employee
{
	// The name of the employee
	private String name;

	public Employee(String name)
	{
		this.name = name;
	}

        public String getName()
	{
		return name;
	}
        public abstract Paycheck createWeeklyPaycheck(int hoursWorked);

    @Override
	public abstract String toString();
}

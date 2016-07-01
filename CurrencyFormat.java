package payroll;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sabertooth
 */
public class CurrencyFormat
{
	public static String format(int cents)
	{
		return String.format("$%,d.%02d", (cents / 100), (cents % 100));
	}
}

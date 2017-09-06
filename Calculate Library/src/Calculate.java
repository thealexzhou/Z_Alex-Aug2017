/*Alex Zhou
 *9-4-17
 *Our self written math library
 *it contains a series of methods to do basic math functions.
 */
public class Calculate {
	//square the input
	public static int square (int operand)
	{
		return operand * operand; 
	}
	//cube the input
	public static int cube (int operand)
	{
		return operand * operand * operand; 
	}
	//average two inputs
	public static double average (double number1, double number2)
	{
		return (number1+number2)/2;
	}
	//average three inputs
	public static double average (double number1, double number2, double number3)
	{
		return (number1+ number2+ number3)/3;
	}
	//converts input radians into degrees
	public static double toDegrees (double radian)
	{
		return (radian*180)/3.14159;
	}
	//converts input degrees into radians
	public static double toRadians (double degree)
	{
		return (degree*3.14159)/180;
	}
	//finds discriminat of the 3 inputs
	public static double discriminant (double a, double b, double c)
	{
		
		return b*b - 4 * a *c;		
	}
	//finds mixedNumber of the input 
	public static String toImproperFrace (int wholeNumber, int numerator, int denominator)
	{
		String mixedNumber; 
		int top = (wholeNumber *  denominator) + numerator ;
		int bottom = denominator;
		mixedNumber = top + "/" + bottom;
		return mixedNumber;
	}
	//finds improperFrac of the input
	public static String toMixedNum (int numerator, int denominator)
	{
		String improperFrac;
		int wholeNumber = numerator/denominator;
		int numerator1 =  numerator- wholeNumber*denominator;
		improperFrac = wholeNumber + "_" + numerator1 + "/" + denominator; 
		return improperFrac;
	}
	//finds the (ax+b)(cx+d) into a quadratic equation
	public static String foil (int a, int b, int c, int d, String n) 
	{
		String binomialMultiplication;
		int firstPart = a * c;
		int secondPart = a * d + c* b;
		int lastPart = b* d; 
		 binomialMultiplication = firstPart +"n^2" + "+" + secondPart + "n" + "+" + lastPart;
		 return  binomialMultiplication;
	}
}
	
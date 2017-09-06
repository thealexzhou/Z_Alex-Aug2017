/*Alex Zhou
 *9-4-17
 *This is the runner for the calculate library. It is used to test the methods in Calculate.
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5,5));
		System.out.println(Calculate.average(5,5,5));
		System.out.println(Calculate.toDegrees(10));
		System.out.println(Calculate.toRadians(10));
		System.out.println(Calculate.discriminant(2,5,2));
		System.out.println(Calculate.toImproperFrace(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7, "n"));
	}

}

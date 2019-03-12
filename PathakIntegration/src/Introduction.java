// Ravi Pathak
// A program integrating skills learned in COP 2006
public class Introduction {
		public static void carDemo() {

			Car myCar = new Car();
			Car kit = new Car();
			Car mysteryMachine = new Car();
			
			myCar.setColor("Red");
			kit.setColor("Black");
			mysteryMachine.setColor("Green");
			
			
			System.out.println(myCar.getColor());
			System.out.println(kit.getColor());
			System.out.println(mysteryMachine.getColor());
			
			// creating boolean values
			boolean first = true;
			boolean second = false;

			// setting strings to the boolean value
			String bLean = Boolean.toString(first);
			String cLean = Boolean.toString(second);

			// printing out the string in the console to return the value

			System.out.println(bLean);
			System.out.println(cLean);

		}
	}
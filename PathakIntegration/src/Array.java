// Ravi Pathak
// A program integrating skills learned in COP 2006
public class Array {
	public static int identifyArray() {
			int simpleArray[] = new int[] {4,6,16,8,56};
			for (int i = 0; i<simpleArray.length; i++) {
				 if (simpleArray[i] == 6) {
					 return i;
				 }
				 else if (simpleArray[i] == 8 ) {
					 return i;
				 }
				 else if (simpleArray[i] == 56) {
					 return i;
				 }
				 
				 else {
					 return 0;
				 }
			}
			return 0;
	}
}





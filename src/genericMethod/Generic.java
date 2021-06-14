package genericMethod;

public class Generic {

	public static void main(String[] args) {
		Integer[] number = {1,2,3,4,5,6,7};
		Character[] chars = {'a','e','f'};
		String[] words = {"hellow","hi","likhon"};
		
		
		printArray(words);
 
	}
	
	public static <Z> void printArray(Z[] x) {
		for (Z  item : x) {
			System.out.println(item);
			}
		}
		
		
			
			
			}
	



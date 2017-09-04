package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> StringList = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
			StringList.add("AI");
			StringList.add("Online...");
			StringList.add("Project");
			StringList.add("Genisys");
			StringList.add("Initiated...");
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
			for(int i = 0; i < StringList.size(); i++){
				String s = StringList.get(i);
				System.out.println(s);
			}
		//4. Print all the Strings using a for-each loop
			for(String S: StringList){
				System.out.println(S);
			}
		//5. Print only the even numbered elements in the list.
			for(int i = 0; i < StringList.size(); i+= 2){
				String s = StringList.get(i);
				System.out.println(s);
			}
		//6. Print all the Strings in reverse order.
			for(int i = 0; i < StringList.size(); i++){
				String s = StringList.get(i);
				System.out.println(s);
			}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}

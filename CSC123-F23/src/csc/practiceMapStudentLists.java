package csc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class practiceMapStudentLists {

	public static void main(String[] args) {
		//making a Map object
		Map<String, Object>	studentJoe = new HashMap<String, Object>();	
		Map<String, Object>	studentJane = new HashMap<String, Object>();
		Map<String, Object>	studentJames = new HashMap<String, Object>();
		
		//array list of the "Map" for the name students
		ArrayList<Map> students = new ArrayList<Map>();
		
		//dictionary Joe
		
		ArrayList<String> JoesHobbies = new ArrayList<String>();
		JoesHobbies.add("play golf");
		JoesHobbies.add("spear fishing");
		JoesHobbies.add("Hiking");
		
		studentJoe.put("Name", "Joe");
		studentJoe.put("Age", "15");
		studentJoe.put("GPA", "4");
		studentJoe.put("Hobbies", JoesHobbies);
		//dictionary Jane
		
		ArrayList<String> JanesHobbies = new ArrayList<String>();
		JanesHobbies.add("gaming");
		JanesHobbies.add("hunting");
		
		studentJane.put("Name", "Jane");
		studentJane.put("Age", "21");
		studentJane.put("GPA", "4");
		studentJane.put("Hobbies", JanesHobbies);

		//Dictionary James
		ArrayList<String> JamessHobbies = new ArrayList<String>();
		JamessHobbies.add("soccer");

		studentJames.put("Name", "James");
		studentJames.put("Age", "21");
		studentJames.put("GPA", "3.9");
		studentJames.put("Hobbies", JamessHobbies);

				
		//adding to ArrayList students
		students.add(studentJoe);
		students.add(studentJane);
		students.add(studentJames);
		
		System.out.println(students);
		
		//for(Map m: students) {
			//System.out.println(m);
		//}

	}

}

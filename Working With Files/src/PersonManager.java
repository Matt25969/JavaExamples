import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersonManager {

	private static final String FILENAME = "C:\\Users\\Admin\\JavaExercises\\filename.txt";

	public void writeToFile(ArrayList<Person> personArray) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);

			for (Person p : personArray) {

				String content = p.getName() + "|" + p.getAge() + "|" + p.getOccupation();

				bw.write(content);
				bw.newLine();

			}

			bw.close();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

		}

	}

	public ArrayList<Person> readFromFile() {

		ArrayList<Person> testArrayList = new ArrayList<Person>();

		String currentLine = null;

		try {

			// open input stream test.txt for reading purpose.
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\JavaExercises\\filename.txt"));

			while ((currentLine = br.readLine()) != null) {

				// so with this bit i need to read through the lines until i reach the split |,
				// then remove that word to pu tin the first parameter for my constructor
				//

				// Dont use | it fucked it up!!!!

				String[] currentArray = currentLine.split("\\|");

				String name = currentArray[0];

				int age = Integer.parseInt(currentArray[1]);

				String occupation = currentArray[2];

				Person p1 = new Person(name, occupation, age);

				testArrayList.add(p1);

			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

		return testArrayList;

	}
}

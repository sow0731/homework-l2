import java.util.HashMap;
import java.util.Map;

public class Exceptionsample {

	public static void main(String[] args) throws Exception {

		Map<Integer, String> studentId = new HashMap<>();
		studentId.put(1, "Aizawa");
		studentId.put(2, "Inoue");
		studentId.put(3, "Ueda");
		studentId.put(4, "Oda");
		studentId.put(5, "Kato");

		String name = studentId.get(6);

		if (name == null) {
			throw new Exception("name was null");
		} else {
			System.out.println("name was" + name);
		}

	}
}

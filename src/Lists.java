import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {

		List<String> favoritThings = new ArrayList<>();
		favoritThings.add("music");
		favoritThings.add("movie");
		favoritThings.add("fishing");
		favoritThings.add("basketball");
		favoritThings.add("flashin'clothes");

		for (String fav : favoritThings) {
			if (fav.startsWith(""))
				System.out.println(fav);

		}
	}

}

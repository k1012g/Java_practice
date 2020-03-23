import java.util.*;

public class Main03_06 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);

		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + ":" + value + "万人");
		}
	}
}
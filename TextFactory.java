package flyweightpattern;
import java.util.HashMap;
import java.util.Map;

public class TextFactory {
    private static final Map<String, Text> textMap = new HashMap<>();

    public static Text getText(String font, int size, String color) {
        String key = font + size + color;

        if (!textMap.containsKey(key)) {
            System.out.println("Creating new Textformat object for key: " + key);
            textMap.put(key, new Textformat(font, size, color));
        }
        else {
            System.out.println("Using cached Textformat object for key: " + key);
        }
        return textMap.get(key);
    }
}
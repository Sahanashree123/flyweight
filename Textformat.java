package flyweightpattern;
public class Textformat implements Text {
    private String font;
    private int size;
    private String color;

    public Textformat(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    @Override
    public void format(String text) {
        System.out.println("Formatting text: '" + text + "' with Font: " + font + ", Size: " + size + ", Color: " + color);
    }
}
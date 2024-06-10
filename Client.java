public class Client {
    public static void main(String[] args) {
        // Create different text objects
        Text text1 = TextFactory.getText("Arial", 12, "Black");
        Text text2 = TextFactory.getText("Times New Roman", 12, "Black");
        Text text3 = TextFactory.getText("Arial", 12, "Black");
        Text text4 = TextFactory.getText("Arial", 14, "Black");

        // Format and display text
        text1.format("Hello");
        text2.format("World");
        text3.format("Flyweight");
        text4.format("Pattern");
    }
}
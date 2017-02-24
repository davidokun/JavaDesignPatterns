package structural.flyweight;

public class Client {

    public static void main(String[] args) {

        WordProcessor wordProcessor = new WordProcessor();

        String textToAdd = "Hello I'm aaaa wwworddd pprocesssoorrr";
        int length = textToAdd.length();

        LetterFactory factory = new LetterFactory();

        for (int i = 0; i < length; i++) {

            String value = textToAdd.substring(i, i + 1);
            wordProcessor.addLetter(factory.createLetter(value));
        }

        wordProcessor.printLetters();
    }
}

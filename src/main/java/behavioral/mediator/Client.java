package behavioral.mediator;

public class Client {

    public static void main(String[] args) {

        ListText listText = new ListText();
        InputText inputText = new InputText();

        ScreenDirector screenDirector = new ScreenDirectorOne();
        screenDirector.setInputText(inputText);

        listText.setScreenDirector(screenDirector);

        listText.getItems().add("Data item one");
        listText.getItems().add("Data item two");
        listText.getItems().add("Data item three");

        listText.selectItem(0);

        System.out.println("Selected item : " + inputText.getValue());
    }
}

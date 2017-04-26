package behavioral.mediator;

public class ScreenDirectorOne implements ScreenDirector {

    private InputText inputText;

    @Override
    public void itemSelected(String value) {
        this.inputText.setValue(value);
    }

    @Override
    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}

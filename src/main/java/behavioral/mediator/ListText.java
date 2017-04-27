package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ListText {

    private List<String> items = new ArrayList<>();

    private ScreenDirector screenDirector;

    public void selectItem(int itemNumber) {
        String item = items.get(itemNumber);
        if (screenDirector != null) {
            screenDirector.itemSelected(item);
        }
    }

    public List<String> getItems() {
        return items;
    }

    public void setScreenDirector(ScreenDirector screenDirector) {
        this.screenDirector = screenDirector;
    }
}

package DifferentKindsOfBoxes;

import java.util.ArrayList;

public class MisplacingBox extends Box{

    private ArrayList<Item> misplacingList;

    public MisplacingBox(){
        this.misplacingList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        misplacingList.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}

package skeleton;

public class Digestor {

    private int digestedItems;

    public void consumeItem(int i) {
        digestedItems = digestedItems+i;
    }

    public int getDigestedItems() {
        return digestedItems;
    }

}

package skeleton;

public class Belly {
    Digestor digestor = new Digestor();
    public void eat(int cukes) {
        for (int i = cukes; i >0; i--) {
            digestor.consumeItem(1);
        }
    }

    public Digestor getDigestor() {
        return digestor;
    }
}

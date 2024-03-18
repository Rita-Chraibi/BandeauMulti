package bandeau;

public class Blink extends Effect {

    private final int myDelay;

    public Blink(String message, int delay) {
        super(message);
        myDelay = delay;
    }

    @Override
    public void playOn(Bandeau bandeau) {
        super.init(bandeau);
        String message = bandeau.getMessage();
        bandeau.setMessage("");
        bandeau.sleep(myDelay);
        bandeau.setMessage(message);
        bandeau.sleep(myDelay);
    }

}

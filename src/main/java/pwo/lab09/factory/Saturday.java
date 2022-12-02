package pwo.lab09.factory;

public class Saturday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Weekendzik - tak to można żyć";
    }

    @Override
    public String createMainMessage() {
        return "Bajlando";
    }

    @Override
    public String createClosingMessage() {
        return "Koniec imprezy, trzeba iść spać";
    }
}

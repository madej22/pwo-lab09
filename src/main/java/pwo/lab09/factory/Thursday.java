package pwo.lab09.factory;

public class Thursday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Czwartek - już bliżej jak dalej.";
    }

    @Override
    public String createMainMessage() {
        return "Bez pracy nie ma kołaczy...";
    }

    @Override
    public String createClosingMessage() {
        return "Czas wracać do domu";
    }
}

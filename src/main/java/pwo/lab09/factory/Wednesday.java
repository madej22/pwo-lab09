package pwo.lab09.factory;

public class Wednesday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Środa - już półmetek.";
    }

    @Override
    public String createMainMessage() {
        return "Praca idzie jak krew z nosa";
    }

    @Override
    public String createClosingMessage() {
        return "W końcu 16, czas wracać do domu";
    }
}

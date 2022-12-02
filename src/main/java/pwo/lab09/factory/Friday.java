package pwo.lab09.factory;

public class Friday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Piąteczek, piątunio, już prawie...";
    }

    @Override
    public String createMainMessage() {
        return "Taski w sprincie się skończyły, nie ma co robić";
    }

    @Override
    public String createClosingMessage() {
        return "Wolność!";
    }
}

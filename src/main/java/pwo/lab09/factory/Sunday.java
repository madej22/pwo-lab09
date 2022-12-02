package pwo.lab09.factory;

public class Sunday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Kac po wczorajszej imprezie jest, ale trzeba wstać na Mszę...";
    }

    @Override
    public String createMainMessage() {
        return "Trzeba się rozkoszować chwilą wolnego póki jeszcze można";
    }

    @Override
    public String createClosingMessage() {
        return "Niedziela wieczur... i humor popsuty";
    }
}

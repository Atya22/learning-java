package EnumClasses;

public enum Lights {
    GREEN("Go"),
    RED("Stop"),
    YELLOW("Ready");

    private final String action;

    public String getAction() {
        return action;
    }

    Lights(String action) {
        this.action = action;
    }
}
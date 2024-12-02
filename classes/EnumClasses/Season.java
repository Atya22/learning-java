package EnumClasses;

public enum Season {
    WINTER("-30", "+5", "Cold"),
    SPRING("-10", "+15", "Sunny"),
    SUMMER("+18", "+30", "Hot"),
    AUTUMN("-3", "+15", "Rainy");

    private final String formatInfo;

    Season(String minTemp, String maxTemp, String description) {
        this.formatInfo = "Min temperature " + minTemp + " Max temperature " + maxTemp + " descroption " + description;
    }

    public String getFormatInfo() {
        return formatInfo;
    }
}
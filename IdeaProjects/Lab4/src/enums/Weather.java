package enums;

public enum Weather {
    DEFAULT("default"),
    PLEASENT_COOLNESS("pleasent coolness"),
    TERRIBLY_COLD("terribly cold"),
    PLEASENT_WEATHER("pleasent weather");

    private String weather;

    Weather(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

}

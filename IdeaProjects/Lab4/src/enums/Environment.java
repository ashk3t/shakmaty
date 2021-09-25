package enums;

public enum Environment {
    STARTING("starting"),
    FULL_DARKNESS("full darkness"),
    WORLD("world"),
    SUBLUNARY_GROTTO("sublunary grotto");

    private String environment;

    Environment(String environment) {
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}

package enums;

public enum Adverbs {
    RELUCTANTLY("relucantly"),
    GROANING("groaning"),
    ANNOYINGLY("annoyingly"),
    CHEERFULLY("cheerfully");

    private String adverbs;

    Adverbs(String adverbs) {
        this.adverbs = adverbs;
    }

    public String getAdverbs() {
        return adverbs;
    }
}

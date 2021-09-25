package enums;

public enum Feeling {
    STARTING("starting"),
    TIRED("tired"),
    FROZEN("frozen"),
    UNKNOWN("unkown"),
    TIRED_AND_ALSO_FROZEN("tired and also tired");

    private String feeling;

    Feeling (String feeling){
        this.feeling=feeling;
    }

    public String getFeeling(){
        return feeling;
    }
    public void setFeeling (String feeling){
        this.feeling=feeling;
    }

}

package person;

import enums.Adverbs;
import enums.Environment;
import enums.Feeling;
import enums.Weather;
import exceptions.NumberOfStepsException;
import interfaces.Movable;
import interfaces.Speakable;

import java.util.Objects;

public class Donut extends SpawnedPerson implements Movable, Speakable {

    private Around donutAround =new Around(Environment.STARTING);
    private Hands donutHands = new Hands("hands");
    private Legs donutLegs = new Legs("legs");
    private boolean areBootsPut = false;

    public Hands getHands() {
        return donutHands;
    }

    public Legs getLegs() {
        return donutLegs;
    }

    public Around getDonutAround() {
        return donutAround;
    }

    public String getAroundAsString(){
        return donutAround.getAround().getEnvironment();
    }

    public void PutOnBoots() {
        areBootsPut = true;
        System.out.println(getName() + " put on the boots!");
    }


    public void goFor(SpawnedPerson person2, int n) throws NumberOfStepsException {
        if (n < 0) {
            throw new NumberOfStepsException("You can't do negative number of steps", n);
        }
        if (n > 10) {
            throw new NumberOfStepsException("You can't do 10 or more number of steps", n);
        }
        System.out.println(getName() + " " + "went for " + person2.getName() + " " + n + " steps");

    }

    public void stendUp(Adverbs adverb) {
        System.out.println(getName() + " stood up" + " " + adverb.getAdverbs() + "!");
    }

    public void wish(String str) {
        System.out.println(getName() + " wished to " + str);
    }

    public void grunt(Adverbs adverbs) {
        System.out.println(getName() + " grunted " + adverbs.getAdverbs());
    }

    @Override
    public void move() {
        System.out.println(getName() + " was moving!");
    }

    @Override
    public void speak(String str) {
        System.out.println(getName() + " said that" + str);
    }

    public Donut(String name, Feeling feeling, Weather weather) {
        super(name, feeling, weather);
    }

    public Donut(String name) {
        super(name);
    }


    public Donut() {
        super();
    }

    public void jump() {
        System.out.println(getName() + " was jumping!");
    }

    @Override
    public Feeling getFeeling() {
        return super.getFeeling();
    }

    @Override
    public String getFeelingAsString() {
        return super.getFeelingAsString();
    }

    @Override
    public Weather getWeather() {
        return super.getWeather();
    }

    @Override
    public void setWeather(Weather w) {
        super.setWeather(w);
    }

    @Override
    public String getWeatherAsString() {
        return super.getWeatherAsString();
    }

    @Override
    public void setFeeling(Feeling adj) {
        super.setFeeling(adj);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * Objects.hashCode(donutAround);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Donut other = (Donut) otherObject;
        return getDonutAround().equals(other.getDonutAround());
    }

    @Override
    public String toString() {
        return super.toString() + "[ Around :" + getAroundAsString() +
                "]";
    }
}

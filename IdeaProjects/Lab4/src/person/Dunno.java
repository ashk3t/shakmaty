package person;

import enums.Environment;
import enums.Feeling;
import enums.Weather;
import interfaces.Movable;
import interfaces.Speakable;

import java.util.Objects;

public class Dunno extends SpawnedPerson implements Movable, Speakable {

    private Around dunnoAround = new Around(Environment.STARTING);
    private Hands dunnoHands = new Hands("hands");
    private Legs dunnoLegs = new Legs("legs");

    public Dunno(String name) {
        super(name);
    }

    public Dunno() {
        super();
    }

    public Dunno(String name, Feeling adj, Weather weather) {
        super(name, adj, weather);
    }

    public Dunno(String name, Feeling adj) {
        super(name, adj);
    }


    public Around getDunnoAround() {
        return dunnoAround;
    }

    public String getAroundAsString() {
        return dunnoAround.getAround().getEnvironment();
    }

    public void move() {
        System.out.println(getName() + " was moving forward");
    }

    public void speak(String str) {
        System.out.println(getName() + " said that" + str);
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
    public Feeling getFeeling() {
        return super.getFeeling();
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
        return super.hashCode() + 17 * Objects.hashCode(dunnoAround);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Dunno other = (Dunno) otherObject;
        return this.dunnoAround.equals(((Dunno) otherObject).dunnoAround);
    }

    @Override
    public String toString() {
        return super.toString() + "[ Around :" + getAroundAsString() +
                "]";
    }
}

package person;

import enums.Environment;
import enums.Feeling;
import enums.Weather;

import java.util.Objects;

public abstract class SpawnedPerson extends Person {
    private Feeling feelings=Feeling.UNKNOWN;
    private Weather weather=Weather.DEFAULT;

    public SpawnedPerson(String name, Feeling adj,Weather weather) {
        super(name);
        feelings=adj;
        this.weather=weather;
    }

    public SpawnedPerson(String name,Feeling adj){
       super(name);
        this.feelings=adj;
    }

    public SpawnedPerson(String name) {
        super(name);
    }


    public SpawnedPerson() {
        super();
    }

    public Feeling getFeeling() {
        return feelings;
    }

    public String getFeelingAsString(){
        return feelings.getFeeling();
    }

    public void setFeeling(Feeling adj) {
        feelings=adj;
    }

    public Weather getWeather(){
        return weather;
    }

    public void setWeather(Weather w){
        weather=w;
    }

    public String getWeatherAsString(){
        return weather.getWeather();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    static public class Around {
        private Environment environment=Environment.STARTING;

        public Around(Environment environment) {
            this.environment = environment;
        }

        public Environment getAround() {
            return environment;
        }

        public void setAround(Environment environment) {
            this.environment = environment;
        }

        public void printAround() {
            System.out.println("The current environment was" + environment.getEnvironment());
        }

        @Override
        public boolean equals(Object obj) {
            if (this==obj) return true;
            if (obj==null || getClass()!=obj.getClass()) return false;
            Around other = (Around) obj;
            return getAround().equals(((Around) obj).getAround());
        }

        @Override
        public int hashCode() {
            return 7 * Objects.hashCode(environment);
        }
    }

    public class Hands extends Limbs{
        public Hands(String typeOfLimbs) {
            super(typeOfLimbs);
        }

        @Override
        public String getTypeOfLimbs() {
            return super.getTypeOfLimbs();
        }

        @Override
        public void getFreeze() {
            System.out.println(getName()+"'s " + getTypeOfLimbs() +" were freezing!");
        }

        public void clap(){
            System.out.println(getName()+ " was clapping hand in hand!");
        }
    }

    public class Legs extends Limbs{
        public Legs(String typeOfLimbs) {
            super(typeOfLimbs);
        }

        @Override
        public String getTypeOfLimbs() {
            return super.getTypeOfLimbs();
        }

        @Override
        public void getFreeze() {
            System.out.println(getName()+"'s " + getTypeOfLimbs() +" were freezing!");
        }

        public void jerk(){
            System.out.println(getName() +" was jerking his legs!");
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 11 * Objects.hashCode(feelings) + 13 * Objects.hashCode(weather);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(super.equals(otherObject))) return false;
        SpawnedPerson other= (SpawnedPerson) otherObject;
        return (getFeeling().equals(other.getFeeling())) && (getWeather().equals(other.getWeather()));
    }

    @Override
    public String toString() {
        return super.toString() + "[feelings:" + getFeelingAsString() + " ," +
                "weather: " + getWeatherAsString() +
                "]";
    }
}

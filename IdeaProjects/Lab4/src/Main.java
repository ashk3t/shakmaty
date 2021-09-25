import enums.Adverbs;
import enums.Environment;
import enums.Feeling;
import enums.Weather;
import exceptions.NegativeTunnelParametresException;
import exceptions.NumberOfStepsException;
import interfaces.onAble;
import interfaces.pushAble;
import person.Donut;
import person.Dunno;
import person.Tunnel;

public class Main {
    public static void main(String[] args) throws NumberOfStepsException, NegativeTunnelParametresException {
        Donut donut = new Donut("Donut", Feeling.TIRED, Weather.PLEASENT_COOLNESS);
        Dunno dunno = new Dunno("Duno");

        donut.PutOnBoots();
        donut.stendUp(Adverbs.GROANING);
        donut.goFor(dunno, 8);
        donut.getDonutAround().setAround(Environment.FULL_DARKNESS);
        dunno.getDunnoAround().setAround(Environment.FULL_DARKNESS);

        System.out.println("And the travelers found themselves in " + dunno.getAroundAsString());
        donut.speak(" it was unthinkable to conduct any research in such darkness");
        donut.wish("go back");

        onAble torch = new onAble() {
            @Override
            public void on() {
                System.out.println("The torch was on and the darkness lifted!");
                donut.getDonutAround().setAround(Environment.WORLD);
                dunno.getDunnoAround().setAround(Environment.WORLD);
                donut.grunt(Adverbs.ANNOYINGLY);
                donut.move();
            }
        };

        torch.on();
        donut.setFeeling(Feeling.TIRED_AND_ALSO_FROZEN);
        System.out.println(donut.getName() + " felt " + donut.getFeelingAsString() + "!");
        System.out.println(donut.getName() + " was well influenced at first by " + donut.getWeatherAsString());
        donut.setWeather(Weather.TERRIBLY_COLD);
        System.out.println("But now " + donut.getName() + " was shaked by the " + donut.getWeatherAsString());
        donut.getHands().getFreeze();
        donut.getLegs().getFreeze();
        donut.jump();
        donut.getLegs().jerk();
        donut.getHands().clap();
        System.out.println("But " + donut.getName() + " was also feeling the " + donut.getWeatherAsString());
        dunno.setWeather(Weather.PLEASENT_WEATHER);
        System.out.println("However, " + dunno.getName() + " was feeling " + dunno.getWeatherAsString());
        dunno.move();

        Tunnel tunnel = new Tunnel(3, 3);
        tunnel.goesDown();

        pushAble someOne = new pushAble() {
            @Override
            public void pushInTheBack() {
                System.out.println("It seemed as if someone was pushing in the back all the time");
            }
        };
        someOne.pushInTheBack();
        tunnel.expension();
        donut.getDonutAround().setAround(Environment.SUBLUNARY_GROTTO);
        dunno.getDunnoAround().setAround(Environment.SUBLUNARY_GROTTO);
        System.out.println("And the travelers found themselves in " + dunno.getAroundAsString() + "!");

    }
}

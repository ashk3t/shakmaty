package person;

import interfaces.Freezable;

public abstract class Limbs implements Freezable {
    private String typeOfLimbs;

    public Limbs(String typeOfLimbs){
        this.typeOfLimbs=typeOfLimbs;
    }

    public String getTypeOfLimbs(){
        return typeOfLimbs;
    }
    @Override
    public void getFreeze() {
        System.out.println(getTypeOfLimbs()+ "are freezing!");
    }

}

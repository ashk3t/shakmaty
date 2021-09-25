package person;

import exceptions.NegativeTunnelParametresException;

public class Tunnel {
     private int depth;
     private int width;

    public Tunnel(int depth, int width) throws NegativeTunnelParametresException {
        if (depth>0 && width>0) {
            this.depth = depth;
            this.width = width;
        }
        else throw new NegativeTunnelParametresException("The tunnel was collapsed!");
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }

    public void expension(){
        width+=10;
        System.out.println("Suddenly, the walls of the tunnel parted!");
    }

    public void goesDown(){
        System.out.println("The bottom of the tonnel goes down!");
    }


}

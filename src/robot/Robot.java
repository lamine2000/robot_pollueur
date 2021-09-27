package robot;

import monde.Monde;

public abstract class Robot {
    protected int posx, posy;
    protected Monde m;

    public Robot(int x, int y, Monde m){
        this.posx = x;
        this.posy = y;
        this.m = m;
    }

    public Robot(Monde m){
        this.posx = (int) (Math.random() * (m.getNbC()));
        this.posy = (int) (Math.random() * (m.getNbL()));
        this.m = m;
    }

    public int vaEn(int i, int j){
        if(i < 0 || j < 0 || i > m.getNbL() || j > m.getNbC())
            return -1;
        else{
            posx = j;
            posy = i;
        }
        return 0;
    }
}

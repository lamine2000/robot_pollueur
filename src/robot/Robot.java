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
        //this.Robot(posx, posy, m); 
    }

    protected int vaEn(int i, int j){
        if(i < 0 || j < 0 || j >= m.getNbL() || i >= m.getNbC())
            return -1;
        else{
            posx = i;
            posy = j;
        }
        return 0;
    }

    public abstract void parcourir(); //methode abstraite
}

// TODO: 28-09-2021 documenter toutes les methodes et mieux commenter le code

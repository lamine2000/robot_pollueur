package robot_pollueur;

import monde.Monde;
import robot.Robot;

public abstract class RobotPollueur extends Robot {
    public RobotPollueur(int x, int y, Monde m){
        super(x, y, m);
    }

    public RobotPollueur(Monde m){
        super(m);
    }

    public void polluer(){
        if(m.estSale(posy, posx) == 0)
            m.metPapierGras(this.posy, this.posx);
    }
}

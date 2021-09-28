package robot_nettoyeur;

import monde.Monde;
import robot.Robot;

public class RobotNettoyeur extends Robot {


    public RobotNettoyeur(Monde m) {
        super(0, 0, m);
    }

    protected void nettoyer(){
        if(m.estSale(this.posy, this.posx) == 1)
            m.prendPapierGras(this.posy, this.posx);
    }

    @Override
    public void parcourir() {
        int newx, dansMonde, deltax = 1;

        for (int i = 0; i < m.getNbL(); i++) {
            for(int j = 0; j < m.getNbC(); j++){
                this.nettoyer();

                newx = this.posx + deltax;
                dansMonde = vaEn(i, newx);

                if(dansMonde == -1 && deltax > 0){
                    vaEn(i+1, m.getNbC()-1);
                    deltax = -1;
                }
                else if(dansMonde == -1 /*&& deltax > 0*/){
                    vaEn(i+1, 0);
                    deltax = 1;
                }
            }
        }
    }
}

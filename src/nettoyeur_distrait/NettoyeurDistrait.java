package nettoyeur_distrait;

import monde.Monde;
import robot_nettoyeur.RobotNettoyeur;

public class NettoyeurDistrait extends RobotNettoyeur {
    public NettoyeurDistrait(Monde m) {
        super(m);
    }

    @Override
    public void parcourir(){
        int newx, dansMonde, cpt = 0, deltax = 1;

        for (int i = 0; i < m.getNbL(); i++) {
            for(int j = 0; j < m.getNbC(); j++) {

                //on compte le nombre de cases sales rencontrées
                cpt = m.estSale(this.posy, this.posx) == 1 ? cpt + 1 : cpt;

                //on ne nettoie qu'une case sale sur deux
                if (cpt % 2 == 0)
                    this.nettoyer();

                newx = this.posx + deltax;
                dansMonde = vaEn(i, newx);

                if (dansMonde == -1 && deltax > 0) {
                    vaEn(i + 1, m.getNbC() - 1);
                    deltax = -1;
                } else if (dansMonde == -1 /*&& deltax > 0*/) {
                    vaEn(i + 1, 0);
                    deltax = 1;
                }
            }
        }
    }

}

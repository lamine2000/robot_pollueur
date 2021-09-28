package pollueur_sauteur;

import monde.Monde;
import robot_pollueur.RobotPollueur;

public class PollueurSauteur extends RobotPollueur {
    private final int deltax;

    public PollueurSauteur(int deltax, int colDepart, Monde m) {
        super(colDepart, 0, m);
        this.deltax = deltax;
    }


    @Override
    public void parcourir() {
        int newx, dansMonde;
        for(int i = 0; i < m.getNbL(); i++){
            this.polluer();

            newx = this.posx + deltax;
            dansMonde = vaEn(i+1, newx);

            if(deltax > 0 && dansMonde == -1)
                vaEn(i+1, newx % m.getNbC());

            else if(deltax < 0 && dansMonde == -1 )
                //le robot apparait de l'autre coté de la ligne
                vaEn(i+1, m.getNbC() - ((m.getNbC()-newx) % m.getNbC()));
        }
    }
}

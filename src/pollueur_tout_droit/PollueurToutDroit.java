package pollueur_tout_droit;

import monde.Monde;
import robot_pollueur.RobotPollueur;

public class PollueurToutDroit extends RobotPollueur {
    private final int colDepart;

    public PollueurToutDroit(int colDepart, Monde m) {
        super(colDepart, 0, m);
        this.colDepart = colDepart;
    }

    @Override
    public void parcourir() {
        for(int i = 0; i < m.getNbL(); i++) {
            polluer();
            this.posy += 1;
        }
        this.posy -= 1;//repositionner le robot à la derniere ligne
    }
}

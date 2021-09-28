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
        for(int i = 0; i < m.getNbL(); i++){
            this.polluer();

            this.posy += 1;
            this.posx += deltax;

            if(deltax > 0 && this.posx >= m.getNbC())
                this.posx %= m.getNbC();
            else if(deltax < 0 && this.posx < 0 )
                //le robot apparait de l'autre coté de la ligne
                this.posx = m.getNbC() - ((m.getNbC()-this.posx) % m.getNbC());
        }
        /*repositionner le robot à la derniere
        ligne (corriger l'incrémentation de trop)
        */
        this.posy -= 1;
        this.posx -= deltax;
    }
}

import monde.Monde;
import pollueur_sauteur.PollueurSauteur;
import pollueur_tout_droit.PollueurToutDroit;
import robot.Robot;
import robot_nettoyeur.RobotNettoyeur;

public class Main {

    public static void main(String[] args) {
        Monde monde = new Monde(20, 20, true);
        Robot r = new PollueurSauteur(3, 5, monde);
        Robot r2 = new PollueurSauteur(-3, 6, monde);
        Robot r1 = new PollueurToutDroit(6, monde);
        //r1.parcourir();
        //r2.parcourir();
        //r.parcourir();
        System.out.println(monde);

        RobotNettoyeur r3 = new RobotNettoyeur(monde);
        r3.parcourir();
        System.out.println(monde);
    }
}

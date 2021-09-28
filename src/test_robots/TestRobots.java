package test_robots;

import monde.Monde;
import pollueur_sauteur.PollueurSauteur;
import pollueur_tout_droit.PollueurToutDroit;
import robot.Robot;
import robot_nettoyeur.RobotNettoyeur;
import nettoyeur_distrait.NettoyeurDistrait;

public class TestRobots {

    public static void main(String[] args) {
        Monde monde = new Monde(20, 20, true);
        Robot r = new PollueurSauteur(3, 5, monde);
        Robot r2 = new PollueurSauteur(-3, 6, monde);
        Robot r1 = new PollueurToutDroit(6, monde);
        Robot r3 = new RobotNettoyeur(monde);
        Robot r4 = new NettoyeurDistrait(monde);
        //r3.parcourir();
        //r1.parcourir();
        //r2.parcourir();
        //r.parcourir();

        System.out.println(monde);

        r4.parcourir();

        System.out.println(monde);
    }
}

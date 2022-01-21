package test_robots;

import monde.Monde;
import pollueur_sauteur.PollueurSauteur;
import pollueur_tout_droit.PollueurToutDroit;
import robot.Robot;
import robot_nettoyeur.RobotNettoyeur;
import nettoyeur_distrait.NettoyeurDistrait;

public class TestRobots {

    public static void afficheMonde(Monde monde, String titre){
        System.out.println(titre);
        System.out.println(monde.toString());
        System.out.println("Nombre de papiers gras : "+ monde.nbPapiersGras());
        System.out.println("\n\n__________________________________________\n");
    }

    public static void main(String[] args) {

        //création d'un monde propre
        Monde monde = new Monde(40, 45, false);

        //On affiche le monde avant le passage des Robots
        afficheMonde(monde, "Le monde avant le passage des robots :");

        //création des différents robots
        Robot ps1 = new PollueurSauteur(3, 5, monde);
        Robot ps2 = new PollueurSauteur(-2, 30, monde);

        Robot pt = new PollueurToutDroit(17, monde);

        Robot n = new RobotNettoyeur(monde);
        Robot nd = new NettoyeurDistrait(monde);

        //les robots pollueurs parcourent le monde et polluent

        pt.parcourir();
        //On réaffiche le monde
        afficheMonde(monde, "Le monde après le passage du pollueur tout droit :");

        ps1.parcourir();
        //On réaffiche le monde
        afficheMonde(monde, "Le monde après le passage d'un robot pollueur sauteur :");

        ps2.parcourir();
        //On réaffiche le monde
        afficheMonde(monde, "Le monde après le passage d'un deuxième pollueur sauteur :");

        //le robot nettoyeur distrait parcoure le monde et nettoie
        nd.parcourir();

        //On réaffiche le monde
        afficheMonde(monde, "Le monde après le passage du nettoyeur distrait :");

        //le robot nettoyeur (pas distrait) parcoure le monde et nettoie
        n.parcourir();

        //On réaffiche le monde
        afficheMonde(monde, "Le monde après le passage du nettoyeur (pas distrait) :");
    }
}

import monde.Monde;

public class Main {

    public static void main(String[] args) {
        Monde monde = new Monde();

        monde.metPapierGras(5, 7);
        monde.metPapierGras(9, 7);
        monde.metPapierGras(9, 8);
        monde.metPapierGras(0, 5);
        monde.metPapierGras(1, 2);
        monde.metPapierGras(3, 0);

        System.out.println(monde);
        System.out.println(monde.nbPapiersGras());

        monde.prendPapierGras(5, 7);
        System.out.println(monde);
        System.out.println(monde.nbPapiersGras());
        System.out.println(monde.estSale(0, 5));
    }
}

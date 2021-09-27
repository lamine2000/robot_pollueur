package com.robot_pollueur;

public class Monde {
    private final int nbL, nbC;
    private final Boolean[][] mat;

    public Monde(int lignes, int colonnes, Boolean etat){
        this.nbL = lignes;
        this.nbC = colonnes;
        this.mat = new Boolean[nbL][nbC];

        for(int i = 0; i < nbL; i++)
            for(int j = 0; j < nbC; j++)
                this.mat[i][j] = etat;
    }

    public Monde(){
        this.nbL = this.nbC = 10;
        this.mat = new Boolean[10][10];

        for(int i = 0; i < nbL; i++)
            for(int j = 0; j < nbC; j++)
                this.mat[i][j] = false;
    }

    @Override
    public String toString() {
        StringBuilder repr = new StringBuilder();

        for(int i = 0; i < nbL; i++) {
            for(int j = 0; j < nbC; j++){
                repr.append(mat[i][j] ? "o " : ". ");
                if(j == nbC - 1)
                    repr.append('\n');
            }
        }

        return repr.toString();
    }

    //retourne -1 si la case n'existe pas
    public int metPapierGras(int i, int j){
        if(i < 0 || j < 0 || i > nbL || j > nbC)
            return -1;
        else
            mat[i][j] = true;
        return 0;
    }

    public int prendPapierGras(int i, int j){
        if(i < 0 || j < 0 || i > nbL || j > nbC)
            return -1;
        else
            mat[i][j] = false;
        return 0;
    }

    public int estSale(int i , int j){
        if(i < 0 || j < 0 || i > nbL || j > nbC)
            return -1;
        else
            return mat[i][j] ? 1 : 0;
    }

    public int nbPapiersGras(){
        int nb = 0;

        for(int i = 0; i < nbL; i++)
            for(int j = 0; j < nbC; j++)
                if(mat[i][j])
                    nb++;

        return nb;
    }
}

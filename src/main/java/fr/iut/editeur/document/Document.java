package fr.iut.editeur.document;

import java.util.Random;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String texteMaj = texte.substring(debut, fin).toUpperCase();
        remplacer(debut, fin, texteMaj);
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        texte = "";
    }

    public void inserer(int debut, String ajout) {
        ajout = texte.charAt(debut) + ajout;
        remplacer(debut, debut, ajout);
    }

    @Override
    public String toString() {
        return this.texte;
    }
}

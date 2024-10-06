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


    /**
     * Remplace le texte entre debut et fin par remplacement
     * @param debut index de début du texte à remplacer
     * @param fin index de fin du texte à remplacer
     * @param remplacement texte qui servira de remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Met le texte entre debut et fin en majuscule
     * @param debut index de début du texte à mettre en majuscule
     * @param fin index de fin du texte à mettre en majuscule
     */
    public void majuscules(int debut, int fin) {
        String texteMaj = texte.substring(debut, fin).toUpperCase();
        remplacer(debut, fin, texteMaj);
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Efface tout le texte
     */
    public void clear() {
        texte = "";
        // bug supprimé
    }

    public void inserer(int debut, String ajout) {
        ajout = texte.charAt(debut) + ajout;
        remplacer(debut, debut, ajout);
    }

    /**
     * Ecrit le texte
     * @return L'attribyt texte de la classe
     */
    @Override
    public String toString() {
        return this.texte;
    }
}

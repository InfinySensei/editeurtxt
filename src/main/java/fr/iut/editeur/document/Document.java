package fr.iut.editeur.document;

/**
* Classe document simule un doucment composé d'un texte.
*/
public class Document {

    /**
    * chaine de caractère composant le contenu du document
    */
    private String texte;

    /**
    * Constructeur
    */
    public Document() {
        this.texte = "";
    }

    /**
    * getTexte
    * @return texte du document
    */
    public String getTexte() {
        return texte;
    }

    /**
    * setetxte
    * @param String texte, nouveau contenu du document
    */
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
        String maj = this.texte.substring(debut, fin + 1).toUpperCase();
        remplacer(debut, fin, maj);
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin , "");
    }

    public void clear() {
        texte = "";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}

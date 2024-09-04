package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        String[] tab = new String[3];
        int index = 0;
        for (int i=10; i<parameters.length; i++) {
            if (parameters[i].equals(";")) {
                index += 1;
            }
            else {
                tab[index] = tab[index] + parameters[i];
            }
        }
        System.out.println(tab[0]);
        this.document.remplacer(Integer.parseInt(tab[0]), Integer.parseInt(tab[1]), tab[2]);
        super.executer();
    }

}

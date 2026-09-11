class Livre {
    // Compartiment des attributs
    private String titre;
    private String auteur;
    private int nombrePages;
    private boolean disponible;

    Livre(String titre, String auteur, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.disponible = true;
    }

    void emprunter(){
        if(this.disponible){
            this.disponible = false;
            System.out.println("Le livre " + this.titre + " est disponible");
        } else {
            System.out.println("Le livre " + this.titre + " n'est pas disponible.");
        }

        }

    void rendre(){
        if(!this.disponible){
            this.disponible = true;
            System.out.println("Le livre " + this.titre + " a été rendu");
        } else {
            System.out.println("Le livre " + this.titre + " était déjà disponible");
        }

    }

}


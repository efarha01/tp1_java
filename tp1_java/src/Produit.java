public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix ne peut pas être négatif.");
        }
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void afficher() {
        System.out.println("Produit : " + nom + " | Prix : " + prix + " €");
    }

    public void afficher(double remise) {
        if (remise < 0 || remise > 100) {
            throw new IllegalArgumentException("La remise doit être comprise entre 0 et 100.");
        }
        double prixRemise = prix * (1 - remise / 100);
        System.out.println("Produit : " + nom + " | Prix avec " + remise + "% de remise : " + prixRemise + " €");
    }

    public void afficher(String devise) {
        System.out.println("Produit : " + nom + " | Prix : " + prix + " " + devise);
    }
}
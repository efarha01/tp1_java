public class Employe {
    private String nom;
    private double salaireBase;

    public Employe(String nom, double salaireBase) {
        if (salaireBase < 0) {
            throw new IllegalArgumentException("Le salaire de base ne peut pas être négatif.");
        }
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public double calculerSalaire() {
        return salaireBase;
    }
}
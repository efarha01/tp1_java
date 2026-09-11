import java.util.Objects;

public class Etudiant {
    private String numeroEtudiant;
    private String nom;
    private double moyenne;

    public Etudiant(String numeroEtudiant, String nom, double moyenne) {
        if (numeroEtudiant == null || numeroEtudiant.isBlank()) {
            throw new IllegalArgumentException("Le numéro d'étudiant ne peut pas être vide.");
        }
        this.numeroEtudiant = numeroEtudiant;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    @Override
    public String toString() {
        return "Étudiant n°" + numeroEtudiant + " : " + nom + " (Moyenne : " + moyenne + "/20)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(numeroEtudiant, etudiant.numeroEtudiant);
    }
     // si deux objets sont égaux selon la méthode equals(),
     // ils DOIVENT obligatoirement renvoyer le même hashCode().
     // Si cette règle n'est pas respectée les structures de données basées sur les tables de hachag ne fonctionneront pas
    @Override
    public int hashCode() {
        return Objects.hash(numeroEtudiant);
    }
}
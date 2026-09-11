public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double soldeInitial) {
        if (soldeInitial < 0) {
            throw new MontantInvalideException("Le solde initial ne peut pas être négatif.");
        }
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void deposer(double montant) {
        if (montant <= 0) {
            throw new MontantInvalideException("Le montant du dépôt doit être supérieur à 0.");
        }
        this.solde += montant;
    }

    // Retrait avec declaration de l'exception checked SoldeInsuffisantException
    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant <= 0) {
            // Optionnel : exception unchecked pour montant invalide
            throw new MontantInvalideException("Le montant du retrait doit être strictement positif.");
        }

        if (montant > solde) {
            double manquant = montant - solde;
            throw new SoldeInsuffisantException(
                    "Solde insuffisant pour effectuer ce retrait.",
                    manquant
            );
        }

        this.solde -= montant;
    }
}
public class SoldeInsuffisantException extends Exception {
    private double montantManquant;

    public SoldeInsuffisantException(String message, double montantManquant) {
        super(message);
        this.montantManquant = montantManquant;
    }

    public double getMontantManquant() {
        return montantManquant;
    }
}
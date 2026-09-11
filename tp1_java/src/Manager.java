public class Manager extends Employe {
    private double prime;

    public Manager(String nom, double salaireBase, double prime) {
        super(nom, salaireBase);
        if (prime < 0) {
            throw new IllegalArgumentException("La prime ne peut pas être négative.");
        }
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    @Override
    public double calculerSalaire() {
        return getSalaireBase() + prime;
    }
}
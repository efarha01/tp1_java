public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        if (rayon <= 0) {
            throw new IllegalArgumentException("Le rayon doit être positif.");
        }
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }
}
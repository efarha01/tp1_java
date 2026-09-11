public class Triangle extends Forme {
    private double base;
    private double hauteur;

    public Triangle(double base, double hauteur) {
        if (base <= 0 || hauteur <= 0) {
            throw new IllegalArgumentException("La base et la hauteur doivent être positives.");
        }
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double aire() {
        return (base * hauteur) / 2.0;
    }
}
public class RectangleForme extends Forme {
    private double largeur;
    private double hauteur;

    public RectangleForme(double largeur, double hauteur) {
        if (largeur <= 0 || hauteur <= 0) {
            throw new IllegalArgumentException("Les dimensions doivent être positives.");
        }
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double aire() {
        return largeur * hauteur;
    }
}
public class Rectangle {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        if (largeur <= 0 || hauteur <= 0) {
            throw new IllegalArgumentException("La largeur et la hauteur doivent être positives.");
        }
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle(double cote) {
        this(cote, cote);
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setLargeur(double largeur) {
        if (largeur <= 0) {
            throw new IllegalArgumentException("La largeur doit être positive.");
        }
        this.largeur = largeur;
    }

    public void setHauteur(double hauteur) {
        if (hauteur <= 0) {
            throw new IllegalArgumentException("La hauteur doit être positive.");
        }
        this.hauteur = hauteur;
    }
    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
}
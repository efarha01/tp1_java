public abstract class Forme {
    public abstract double aire();

    public void afficherAire() {
        System.out.println("L'aire de cette forme est : " + aire());
    }
    public static Forme plusGrande(Forme[] formes) {
        if (formes == null || formes.length == 0) {
            return null;
        }

        Forme max = formes[0];
        for (Forme f : formes) {
            if (f.aire() > max.aire()) {
                max = f;
            }
        }
        return max;
    }
}
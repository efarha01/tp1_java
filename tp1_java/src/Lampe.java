public class Lampe implements Allumable {
    private boolean allume;

    public Lampe() {
        this.allume = false;
    }

    @Override
    public void allumer() {
        this.allume = true;
        System.out.println("Lampe : Allumée (Lumière activée).");
    }

    @Override
    public void eteindre() {
        this.allume = false;
        System.out.println("Lampe : Éteinte.");
    }
}

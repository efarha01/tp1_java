public class TelephonePortable implements Allumable, ConnecteWifi {
    private boolean allume;
    private String reseauConnecte;

    public TelephonePortable() {
        this.allume = false;
        this.reseauConnecte = null;
    }

    @Override
    public void allumer() {
        this.allume = true;
        System.out.println("Téléphone : Allumé.");
    }

    @Override
    public void eteindre() {
        this.allume = false;
        this.reseauConnecte = null;
        System.out.println("Téléphone : Éteint.");
    }

    @Override
    public void connecter(String reseau) {
        if (!allume) {
            System.out.println("Téléphone : Impossible de se connecter au Wi-Fi, le téléphone est éteint.");
            return;
        }
        this.reseauConnecte = reseau;
        System.out.println("Téléphone : Connecté au réseau Wi-Fi " + reseau);
    }

    @Override
    public void deconnecter() {
        if (reseauConnecte != null) {
            System.out.println("Téléphone : Déconnecté du réseau " + reseauConnecte);
            this.reseauConnecte = null;
        } else {
            System.out.println("Téléphone : Aucune connexion Wi-Fi active.");
        }
    }
}
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Exercice 1
        Livre livre1 = new Livre("Harry Potter 1", "JK Rowling", 555);
        Livre livre2 = new Livre("Les misérables", "Victor Hugo", 222);

        livre1.emprunter();
        livre1.emprunter();
        livre2.emprunter();

        livre1.rendre();
        livre1.rendre();
        livre2.rendre();

        // Exercice 2
        CompteBancaire compte = new CompteBancaire("Elias", 500.0);
        System.out.println("Titulaire : " + compte.getTitulaire());
        System.out.println("Solde initial : " + compte.getSolde() + " €");

        try {
            CompteBancaire compteInvalide = new CompteBancaire("Jean", -100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Échec intercepté : " + e.getMessage());
        }

        try {
            compte.retirer(1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Échec intercepté : " + e.getMessage());
        }

        // Exercice 3
        Rectangle r1 = new Rectangle(4.0, 5.0);
        System.out.println("Rectangle 1 - Aire : " + r1.aire() + " | Périmètre : " + r1.perimetre());

        Rectangle r2 = new Rectangle(3.0);
        System.out.println("Rectangle 2 - Aire : " + r2.aire() + " | Périmètre : " + r2.perimetre());

        Rectangle r3 = new Rectangle();
        System.out.println("Rectangle 3 - Aire : " + r3.aire() + " | Périmètre : " + r3.perimetre());

        // Exercice 4
        Employe[] employes = new Employe[] {
                new Employe("Vincent", 2500.0),
                new Manager("Elias", 3500.0, 1000.0),
                new Employe("Cesar", 2200.0),
                new Manager("Rim", 4000.0, 1500.0)
        };

        for (Employe e : employes) {
            System.out.println("Employé : " + e.getNom() + " | Salaire total : " + e.calculerSalaire() + " €");
        }

        // Exercice 5
        Produit ordi = new Produit("MacBook Air", 1200.0);
        ordi.afficher();
        ordi.afficher(15.0);
        ordi.afficher("USD");

        // Exercice 6
        Forme[] formes = new Forme[] {
                new Cercle(3.0),
                new RectangleForme(4.0, 5.0),
                new Triangle(6.0, 4.0)
        };

        System.out.println("\nCalcul des aires :");
        for (Forme f : formes) {
            f.afficherAire();
        }

        Forme plusGrandeForme = Forme.plusGrande(formes);
        if (plusGrandeForme != null) {
            System.out.println("La plus grande forme a une aire de : " + plusGrandeForme.aire());
        }

        // Exercice 7
        Allumable[] appareils = new Allumable[] {
                new TelephonePortable(),
                new Lampe()
        };

        for (Allumable appareil : appareils) {
            appareil.allumer();
        }
        for (Allumable appareil : appareils) {
            if (appareil instanceof ConnecteWifi) {
                ConnecteWifi appareilWifi = (ConnecteWifi) appareil;
                appareilWifi.connecter("Maison_5G");
            } else {
                System.out.println("Cet appareil (" + appareil.getClass().getSimpleName() + ") ne supporte pas le Wi-Fi.");
            }
        }

        // Exercice 8
        Reservation res1 = new Reservation("Elias", LocalDate.of(2026, 7, 10), LocalDate.of(2026, 7, 17));
        Reservation res2 = new Reservation("Cesar", LocalDate.of(2026, 11, 1), LocalDate.of(2026, 11, 5));

        Reservation[] reservations = { res1, res2 };
        for (Reservation res : reservations) {
            System.out.println("Client : " + res.getNomClient() + " | Durée : " + res.dureeSejour() + " nuits | Haute saison : " + Reservation.estEnHauteSaison(res.getDateArrivee()));
        }
    }
}
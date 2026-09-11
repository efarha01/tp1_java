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
    }




}
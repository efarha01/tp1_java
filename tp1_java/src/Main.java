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

    }

    // Exercice 3


}
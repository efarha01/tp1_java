public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Harry Potter 1", "JK Rowling", 555);
        Livre livre2 = new Livre("Les misérables", "Victor Hugo", 222);

        System.out.println("--- Test des emprunts ---");
        livre1.emprunter();

        livre1.emprunter();

        livre2.emprunter();

        System.out.println("\n--- Test des rendus ---");
        livre1.rendre();

        livre1.rendre();

        livre2.rendre();
    }
}
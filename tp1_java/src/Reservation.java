import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private String nomClient;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;

    public Reservation(String nomClient, LocalDate dateArrivee, LocalDate dateDepart) {
        if (dateArrivee == null || dateDepart == null) {
            throw new IllegalArgumentException("Les dates ne peuvent pas être nulles.");
        }
        if (!dateDepart.isAfter(dateArrivee)) {
            throw new IllegalArgumentException("La date de départ (" + dateDepart + ") doit être postérieure à la date d'arrivée (" + dateArrivee + ").");
        }
        this.nomClient = nomClient;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    public String getNomClient() {
        return nomClient;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public long dureeSejour() {
        return ChronoUnit.DAYS.between(dateArrivee, dateDepart);
    }

    public static boolean estEnHauteSaison(LocalDate date) {
        if (date == null) {
            return false;
        }
        Month mois = date.getMonth();
        return mois == Month.JULY || mois == Month.AUGUST;
    }
}
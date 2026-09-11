/*
 * EXPLICATION CHECKED VS UNCHECKED :
 *
 * - Checked (extends Exception) : Le compilateur exige qu'elle soit gérée (try/catch)
 *   ou transmise (throws). On l'utilise pour des situations prévisibles dont le programme
 *   peut se remettre (ex: solde insuffisant).
 *
 * - Unchecked (extends RuntimeException) : Le compilateur n'impose rien (pas de throws obligatoire).
 *   Elle signale en général un bug ou un paramètre totalement incohérent (ex: montant <= 0).
 */
public class MontantInvalideException extends RuntimeException {
    public MontantInvalideException(String message) {
        super(message);
    }
}
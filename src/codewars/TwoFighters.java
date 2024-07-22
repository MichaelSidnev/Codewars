package codewars;

public class TwoFighters {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = fighter1.name;
        while (fighter1.health > 0 || fighter2.health > 0) {

            if (firstAttacker.equals(fighter2.name)) {

                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    return winner;
                }

                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return winner;
                }
            } else {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return winner;
                }

                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    return winner;
                }
            }
        }
        return winner;
    }
}

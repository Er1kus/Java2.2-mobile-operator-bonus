public class Main {
    public static void main(String[] args) {

        int account = 500;
        int payment = 1200;
        int bonusCost = 100;
        int secondPayment = 3000;

        int bonus;
        if (payment >= 1000) {
            bonus = payment / bonusCost;
        } else {
            bonus = 0;
        }
        int sumAccount = account + payment + bonus;

        int bonus2;
        if (secondPayment >= 1000) {
            bonus2 = secondPayment / bonusCost;
        } else {
            bonus2 = 0;
        }
        int sumAccount2 = account + secondPayment + bonus2;
        System.out.println("Начисленные бонусы за пополнение: " + bonus + " руб");
        System.out.println("Итоговый счёт после пополнения: " + sumAccount + " руб");
        System.out.println("Начисленные бонусы за последующее пополнение: " + bonus2 + " руб");
        System.out.println("Итоговый счёт после последующего пополнения: " + sumAccount2 + " руб");

    }
}
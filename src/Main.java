public class Main {
    public static void main(String[] args) {

        int account = 500;
        int payment = 3000;
        int bonusCost = 100;
        boolean condition = payment >= 1000;

        //int bonus = condition ? payment / bonusCost : 0;
        int bonus;
        if (condition) {
            bonus = payment / bonusCost;
        } else {
            bonus = 0;
        }
        int sumAccount = account + payment + bonus;


        System.out.println("Начисленные бонусы за пополнение: " + bonus + " руб");
        System.out.println("Итоговый счёт после пополнения: " + sumAccount + " руб");

    }
}
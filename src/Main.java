public class Main {
    public static void main(String[] args) {
        int startAmount = 429;
        int sum = 581;

//        int bonus;
//
//        if (sum > 1000) {
//            bonus = sum / 100;
//        } else {
//            bonus = 0;
//        }

        int bonus = sum > 1000 ? sum / 100 : 0;

        int finishAmount = startAmount + sum + bonus;

        System.out.println("Бонус: " + bonus + " руб." + " Итоговая сумма на счету: " + finishAmount + " руб.");
    }
}
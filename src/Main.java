public class Main {
    public static void main(String[] args) {
        int amount = 10_840; // Стоимость совершенной нами покупки

        int bonus;
        if (amount >= 20) {
            bonus = 1;
        }
        int result = amount / 20;
        System.out.println("Вам начислены мили за покупку:" + result);
    }
}
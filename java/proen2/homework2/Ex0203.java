public class Ex0203 {
    public static void main(String[] args) {
        Robot robita = new Robot(new Position(10, 20), "ロビタ");
        System.out.println("[Start]");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                robita.moveX(i);
            } else {
                robita.moveY(i);
            }
            System.out.println(robita);
        }
        System.out.println("[Goal]");
    }
}

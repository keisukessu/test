public class TestEx0206 {
    public static void main(String[] args) {
        Robot robita = new Robot(new Position(10, 20), "ロビタ");
        System.out.println("[Start]");
        Robot robitaMkII = robita.makeClone2();
        System.out.println("移動前のrobita = " + robita);
        robita.moveX(10);
        System.out.println("移動後のrobita = " + robita);
        System.out.println("robitaMkII = " + robitaMkII);
        System.out.println("[Goal]");
    }
}
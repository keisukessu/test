package proen1;

class kadai12_4 {
    public static void main(String[] args) {
        String a = args[0];
        char[] b = a.toCharArray();

        String c = args[1];
        char[] d = c.toCharArray();

        if (b.length != d.length) {
            System.out.println("false");
        } else {
            for (int i = 0; i < b.length; i++) {
                if (b[i] != d[i]) {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        }
    }
}
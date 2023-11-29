package proen1;

class kadai13_6 {
    @FunctionalInterface
    interface my_function {
        public double value(double x);
    }

    static double integral(my_function f, double a, double b) {
        double n = 1000.0;
        double h = (b - a) / n;

    }

    d(my_function f) {
        return (double x) -> {
            return (f.value(x + 0.00001) - f.value(x)) / 0.00001;
        };
    }

    public static void main(String[] args) {
        my_function f = (double x) -> {
            return Math.sin(x);
        };
        my_function df = d(f);
        System.out.println(f.value(3));
        System.out.println(Math.cos(3));
        System.out.println(df.value(3));
    }
}
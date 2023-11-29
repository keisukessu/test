package proen1;

class Complex {
    double real;
    double imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(Complex z) {
        real = real + z.real;
        imaginary = imaginary + z.imaginary;
    }

    void scalar_mul(double k) {
        real = real * k;
        imaginary = imaginary * k;
    }

    void mul(Complex z) {
        double n1 = real * z.real - imaginary * z.imaginary;
        double n2 = (imaginary * z.real) + (real * z.imaginary);
        real = n1;
        imaginary = n2;
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public class kadai13_4 {
        public static void main(String[] args) {
            Complex z1 = new Complex(3, 4);
            Complex z2 = new Complex(2, 3);
            Complex z3 = new Complex(3, 4);
            z1.scalar_mul(5);
            z1.mul(z2);
            z1.add(z3);
            System.out.println("計算結果は" + z1 + "です");
        }

    }
}

abstract class Numerica {

    public abstract String toString();

    public abstract boolean equals(Object ob);

    public abstract Numerica sumar(Numerica numero);

    public abstract Numerica restar(Numerica numero);

    public abstract Numerica multiplicar(Numerica numero);

    public abstract Numerica dividir(Numerica numero);
}


class Fraccion extends Numerica {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void simplificar() {
        int divisor = mcd(numerador, denominador);
        if (divisor != 0) {
            numerador /= divisor;
            denominador /= divisor;
        }
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (!(ob instanceof Fraccion)) {
            return false;
        }
        Fraccion otra = (Fraccion) ob;
 
        return this.numerador == otra.numerador && this.denominador == otra.denominador;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        Fraccion otra = (Fraccion) numero;
        int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Numerica restar(Numerica numero) {
        Fraccion otra = (Fraccion) numero;
        int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        Fraccion otra = (Fraccion) numero;
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Numerica dividir(Numerica numero) {
        Fraccion otra = (Fraccion) numero;
        if (otra.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por una fraccion igual a 0.");
        }
        int nuevoNumerador = this.numerador * otra.denominador;
        int nuevoDenominador = this.denominador * otra.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
}

public class Prueba {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(1, 2);   // 1/2
        Fraccion f2 = new Fraccion(2, 4);   // se simplifica a 1/2
        Fraccion f3 = new Fraccion(3, 4);   // 3/4

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        System.out.println("\n¿f1 equals f2? " + f1.equals(f2)); // true, ambas son 1/2
        System.out.println("¿f1 equals f3? " + f1.equals(f3)); // false

        System.out.println("\nf1 + f3 = " + f1.sumar(f3));
        System.out.println("f1 - f3 = " + f1.restar(f3));
        System.out.println("f1 * f3 = " + f1.multiplicar(f3));
        System.out.println("f1 / f3 = " + f1.dividir(f3));
    }
}

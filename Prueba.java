class Profesor {
    protected void imprimir() {
        System.out.println("Es un profesor.");
    }
}

class ProfesorTitular extends Profesor {
    @Override
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
}

public class Prueba {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        profesor1.imprimir();
    }
}

public class Main {
    public static void main(String[] args) {
        cliente cliente = new cliente();
        cliente.nombre = "Carlos";
        cliente.edad = 20;
        cliente.telefono = 85412458;
        cliente.credito = 5000;
        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Edad del cliente: " + cliente.edad);
        System.out.println("Telefono del cliente: " + cliente.telefono);
        System.out.println("Credito del cliente: " + cliente.credito);
        System.out.println("----------------------------------------");

        trabajador trabajador = new trabajador();
        trabajador.nombre = "Allan";
        trabajador.edad = 25;
        trabajador.telefono = 95175384;
        trabajador.salario = 3200;
        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Edad del trabajador: " + trabajador.edad);
        System.out.println("Telefono del trabajador: " + trabajador.telefono);
        System.out.println("Salario del trabajador: " + trabajador.salario);
    }
}

class persona{
    String nombre;
    int edad;
    int telefono;
}

class cliente extends persona{
    int credito;
}

class trabajador extends persona{
    int salario;
}
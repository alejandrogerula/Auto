import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

    int familiar = 245000;
    int coupe = 270000;
    int sedan = 230000;

    int techo = 12000;
    int aire = 20000;
    int frenos = 14000;
    int airbag = 7000;
    int llantas = 12000;
    int total;




    Autos auto1 = new Autos("Juan", "sedan", sedan, 0, 0, frenos,airbag,llantas );
    Autos auto2 = new Autos("pepe", "familiar", familiar, techo,0,0,0,0);
    Autos auto3 = new Autos("Cacho", "coupe",coupe, techo,aire,frenos,0,llantas);


    System.out.println("Precios de todos los vehiculos asignados:    \n");

    total = auto1.calcular();
    System.out.println(auto1.nombreDuenio + "   " + auto1.tipoVehiculo + "   " + "precio total   " + total);

    total = auto2.calcular();
    System.out.println(auto2.nombreDuenio + "   " + auto2.tipoVehiculo + "   " + "precio total   " + total);

    total = auto3.calcular();
    System.out.println(auto3.nombreDuenio + "   " + auto3.tipoVehiculo + "   " + "precio total   " + total);
    }
}

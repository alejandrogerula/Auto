public class Autos {


    String nombreDuenio;
    String tipoVehiculo;
    int precioTipo;
    int techo;
    int aire;
    int frenos;
    int airbag;
    int llantas;

    public Autos(String nombreDuenio, String tipoVehiculo, int precioTipo, int techo, int aire, int frenos, int airbag, int llantas) {
        this.nombreDuenio = nombreDuenio;
        this.tipoVehiculo = tipoVehiculo;
        this.precioTipo = precioTipo;
        this.techo = techo;
        this.aire = aire;
        this.frenos = frenos;
        this.airbag = airbag;
        this.llantas = llantas;

    }

    public int calcular() {

        int total = precioTipo + techo + aire + frenos + airbag + llantas;

        return total;

    }

}

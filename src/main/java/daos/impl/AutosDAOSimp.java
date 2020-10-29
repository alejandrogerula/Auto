package daos.impl;

import daos.AutosDAOS;
import Model.Autos;
import java.sql.*;



public class AutosDAOSimp implements AutosDAOS{


int id = 10;


public void Insert(Autos auto){
    Connection connection = null;

    try {
        String url = "jdbc:mysql://localhost:3306/autos";
        String usuario = "root";
        String clave = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, usuario, clave);

    }catch (Exception ex){

        ex.printStackTrace();
    }
int numeroid =+ 1;

    try{

        String sql ="insert into auto (idAuto, duenio, tipo, precio) values (" +
                numeroid+ "," +
                auto.getduenio() + "," +
                auto.getTipoVehiculo()+ "," +
                auto.calcular()+")";


      /*  String consulta="insert into Articulo (descripcion, precio) values(" +
                articulo.getDescripcion() + ","  +
                articulo.getPrecio() + ")";   */


                Statement sentencia = connection.createStatement();
                sentencia.execute(sql);

    }catch (Exception ex){

        ex.printStackTrace();
    }finally {




    }





}
}
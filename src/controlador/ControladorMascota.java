package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Mascota;

public class ControladorMascota {

    Conexion conexion = new Conexion();

    public void MascotaAlmacenar(Mascota mascota) throws Exception {

        try {

            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "INSERT INTO MASCOTA (NOM_MASCOTA, AT_PREVIA, CANT_AT_PREV, DUENIO, NOM_DUENIO, DESCRI_MASCOTA, EDAD_MASCOTA, TIPO_MASCOTA, TEL_DUENO) VALUES ("
                    + "'" + mascota.getNomMascota() + "', "
                    + "" + mascota.isAtPrevia() + ", "
                    + "" + mascota.getCantAtPrev() + ", "
                    + "" + mascota.isDuenio() + ", "
                    + "'" + mascota.getNomDuenio() + "', "
                    + "'" + mascota.getDescriMascota() + "', "
                    + "'" + mascota.getEdadMascota() + "', "
                    + "'" + mascota.getTipoMascota() + "', "
                    + "'" + mascota.getTelefono() + "');";

            System.out.println("CONSULTA: " + consulta);
            stmt.executeUpdate(consulta);
            System.out.println("CONSULTA OK");

        } catch (Exception err) {
            System.out.println(err.getMessage());
            throw err;

        }
    }

    public ArrayList<Mascota> MascotaListar(String texto) throws Exception {

        ArrayList<Mascota> listarMascota = new ArrayList<>();

        try {

            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT ID_MASCOTA, NOM_MASCOTA, EDAD_MASCOTA, TIPO_MASCOTA, DUENIO FROM MASCOTA WHERE "
                    + "NOM_MASCOTA LIKE '" + texto + "%';";
            System.out.println("CONSULTA: " + consulta);

            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("ID_MASCOTA"));
                mascota.setNomMascota(rs.getString("NOM_MASCOTA"));
                mascota.setEdadMascota(rs.getInt("EDAD_MASCOTA"));
                mascota.setTipoMascota(rs.getString("TIPO_MASCOTA"));
                mascota.setDuenio(rs.getBoolean("DUENIO"));
                listarMascota.add(mascota);
            }
            return listarMascota;

        } catch (Exception err) {
            System.out.println(err.getMessage());
            throw err;

        }
    }

    public ArrayList<Mascota> TipoListar(String texto) throws Exception {
        ArrayList<Mascota> listarMascota = new ArrayList<>();

        try {

            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT ID_MASCOTA, NOM_MASCOTA, EDAD_MASCOTA, TIPO_MASCOTA, DUENIO FROM MASCOTA WHERE "
                    + "TIPO_MASCOTA LIKE '" + texto + "%';";
            System.out.println("CONSULTA: " + consulta);

            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("ID_MASCOTA"));
                mascota.setNomMascota(rs.getString("NOM_MASCOTA"));
                mascota.setEdadMascota(rs.getInt("EDAD_MASCOTA"));
                mascota.setTipoMascota(rs.getString("TIPO_MASCOTA"));
                mascota.setDuenio(rs.getBoolean("DUENIO"));
                listarMascota.add(mascota);
            }
            return listarMascota;

        } catch (Exception err) {
            System.out.println(err.getMessage());
            throw err;

        }
    }

    public void MascotaEliminar(int idMascota) throws Exception {

        try {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "DELETE FROM MASCOTA WHERE ID_MASCOTA = " + idMascota + ";";
            System.out.println("CONSULTA " + consulta);
            stmt.executeUpdate(consulta);
            System.out.println("CONSULTA OK");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public Mascota obtenerMascota(int id) throws Exception {
        Mascota mascota = new Mascota();

        try {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "SELECT ID_MASCOTA, NOM_MASCOTA, AT_PREVIA, CANT_AT_PREV, DUENIO, NOM_DUENIO, DESCRI_MASCOTA, EDAD_MASCOTA, TIPO_MASCOTA, TEL_DUENO FROM MASCOTA WHERE "
                    + "ID_MASCOTA = " + id + ";";
            System.out.println("CONSULTA: " + consulta);
            ResultSet rs = stmt.executeQuery(consulta);
            while (rs.next()) {

                mascota.setIdMascota(id);
                mascota.setNomMascota(rs.getString("NOM_MASCOTA"));
                mascota.setAtPrevia(rs.getBoolean("AT_PREVIA"));
                mascota.setCantAtPrev(rs.getInt("CANT_AT_PREV"));
                mascota.setDuenio(rs.getBoolean("DUENIO"));
                mascota.setNomDuenio(rs.getString("NOM_DUENIO"));
                mascota.setDescriMascota(rs.getString("DESCRI_MASCOTA"));
                mascota.setEdadMascota(rs.getInt("EDAD_MASCOTA"));
                mascota.setTipoMascota(rs.getString("TIPO_MASCOTA"));
                mascota.setTelefono(rs.getString("TEL_DUENO"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

        return mascota;
    }

    public void MascotaActualizar(Mascota mascota) throws Exception {

        try {

            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "UPDATE MASCOTA "
                    + "SET NOM_MASCOTA = '" + mascota.getNomMascota() + "', "
                    + "EDAD_MASCOTA = " + mascota.getEdadMascota() + " ,"
                    + " AT_PREVIA = " + mascota.isAtPrevia() + ", "
                    + " CANT_AT_PREV = " + mascota.getCantAtPrev() + ", "
                    + " DUENIO = " + mascota.isDuenio() + ", "
                    + " NOM_DUENIO = '" + mascota.getNomDuenio() + "', "
                    + " DESCRI_MASCOTA = '" + mascota.getDescriMascota() + "', "
                    + " EDAD_MASCOTA = " + mascota.getEdadMascota() + ", "
                    + " TIPO_MASCOTA = '" + mascota.getTipoMascota() + "', "
                    + " TEL_DUENO = " + mascota.getTelefono() + ""
                    + " WHERE ID_MASCOTA = " + mascota.getIdMascota() + ";";
            System.out.println("CONSULTA: " + consulta);
            stmt.executeUpdate(consulta);
            System.out.println("CONSULTA OK");

        } catch (Exception err) {
            System.out.println(err.getMessage());
            throw err;

        }
    }
}

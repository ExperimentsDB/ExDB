package searchDB;

import Papers.*;

import java.sql.*;
import java.util.ArrayList;

public class SearchDB {

    public SearchDB() {}

    public static ArrayList<Paper> Searchdb(String sqlInput,String table) throws SQLException {

        ArrayList<Paper> results = new ArrayList<>();

        String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
        try {
            // Registers the driver
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
        }

        Connection conn= DriverManager.getConnection(dbUrl, "postgres", "nestoras");

        try {
            Statement s = conn.createStatement();

            String sqlStr = "SELECT * FROM "+table+" WHERE " + sqlInput;
            ResultSet rset=s.executeQuery(sqlStr);

            switch(table){
                case "il8":
                    while(rset.next()){

                        assert false;
                        results.add(new IL8(rset.getInt("id"),rset.getString("link"),rset.getString(3),
                                rset.getString(4),rset.getString(5),rset.getString(6),
                                rset.getString(7),rset.getString(8),rset.getString(9),
                                rset.getString(10),rset.getString(11),rset.getString(12),
                                rset.getString(13),rset.getString(14),rset.getString(15),
                                rset.getString(16),rset.getString(17),rset.getString(18),
                                rset.getString(19)));
                    }
                    break;
                case "il12":
                    while(rset.next()){
                        assert false;
                        results.add(new IL12(rset.getInt("id"),rset.getString("link"),rset.getString(3),
                                rset.getString(4),rset.getString(5),rset.getString(6),
                                rset.getString(7),rset.getString(8),rset.getString(9),
                                rset.getString(10),rset.getString(11),rset.getString(12),
                                rset.getString(13),rset.getString(15),rset.getString(16),
                                rset.getString(17),rset.getString(18),rset.getString(20),
                                rset.getString(21),rset.getString(14),rset.getString(19)));
                    }
                    break;
                case "nphil":
                    while(rset.next()){
                        assert false;
                        results.add(new NPhil(rset.getInt("id"),rset.getString("link"),rset.getString(3),
                                rset.getString(4),rset.getString(5),rset.getString(6),
                                rset.getString(7),rset.getString(8),rset.getString(9),
                                rset.getString(10),rset.getString(11),rset.getString(12),
                                rset.getString(13),rset.getString(15),rset.getString(16),
                                rset.getString(17),rset.getString(18),rset.getString(20),
                                rset.getString(21),rset.getString(14),rset.getString(19)));
                    }
                    break;
                case "tnfavivo":
                    while(rset.next()){
                        assert false;
                        results.add(new TNFAVivo(rset.getInt("id"),rset.getString("link"),rset.getString(3),
                                rset.getString(4),rset.getString(5),rset.getString(6),
                                rset.getString(7),rset.getString(8),rset.getString(9),
                                rset.getString(10),rset.getString(11),rset.getString(12),
                                rset.getString(13),rset.getString(14),rset.getString(15),
                                rset.getString(16),rset.getString(17),rset.getString(18),
                                rset.getString(19)));
                    }
                    break;
            }

            rset.close();
            s.close();
            conn.close();
        }
        catch (Exception e){
        }

        return results;
    }

}
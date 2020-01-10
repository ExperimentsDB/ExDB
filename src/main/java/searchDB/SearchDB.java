package searchDB;

import Papers.*;
import org.json.simple.parser.ParseException;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

public class SearchDB {

    private Connection conn;


    // for testing
    public SearchDB(Connection conn) throws SQLException, URISyntaxException {

        try {
            // Registers the driver
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        this.conn = conn;
    }

    public SearchDB() throws SQLException, URISyntaxException {
        try {
            // Registers the driver
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        URI connectionParams = new URI(System.getenv("DATABASE_URL"));
        String jdbcUrl = "jdbc:postgresql://" + connectionParams.getHost() + ":" + connectionParams.getPort() + connectionParams.getPath() + "?sslmode=require";
        String username = connectionParams.getUserInfo().split(":")[0];
        String password = connectionParams.getUserInfo().split(":")[1];
        conn = DriverManager.getConnection(jdbcUrl, username, password);
    }

    // For closing the connection outside the class
    public void closeConn() throws SQLException {
        conn.close();
    }

    // Search through database and returns data
    public ArrayList<Paper> Searchdb(String searchbarText, String table) throws SQLException, ParseException {
        String sqlInput = "";
        ArrayList<String> columns = new ArrayList<>();
        ArrayList<Paper> results = new ArrayList<>();

        if (searchbarText.equals("")) {
            sqlInput = " id>0";
        } else {
            Statement s = conn.createStatement();
            //get column names
            String sqlStr = "select COLUMN_NAME from INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '" + table + "';";
            ResultSet rset = s.executeQuery(sqlStr);
            while (rset.next()) {
                columns.add(rset.getString(1));
            }

            rset.close();
            s.close();
            // Splits searchbar text into keywords
            String[] keywords = searchbarText.split(" ");
            for (String key : keywords) {
                sqlInput = sqlInput + "( ";
                Iterator c = columns.iterator();
                // If statement required for testing
                if (c.hasNext()) {
                    c.next();

                    while (c.hasNext()) {
                        sqlInput = sqlInput + " (" + c.next() + " ILIKE '%" + key + "%') OR";
                    }
                sqlInput = sqlInput.substring(0, sqlInput.length() - 3);//trim last OR
                }
                sqlInput = sqlInput + ") AND ";
            }
            sqlInput = sqlInput.substring(0, sqlInput.length() - 4);//trim last AND
        }

        Statement s = conn.createStatement();
        String sqlStr = "SELECT * FROM " + table + " WHERE " + sqlInput + ";";
        ResultSet rset = s.executeQuery(sqlStr);

        // Creates the results list based on which Cytokine was selected
        switch (table) {
            case "il8":
                while (rset.next()) {
                    assert false;
                    results.add(new IL8(rset.getInt("id"), rset.getString("link"), rset.getString(3),
                            rset.getString(4), rset.getString(5), rset.getString(6),
                            rset.getString(7), rset.getString(8), rset.getString(9),
                            rset.getString(10), rset.getString(11), rset.getString(12),
                            rset.getString(13), rset.getString(14), rset.getString(15),
                            rset.getString(16), rset.getString(17), rset.getString(18),
                            rset.getString(19)));
                }
                break;
            case "il12":
                while (rset.next()) {
                    assert false;
                    results.add(new IL12(rset.getInt("id"), rset.getString("link"), rset.getString(3),
                            rset.getString(4), rset.getString(5), rset.getString(6),
                            rset.getString(7), rset.getString(8), rset.getString(9),
                            rset.getString(10), rset.getString(11), rset.getString(12),
                            rset.getString(13), rset.getString(15), rset.getString(16),
                            rset.getString(17), rset.getString(18), rset.getString(20),
                            rset.getString(21), rset.getString(14), rset.getString(19)));
                }
                break;
            case "nphil":
                while (rset.next()) {
                    assert false;
                    results.add(new NPhil(rset.getInt("id"), rset.getString("link"), rset.getString(3),
                            rset.getString(4), rset.getString(5), rset.getString(6),
                            rset.getString(7), rset.getString(8), rset.getString(9),
                            rset.getString(10), rset.getString(11), rset.getString(12),
                            rset.getString(13), rset.getString(15), rset.getString(16),
                            rset.getString(17), rset.getString(18), rset.getString(20),
                            rset.getString(21), rset.getString(14), rset.getString(19)));
                }
                break;
            case "tnfavivo":
                while (rset.next()) {
                    assert false;
                    results.add(new TNFAVivo(rset.getInt("id"), rset.getString("link"), rset.getString(3),
                            rset.getString(4), rset.getString(5), rset.getString(6),
                            rset.getString(7), rset.getString(8), rset.getString(9),
                            rset.getString(10), rset.getString(11), rset.getString(12),
                            rset.getString(13), rset.getString(14), rset.getString(15),
                            rset.getString(16), rset.getString(17), rset.getString(18),
                            rset.getString(19)));
                }
                break;
        }
        rset.close();
        s.close();
        return results;
    }
}
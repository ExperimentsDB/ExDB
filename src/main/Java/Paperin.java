import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Paperin {
    public static void insertToDB(String table,String input) throws SQLException {

        String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
        try {
            // Registers the driver
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
        }

        Connection conn= DriverManager.getConnection(dbUrl, "postgres", "nestoras");

        String variables;

        switch (table){
            case "il8":
                variables="(link,figure,author,morphotype,liveORfixed,fixationmethod,initialAFinoculum,Afumigatusstrain,infectionmodel,strain,age,treatment,infectionroute,sample,sampleVolume,sampleSize,tUnits)";
                break;
            case "il12":
                variables="(link,author,morphotype,liveORfixed,fixationmethod,initialAFinoculum,Afumigatusstrain,infectionmodel,strain,age,treatment,cellconcentration,infectionroute,sample,sampleVolume,sampleSize,analysis,tUnits)";
                break;
            case "nphil":
                variables="(link,figure,author,morphotype,liveORfixed,fixationmethod,initialAFinoculum,Afumigatusstrain,infectionmodel,strain,age,treatment,cellconcentration,infectionroute,sample,sampleVolume,sampleSize,analysis,tUnits)";
                break;
            case "tnfavivo":
                variables="(link,figure,author,morphotype,liveORfixed,fixationmethod,initialAFinoculum,Afumigatusstrain,infectionmodel,strain,age,treatment,infectionroute,sample,sampleVolume,sampleSize,tUnits)";
                break;
        }



        try {
            Statement s=conn.createStatement();
            String sqlStr = "INSERT INTO "+table+" "+variables+" values ("+input+");";
            s.execute (sqlStr);
            s.close();
            conn.close()
        }
        catch (Exception e){
        }

    }

}

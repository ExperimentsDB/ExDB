package testSearchDB;

import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import searchDB.SearchDB;

import java.net.URISyntaxException;
import java.sql.*;

import static org.mockito.Mockito.*;

public class TestSearchDB {

    @Mock
    private Connection mockConnection;
    @Mock
    private Statement mockStatement;
    @Mock
    private ResultSet resultset;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDB() throws SQLException, URISyntaxException, ParseException {
        // Creates mocks for database
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeQuery(Mockito.any())).thenReturn(resultset);
        when(resultset.next()).thenReturn(false);
        when(resultset.toString()).thenReturn("");

        SearchDB searchDB = new SearchDB(mockConnection);
        searchDB.Searchdb("", "table");
        searchDB.Searchdb("test", "table");

        verify(mockStatement).executeQuery("SELECT * FROM table WHERE  id>0;");
        verify(mockStatement).executeQuery("select COLUMN_NAME from INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'table';");
    }
}

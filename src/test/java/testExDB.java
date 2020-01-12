import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import website.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;

public class testExDB {
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }
    //Tests for the websites
    // Each one asserts that each path prints the correct website using the websites from website package
    @Test
    public void testIndex() throws IOException {
        StringWriter writer = new StringWriter();
        PrintWriter printer = new PrintWriter(writer);
        when(response.getWriter()).thenReturn(printer);
        when(request.getServletPath()).thenReturn("/");

        ExDB testServlet = new ExDB();
        testServlet.doGet(request,response);

        String output = writer.getBuffer().toString();
        Assert.assertThat(output, is(equalTo(new WebIndex().toString())));
    }
//    @Test
//    public void testResults() throws IOException {
//        StringWriter writer = new StringWriter();
//        PrintWriter printer = new PrintWriter(writer);
//        when(response.getWriter()).thenReturn(printer);
//        when(request.getServletPath()).thenReturn("/results");
//
//        ExDB testServlet = new ExDB();
//        testServlet.doGet(request,response);
//
//        String output = writer.getBuffer().toString();
//        Assert.assertThat(output, is(equalTo(new webResults().toString())));
//    }
    @Test
    public void testSignIn() throws IOException {
        StringWriter writer = new StringWriter();
        PrintWriter printer = new PrintWriter(writer);
        when(response.getWriter()).thenReturn(printer);
        when(request.getServletPath()).thenReturn("/signin");

        ExDB testServlet = new ExDB();
        testServlet.doGet(request,response);

        String output = writer.getBuffer().toString();
        Assert.assertThat(output, is(equalTo(new WebSignin().toString())));
    }
    @Test
    public void testRegister() throws IOException {
        StringWriter writer = new StringWriter();
        PrintWriter printer = new PrintWriter(writer);
        when(response.getWriter()).thenReturn(printer);
        when(request.getServletPath()).thenReturn("/register");

        ExDB testServlet = new ExDB();
        testServlet.doGet(request,response);

        String output = writer.getBuffer().toString();
        Assert.assertThat(output, is(equalTo(new WebRegister().toString())));
    }
    @Test
    public void testStyle() throws IOException {
        StringWriter writer = new StringWriter();
        PrintWriter printer = new PrintWriter(writer);
        when(response.getWriter()).thenReturn(printer);
        when(request.getServletPath()).thenReturn("/style.css");

        ExDB testServlet = new ExDB();
        testServlet.doGet(request,response);

        String output = writer.getBuffer().toString();
        Assert.assertThat(output, is(equalTo(new WebStylesheetCommon().toString())));
    }
    @Test
    public void testScript() throws IOException {
        StringWriter writer = new StringWriter();
        PrintWriter printer = new PrintWriter(writer);
        when(response.getWriter()).thenReturn(printer);
        when(request.getServletPath()).thenReturn("/script.js");

        ExDB testServlet = new ExDB();
        testServlet.doGet(request,response);

        String output = writer.getBuffer().toString();
        Assert.assertThat(output, is(equalTo(new WebResultsChartTemplate().toString())));
    }
}


package website;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Html2string {
    private String html;

    public Html2string(String fileName){
        html = "";
        StringBuilder Bob = new StringBuilder();
        String path = new File("").getAbsolutePath();

        try {
            BufferedReader in = new BufferedReader(new FileReader(path + "/src/main/Java/website/" + fileName));
            String str;
            while ((str = in.readLine()) != null) {
                Bob.append(str);
            }
            in.close();
        } catch (IOException e) {
        }
        html = Bob.toString();
    }

    public String print(){
        return html;
    }
}

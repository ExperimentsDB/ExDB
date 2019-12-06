import HTML.*;

public class FrontPage {
    private HTML content;

    public FrontPage(){
        content = new HTML();
        TagA title = new TagA("class=\"navbar-brand\" href=\"#\"","<h1>ExDB</h1>");
        TagInput bar = new TagInput("class=\"form-control mr-sm-2\"\n" +
                "          type=\"search\"\n" +
                "          placeholder=\"Search\"\n" +
                "          aria-label=\"Search\"");
        TagButton button = new TagButton("class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\"","Search");
        TagForm form = new TagForm("class=\"form-inline\"",bar.toString()+button.toString());
        TagNav nav = new TagNav("class=\"navbar navbar-dark bg-dark py-5\"", title.toString()+form.toString());
        TagHeader header = new TagHeader(nav.toString());
        content.addtoBody(header);

        TagA HomeButton = new TagA("href=\"file:///D:/PRG3/Project/test3.html\" type=\"button\" class=\"btn btn-secondary btn-lg btn-block\"","Home");
        TagDiv home = new TagDiv("class=\"p-1 col-12 col-lg\"",HomeButton.toString());
        TagA SearchButton = new TagA("href=\"file:///D:/PRG3/Project/test3.html\" type=\"button\" class=\"btn btn-secondary btn-lg btn-block\"","Search");
        TagDiv search = new TagDiv("class=\"p-1 col-12 col-lg\"",SearchButton.toString());
        TagA InputButton = new TagA("href=\"file:///D:/PRG3/Project/test3.html\" type=\"button\" class=\"btn btn-secondary btn-lg btn-block\"","Input");
        TagDiv input = new TagDiv("class=\"p-1 col-12 col-lg\"",InputButton.toString());
        TagA ReqButton = new TagA("href=\"file:///D:/PRG3/Project/test3.html\" type=\"button\" class=\"btn btn-secondary btn-lg btn-block\"","Requests");
        TagDiv requests = new TagDiv("class=\"p-1 col-12 col-lg\"", ReqButton.toString());

        TagDiv row = new TagDiv("class=\"row justify-content-xl-center\"",home.toString()+search.toString()+input.toString()+requests.toString());
        TagDiv container = new TagDiv("class=\"container-fluid\" style=\"background-color: rgb(56, 54, 54);\"",row.toString());

        content.addtoBody(container);

    }

    public String printPage(){
        return content.toString();
    }
}

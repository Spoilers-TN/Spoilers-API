package ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class Demo {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String DemoText(){
        return "Prova API Spoilers";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String DemoHtml(){
        return "<html> " + "<title>" + "Spoilers API 0.1" + "</title>"
                + "<body><h1>" + "Spoilers API 0.1" + "</body></h1>" + "</html> ";
    }
}

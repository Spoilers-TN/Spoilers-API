package ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Demo")
public class Demo {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String DemoText(){
        return "Prova API Spoilers";
    }
}

package my.pack;

import org.atmosphere.cpr.Broadcaster;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("/users/{id}")
public class Resource {
//    private @PathParam("id")   Broadcaster topic;

    @GET
    @Path("get")
    @Produces("application/xml")
    public List<Info> get(@PathParam("id") String userId) {
        List<Info> list = new ArrayList<Info>();
        list.add(new Info("this"));
        list.add(new Info("is"));
        list.add(new Info("test"));
        list.add(new Info(userId));
        return list;
    }
}



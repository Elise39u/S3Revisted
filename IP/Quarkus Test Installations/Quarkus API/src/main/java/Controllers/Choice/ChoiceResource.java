package Controllers.Choice;

import Models.Choice;
import org.jboss.resteasy.spi.NotImplementedYetException;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Choice")
@Produces(MediaType.APPLICATION_JSON)
public class ChoiceResource {

    @GET
    @Path("{ChoiceId}")
    public Choice getChoiceById(int choiceId) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/GetChoicesByLocation/{locationId}")
    public List<Choice> getChoicesByLocation(int locationId) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/All")
    public List<Choice> getAllChoices() {
        throw new NotImplementedYetException();
    }

    @POST
    @Path("/Add/?fromLocationId={fromLocationId}&toLocationId={toLocationId}&choiceName={choiceName}")
    public String AddChoice(int fromLocationId, int toLocationId, String choiceName) {
        throw new NotImplementedYetException();
    }

    @PUT
    @Path("UpdateChoiceName/?choiceId={choiceId}&choiceTitle={choiceTitle}")
    public Choice UpdateChoice(int choiceId, String choiceTitle) {
        throw new NotImplementedYetException();
    }
}

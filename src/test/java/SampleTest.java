import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.spi.container.TestContainer;
import my.pack.Info;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.List;

public class SampleTest extends JerseyTest {
        public SampleTest() throws Exception {
        super("my.pack");
    }

    @Test
    public void getUserPowerConsumptions() {
        Client client = Client.create();
        client.addFilter(new LoggingFilter());

        ClientResponse response = client.resource(getBaseURI()).path("/users/bob/get").get(ClientResponse.class);

        List<Info> infos = response.getEntity(new GenericType<List<Info>>() {});
        System.out.println(infos);
    }
}

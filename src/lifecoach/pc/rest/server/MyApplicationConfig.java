package lifecoach.pc.rest.server;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("adapter")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("lifecoach.pc.rest.server.resources");
    }
}

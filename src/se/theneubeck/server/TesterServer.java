package se.theneubeck.server;

import com.sun.net.httpserver.BasicAuthenticator;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * author: jensneubeck Date: 2009-jul-21
 */
public class TesterServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 8000);

        HttpContext context = server.createContext("/app", new SimpleHandler());
//        context.setAuthenticator(new BasicAuthenticator("foobar"){
//            public boolean checkCredentials(String uname, String pass) {
//                return uname.equals("foo") && pass.equals("bar");
//            }
//        });

        server.setExecutor(null); // creates a default executor
        server.start();

    }
}

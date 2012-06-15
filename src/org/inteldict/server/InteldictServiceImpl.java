package org.inteldict.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.inteldict.client.InteldictService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class InteldictServiceImpl extends RemoteServiceServlet implements
        InteldictService {

  public String greetServer(String input) {
    String serverInfo = getServletContext().getServerInfo();
    String userAgent = getThreadLocalRequest().getHeader("User-Agent");
    return "Hello, " + input + "!<br><br>I am running " + serverInfo
        + ".<br><br>It looks like you are using:<br>" + userAgent;
  }
}

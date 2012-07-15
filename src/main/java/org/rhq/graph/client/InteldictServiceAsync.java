package org.inteldict.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface InteldictServiceAsync {
    void greetServer(String input, AsyncCallback<String> callback);
}

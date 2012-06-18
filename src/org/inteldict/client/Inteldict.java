package org.inteldict.client;


import com.google.gwt.dom.client.Style;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.IButton;
import com.google.gwt.core.client.EntryPoint;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;


/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class Inteldict implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad()
    {
        IButton button = new IButton();
        button.setTitle("Click!");

        button.addClickHandler(new ClickHandler(){

            @Override
            public void onClick(ClickEvent event)
            {
                SC.say("Hello World! :)");
            }

        });

        button.show();

        alert("It's work cool");

    }

    public static native void alert(String msg) /*-{
        $wnd.alert(msg);
    }-*/;
}

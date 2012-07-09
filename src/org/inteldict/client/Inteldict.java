package org.inteldict.client;


import com.google.gwt.core.client.EntryPoint;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Slider;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.VStack;


/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class Inteldict implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        IButton button = new IButton();
        button.setTitle("Click!");

        button.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                SC.say("Hello SmartGWT! :)");
            }

        });

        Canvas canvas = new Canvas();

        VStack vStack = new VStack();
        vStack.setShowEdges(true);
        vStack.setWidth(1024);
        vStack.setHeight(1024);
        vStack.setMembersMargin(5);
        vStack.setLayoutMargin(10);
        vStack.addMember(button);
        CubismCanvas cubismCanvas = new CubismCanvas();
        vStack.addMember(cubismCanvas);
        canvas.addChild(vStack);
        canvas.draw();
        cubismCanvas.drawCharts();
    }

}

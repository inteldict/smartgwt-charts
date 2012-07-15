package org.rhq.graph.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VStack;

/**
 * Entry point for test SmartGWT GWT module.
 */
public class Application implements EntryPoint {
    /**
     * This is called when the browser loads Application.html.
     */
    public void onModuleLoad() {
        GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
            public void onUncaughtException(Throwable t) {
                System.err.println("--- UNCAUGHT EXCEPTION ---");
                t.printStackTrace();
            }
        });

        VStack vStack = new VStack();
        vStack.setWidth(1024);
        vStack.setHeight(1024);
        vStack.setMargin(10);
        CubismCanvas cubismCanvas = new CubismCanvas();
        vStack.addMember(cubismCanvas);

        vStack.draw();
        cubismCanvas.drawCharts();
    }
}


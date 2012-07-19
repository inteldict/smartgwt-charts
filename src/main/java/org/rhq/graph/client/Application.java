/*
 * RHQ Management Platform
 * Copyright (C) 2005-2008 Red Hat, Inc.
 * All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package org.rhq.graph.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.smartgwt.client.widgets.layout.VStack;

import org.rhq.graph.client.Cubsim.Canvas;

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
        Canvas canvas = new Canvas();
        vStack.addMember(canvas);
        vStack.draw();
        canvas.drawCharts(0,0,1000, 900);
    }
}


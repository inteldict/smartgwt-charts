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
package org.rhq.graph.client.Cubsim;

import com.smartgwt.client.widgets.HTMLFlow;

/**
 * @author Denis Krusko
 */
public class Canvas extends com.smartgwt.client.widgets.Canvas {

    public Canvas() {
        HTMLFlow flow = new HTMLFlow();
        flow.setContents("<div id = \"cubism_chart\" />");
        flow.setWidth(900);
        this.addChild(flow);
    }

    public static native void drawCharts(int serverDelay, int clientDelay, int valuePerMs, int size) /*-{
        var context =  $wnd.cubism.context()
                .serverDelay(serverDelay)// allow seconds of collection lag
                .clientDelay(clientDelay)
                .step(valuePerMs)// value per second
                .size(size);

//        $wnd.alert("server: " +serverDelay + "clientDelay: " + clientDelay + "step: " + valuePerMs + "size: " + size);

        function random(name) {
            var value = 0,
                    values = [],
                    i = 0,
                    last;
            return context.metric(function (start, stop, step, callback) {
                start = +start, stop = +stop;
                if (isNaN(last)) last = start;
                while (last < stop) {
                    last += step;
                    value = Math.max(-10, Math.min(10, value + .8 * Math.random() - .4 + .2 * Math.cos(i += .2)));
                    values.push(value);
                }
                callback(null, values = values.slice((start - stop) / step));
            }, name);
        }

        var foo = random("foo"),
                bar = random("bar");

        $wnd.d3.select("#cubism_chart").call(function (div) {

            div.append("div")
                    .attr("class", "axis")
                    .call(context.axis().orient("top"));

            div.selectAll(".horizon")
                    .data([foo, bar, foo.add(bar), foo.subtract(bar)])
                    .enter().append("div")
                    .attr("class", "horizon")
                    .call(context.horizon().extent([-20, 20]));

            div.append("div")
                    .attr("class", "rule")
                    .call(context.rule());
        });

        // On mousemove, reposition the chart values to match the rule.
        context.on("focus", function (i) {
            $wnd.d3.selectAll(".value").style("right", i == null ? null : context.size() - i + "px");
        });
    }-*/;

}


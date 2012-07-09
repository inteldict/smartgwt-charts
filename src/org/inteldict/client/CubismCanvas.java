package org.inteldict.client;

import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.HTMLFlow;


public class CubismCanvas extends Canvas {

    public CubismCanvas() {

        this.setHeight(400);
        this.setWidth(960);
        HTMLFlow flow = new HTMLFlow();
        flow.setContents("<div id = \"example1\" >\n" +
                "           <div class=\"axis\" >" +
                "           </div >\n" +
                "           <div class=\"horizon\" >\n" +
                "               <span class=\"title\" > foo - bar </span >\n" +
                "                <span class=\"value\" style = \"\" > 5.7 </span ></div >\n" +
                "           <div class=\"rule\" >\n" +
                "               <div class=\"line\" style = \"position: absolute; top: 0px; bottom: 0px; width: 1px; pointer-events: none; left: 417px; display: none; \" >\n" +
                "           </div >\n" +
                "           </div >\n" +
                "        </div >");
        flow.setSize("360px", "180px");
        this.addChild(flow);
    }

    public static native void drawCharts() /*-{
        var context =  $wnd.cubism.context()
                .serverDelay(0)// allow seconds of collection lag
                .clientDelay(0)
                .step(1e3)// value per second
                .size(960);

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



        $wnd.d3.select("#example1").call(function (div) {

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




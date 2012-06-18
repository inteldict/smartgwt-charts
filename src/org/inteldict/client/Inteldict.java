package org.inteldict.client;


import com.google.gwt.core.client.EntryPoint;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.IButton;
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


        HTMLFlow flow = new HTMLFlow();
        flow.setContents("<div class='chart' id='chart-2'>\n" +
                "<button>Run</button>\n" +
                "</div>");
        flow.setSize("800px","600px");

        Canvas canvas = new Canvas();

        VStack vStack = new VStack();
        vStack.setShowEdges(true);
        vStack.setWidth(1024);
        vStack.setMembersMargin(5);
        vStack.setLayoutMargin(10);
        vStack.addMember(button);
        vStack.addMember(flow);
        canvas.addChild(vStack);
        canvas.draw();

        drawCircles();
    }

    public static native void drawCircles() /*-{
        var data = [32, 57, 112],
                dataEnter = data.concat(293),
                dataExit = data.slice(0, 2),
                w = 360,
                h = 180,
                x = $wnd.d3.scale.ordinal().domain([57, 32, 112]).rangePoints([0, w], 1),
                y = $wnd.d3.scale.ordinal().domain(data).rangePoints([0, h], 2);

        (function () {
            var svg = $wnd.d3.select("#chart-2").append("svg")
                    .attr("width", w)
                    .attr("height", h);

            svg.selectAll(".little")
                    .data(data)
                    .enter().append("circle")
                    .attr("class", "little")
                    .attr("cx", x)
                    .attr("cy", y)
                    .attr("r", 12);

            $wnd.d3.select("#chart-2 button").on("click", function () {
                svg.selectAll(".select").remove();

                svg.selectAll(".select")
                        .data(data)
                        .enter().append("circle")
                        .attr("class", "select")
                        .attr("cx", x)
                        .attr("cy", y)
                        .attr("r", 60)
                        .style("fill", "none")
                        .style("stroke", "red")
                        .style("stroke-opacity", 1e-6)
                        .style("stroke-width", 3)
                        .transition()
                        .duration(750)
                        .attr("r", 12)
                        .style("stroke-opacity", 1);
            });
        })();
    }-*/;
}

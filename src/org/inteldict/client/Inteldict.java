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

        HTMLFlow flow = new HTMLFlow();

        flow.setLayoutAlign(Alignment.CENTER);
        flow.setContents("<!DOCTYPE html>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<title>Cubism.js</title>\n" +
                "<style>\n" +
                "    #example1 {\n" +
                "        min-height: 155px;\n" +
                "    }\n" +
                "\n" +
                "    #example2a {\n" +
                "        min-height: 153px;\n" +
                "    }\n" +
                "\n" +
                "    #example2b {\n" +
                "        min-height: 255px;\n" +
                "    }\n" +
                "\n" +
                "</style>\n" +
                "<div id=\"body\">\n" +
                "\n" +
                "    <h1>Cubism.js</h1>\n" +
                "    <h2>Time Series Visualization</h2>\n" +
                "    <div id=\"example1\"></div>\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "\n" +
                "    function random(name) {\n" +
                "        var value = 0,\n" +
                "                values = [],\n" +
                "                i = 0,\n" +
                "                last;\n" +
                "        return context.metric(function (start, stop, step, callback) {\n" +
                "            start = +start, stop = +stop;\n" +
                "            if (isNaN(last)) last = start;\n" +
                "            while (last < stop) {\n" +
                "                last += step;\n" +
                "                value = Math.max(-10, Math.min(10, value + .8 * Math.random() - .4 + .2 * Math.cos(i += .2)));\n" +
                "                values.push(value);\n" +
                "            }\n" +
                "            callback(null, values = values.slice((start - stop) / step));\n" +
                "        }, name);\n" +
                "    }\n" +
                "\n" +
                "</script>\n" +
                "<script>\n" +
                "\n" +
                "    var context = cubism.context()\n" +
                "            .serverDelay(0)\n" +
                "            .clientDelay(0)\n" +
                "            .step(1e3)\n" +
                "            .size(960);\n" +
                "\n" +
                "    var foo = random(\"foo\"),\n" +
                "            bar = random(\"bar\");\n" +
                "\n" +
                "    d3.select(\"#example1\").call(function (div) {\n" +
                "\n" +
                "        div.append(\"div\")\n" +
                "                .attr(\"class\", \"axis\")\n" +
                "                .call(context.axis().orient(\"top\"));\n" +
                "\n" +
                "        div.selectAll(\".horizon\")\n" +
                "        div.selectAll(\".horizon\")\n" +
                "                .data([foo, bar, foo.add(bar), foo.subtract(bar)])\n" +
                "                .enter().append(\"div\")\n" +
                "                .attr(\"class\", \"horizon\")\n" +
                "                .call(context.horizon().extent([-20, 20]));\n" +
                "\n" +
                "        div.append(\"div\")\n" +
                "                .attr(\"class\", \"rule\")\n" +
                "                .call(context.rule());\n" +
                "\n" +
                "    });\n" +
                "\n" +
                "    // On mousemove, reposition the chart values to match the rule.\n" +
                "    context.on(\"focus\", function (i) {\n" +
                "        d3.selectAll(\".value\").style(\"right\", i == null ? null : context.size() - i + \"px\");\n" +
                "    });\n" +
                "\n" +
                "</script>");
        flow.show();

        button.show();
    }
}

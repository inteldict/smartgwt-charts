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
        flow.setContents("<br/><br/><br/><br/><br/><br/><style type='text/css'>\n" +
                "\n" +
                ".chart {\n" +
                "  background: #fff;\n" +
                "  border: solid 1px #ddd;\n" +
                "  box-shadow: 0 0 4px rgba(0,0,0,.2);\n" +
                "  font: 10px sans-serif;\n" +
                "  height: 180px;\n" +
                "  position: relative;\n" +
                "  width: 720px;\n" +
                "}\n" +
                "\n" +
                ".chart svg {\n" +
                "  border-left: solid 2px #ddd;\n" +
                "  left: 360px;\n" +
                "  position: absolute;\n" +
                "  top: 0;\n" +
                "}\n" +
                "\n" +
                ".chart pre {\n" +
                "  font: 12px monospace;\n" +
                "  height: 60px;\n" +
                "  left: 10px;\n" +
                "  position: absolute;\n" +
                "  top: 0;\n" +
                "  width: 340px;\n" +
                "}\n" +
                "\n" +
                ".chart circle.little {\n" +
                "  fill: #aaa;\n" +
                "  stroke: #666;\n" +
                "  stroke-width: 1.5px;\n" +
                "}\n" +
                "\n" +
                ".chart button {\n" +
                "  left: 275px;\n" +
                "  position: absolute;\n" +
                "  top: 145px;\n" +
                "  width: 80px;\n" +
                "}\n" +
                "\n" +
                ".chart .data rect {\n" +
                "  fill: #eee;\n" +
                "  stroke: #ccc;\n" +
                "}\n" +
                "</style><script type='text/javascript'>\n" +
                "    var data = [32, 57, 112],\n" +
                "            dataEnter = data.concat(293),\n" +
                "            dataExit = data.slice(0, 2),\n" +
                "            w = 360,\n" +
                "            h = 180,\n" +
                "            x = d3.scale.ordinal().domain([57, 32, 112]).rangePoints([0, w], 1),\n" +
                "            y = d3.scale.ordinal().domain(data).rangePoints([0, h], 2);\n" +
                "</script>\n" +
                "<div class='chart' id='chart-2'>\n" +
                "<button>Run</button>\n" +
                "</div><script type='text/javascript'>\n" +
                "(function() {\n" +
                "  var svg = d3.select(\"#chart-2\").append(\"svg\")\n" +
                "      .attr(\"width\", w)\n" +
                "      .attr(\"height\", h);\n" +
                "\n" +
                "  svg.selectAll(\".little\")\n" +
                "      .data(data)\n" +
                "    .enter().append(\"circle\")\n" +
                "      .attr(\"class\", \"little\")\n" +
                "      .attr(\"cx\", x)\n" +
                "      .attr(\"cy\", y)\n" +
                "      .attr(\"r\", 12);\n" +
                "\n" +
                "  d3.select(\"#chart-2 button\").on(\"click\", function() {\n" +
                "    svg.selectAll(\".select\").remove();\n" +
                "\n" +
                "    svg.selectAll(\".select\")\n" +
                "        .data(data)\n" +
                "      .enter().append(\"circle\")\n" +
                "        .attr(\"class\", \"select\")\n" +
                "        .attr(\"cx\", x)\n" +
                "        .attr(\"cy\", y)\n" +
                "        .attr(\"r\", 60)\n" +
                "        .style(\"fill\", \"none\")\n" +
                "        .style(\"stroke\", \"red\")\n" +
                "        .style(\"stroke-opacity\", 1e-6)\n" +
                "        .style(\"stroke-width\", 3)\n" +
                "      .transition()\n" +
                "        .duration(750)\n" +
                "        .attr(\"r\", 12)\n" +
                "        .style(\"stroke-opacity\", 1);\n" +
                "  });\n" +
                "})();\n" +
                "</script><br/><br/><br/><br/><br/><br/>\n");
        flow.show();

        button.show();
    }
}

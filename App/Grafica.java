package project15;

import java.awt.BasicStroke;
import java.io.*;
import java.util.LinkedList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Grafica {

    private int width;
    private int height;

    public Grafica() {
        this.width = 816;
        this.height = 272;
    }

    public String obtenerGrafica(LinkedList secuenciaXn, int indiceDeOrigen, String secuencia) throws IOException {
        LinkedList lista = new LinkedList();
        for (int i = 0; i < secuenciaXn.size(); i++) {
            XYSeries m = new XYSeries(Integer.toString(i));
            m.add(i - indiceDeOrigen, 0);
            m.add(i - indiceDeOrigen, Double.parseDouble(secuenciaXn.get(i).toString()));

            lista.add(m);
        }
        final XYSeriesCollection dataset = new XYSeriesCollection();
        for (int i = 0; i < secuenciaXn.size(); i++) {

            dataset.addSeries((XYSeries) lista.get(i));
        }
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "Secuencia " + secuencia + "(n)",
                "n",
                secuencia + "(n)",
                dataset,
                PlotOrientation.VERTICAL,
                false, false, false);

        XYPlot plot = (XYPlot) xylineChart.getPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        for (int i = 0; i < secuenciaXn.size(); i++) {
            renderer.setSeriesStroke(i, new BasicStroke(4));
            renderer.setSeriesLinesVisible(i, true);
            renderer.setSeriesShapesVisible(i, false);
        }

        plot.setRenderer(renderer);
        String liga = "src/Imagenes/entrada" + secuencia + "/" + secuencia + "n.jpg";

        File XYChart = new File(liga);

        ChartUtilities.saveChartAsJPEG(XYChart, xylineChart, width, height);
        return liga;
    }
}

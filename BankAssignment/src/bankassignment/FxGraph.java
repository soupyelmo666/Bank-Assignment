package bankassignment;

import java.math.BigDecimal;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class FxGraph extends JFXPanel
{
   Series series = new Series();
   LineChart<Number, Number> chart;
   
   public FxGraph()
   {
      // axis setup
      NumberAxis xAxis = new NumberAxis();
      xAxis.setLabel("Month");
      xAxis.setTickUnit(1);
      xAxis.setMinorTickCount(0);
      NumberAxis yAxis = new NumberAxis();
      yAxis.setLabel("Account Balance");
      
      // creating graph
      chart = new LineChart<>(xAxis, yAxis);
      // assigning graph a data series
      chart.getData().add(series);
      this.setScene(new Scene(chart));
   }
   
   // adds a value onto the end of the data series
   public void addValue(BigDecimal d)
   {
      series.getData().add(new Data(series.getData().size() + 1, d));
   }
}
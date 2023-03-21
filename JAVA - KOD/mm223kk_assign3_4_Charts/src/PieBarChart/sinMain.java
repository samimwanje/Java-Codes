/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package PieBarChart;

import java.util.ArrayList;
import java.util.List;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

public class sinMain {

	public static void main(String[] args) {

		sinMain exampleChart = new sinMain();
	    XYChart chart = exampleChart.getChart();
	    new SwingWrapper<XYChart>(chart).displayChart();
	  }

	  public XYChart getChart() {

	    // Create Chart
	    XYChart chart = new XYChartBuilder().width(800).height(600).build();

	    // Customize Chart
	    
	    chart.getStyler().setXAxisMin(0.0);

	    // generates sine data
	    int size = 4;
	    List<Integer> xData = new ArrayList<Integer>();
	    List<Double> yData = new ArrayList<Double>();
	    for (int i = 0; i <= size; i++) {
	      
	      xData.add(i - size / 2);
	   
	      yData.add( (1+(i - size / 2)/Math.PI)*Math.cos((i - size / 2))*Math.cos(40*(i - size / 2)) );
	    }

	    // Series
	  chart.addSeries("y = (1 + x/pi)*cos(x)*cos(40*x)", xData, yData);

	    return chart;
	  }

}

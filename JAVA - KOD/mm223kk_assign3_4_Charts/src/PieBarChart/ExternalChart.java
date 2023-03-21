/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package PieBarChart;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.internal.chartpart.Chart;

public interface ExternalChart<C extends Chart<?, ?>> {

  C getChartBar();
  
  PieChart getChartPie();
 
}
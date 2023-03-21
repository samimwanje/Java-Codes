/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package PieBarChart;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;



public class PieBarChart implements ExternalChart<CategoryChart> {
	
public static Scanner input;	
	
	
  public static void main(String[] args) {
	  
	ExternalChart<CategoryChart> barChart = new PieBarChart();
    CategoryChart barchart = barChart.getChartBar();
    new SwingWrapper<CategoryChart>(barchart).displayChart();
    
    
    ExternalChart<CategoryChart> PieChart = new PieBarChart();
    PieChart piechart = PieChart.getChartPie();
    new SwingWrapper<PieChart>(piechart).displayChart();
  }
 
  
  public CategoryChart getChartBar() {
 
    // Create Chart
    CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Integer Bar Chart").xAxisTitle("Intervals").yAxisTitle("Count").build();
 
    // Customize Chart
    chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
    chart.getStyler().setHasAnnotations(true);
   
   
    // Series
    
    int[] xAxel = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    
    int[] values = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    
    
    try {
  		Scanner input = new Scanner( new File("src/PieBarChart/integers.dat") );
  	
  		while(input.hasNext()) {
  			
  			int n = Integer.parseInt(input.next());
  			
  			if(n <= 10 && n >= 0) 
  			values[0]++;
  			
  			if(n <= 20 && n > 10) 
  				values[1]++;	
  			
  			
  			if(n <= 30 && n > 20) 
  				values[2]++;
					

  			if(n <= 40 && n > 30) 
  				values[3]++;
		
  			
  			if(n <= 50 && n > 40) 
  				values[4]++;
		

  			if(n <= 60 && n > 50) 
  				values[5]++;
		

  			if(n <= 70 && n > 60) 
  				values[6]++;
		

  			if(n <= 80 && n > 70) 
  				values[7]++;
	

  			if(n <= 90 && n > 80) 
  				values[8]++;
		
  			
  			if(n <= 99 && n > 90) 
  				values[9]++;			
  		
  			}
  		
		  
	  } catch (Exception e) {
  		e.printStackTrace();
  	}
  	  

    chart.addSeries("Integer Intervals", xAxel, values);
  
    return chart;
  }



@Override
public PieChart getChartPie() {
	 // Create Chart
	PieChart pieCharter = new PieChartBuilder().width(800).height(600).title(getClass().getSimpleName()).build();
 
    // Customize Chart
    Color[] sliceColors = new Color[] { new Color(175, 179, 172), new Color(191, 40, 190), new Color(23, 7, 104), new Color(144, 207, 204), new Color(227, 238, 127),
    		
    		new Color(174, 62, 55), new Color(229, 151, 40), new Color(70, 88, 66), new Color(217, 197, 138), new Color(144, 203, 190)
    		
    
    
    
    
    
    
    };
    pieCharter.getStyler().setSeriesColors(sliceColors);
 
    // Series
       
    int[] values = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    
    
    try {
  		Scanner input = new Scanner( new File("src/PieBarChart/integers.dat") );
  	
  		while(input.hasNext()) {
  			
  			int n = Integer.parseInt(input.next());
  			
  			if(n <= 10 && n >= 0) 
  			values[0]++;
  			
  			if(n <= 20 && n > 10) 
  				values[1]++;	
  			
  			
  			if(n <= 30 && n > 20) 
  				values[2]++;
					

  			if(n <= 40 && n > 30) 
  				values[3]++;
		
  			
  			if(n <= 50 && n > 40) 
  				values[4]++;
		

  			if(n <= 60 && n > 50) 
  				values[5]++;
		

  			if(n <= 70 && n > 60) 
  				values[6]++;
		

  			if(n <= 80 && n > 70) 
  				values[7]++;
	

  			if(n <= 90 && n > 80) 
  				values[8]++;
		
  			
  			if(n <= 99 && n > 90) 
  				values[9]++;			
  		
  			}
  		
		  
	  } catch (Exception e) {
  		e.printStackTrace();
  	}
  	  
    
    
    pieCharter.addSeries("<10", values[0]);
    pieCharter.addSeries("<20", values[1]);
    pieCharter.addSeries("<30", values[2]);
    pieCharter.addSeries("<40", values[3]);
    pieCharter.addSeries("<50", values[4]);
    pieCharter.addSeries("<60", values[5]);
    pieCharter.addSeries("<70", values[6]);
    pieCharter.addSeries("<80", values[7]);
    pieCharter.addSeries("<90", values[8]);
    pieCharter.addSeries("<100", values[9]);
 
    return pieCharter;
	}
  
}



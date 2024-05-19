package Landowner;

import java.util.ArrayList;


public class Landowner {
	private ArrayList<Area> plots= new ArrayList<>();
public boolean add(Area plot)
{
	return plots.add(plot);
}
public void removePlot(int index)
{ 
	plots.remove(index);
}
public double getTotalArea()
{
	double totalArea=0;
	for(Area plots:plots)
	{
		totalArea+=((Area) plots).computeArea();
	}
	return totalArea;
}
}




package model;

import java.util.Comparator;

public class Colorcompare implements Comparator<Figure> {



	@Override
	public int compare(Figure o1, Figure o2) {
		// TODO Auto-generated method stub
		return o1.getColor()-o2.getColor(); 
	}

}

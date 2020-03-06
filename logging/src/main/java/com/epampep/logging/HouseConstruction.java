package com.epampep.logging;

public class HouseConstruction {
	int area;
	String material;
	int materialCost;
	public HouseConstruction(int area, String material)
	{
		this.material = material;
		this.area = area;
	}
	public void setMaterial(String material)
	{
		this.material = material;
	}
	public void setArea(int area)
	{
		this.area = area;
	}
	public int getEstimatedCost()
	{
		if(material.equals("standard"))
			materialCost = 1200;
		if(material.equals("above standard"))
			materialCost = 1500;
		if(material.equals("high standard"))
			materialCost = 1800;
		if(material.equals("high standard and automated"))
			materialCost = 2500;
		return materialCost*area;
	}
}

package com.epampep.logging;

public class CompoundInterest {
	double interest_rate, principle, time;
	public CompoundInterest(double principle, double interest_rate, double time)
	{
		this.principle = principle;
		this.interest_rate = interest_rate;
		this.time = time;
	}
	public void setInterestRate(double interest_rate)
	{
		this.interest_rate = interest_rate;
	}
	public void setPrinciple(double principle)
	{
		this.principle = principle;
	}
	public void setTime(double time)
	{
		this.time = time;
	}
	public double getInterestRate()
	{
		return interest_rate;
	}
	public double getPrinciple()
	{
		return principle;
	}
	public double getTime()
	{
		return time;
	}
	public double getCompoundInterest()
	{
		return principle*Math.pow(1+interest_rate, time);
	}

}

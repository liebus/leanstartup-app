package com.leanstartup.app.domain;

public class Rate {
	private double rate;
	private double lowerBound;
	private double upperBound;

	public Rate(double rate, double lowerBound, double upperBound) {
		this.rate = rate;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(double lowerBound) {
		this.lowerBound = lowerBound;
	}

	public double getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(double upperBound) {
		this.upperBound = upperBound;
	}

}

package org.ruan.architecture.jobs;

import java.math.BigDecimal;

public class Developer {


	private BigDecimal averageProfit;
	private double AverageprofessionalAge;
	private Boolean isGraduationRequired;

	public BigDecimal getAverageProfit() {
		return averageProfit;
	}

	public void setAverageProfit(BigDecimal averageProfit) {
		this.averageProfit = averageProfit;
	}

	public double getAverageprofessionalAge() {
		return AverageprofessionalAge;
	}

	public void setAverageprofessionalAge(double averageprofessionalAge) {
		AverageprofessionalAge = averageprofessionalAge;
	}

	public Boolean getIsGraduationRequired() {
		return isGraduationRequired;
	}

	public void setIsGraduationRequired(Boolean isGraduationRequired) {
		this.isGraduationRequired = isGraduationRequired;
	}

}

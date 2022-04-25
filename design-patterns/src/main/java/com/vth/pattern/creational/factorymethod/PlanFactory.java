package com.vth.pattern.creational.factorymethod;

/**
 * PlanFactory helps to generate object of concrete classes based on given
 * information..
 * 
 * @author vikshind
 *
 */
public class PlanFactory {
	/**
	 * Returns the appropriate plan for bill calculation
	 * 
	 * @param planType
	 * @return
	 */
	public IPlan getPlan(String planType) {
		IPlan plan = null;
		if (planType == null) {
			return null;
		}

		switch (planType.toUpperCase()) {
		case "DOMESTIC":
			plan = new DomesticPlan();
			break;

		case "COMMERCIAL":
			plan = new CommercialPlan();
			break;

		case "INSTITUTIONAL":
			plan = new InstitutionalPlan();
			break;
		default:
			break;
		}
		
		return plan;
	}

}

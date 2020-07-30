package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;

	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, int hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1; //Funcion�rios terceirizados recebem um adcional de 110% sobre o adcional.
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
}

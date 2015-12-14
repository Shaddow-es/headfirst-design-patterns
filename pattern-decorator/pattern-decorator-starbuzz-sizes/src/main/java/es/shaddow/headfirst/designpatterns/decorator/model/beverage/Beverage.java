package es.shaddow.headfirst.designpatterns.decorator.model.beverage;

public abstract class Beverage {

	public enum Size {
		TALL, GRANDE, VENTI
	}

	String description = "Unknown beverage";
	Size size = Size.GRANDE;

	public String getDescription() {
		return description + " [" + getSize().toString() + "]";
	}

	public Size getSize() {
		return this.size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public abstract double cost();
}

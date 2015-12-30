package es.shaddow.headfirst.designpatterns.templatemethod;

public class Duck implements Comparable<Object> {

	String name;
	int weight;

	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name + " weight " + weight;
	}

	public int compareTo(Object object) {
		Duck otherDuck = (Duck) object;
		if (this.weight > otherDuck.weight) {
			return 1;
		} else if (this.weight < otherDuck.weight) {
			return -1;
		} else {
			// this.weight == otherDuck.weight
			return 0;
		}
	}

}

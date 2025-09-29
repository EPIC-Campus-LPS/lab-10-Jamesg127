package Flowers;

public class Flower {
	private String species;
	public Flower(String s) {
		species = s;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String s) {
		species = s;
	}
	public String toString() {
		return "flower {" + species + "}";
	}
}

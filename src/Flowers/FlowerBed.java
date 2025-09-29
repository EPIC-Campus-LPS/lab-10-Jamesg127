package Flowers;

public class FlowerBed {
	private Flower[] bed;
	public FlowerBed(Flower[] b) {
		bed = b;
	}
	public FlowerBed(int number) {
		bed = new Flower[number];
	}
	public Flower[] getBed() {
		return bed;
	}
	public void setBed(Flower[] b) {
		bed = b;
	}
	public int plantFlower(Flower f) {
		for(int i = 0; i < bed.length; i++) {
			if (bed[i + 1] == null && bed[i] == null && bed[i + 1] == null) {
				bed[i] = f;
				return i;
			}
			else {
				return -1;
			}
		}
		return -1;
	}
	public void flipBed() {
		Flower temp;
		for(int i = 0; i < (int)bed.length / 2; i++) {
			if(bed.length > 0) {
				temp = bed[i];
				bed[i] = bed[bed.length - i -1];
				bed[bed.length - i -1] = temp; 
			}
			
		}
	}
	public String toString() {
		String flowerBedString = "FlowerBed{ ";
		for (int j = 0; j < bed.length; j++) {
			if(bed[j] == null) {
				flowerBedString += " null, ";
			}
			else {
				flowerBedString += "{ flower" + bed[j].getSpecies() + " },";
			}
			
		}
		return flowerBedString + " }";
	}
}

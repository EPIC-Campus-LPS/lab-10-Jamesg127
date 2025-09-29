package Flowers;

public class FlowerBed {
	private Flower[] bed;
	public FlowerBed(Flower[] b) {
		bed = b;
	}
	public FlowerBed(int number) {
		Flower[] bed = new Flower[number];
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
		for(int i = 0; i < bed.length / 2; i++) {
			temp = bed[i];
			bed[i] = bed[bed.length - i];
			bed[bed.length - 1] = temp; 
		}
	}
	public String toString() {
		String flowerBedString = "FlowerBed{ ";
		for (int i = 0; i < bed.length; i++) {
			if(bed[i] == null) {
				flowerBedString += " null, ";
			}
			else {
				flowerBedString += "{ flower" + bed[i].getSpecies() + " },";
			}
			
		}
		return flowerBedString + " }";
	}
}

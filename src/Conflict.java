import java.util.ArrayList;
import java.util.List;

public class Conflict {
	int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	List<Integer> leadups;
	String text;
	List<Integer> carryons;

	public Conflict() {
		super();
		leadups = new ArrayList<Integer>();
		carryons = new ArrayList<Integer>();
		// TODO Auto-generated constructor stub
	}

	public List<Integer> getLeadups() {
		return leadups;
	}

	public void setLeadups(int leadup) {
		this.leadups.add(leadup);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Integer> getCarryons() {
		return carryons;
	}

	public void setCarryons(int carryon) {
		this.carryons.add(carryon);
	}
}

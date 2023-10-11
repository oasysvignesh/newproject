package oasys.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mark_sheet")
public class MarkSheet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollnumber;
	private int sem1theory;
	private int sem1prac;
	private int sem1tot;
	private int sem2theory;
	private int sem2prac;
	private int sem2tot;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getSem1theory() {
		return sem1theory;
	}
	public void setSem1theory(int sem1theory) {
		this.sem1theory = sem1theory;
	}
	public int getSem1prac() {
		return sem1prac;
	}
	public void setSem1prac(int sem1prac) {
		this.sem1prac = sem1prac;
	}
	public int getSem1tot() {
		return sem1tot;
	}
	public void setSem1tot(int sem1tot) {
		this.sem1tot = sem1tot;
	}
	public int getSem2theory() {
		return sem2theory;
	}
	public void setSem2theory(int sem2theory) {
		this.sem2theory = sem2theory;
	}
	public int getSem2prac() {
		return sem2prac;
	}
	public void setSem2prac(int sem2prac) {
		this.sem2prac = sem2prac;
	}
	public int getSem2tot() {
		return sem2tot;
	}
	public void setSem2tot(int sem2tot) {
		this.sem2tot = sem2tot;
	}
	

}

class Student{
	private String imie;
	private String nazwisko;
	private int rok;
	private int id;

	public Student(int id, String imie, String nazwisko, int rok){
	this.id = id;
	this.imie = imie;
	this.nazwisko = nazwisko;
	this.rok = rok;
	}
	public String toString(){
	return "Student " + id +": " + imie +", " + nazwisko + " rok: " + rok;
	}
}
public class Main{
	public static void main(String[] args){
	Student s1 = new Student (1,"Jan", "Nowak", 1);
	Student s2 = new Student (2, "Grazyna", "Kowalska", 3);
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	}
}


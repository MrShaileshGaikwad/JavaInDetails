package InterviewQuestion;



public class Encapsulation {


private	int id;
	private String name;
	
	public Encapsulation (int id, String name) {
		
		this.id=id;
		this.name=name;
	}
	
	public Encapsulation() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name=name;
	}
	public void setid(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public int getid() {
		return id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation e = new Encapsulation();
		e.setid(12);
		
		e.setName("Shailesh");
		System.err.println(e.getid() +""+ e.getName());
		

	}

}

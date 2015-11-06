package mainStructure;

public class Member {

	private MemberStatus status;
	private int age;
	private boolean isReal;
	private String firstName;
	private String lastName;

	public Member(){
		
	}
	public Member(String firstName, String lastName, int age, boolean isReal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isReal = isReal;
	}

	public MemberStatus getStatus() {
		return status;
	}

	public void setStatus(MemberStatus status) {
		this.status = status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isReal() {
		return isReal;
	}

	public void setReal(boolean isReal) {
		this.isReal = isReal;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}


public class Department {
	int departmentid;
	String departmentname;
	
	public Department(int departmentid, String departmentname) {
		this.departmentid = departmentid;
		this.departmentname = departmentname;
	}

	@Override
	public String toString() {
		return "Id: " + departmentid + " Tên: " + departmentname;
	}
}

import java.util.ArrayList;
import java.util.List;
public abstract class Student {
	public static List<Student> listStudent = new ArrayList<Student>();
	private String fullName;
	private String dateofBirth;
	private String gender;
	private String phoneNumber;
	private String schoolName;
	private String gradeLevel;
	
	public Student() {
		
	}

	public Student(String fullName, String dateofBirth, String gender, String phoneNumber, String schoolName,
			String gradeLevel) {
		super();
		this.fullName = fullName;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.schoolName = schoolName;
		this.gradeLevel = gradeLevel;
	}

	public static List<Student> getListStudent() {
		return listStudent;
	}

	public static void setListStudent(List<Student> listStudent) {
		Student.listStudent = listStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	   public String  showInfo() {
	        return "name - " + fullName + 
	                " DoB - " + dateofBirth + "gender - " + gender + 
	                " phone number - " + phoneNumber + " school name - " + 
	                schoolName + " gradeLevel :" + gradeLevel;
	    }

}

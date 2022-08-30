import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Management {
public static void main(String[] args) throws IOException {
	Student.listStudent.addAll(readFileGoodStudent());
	for(Student std : Student.listStudent) {
		if( std instanceof GoodStudent) {
			GoodStudent goodStudent = (GoodStudent) std;
			System.out.println(goodStudent.showInfo());
		}
	}
}
public static List<GoodStudent> readFileGoodStudent() throws FileNotFoundException, IOException{
	List<GoodStudent> listGoodStudents = new ArrayList<GoodStudent>();
	FileReader fileReader = new FileReader("goodStudent.csv");
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	String docFile;
	while((docFile = bufferedReader.readLine())!= null) {
		String[] stringDoiTuong = docFile.split(",");
		GoodStudent goodStudent = new GoodStudent();
		goodStudent.setFullName(stringDoiTuong[0].toString());
		goodStudent.setDateofBirth(stringDoiTuong[1].toString());
		goodStudent.setGender(stringDoiTuong[2].toString());
		goodStudent.setPhoneNumber(stringDoiTuong[3].toString());
		goodStudent.setSchoolName(stringDoiTuong[4].toString());
		goodStudent.setGradeLevel(stringDoiTuong[5].toString());
		goodStudent.setGpa(stringDoiTuong[6].toString());
		goodStudent.setBestRewardName(stringDoiTuong[7].toString());
		listGoodStudents.add(goodStudent);
		
	}
	return listGoodStudents;
	
}
}

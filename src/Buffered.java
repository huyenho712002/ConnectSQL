import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Buffered {
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	FileReader fileReader = new FileReader("goodStudent.csv");
	 BufferedReader bufferedReader= new BufferedReader(fileReader);
     String stringReader ;
     while((stringReader=bufferedReader.readLine())!= null){
         System.out.println(stringReader);
     }
}
}

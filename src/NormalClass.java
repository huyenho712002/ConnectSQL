
public class NormalClass extends Student {
 private String toeicScore;
 private String entryScore;
 
 public NormalClass() {
	 
 }

public NormalClass(String toeicScore, String entryScore) {
	super();
	this.toeicScore = toeicScore;
	this.entryScore = entryScore;
}

public String getToeicScore() {
	return toeicScore;
}

public void setToeicScore(String toeicScore) {
	this.toeicScore = toeicScore;
}

public String getEntryScore() {
	return entryScore;
}

public void setEntryScore(String entryScore) {
	this.entryScore = entryScore;
}
 @Override
 public String showInfo() {
	  return "Normal Student: "+super.showInfo()+
              "toeic Score :"+ toeicScore+"entry score :"+ entryScore; 
 }
}

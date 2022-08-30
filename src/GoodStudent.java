
public class GoodStudent extends Student {
 private String gpa;
 private String bestRewardName;
 
 public GoodStudent(String gpa, String bestRewardName) {
	 this.gpa = gpa;
	 this.bestRewardName = bestRewardName;
 }
 public GoodStudent() {
	 
 }
 
 public String getGpa() {
	 return gpa;
 }
 public void setGpa(String gpa) {
	 this.gpa = gpa;
 }
 public String getBestRewardName() {
	 return bestRewardName;
 }
 public void setBestRewardName(String bestRewardName) {
	 this.bestRewardName = bestRewardName;
 }
 @Override
 public String showInfo() {
	 return "Good Student - "+ super.showInfo()+
			 "gpa - "+ gpa+"Rewards - "+ bestRewardName;
 }
}

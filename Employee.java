
public class Employee {
 
 private int age;
 private String jobTitle;
 private int yearOfWork;
 private Location location;
 private int ranking;
 private String username;
 private String password;

 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 public String getJobTitle() {
  return jobTitle;
 }
 public void setJobTitle(String jobTitle) {
  this.jobTitle = jobTitle;
 }
 public int getYearOfWork() {
  return yearOfWork;
 }
 public void setYearOfWork(int yearOfWork) {
  this.yearOfWork = yearOfWork;
 }
 public Location getLocation() {
  return location;
 }
 public void setLocation(Location location) {
  this.location = location;
 }
 public int getRanking() {
  return ranking;
 }
 public void setRanking(int ranking) {
  this.ranking = ranking;
 }
 public void setUsername(String username){
   this.username = username;
 }
 public void setPassword(String password){
   this.password = password;
 }
 public String getPassword(){
   return this.password;
 }
 public String getUsername(){
   return this.username;
 }
}


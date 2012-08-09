public class Parson2{
	public static String uji = "氏";
	public static String na  = "名";
	public String firstName  = null;
	public String lastName   = null;
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String name){
		this.firstName = name;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String name){
		this.lastName = name;
	}
	public void showName(){
		System.out.println(Parson2.uji + ":" + this.lastName + " " + Parson2.na + ":" + this.firstName);
	}
	public static void main(String[] args){
		Parson2 parsonA = new Parson2();
		parsonA.setLastName("渡辺");
		parsonA.setFirstName("高志");
		parsonA.showName();

		Parson2 parsonB = new Parson2();
		parsonB.setLastName("和田");
		parsonB.setFirstName("充史");
		parsonB.showName();
		
		parsonA.showName();
	}
}
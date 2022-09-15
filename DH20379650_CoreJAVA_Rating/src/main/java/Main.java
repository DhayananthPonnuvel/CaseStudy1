import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main
{
	static LinkedHashMap<key1, Integer> test = new LinkedHashMap<key1, Integer>();
	static LinkedHashMap<key1, Integer> quiz = new LinkedHashMap<key1, Integer>();
	static LinkedHashMap<key1, Integer> lab = new LinkedHashMap<key1, Integer>();
	static LinkedHashMap<key1, Integer> project = new LinkedHashMap<key1, Integer>();
	static LinkedHashMap<key2, v1> testScore = new LinkedHashMap<key2, v1>();
	static LinkedHashMap<key2, v1> quizScore = new LinkedHashMap<key2, v1>();
	static LinkedHashMap<key2, v1> labScore = new LinkedHashMap<key2, v1>();
	static LinkedHashMap<key2, v1> projectScore = new LinkedHashMap<key2, v1>();
	static LinkedHashMap<key2, v2> overallRating = new LinkedHashMap<key2, v2>();
	static LinkedHashSet<rating> set = new LinkedHashSet<rating>();

	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		rating a1=new rating("Ananth", "Electro Fields", "test", "21-Jul-16", 100);
		validateAssignmentCategory(a1);
		rating a2=new rating("Bhagath","Electro Fields", "test", "21-Jul-16", 78);
		validateAssignmentCategory(a2);
		rating a3=new rating("Chaya", "Electro Fields","test","21-Jul-16",68);
		validateAssignmentCategory(a3);
		rating a4=new rating("Esharath","Electro Fields", "test", "21-Jul-16", 87);
		validateAssignmentCategory(a4);
		rating a5=new rating("Bhagath","Electro Fields", "quiz", "22-Jul-16", 20);
		validateAssignmentCategory(a5);
		rating a6=new rating("Chaya","Electro Fields", "lab", "23-Jul-16", 10);
		validateAssignmentCategory(a6);
		rating a7=new rating("Ananth","Electro Fields", "project", "24-Jul-16", 100);
		validateAssignmentCategory(a7);
		rating a8=new rating("Esharath","Electro Fields", "project", "24-Jul-16", 100);
		validateAssignmentCategory(a8);
		rating a9=new rating("Bhagath","Electro Fields", "quiz", "25-Jul-16", 50);
		validateAssignmentCategory(a9);
		rating a10=new rating("Ananth","Electro Fields", "quiz", "26-Jul-16", 100);
		validateAssignmentCategory(a10);
		rating a11=new rating("Bhagath","Electro Fields", "lab", "27-Jul-16", 10);
		validateAssignmentCategory(a11);
		rating a12=new rating("Chaya","Electro Fields", "project", "28-Jul-16", 100);
		validateAssignmentCategory(a12);
		rating a13=new rating("Bhagath","Electro Fields", "project", "28-Jul-16", 100);
		validateAssignmentCategory(a13);
		rating a14=new rating("Ananth","Computing Techniques", "test", "29-Jul-16", 86);
		validateAssignmentCategory(a14);
		rating a15=new rating("Ananth","Electro Fields", "quiz", "29-Jul-16", 100);
		validateAssignmentCategory(a15);
		rating a16=new rating("Bhagath","Computing Techniques", "project", "30-Jul-16", 100);
		validateAssignmentCategory(a16);
		rating a17=new rating("Ananth","Electro Fields", "lab", "30-Jul-16", 100);
		validateAssignmentCategory(a17);
		rating a18=new rating("Chaya","Computing Techniques", "quiz", "31-Jul-16", 20);
		validateAssignmentCategory(a18);
		rating a19=new rating("Ananth","Electro Fields", "test", "1-Aug-16", 100);
		validateAssignmentCategory(a19);
		rating a20=new rating("Chaya","Electro Fields", "test", "1-Aug-16", 92);
		validateAssignmentCategory(a20);
		calculateScore(set);

		int choice=0;
		while(choice!=6) {
			System.out.println("1. About Student");
			System.out.println("2. Student Data");
			System.out.println("3. Subject Data");
			System.out.println("4. Update assignments");
			System.out.println("5. Display assignment");
			System.out.println("6. Exit");
			System.out.println("Enter a choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				int c=0;
				while(c!=4) {
					System.out.println("1. Add student");
					System.out.println("2. Remove student");
					System.out.println("3. View student info");
					System.out.println("4. Exit");
					System.out.println("Enter a choice: ");
					c=sc.nextInt();
					switch(c) {
					case 1:
						System.out.println("Enter name of the student: ");
						String n = sc.next();
						System.out.println("Enter name of the subject: ");
						sc.nextLine();
						String sub=sc.nextLine();
						System.out.println("Enter assignment: ");
						String category=sc.next();
						System.out.println("Enter date of submission (DD-Month-YY): ");
						String date=sc.next();
						System.out.println("Enter assignment marks: ");
						int marks=sc.nextInt();
						addStudentData(n,sub,category,date,marks);
						break;
					case 2:
						System.out.println("Delete student name: ");
						String na=sc.next();
						deleteData(na);
						break;
					case 3:
						System.out.println("Enter student name: ");
						String sname=sc.next();
						viewData(sname);
						break;
					case 4:
						System.out.println("Exited...");
						break;
					default:
						System.out.println("Enter valid choice.");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Enter student name: ");
				String studentName=sc.next();
				displayStudentWise(studentName);
				break;
			case 3:
				System.out.println("Enter subject name: ");
				sc.nextLine();
				String subjectName=sc.nextLine();
				displaySubjectWise(subjectName);
				break;
			case 4:
				int ch=0;
				while(ch!=3) {
					System.out.println("1. Add Category");
					System.out.println("2. Remove Category");
					System.out.println("3. Exit");
					System.out.println("Enter choice: ");
					ch=sc.nextInt();
					switch(ch) {
					case 1:
						System.out.println("Enter student name to add: ");
						String name=sc.next();
						System.out.println("Enter which subject assignment to be added: ");
						sc.nextLine();
						String subject=sc.nextLine();
						System.out.println("Add assignment category: ");
						String assigncategory=sc.next();
						System.out.println("Enter date of submission (DD-Month-YY): ");
						String date=sc.next();
						System.out.println("Enter assignment marks: ");
						int marks=sc.nextInt();
						addAssignmentCategory(name,subject,assigncategory,date,marks);
						break;
					case 2:
						System.out.println("Enter student name to remove: ");
						String name1=sc.next();
						System.out.println("Enter which subject assignment to be deleted: ");
						sc.nextLine();
						String subject1=sc.nextLine();
						System.out.println("Enter assignment to remove (like (for eg. test_1)): ");
						String assigncategory1=sc.next();
						removeAssignmentCategory(name1,subject1,assigncategory1);
						break;
					case 3:
						System.out.println("Exited...");
						break;
					default:
						System.out.println("Enter valid choice.");
						break;
					}	
				}
				break;
			case 5:
				displayAssignmentCategory();
				break;
			case 6:
				System.out.println("Exited...");
				break;
			default:
				System.out.println("Enter valid choice.");
				break;
			}
		}
		sc.close();
	}
	private static void viewData(String sname) {
		try {
			System.out.println("Student Name: "+sname);
			System.out.printf("%-20s %-20s %-20s %-10s","Subject","Assignment Category", 
					"Date of Submission","Marks");
			System.out.println();
			for(rating a:set) {
				if(a.studName.equals(sname)) {
					System.out.printf("%-20s %-20s %-20s %-10s",a.sub,a.assignment,a.date,a.points);
					System.out.println();
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error. Data cannot be viewed.");
		}
	}
	private static void deleteData(String na) {
		try {
			for(rating a:set) {
				if(a.studName.equals(na)) {
					set.remove(a);
				}
			}
			System.out.println("Data removed successfully.");
		}
		catch(Exception e) {
			System.out.println("Ërror. Data cannot be deleted.");
		}
	}
	private static void addStudentData(String n, String sub, String category, String date, int marks) {
		try {
			rating a=new rating(n,sub,category,date,marks);
			validateAssignmentCategory(a);
			calculateScore(set);
			System.out.println("Data inserted successfully.");
		}
		catch(Exception e){
			System.out.println("Data cannot be inserted");
		}
	}
	private static void removeAssignmentCategory(String name, String subject, String assigncategory) {

		try {
			boolean flag=false;
			for(rating a:set) {
				if(a.studName.equals(name) && a.sub.equals(subject) && a.assignment.equals(assigncategory)) {
					key2 key=new key2(a.studName, a.sub);
					if(assigncategory.substring(0,4).equalsIgnoreCase("test")) {
						testScore.put(key,new v1(testScore.get(key).marks-a.points,testScore.get(key).size-1));
					}
					else if(assigncategory.substring(0,4).equalsIgnoreCase("quiz")) {
						quizScore.put(key,new v1(quizScore.get(key).marks-a.points,quizScore.get(key).size-1));
					}
					else if(assigncategory.substring(0,3).equalsIgnoreCase("lab")) {
						labScore.put(key,new v1(labScore.get(key).marks-a.points,labScore.get(key).size-1));
					}
					else if(assigncategory.substring(0,4).equalsIgnoreCase("proj")) {
						projectScore.put(key,new v1(projectScore.get(key).marks-a.points,projectScore.get(key).size-1));
					}
					else {
						System.out.println("Please enter valid assignment category.");
					}
					set.remove(a);
					calculateScore(set);
					System.out.println("Assignment Category removed succesfully.");
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("Student data does not exist");
			}
		}
		catch(Exception e) {
			System.out.println("Error. Assignment Category cannot be removed.");
		}
	}
	private static void addAssignmentCategory(String name, String subject, String assigncategory, String assigncategory2, int marks) {

		try {
			rating a=new rating(name,subject,assigncategory,assigncategory2,marks);
			if(assigncategory.equalsIgnoreCase("test")) {
				testScore.put(new key2(a.studName,a.sub), new v1(0,1));
			}
			else if(assigncategory.equalsIgnoreCase("quiz")) {
				quizScore.put(new key2(a.studName,a.sub),new v1(0,1));
			}
			else if(assigncategory.equalsIgnoreCase("lab")) {
				labScore.put(new key2(a.studName,a.sub),new v1(0,1));
			}
			else if(assigncategory.equalsIgnoreCase("project")) {
				projectScore.put(new key2(a.studName,a.sub),new v1(0,1));
			}
			else {
				System.out.println("Please enter valid assignment category.");
			}
			validateAssignmentCategory(a);
			calculateScore(set);
			System.out.println("Assignment Category added succesfully.");
		}
		catch(Exception e) {
			System.out.println("Error. Assignment Category cannot be added.");
		}
	}
	private static void displayAssignmentCategory() {
		System.out.printf("%-15s %-20s %-20s %-20s %-10s","Student Name","Subject","Assignment Category","Date of Submission","Marks");
		System.out.println();
		for(rating assignment:set) {
			System.out.printf("%-15s %-20s %-20s %-20s %-10s", assignment.studName,assignment.sub,assignment.assignment,assignment.date,assignment.points);
			System.out.println();
		}
	}
	private static void displaySubjectWise(String subjectName) {
		LinkedHashMap<key2,v2> temp=new LinkedHashMap<key2,v2>(overallRating);
		boolean flag = false;
		System.out.println("Subject: "+subjectName);
		System.out.printf("%-25s%-15s %-15s %-15s %-15s %-15s","Student Name","Test Score","Quiz Score","Lab Score","Project Score","Overall Rating(%)");
		System.out.println();
		for(key2 key : temp.keySet()) {
			if(key.sub.equals(subjectName)) {
				System.out.printf("%-25s %-15s %-15s %-15s %-15s %-15s",key.studName,temp.get(key).ts !=0 ? temp.get(key).ts:"NA", 
						temp.get(key).qs !=0 ? temp.get(key).qs:"NA",
								temp.get(key).ls != 0 ? temp.get(key).ls:"NA", 
										temp.get(key).ps != 0 ? temp.get(key).ps:"NA", 
												temp.get(key).os != 0 ? temp.get(key).os:"NA");
				System.out.println();
				flag = true;
			}
		}
		if(flag==false) {
			System.out.println("Subject does not exist.");
		}
	}
	private static void displayStudentWise(String studentName) {
		System.out.println("Student: "+studentName);
		System.out.printf("%-25s%-15s %-15s %-15s %-15s %-15s", "Subject","Test Score","Quiz Score","Lab Score","Project Score","Overall Rating(%)");
		System.out.println();
		boolean flag=false;
		for(key2 key:overallRating.keySet()) {
			if(key.studName.equals(studentName)) {
				System.out.printf("%-25s %-15s %-15s %-15s %-15s %-15s",key.sub, overallRating.get(key).ts !=0 ? overallRating.get(key).ts:"NA", 
						overallRating.get(key).qs !=0 ? overallRating.get(key).qs:"NA",
								overallRating.get(key).ls != 0 ? overallRating.get(key).ls:"NA", 
										overallRating.get(key).ps != 0 ? overallRating.get(key).ps:"NA", 
												overallRating.get(key).os != 0 ? overallRating.get(key).os:"NA");
				System.out.println();
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Student does not exist.");
		}
	}
	private static void calculateScore(LinkedHashSet<rating> set) {

		for(rating key:set) {
			int score=key.points;
			if(key.assignment.substring(0,4).equalsIgnoreCase("test")) {
				key2 key1=new key2(key.studName, key.sub);
				if(testScore.containsKey(key1)) {
					testScore.put(key1,new v1(testScore.get(key1).marks+score,testScore.get(key1).size+1));
				}
				else {
					testScore.put(key1,new v1(score, 1));
				}
			}
			else if(key.assignment.substring(0,4).equalsIgnoreCase("quiz")) {
				key2 key1 = new key2(key.studName, key.sub);
				if(quizScore.containsKey(key1)) {
					quizScore.put(key1, new v1(quizScore.get(key1).marks + score, quizScore.get(key1).size + 1));
				}
				else {
					quizScore.put(key1, new v1(score, 1));
				}
			}
			else if(key.assignment.substring(0, 3).equalsIgnoreCase("lab")) {
				key2 key1 = new key2(key.studName, key.sub);
				if(labScore.containsKey(key1)) {
					labScore.put(key1, new v1(labScore.get(key1).marks + score, labScore.get(key1).size + 1));
				}
				else {
					labScore.put(key1, new v1(score, 1));
				}
			}
			else if(key.assignment.substring(0, 4).equalsIgnoreCase("proj")) {
				key2 key1 = new key2(key.studName, key.sub);
				if(projectScore.containsKey(key1)) {
					projectScore.put(key1, new v1(projectScore.get(key1).marks + score, projectScore.get(key1).size + 1));
				}
				else {
					projectScore.put(key1, new v1(score, 1));
				}
			}
		}
		for(rating key:set) {
			key2 key1=new key2(key.studName,key.sub);
			float ts=0;
			float ls=0;
			float qs=0;
			float ps=0;
			if(testScore.containsKey(key1)) {
				ts=(float)((40*testScore.get(key1).marks)/testScore.get(key1).size)/100; 
			}
			else {
				ts = 0;
			}
			if(labScore.containsKey(key1)) {
				ls=(float)((10*labScore.get(key1).marks)/labScore.get(key1).size)/100; 
			}
			else {
				ls=0;
			}
			if(quizScore.containsKey(key1)) {
				qs=(float)((20*quizScore.get(key1).marks)/quizScore.get(key1).size)/100; 
			}
			else {
				qs=0;
			}
			if(projectScore.containsKey(key1)) {
				ps=(float)((30*projectScore.get(key1).marks)/projectScore.get(key1).size)/100; 
			}
			else {
				ps=0;
			}
			float os=qs+ls+ps+ts;
			v2 value2=new v2(ts,ls,qs,ps,os);
			overallRating.put(key1,value2);
		}
	}
	private static void validateAssignmentCategory(rating assignments) {
		key1 key=new key1(assignments.getStudentName(),assignments.getSubject(),assignments.getAssignment());
		if(assignments.assignment.equalsIgnoreCase("test")){
			if(test.containsKey(key)) {
				test.put(key,test.get(key)+1);
				assignments.setAssignmentCategory("test_"+test.get(key));
			}
			else {
				test.put(key,1);
				assignments.setAssignmentCategory("test_"+test.get(key));
			}
		}
		else if(assignments.assignment.equalsIgnoreCase("quiz")){
			if(quiz.containsKey(key)) {
				quiz.put(key,quiz.get(key)+1);
				assignments.setAssignmentCategory("quiz_"+quiz.get(key));
			}
			else {
				quiz.put(key,1);
				assignments.setAssignmentCategory("quiz_"+quiz.get(key));
			}
		}
		else if(assignments.assignment.equalsIgnoreCase("lab")){
			if(lab.containsKey(key)) {
				lab.put(key,lab.get(key)+1);
				assignments.setAssignmentCategory("lab_"+lab.get(key));
			}
			else {	
				lab.put(key,1);
				assignments.setAssignmentCategory("lab_"+lab.get(key));
			}
		}
		else if(assignments.assignment.equalsIgnoreCase("project")){
			if(project.containsKey(key)) {
				project.put(key,project.get(key)+1);
				assignments.setAssignmentCategory("project_"+project.get(key));
			}
			else {
				project.put(key,1);
				assignments.setAssignmentCategory("project_"+project.get(key));
			}
		}
		else {
			System.out.println("Please enter valid assignment category.");
		}
		set.add(new rating(assignments.getStudentName(),assignments.getSubject(),assignments.getAssignment(),
				assignments.getDate(),assignments.getPoints()));
	}
}

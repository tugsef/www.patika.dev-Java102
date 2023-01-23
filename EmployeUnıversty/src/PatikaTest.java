
public class PatikaTest {

	public static void main(String[] args) {
//		Employee employee = new Employee("Sefa Demirtaş", "0265623226", "sefa@gmail.com");
//		
//		employee.enter();
//		employee.dinningHall();
//		employee.enter();
		
//		Employee acedemia = new Academicion("Sefa", "Demirtaş", "sefs@gmail.com", "Dr.", "FEN");
//		
//		acedemia.dinningHall();
//		
		
//		Employee lecturer = new Lecturer("Sefa Demirtaş", "5626265", "sefef@gmail.com", "Dr.", "FEN", "MAT");
//		//Ana sınıftan nesne oluşturulursa alt sınıfda bulunan metodlara ulaşılamaz...
//		lecturer.enter();
//		lecturer.dinningHall();
//		lecturer.enter(); //Sadece Employee sınıfın metodlarına ulaştık
		
//		Lecturer lecturer2 = new Lecturer("Tuğba Demirtaş", "545456", "tugsg@fmail.com", "Prof.", "EDEB", "TURK");
//		lecturer2.enter();
//		lecturer2.lessonsEnter();
//		lecturer2.dinningHall();
//		lecturer2.meeting();
//		lecturer2.testExam();
//		lecturer2.exit();
		
//		Employee labAsistant = new LabAsistant("Sefa Demirtaş", "5626265", "sefef@gmail.com", "Dr.", "FEN", "MAT");
//		
//		labAsistant.enter();
//		labAsistant.dinningHall();  // Üst sınıftadan tanımladık onu için alt metodlara ulaşamayız
//		labAsistant.exit();
		
//		LabAsistant labAsistant2 = new LabAsistant("Sefa Demirtaş", "5626265", "sefef@gmail.com", "Dr.", "FEN", "MAT");
//		labAsistant2.enter();
//		labAsistant2.lessonsEnter();
//		labAsistant2.labEnter();
//		labAsistant2.dinningHall();
//		labAsistant2.quizTest();
//		labAsistant2.exit();  // LabAsistant sınıfından tanımlama yaptığımız için alttan üste bütün metodlara ulaşabildik
		
//		Officer computing = new Computing("Sefa Demirtaş", "5626265", "sefef@gmail.com", "Bilgi İşlem.", "09.00-17.30", "Network Uzmanı");
//		computing.toString();
//		computing.enter();
//		computing.work();
//		computing.dinningHall();
//		computing.exit();  // Officer sınıfından oluşan computing sadece Employee ve Officer metodlarına ulaşır toString çalışmadı...
		
		
//		Computing computing2 = new Computing("Sefa Demirtaş", "5626265", "sefef@gmail.com", "Bilgi İşlem.", "09.00-17.30", "Network Uzmanı");
//		System.out.println(computing2);
//		computing2.enter();
//		computing2.work();
//		computing2.dinningHall();
//		computing2.networkSetup();
//		computing2.exit();
		
//		Officer guard = new Guard("Sefa Demirtaş", "5626265", "sefef@gmail.com", "Bilgi İşlem.", "09.00-17.30", "17.00-20.00 ");
//		guard.enter();
//		guard.work();
//		guard.dinningHall();
//		guard.exit();
//		//guard.guartyDuty(); // Çalışmadı üst sınıf alt sınıfın metodlarına ulaşamaz..
		
		Guard guard2 = new Guard("Sefa Demirtaş", "5626265", "sefef@gmail.com", "Bilgi İşlem.", "09.00-17.30", "17.00-20.00 ");
		guard2.enter();
		guard2.work();
		guard2.dinningHall();
		guard2.guartyDuty();
		guard2.exit();
	}

}

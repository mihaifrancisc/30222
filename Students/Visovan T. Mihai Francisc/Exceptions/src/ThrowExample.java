import java.util.Calendar;


public class ThrowExample{

	void doIt() throws WrongDayException{
		
		 int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		 
		 System.out.println(dayOfWeek);
		 if (dayOfWeek != 2 && dayOfWeek != 4)
			 throw new WrongDayException("Tue. or Thur.");
		 	 System.out.println("Did it");
	}
	void doItAgain() throws 
		 public static void main (String [] argv){
		 
		 try{
			 (new ThrowExample()).doIt();
			 }
		 catch (WrongDayException e){
			 System.out.println("Sorry, can do it only on " + e.getMessage());
			 }
	  }
}

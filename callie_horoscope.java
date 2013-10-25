import java.util.*;

class horoscope
{
  
  enum Month{January, Febuary, March, April, May, June, July, August, September,
    October, November, December};
  
  enum Horoscope{Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio,
    Sagittarius, Capricorn, Aquarious, Pisces};

  //Creates a static HashMap using an instance initializer to store int/string pairs 
  //for later lookup (why haven't they included collection literals yet...?)
  static final HashMap<Integer, String> daysHash = new HashMap<Integer, String>(){{
  	put(1,"first"); put(2, "second"); put(3, "third"); put(4, "fourth");
  }};
 
  public static void main (String[] args)
  {
    final int LIMIT = 12;
    
    int birthday;
    String horoscopeA, infoB;
    String monthString = " "; //initialize to empty string
    String dayString = " "; //initialize to empty string

    Scanner scan = new Scanner (System.in);
    
    System.out.println("What month were you born in?(number)");
    int month = scan.nextInt();
    //Check for valid input month
    if(!(month >= 1 && month <= 12)){
    	System.out.println("error: invalid month input");
    	System.exit(0);
    }
    System.out.println("What day (number)");
    int day = scan.nextInt();
    //Check for valid input day
    if(!(day >= 1 && day <= 31)){
    	System.out.println("error: invalid day input");
    	System.exit(0);
    }
    
    //This grabs the value in the Month enum corresponding to the user-inputed 'month' and
    //converts it to a String   
    monthString = Month.values()[month - 1].toString();
    
    //This grabs the correct day from the Days enum and converts it to a String    
    dayString = daysHash.get(day);

    System.out.println("Your birthday is: " + monthString + " " + dayString);


/* Switch statements (pretty much if/else statements)    
    switch (month) {
        case 1:  monthString = "January";
            break;
        case 2:  monthString = "February";
            break;
        case 3:  monthString = "March";
            break;
        case 4:  monthString = "April";
            break;
        case 5:  monthString = "May";
            break;
        case 6:  monthString = "June";
            break;
        case 7:  monthString = "July";
            break;
        case 8:  monthString = "August";
            break;
        case 9:  monthString = "September";
            break;
        case 10: monthString = "October";
            break;
        case 11: monthString = "November";
            break;
        case 12: monthString = "December";
            break;
        default: System.out.println = "error";
                 break;
    }
*/

/* Nasty if/else statementes       
    if(month == 1){
      System.out.println("January" + day);
    }else if( month == 2){
      System.out.println("Febuary" + day);
    }else if(month == 3){
      System.out.println("March" + day);
    }else if(month == 4){
      System.out.println("April" + day);
    }else if(month == 5){
      System.out.println("May" + day);
    }else if(month == 6){
      System.out.println("June" + day);
    }else if(month == 7){
      System.out.println("July" + day);
    }else if(month == 8){
      System.out.println("August" + day);
    }else if(month == 9){
      System.out.println("September" + day);
    }else if(month == 10){
      System.out.println("October" + day);
    }else if(month == 11){
      System.out.println("November" + day);
    }else if(month == LIMIT){
      System.out.println("December" + day);
*/    
     // if(month == 3 && day >= 21){
     //   System.out.println("\nAries");
     // }
    
    
    //System.out.println(horoscopeA);
    //System.out.println("Horoscope: " + infoB);
  }
}
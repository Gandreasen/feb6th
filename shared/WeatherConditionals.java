
/**
 * Write a description of class WeatherConditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
   
    public static String getWeatherAdvice(int temperature, String description){
       boolean windy = false;
       
       
      if (description.indexOf("windy") >= 0) {
            windy = true;
        }   
        
      /*if (temperature >100) {
          return "Too Hot"; 
        }*/
        
       if ((temperature>100)&&(description.indexOf("snow") >=0)) {
           return "Your wacked out"; 
        }
        
        
        
        
      else {
        return "no"; 
        }
    
        
        
        
        
        //return (temperature + " degrees and " + description + ".");
       
    
    /*
    if ((temperature ==32)&&(description.indexOf("heavy snow")>=0)){
        return("32 degrees and heavy snow.");
    }
    else {
        return "Drats";
    }   */
    

  }
}

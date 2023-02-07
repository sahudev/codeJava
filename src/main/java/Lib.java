import java.time.LocalDateTime;

public interface Lib {
    static String greeting(){
        if(LocalDateTime.now().getHour() <12){
           return "Good Morning";
        } else if(LocalDateTime.now().getHour() <18){
            return "Good Afternoon";
        }else{
            return "Good Evening";
        }
    }
}

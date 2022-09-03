package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class DataStructure {


//    @Autowired //Field Injection
//    @NonNull //Required Field for Constructor, Then don't need AllArgsConstructor
    ExtraHours extraHours;

//    @Autowired //Constructor Injection but no need if only one constructor
//    public DataStructure(ExtraHours extraHours){
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("DataStructure Total hours: " + (20 + extraHours.getExtraHours()));
    }

//    public void getTotalHours(ExtraHours extraHours){
//        System.out.println("DataStructure Total hours: " + (20 + extraHours.getExtraHours()));
//    }

}

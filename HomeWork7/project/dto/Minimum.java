package HomeWork7.project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Minimum {

     @Override
     public String toString(){
           return "Minimum{" +
                    " Unit" + unit +
                    ", UnitType" + unitType +
                    ", Value" + value +
                    '}';
        }


    @JsonProperty(value = "Unit")
    private String unit;
    @JsonProperty(value = "UnitType")
    private String unitType;
    @JsonProperty(value = "Value")
    private String value;

}
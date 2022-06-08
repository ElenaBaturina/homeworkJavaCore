package HomeWork7.project.dto;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Temperature {
    @Override
    public String toString(){
        return "Temperature{" +
                ", Metric" + metric +
                ", Minimum" + minimum +
                ", Maximum" + maximum +
                ", Imperial" + imperial +
                '}';
    }


    @JsonProperty(value = "Metric")
    private HomeWork7.project.dto.Metric metric;
    @JsonProperty(value = "Minimum")
    private HomeWork7.project.dto.Minimum minimum;
    @JsonProperty(value = "Maximum")
    private HomeWork7.project.dto.Maximum maximum;
    @JsonProperty(value = "Imperial")
    private HomeWork7.project.dto.Imperial imperial;

}

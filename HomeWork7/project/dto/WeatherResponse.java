package HomeWork7.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @Override
    public  String toString() {
        return "WeatherReasponse{" +
                ", WeatherText='" + weatherText + '\'' +
                ", Date = '" + date + '\'' +
                ", Temperature =" + temperature +
                ", Day=" + day +
                ", Night=" + night +
                '}';
    }

    @JsonProperty(value = "WeatherText")
    private String weatherText;
    @JsonProperty(value = "Date")
    private String date;
    @JsonProperty(value = "Temperature")
    private HomeWork7.project.dto.Temperature temperature;
    @JsonProperty(value = "Day")
    private HomeWork7.project.dto.Day day;
    @JsonProperty(value = "Night")
    private HomeWork7.project.dto.Night night;


}

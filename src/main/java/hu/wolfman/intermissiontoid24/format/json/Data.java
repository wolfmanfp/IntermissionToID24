package hu.wolfman.intermissiontoid24.format.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record Data(String music, @JsonProperty("backgroundimage") String backgroundImage, List<Layer> layers) {
}

package hu.wolfman.intermissiontoid24.format.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record Metadata(String author, Date timestamp, String comment) {
    @JsonProperty("application")
    public String getApplication() {
        return "IntermissionToID24";
    }
}

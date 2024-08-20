package hu.wolfman.intermissiontoid24.format.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public record JsonLump(Metadata metadata, Data data) {
    @JsonProperty("type")
    public String getType() {
        return "interlevel";
    }

    @JsonProperty("version")
    public String getVersion() {
        return "1.0.0";
    }
}

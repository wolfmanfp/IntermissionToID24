package hu.wolfman.intermissiontoid24.format.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class JsonLump<D extends Data> {
    @JsonProperty("metadata")
    public abstract Metadata getMetadata();

    @JsonProperty("data")
    public abstract D getData();

    @JsonProperty("type")
    public abstract String getType();

    @JsonProperty("version")
    public String getVersion() {
        return "1.0.0";
    }
}

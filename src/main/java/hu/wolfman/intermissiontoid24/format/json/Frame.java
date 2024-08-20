package hu.wolfman.intermissiontoid24.format.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Frame(String image, FrameType type, double duration, @JsonProperty("maxduration") int maxDuration) {
}

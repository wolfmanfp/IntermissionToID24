package hu.wolfman.intermissiontoid24.format.json;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FrameType {
    NONE(0x0000),
    INFINITE_DURATION(0x0001),
    FIXED_DURATION(0x0002),
    RANDOM_DURATION(0x0004),
    RANDOM_FIRST_FRAME_OFFSET(0x1000)
    ;

    private final int value;

    FrameType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}

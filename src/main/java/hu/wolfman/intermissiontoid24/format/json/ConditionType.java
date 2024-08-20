package hu.wolfman.intermissiontoid24.format.json;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConditionType {
    NONE,
    MAP_NUMBER_IS_GREATER_THAN,
    MAP_NUMBER_IS_EQUAL_TO,
    MAP_NUMBER_HAS_BEEN_VISITED,
    CURRENT_MAP_IS_NOT_SECRET,
    ANY_SECRET_MAP_HAS_BEEN_VISITED,
    CURRENT_SCREEN_IS_TALLY,
    CURRENT_SCREEN_IS_ENTERING
    ;

    @JsonValue
    public int getValue() {
        return ordinal();
    }
}

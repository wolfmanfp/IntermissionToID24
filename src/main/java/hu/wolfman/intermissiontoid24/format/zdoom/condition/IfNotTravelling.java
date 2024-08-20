package hu.wolfman.intermissiontoid24.format.zdoom.condition;

import hu.wolfman.intermissiontoid24.format.zdoom.Command;
import hu.wolfman.intermissiontoid24.format.zdoom.Condition;

public record IfNotTravelling(String mapname1, String mapname2, Command command) implements Condition {
}

package hu.wolfman.intermissiontoid24.format.zdoom.condition;

import hu.wolfman.intermissiontoid24.format.zdoom.Command;
import hu.wolfman.intermissiontoid24.format.zdoom.Condition;

public record IfLeaving(String mapname, Command command) implements Condition {
}

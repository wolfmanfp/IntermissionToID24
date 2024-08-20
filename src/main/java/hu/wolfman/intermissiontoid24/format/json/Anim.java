package hu.wolfman.intermissiontoid24.format.json;

import java.util.List;

public record Anim(int x, int y, List<Frame> frames, List<Condition> conditions) {
}

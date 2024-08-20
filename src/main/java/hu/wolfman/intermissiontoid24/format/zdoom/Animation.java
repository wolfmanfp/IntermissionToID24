package hu.wolfman.intermissiontoid24.format.zdoom;

import java.util.List;

public record Animation(int x, int y, boolean once, List<String> piclist) implements Command {
    public Animation(int x, int y, List<String> piclist) {
        this(x, y, false, piclist);
    }
}

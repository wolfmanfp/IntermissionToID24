package hu.wolfman.intermissiontoid24.format.zdoom;

import java.util.List;
import java.util.Set;

public class Intermission {
    private boolean noAutoStartMap = true;
    private String background;
    private boolean tileBackground;
    private String splat;
    private Pointer pointer;
    private List<Spot> spots;
    private Set<Animation> animations;
    private List<Condition> conditions;
    private ScreenSize screenSize;

    public boolean isNoAutoStartMap() {
        return noAutoStartMap;
    }

    public void setNoAutoStartMap(boolean noAutoStartMap) {
        this.noAutoStartMap = noAutoStartMap;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public boolean isTileBackground() {
        return tileBackground;
    }

    public void setTileBackground(boolean tileBackground) {
        this.tileBackground = tileBackground;
    }

    public String getSplat() {
        return splat;
    }

    public void setSplat(String splat) {
        this.splat = splat;
    }

    public Pointer getPointer() {
        return pointer;
    }

    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }

    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    public Set<Animation> getAnimations() {
        return animations;
    }

    public void setAnimations(Set<Animation> animations) {
        this.animations = animations;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public ScreenSize getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(ScreenSize screenSize) {
        this.screenSize = screenSize;
    }
}

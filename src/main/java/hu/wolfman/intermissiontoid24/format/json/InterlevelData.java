package hu.wolfman.intermissiontoid24.format.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InterlevelData implements Data {
    private String music;
    @JsonProperty("backgroundimage")
    private String backgroundImage;
    private List<Layer> layers;

    public InterlevelData(String music, String backgroundImage, List<Layer> layers) {
        this.music = music;
        this.backgroundImage = backgroundImage;
        this.layers = layers;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }
}

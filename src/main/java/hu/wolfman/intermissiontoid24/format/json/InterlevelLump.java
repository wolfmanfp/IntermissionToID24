package hu.wolfman.intermissiontoid24.format.json;

public class InterlevelLump extends JsonLump<InterlevelData> {
    private Metadata metadata;
    private InterlevelData data;

    public InterlevelLump(Metadata metadata, InterlevelData data) {
        this.metadata = metadata;
        this.data = data;
    }

    @Override
    public Metadata getMetadata() {
        return metadata;
    }

    @Override
    public InterlevelData getData() {
        return data;
    }

    @Override
    public String getType() {
        return "interlevel";
    }
}

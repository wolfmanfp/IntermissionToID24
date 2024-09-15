package hu.wolfman.intermissiontoid24;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import hu.wolfman.intermissiontoid24.format.json.InterlevelLump;
import hu.wolfman.intermissiontoid24.format.json.Metadata;
import hu.wolfman.intermissiontoid24.format.zdoom.Intermission;
import hu.wolfman.intermissiontoid24.format.zdoom.Pointer;
import hu.wolfman.intermissiontoid24.format.zdoom.Spot;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(final String[] args) {
        // TODO remove test data
        Intermission intermission = new Intermission();
        intermission.setBackground("WI2MAP1");
        intermission.setSplat("wisplat");
        intermission.setPointer(new Pointer("wiurh0", "wiurh1"));
        intermission.setSpots(Arrays.asList(
            new Spot("MAP01", 80, 170),
            new Spot("MAP02", 170, 130),
            new Spot("MAP03", 200, 100),
            new Spot("MAP04", 260, 150),
            new Spot("MAP05", 240, 70),
            new Spot("MAP06", 196, 51)
        ));

        Metadata metadata = new Metadata("WolfmanFP", new Date(), "");
        InterlevelLump jsonLump = new InterlevelLump(metadata, new Converter().convert(intermission));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/INTMAP1.json"), jsonLump);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

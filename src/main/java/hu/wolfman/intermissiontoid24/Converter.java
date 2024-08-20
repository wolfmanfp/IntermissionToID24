package hu.wolfman.intermissiontoid24;

import hu.wolfman.intermissiontoid24.format.json.*;
import hu.wolfman.intermissiontoid24.format.zdoom.Intermission;
import hu.wolfman.intermissiontoid24.format.zdoom.Pointer;
import hu.wolfman.intermissiontoid24.format.zdoom.Splat;
import hu.wolfman.intermissiontoid24.format.zdoom.Spot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
    public Data convert(Intermission intermission) {
        Splat splat = intermission.getSplat();
        Pointer pointer = intermission.getPointer();
        List<Spot> spots = intermission.getSpots();

        String music;
        if (spots.get(0).mapname().matches("E\\dM\\d{1,2}")) {
            music = "D_INTER";
        } else {
            music = "D_DM2INT";
        }
        String backgroundImage = intermission.getBackground().picture();
        List<Layer> layers = Arrays.asList(
                createSplatLayer(splat, spots),
                createPointerLayer(pointer, spots)
        );

        return new Data(music, backgroundImage, layers);
    }

    private Layer createSplatLayer(Splat splat, List<Spot> spots) {
        List<Anim> anims = new ArrayList<>();
        for (int i = 0; i < spots.size(); i++) {
            anims.add(new Anim(
                    spots.get(i).xpos(),
                    spots.get(i).ypos(),
                    List.of(
                            new Frame(splat.picture(), FrameType.INFINITE_DURATION, 0, 0)
                    ),
                    List.of(
                            new Condition(ConditionType.MAP_NUMBER_HAS_BEEN_VISITED, i + 1)
                    )
            ));
        }

        return new Layer(
                anims,
                List.of(
                        new Condition(ConditionType.CURRENT_SCREEN_IS_ENTERING, 0)
                )
        );
    }

    private Layer createPointerLayer(Pointer pointer, List<Spot> spots) {
        List<Anim> anims = new ArrayList<>();
        for (int i = 0; i < spots.size(); i++) {
            anims.add(new Anim(
                    spots.get(i).xpos(),
                    spots.get(i).ypos(),
                    Arrays.asList(
                            new Frame(pointer.picture1(), FrameType.FIXED_DURATION, 0.667, 0),
                            new Frame("TNT1A0", FrameType.FIXED_DURATION, 0.333, 0)
                    ),
                    List.of(
                            new Condition(ConditionType.MAP_NUMBER_IS_EQUAL_TO, i + 1)
                    )
            ));
        }

        return new Layer(
                anims,
                List.of(
                        new Condition(ConditionType.CURRENT_SCREEN_IS_ENTERING, 0)
                )
        );
    }
}

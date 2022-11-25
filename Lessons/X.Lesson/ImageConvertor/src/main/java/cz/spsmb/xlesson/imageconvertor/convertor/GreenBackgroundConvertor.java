package cz.spsmb.xlesson.imageconvertor.convertor;

import cz.spsmb.xlesson.imageconvertor.model.Image;

public class GreenBackgroundConvertor extends AbstractImageConvertor {
    private final int RED_CHANNEL_INDEX = 0;
    private final int GREEN_CHANNEL_INDEX = 1;
    private final int BLUE_CHANNEL_INDEX = 2;
    @Override
    public String getLabel() {
        return "GreenBackground effect";
    }

    @Override
    protected int[][][] computeImage(Image imageLeft, Image imageRight) {


        return null;
    }

}

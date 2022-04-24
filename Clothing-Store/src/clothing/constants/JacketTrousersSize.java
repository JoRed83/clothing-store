package clothing.constants;

public enum JacketTrousersSize {

    SIZE_42("42"),
    SIZE_44("44"),
    SIZE_46("46"),
    SIZE_48("48"),
    SIZE_50("50"),
    SIZE_52("52"),
    SIZE_54("54"),
    SIZE_56("56"),
    SIZE_58("58"),
    SIZE_60("60"),
    SIZE_62("62"),
    SIZE_64("64"),
    SIZE_66("66");

    private String size;

    private JacketTrousersSize(String size) {

        this.size = size;
    }

    public String getSize() {

        return this.size;
    }
}

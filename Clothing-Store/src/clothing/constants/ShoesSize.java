package clothing.constants;

public enum ShoesSize {

    SIZE_39("39"),
    SIZE_40("40"),
    SIZE_41("41"),
    SIZE_42("42"),
    SIZE_43("43"),
    SIZE_44("44"),
    SIZE_45("45"),
    SIZE_46("46");

    private String size;

    private ShoesSize(String size) {

        this.size = size;
    }

    public String getSize() {

        return this.size;
    }
}

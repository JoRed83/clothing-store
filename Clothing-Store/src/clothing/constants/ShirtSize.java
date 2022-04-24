package clothing.constants;

public enum ShirtSize {

    SIZE_XS("XS"),
    SIZE_S("S"),
    SIZE_M("M"),
    SIZE_L("L"),
    SIZE_XL("XL"),
    SIZE_2XL("2XL");

    private String size;

    private ShirtSize(String size) {

        this.size = size;
    }

    public String getSize() {

        return this.size;
    }
}

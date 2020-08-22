package sixth;

public enum CarBrand {
    BMW("BMW", 1, "Germany", "02.2020"),
    MERCEDEZ("MERCEDEZ", 2, "Germany", "05.2019"),
    VOLKSWAGEN("VOLKSWAGEN", 3, "Germany", "12.2018"),
    RENAULT("RENAULT", 4, "France", "06.2020"),
    PIGEOT("PIGEOT", 5, "France", "11.2019"),
    INFINITY("INFINITY", 6, "Japan", "12.2018");

    private String brand;
    private String country;
    private String year;
    public int number;

    CarBrand(String value, int number, String value1, String year){
        brand = value;
        this.number = number;
        country = value1;
        this.year = year;
    }

    public void setName(String name) {
        this.brand = brand;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return brand;
    }

    public String getCountry() {
        return country;
    }

    public String getYear() {
        return year;
    }
}




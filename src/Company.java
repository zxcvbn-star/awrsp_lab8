public class Company {
    private String name;
    private String year;

    public Company(String name, String year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
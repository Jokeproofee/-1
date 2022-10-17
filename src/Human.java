public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human (int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0){
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null){
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }
}
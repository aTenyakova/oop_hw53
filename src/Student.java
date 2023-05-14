class Student {
    private String name;
    private int age;
    private String university;
    private String major;

    public Student(String name, int age, String university, String major) {
        this.name = name;
        this.age = age;
        this.university = university;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }

    public String getMajor() {
        return major;
    }
}
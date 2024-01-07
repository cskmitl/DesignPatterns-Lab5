public class Student {
    private String name;
    private String university;
    private Integer age;

    private Student(Builder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }

    public static class Builder {
        private final String name;
        private final String university;
        private Integer age;

        public Builder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student.Builder("John", "Harvard").setAge(21).build();
        Student student2 = new Student.Builder("Jane", "MIT").build();

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("University: " + student1.university);
        System.out.println("Age: " + student1.age);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("University: " + student2.university);
        System.out.println("Age: " + student2.age);
    }
}

package DesignPatterns.Factory;

public class FactoryPatternMainClass {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession doctor = professionFactory.getProfession("Doctor");
        doctor.print();
        Profession teacher = professionFactory.getProfession("Teacher");
        teacher.print();
    }
}

package DesignPatterns.Prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();
        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);
        Profession engProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);
        Profession techProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(techProfession);

        Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession2);

    }
}

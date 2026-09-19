package DesignPatterns.Prototype;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Stack;

public class ProfessionCache {
    private static Hashtable<Integer, Profession> proffessionMap = new Hashtable<>();

    public static Profession getCloneNewProfession(int id){
        Profession cacheProfessionInstance = proffessionMap.get(id);
        return (Profession) cacheProfessionInstance.cloningMethod();
    }
    public static void loadProfessionCache(){
        Doctor doc = new Doctor();
        doc.id =1;
        proffessionMap.put(doc.id, doc);

        Engineer engineer = new Engineer();
        engineer.id =2;
        proffessionMap.put(engineer.id, engineer);

        Teacher teacher = new Teacher();
        teacher.id =3;
        proffessionMap.put(teacher.id, teacher);
    }
}

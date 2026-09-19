package StringConversions;

public class StringBasicDemo {
    public static void main(String[] args) {
        String s1 = "Datta";
        String s3 = "Daya";
        System.out.println("Initial S1 hascode " + s1.hashCode());
        s1 = s1.concat(s3);
        System.out.println(s1);
        System.out.println(s1.hashCode());
        String s2 = new String("Datta");
        System.out.println("S2 HashCode " + s2.hashCode());
        System.out.println("S1 HashCode " + s1.hashCode());

      if(s1.hashCode() == s2.hashCode()){
          System.out.println("Hashcode is equal ");
      } else {
          System.out.println("Hashcode not equal ");
      }

        System.out.println(s1.intern());           // false
        System.out.println(s1.equals(s2));// true

        StringBuffer sb = new StringBuffer("Datta");
        sb.append("anayaDevei");
        System.out.println(sb);
    }
}

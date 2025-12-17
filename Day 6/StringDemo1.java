 public class StringDemo1
{
    public static void main(String[] args) {
        String a="My world my life";
        System.out.println(a.indexOf("w"));
        //lastIndex()
        String s ="my world my life";
        System.out.println(s.lastIndexOf("y"));
        //substring()
        String b="my world";
        System.out.println(b.substring(0));
        //characterAt()
        String c="my programming world";
        System.out.println(c.charAt(7));
        //subsequences()
        String h="my life";
        System.out.println(h.subSequence(0,4));
        
    }

}
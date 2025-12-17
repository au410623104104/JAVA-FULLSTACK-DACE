public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Hello");
        StringBuilder sb1 =new StringBuilder("world");
        //sb1+="hello"
        //append()
        sb1.append("hello");
        System.out.println(sb1);
        //convert StringBuffer
        String s1 =new String(sb1);
        System.out.println(sb1.toString());
        //inser()
        StringBuilder sb2 =new StringBuilder("welcome");
        sb2.insert(0,"hello");
        System.out.println((sb2));
        //reverse()
        StringBuilder sb3=new StringBuilder("Hello");
        System.out.println(sb3.reverse());
        //deletecharAt()
        System.out.println(sb3.deleteCharAt(0));
        //replace
        System.out.println(sb3.replace(0,3,s1));
    }
    
}

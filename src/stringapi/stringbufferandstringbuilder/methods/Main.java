package stringapi.stringbufferandstringbuilder.methods;

public class Main {
    public static void main(String[] args) {
//        StringBuffer s1 = new StringBuffer("The kite is flying in the sky.");
//        s1.insert(4, "red ");
//        System.out.println("Insert: " + s1);
//        System.out.println("Delete: " + s1.delete(1, 4));
//        System.out.println("Reverse: " + s1.reverse());
//        String s = "";
//        s += "welcome";
//        s += " to ";
//        s += "TMA";
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        StringBuilder s1 = new StringBuilder("");
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s1.append("a");
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}

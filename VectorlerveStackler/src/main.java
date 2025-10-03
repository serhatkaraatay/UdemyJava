import java.util.*;

public class main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        ArrayList<String> list = new ArrayList<String>();
        vector.add("Java");
        vector.add("C#");
        vector.add("Python");
        vector.add("Php");
        for (String s : vector) {
            System.out.println(s);
        }
        ListIterator<String> iterator = vector.listIterator();
        while(iterator.hasNext()){
        System.out.println(iterator.next());
         }
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        System.out.println("İlk eleman: "+ vector.firstElement());
        System.out.println("Son eleman: "+ vector.lastElement());
        //Stack last in first out prensibi ile çalışır
        //LIFO
        Stack<String> stack = new Stack<String>();
        stack.add("Java");
        stack.push("Python");
        stack.push("C#");
        stack.push("Php");
        for(String s : stack){
            System.out.println(s);
        }
        Enumeration <String> enumeration1 = stack.elements();
        while(enumeration1.hasMoreElements()){
            System.out.println(enumeration1.nextElement());
        }
        System.out.println("**************************");
        System.out.println(stack.peek()); //en son eklenen eleman yazdırılır.
      //  System.out.println(stack.pop());//son eleman çıkarılır
        System.out.println(stack.empty());//stack doluysa false değer döner boşsa true döner
        while(!stack.isEmpty()){
            System.out.println("Eleman cıkarılıyor : "+stack.pop());
        }
      //  System.out.println(stack.pop());//EmptyStackException hatası
    }
}

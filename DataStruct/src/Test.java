import sun.rmi.log.LogInputStream;

import java.util.function.DoubleToIntFunction;
import java.util.*;
import java.lang.*;
public class Test {
    public static void main(String[] args) {
        String values[]={"A","B","C","D","E","F","G","H"};
        SeqList <String> lista=new SeqList<String>(values);
        System.out.println(lista.toString());
        //lista.insert("D");
        //lista.insert(1,"D");
        //lista.remove(3);
        //lista.clear();
        //System.out.println(lista.search("D" ));
        System.out.println(lista.toString());
    }

}

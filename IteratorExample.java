import java.util.*;
public class IteratorExample{
    public static void main(String[] args){
        List <String> list = Arrays.asList("A","B","C","D");
        System.out.println("1.Fetch data from collection using iterator");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            System.out.println("2.Fetch data from collection using foreach:");
            for(String s:list)
                {
                System.out.println(s);
            }
            System.out.println("3.Fetch data from collection using for with index");
            for(int i = 0; i < list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }
}
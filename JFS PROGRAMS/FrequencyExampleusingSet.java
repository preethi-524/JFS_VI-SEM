import java.util.*;
public class FrequencyExampleusingSet{
    public static void main (String[] args){
    List<Integer>numlst = Arrays.asList(1, 2, 2, 3, 1, 4, 2, 3);
    Set <Integer> unique = new HashSet<>(numlst);
    for(Integer key : unique)
    {
        System.out.println(key + " -> " + Collections.frequency(numlst,key));
    }

}
}
/*
Fetaure       Collection      Collections
----------------------------------------------
Type         Interface         class
Purpose      storage group    uitlity methods
              of objects
Data Storage   yes              No
Instantiation  X                 X
Methods       Abstract         static
Example     ArrayList,Hashset  sort(),reverse()
               
 */
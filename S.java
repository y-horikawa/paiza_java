import java.util.*;

public class S2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    //sc.nextLine();
    Map<Character, Integer> mp = new HashMap<>();
    for(int i=0;i<num;i++){
        char S = sc.next().charAt(0);
        int D = sc.nextInt();
        mp.put(S, D);
    }
    List<Integer> list = new ArrayList<>(mp.values());
    Collections.sort(list);
    for(int i=0;i<list.size();i++){
      for(Character ch : mp.keySet()){
        if(list.get(i) == mp.get(ch)){
          System.out.println(ch);
        }
      }
    }
  }
}

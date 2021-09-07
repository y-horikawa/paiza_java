import java.util.*;

public class Unagiya{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] lineArray = line.split(" ");
    int seatNum = castS(lineArray[0]);
    int groups = castS(lineArray[1]);

    Map<Integer, Boolean> seats = new HashMap<>();
    for(int i=1;i<=seatNum; i++){
      seats.put(i, true);
    }
    int choiceSeat = 0;
    int memberNum = 0;

    for(int i=0;i<groups;i++){
      line = sc.nextLine();
      lineArray = line.split(" ");
      memberNum = castS(lineArray[0]);
      choiceSeat = castS(lineArray[1]);
      if(isSitGuest(seats, choiceSeat, memberNum)){
        for(int j=0, index=1;j<memberNum;j++){
          if(seats.size() < choiceSeat+j){
            seats.put(index, false);
            index++;
          } else {
            seats.put(choiceSeat+j, false);
          }
        }
      }
    }

    int result = 0;

    for(int i=1;i<=seats.size();i++){
      if(seats.get(i).equals(false)){
        result++;
      }
    }
    System.out.println(result);
  }

  public static int castS(String strNum){
    return Integer.parseInt(strNum);
  }

  public static boolean isSitGuest(Map seats, int choiceSeat, int memberNum){
    if(memberNum > seats.size()){
      return false;
    }
    boolean flag = true;

    for(int i=0, index=1;i<memberNum;i++){
      if(seats.size() < choiceSeat + i){
        if(seats.get(index).equals(false)){
          flag = false;
          index++;
        } else {
          index++;
        }
      } else if(seats.get(choiceSeat + i).equals(false)){
        flag = false;
      }
    }
    if(flag){
      return true;
    } else {
      return false;
    }
  }
}

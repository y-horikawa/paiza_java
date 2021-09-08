import java.util.*;


public class Taxi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
        int a[][] = new int[N][4];
        for(int i=0;i<N;i++){
            for(int j=0;j<4;j++){
                a[i][j]=sc.nextInt();
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(X < a[i][0]){
                 list.add(a[i][1]);
            } else {
                int k=0;
                while(X >= a[i][0]+a[i][2]*k){
                    k++;
                }
                list.add(a[i][1]+a[i][3]*k);
            }
        }
        int min=list.get(0);
        int max=list.get(0);
        for(int i=0;i<list.size();i++){
            if(min>list.get(i)){
                min=list.get(i);
            }
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println(min+" "+max);
    }
}

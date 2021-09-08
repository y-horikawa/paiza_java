import java.util.*;


public class Karaokeco {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int a[] = new int[M];
        int h[][] = new int[N][M];
        for(int i=0;i<M;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                h[i][j]=sc.nextInt();
            }
        }

        int c_p=100;
        int max_p=0;
        for(int i=0;i<N;i++){
            c_p=100;
            for(int j=0;j<M;j++){
                if(5<Math.abs(a[j]-h[i][j]) && Math.abs(a[j]-h[i][j])<=10){
                    c_p=c_p-1;
                } else if(10<Math.abs(a[j]-h[i][j]) && Math.abs(a[j]-h[i][j])<=20){
                    c_p=c_p-2;
                } else if(20<Math.abs(a[j]-h[i][j]) && Math.abs(a[j]-h[i][j])<=30){
                    c_p=c_p-3;
                } else if(30<Math.abs(a[j]-h[i][j])){
                    c_p=c_p-5;
                }
            }
            if(max_p < c_p){
                max_p = c_p;
            }
        }
        System.out.println(max_p);
    }
}

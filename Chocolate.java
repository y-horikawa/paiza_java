import java.util.*;


public class Chocolate {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int a[] = new int[h];
        int b[] = new int[h];
        int A[] = new int[h];
        int a_flag;
        int ave[] = new int[h];
        int c[][] = new int[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                c[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<h;i++){
            int sum=0;
            for(int j=0;j<w;j++){
               sum+=c[i][j];
            }
            ave[i]=sum/2;
        }

        for(int i=0;i<h;i++){
            a_flag=0;
            for(int j=0;j<w;j++){
                if(a[i]<ave[i]){
                    a[i]+=c[i][j];
                    a_flag++;
                } else if(a[i]==ave[i]){
                    b[i]+=c[i][j];
                }
            }
            A[i] = a_flag;
        }
        int flag=0, flag1=0;
        for(int i=0;i<h;i++){
            if(a[i] == b[i]){
                flag++;
            }
        }
        if(flag==h){
            System.out.println("Yes");
            flag1=1;
        } else {
            System.out.println("No");
        }

        if(flag1==1){
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(j<A[i]){
                        System.out.print("A");
                    } else {
                        System.out.print("B");
                    }
                }
                System.out.println("");
            }
        }
    }
}

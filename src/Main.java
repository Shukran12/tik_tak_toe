import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Integer>xGedis = new ArrayList<>();
        List<Integer>yGedis = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.print("X-le oynayacaq Oyuncunun Adi: ");
        String xOyuncu = sc.next();
        if(xOyuncu.length()>0){
            System.out.print("O-le oynayacaq Oyuncunun Adi: ");
            String yOyuncu = sc.next();

        }

       // arrays
     // qazanan(x);





       // System.out.println(Arrays.toString(d2));

    }

    public static void qazanan(char[][] x){
        String q="";
        char[] sut1 = new char[3];
        char[] sut2 = new char[3];
        char[] sut3 = new char[3];
        char[] set1 = new char[3];
        char[] set2 = new char[3];
        char[] set3 = new char[3];
        char[] d1   = new char[3];
        char[] d2   = new char[3];

        // Variable


        for(int i=0; i< x.length; i++){
            for (int j=0; j<x[i].length; j++){
                sut1[i] = x[i][0];
                sut2[i] = x[i][1];
                sut3[i] = x[i][2];
                set1[i] = x[0][i];
                set2[i] = x[1][i];
                set3[i] = x[2][i];
                d1[i] = x[i][i];
                if(i==0){
                    d2[i] = x[i][x.length-1];
                }
                if(i==1){
                    d2[i] = x[i][i];
                }
                if(i==2){
                    d2[i] = x[x.length-1][0];               }

                System.out.print(x[i][j] + " ");

                //System.out.println(x[2][2]+", "+x[1][1]+", "+x[0][0]);


            }

            System.out.println();


        }



        for(int r=1; r< x.length;  r++){

            if(sut1[0] == sut1[r]){
                q = sut1[0]+" qazandi";
            } else if (sut2[0] == sut2[r]) {
                q = sut2[0]+" qazandi";
            }else if (sut3[0] == sut3[r]) {
                q = sut3[0]+" qazandi";
            }else if (set1[0] == set1[r]) {
                q = set1[0]+" qazandi";
            }else if (set2[0] == set2[r]) {
                q = set2[0]+" qazandi";
            }else if (set3[0] == set3[r]) {
                q = set3[0]+" qazandi";
            }else if (d1[0] == d1[r]) {
                q = d1[0]+" qazandi";
            }else if (d2[0] == d2[r]) {
                q = d2[0]+" qazandi";
            } else{
                q="Hec Kim Qazanmadi";
            }
        }

        System.out.println(q);
    }

    public static void oyun(){
        char[][] x = new char[3][3];
        x[0][0] = '1';
        x[0][1] = '2';
        x[0][2] = '3';

        x[1][0] = '4';
        x[1][1] = '5';
        x[1][2] = '6';

        x[2][0] = '7';
        x[2][1] = '8';
        x[2][2] = '9';
    }


}// System.out.print("  "+arr[i][j]+"|  "+arr[j][j]+" |\n___|___|___\n");
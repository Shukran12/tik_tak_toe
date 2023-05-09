import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> O = new ArrayList<>();




        char[][] xo= new char[3][3];


        String q= "";
        Scanner sc = new Scanner(System.in);
        int say=2;
       for(int i=0; i< xo.length; i++){
            for (int j=0; j<xo[i].length; j++){
                //System.out.print(xo[i][j] + " ");
                int xDeyeri=sc.nextInt();
                say++;
                if(say %2 ==0) {
                    x.add(xDeyeri);
                    oyun(x, O);
                    if(qalib(x)){
                        q = "X qalib gəldi";
                        break;
                    }


                }else {
                    O.add(xDeyeri);
                    oyun(x, O);
                    if(qaliby(O)){
                        q="O qalib geldi";
                    }

                }


            }
            if(q == "X qalib gəldi" || q == "O qalib geldi"){
                break;
            }else{
                q="Beraber";
            }
        }
        System.out.println(q);





    }

    public static boolean qalib(List<Integer> x){
        for(int i=0; i< x.size(); i++){
            // System.out.print(x[i]+" ");

            if((i-2) >=0){
                if((x.get(i) - x.get(i-1)) == (x.get(i-1) - x.get(i-2))){
                    return true;
                }




            }
        }
        return false;
    }

    public static boolean qaliby(List<Integer> o){
        for(int i=0; i< o.size(); i++){
            // System.out.print(x[i]+" ");

            if((i-2) >=0){
                if((o.get(i) - o.get(i-1)) == (o.get(i-1) - o.get(i-2))){
                    return true;
                }




            }
        }
        return false;
    }

    public static void oyun(List<Integer> x, List<Integer> O){
        char[][] oyun = new char[3][3];
        for(int i=0; i<x.size(); i++){
            if(x.get(i) == 1){
                oyun[0][0] = 'X';

            }
            if(x.get(i) == 2){
                oyun[0][1] = 'X';

            }
            if(x.get(i) == 3){
                oyun[0][2] = 'X';

            }
            if(x.get(i) == 4){
                oyun[1][0] = 'X';

            }
            if(x.get(i) == 5){
                oyun[1][1] = 'X';

            }
            if(x.get(i) == 6){
                oyun[1][2] = 'X';

            }
            if(x.get(i) == 7){
                oyun[2][0] = 'X';

            }
            if(x.get(i) == 8){
                oyun[2][1] = 'X';

            }if(x.get(i) == 9){
                oyun[2][2] = 'X';

            }
        }

        for(int i=0; i<O.size(); i++){
            if(O.get(i) == 1){
                oyun[0][0] = 'O';

            }
            if(O.get(i) == 2){
                oyun[0][1] = 'O';

            }
            if(O.get(i) == 3){
                oyun[0][2] = 'O';

            }
            if(O.get(i) == 4){
                oyun[1][0] = 'O';

            }
            if(O.get(i) == 5){
                oyun[1][1] = 'O';

            }
            if(O.get(i) == 6){
                oyun[1][2] = 'O';

            }
            if(O.get(i) == 7){
                oyun[2][0] = 'O';

            }
            if(O.get(i) == 8){
                oyun[2][1] = 'O';

            }if(O.get(i) == 9){
                oyun[2][2] = 'O';

            }
        }

        for (int t=0; t<oyun.length; t++){
            for(int y=0; y<oyun[t].length; y++){
                System.out.print(oyun[t][y]+" ");
            }
            System.out.println();
        }
    }



}

/*if((x[i] - x[i-1]) == (x[i-1] - x[i-2])){
        if(((x[i] - x[i-1]) ==1 && (x[i-1] - x[i-2])==1) && x[i-2]%3 !=0 && x[i-1]%3 !=0){
        System.out.println("Qalib");
        }
        //System.out.println(x[i]+" --- "+x[i-1]+" --- "+x[i-2]);
        //System.out.println(i);
        }*/
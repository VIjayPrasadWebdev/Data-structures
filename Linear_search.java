import java.util.Scanner;

public class Linear_search {

    public static void main(String [] ar) {


        int game_no[] = {10, 67, 35, 56, 89, 11};
        System.out.println("which game no you want to find");
        Scanner s = new Scanner(System.in);
        int find_game_no = s.nextInt();
        int flag =0;


        for(int i=0; i< game_no.length; i++) {
            if (game_no[i] == find_game_no) {
                flag = 1;
                System.out.println("game no is found  in " + " " + i);
                break;
            }
        }
        
            if(flag == 0)
            {
                System.out.println("game no is  not found");
            }
        }
    }


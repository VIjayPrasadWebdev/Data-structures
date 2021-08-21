import java.util.Scanner;

public class Binary_search {

    public static void main(String [] ar)
    {
        int game_no[] = {1,2,3,4,5,6,7,8,9};
        int low=0;
        int high=game_no.length-1;
        boolean flag=false;
        int find_game_no;
        System.out.println("which game no you want :");
        Scanner s=new Scanner(System.in);
        find_game_no = s.nextInt();



        while(low<=high) {
            int middle = (low + high) / 2;
            if (middle == find_game_no) {
                flag = true;
                System.out.println("Game no is  found");
                break;
            }

            if (game_no[middle] < find_game_no) {
                low = middle + 1;

            }

            if (game_no[middle] > find_game_no) {
                high = middle - 1;
            }

        }
            if (flag == false) {
                System.out.println("Not found");
            }
        }

    }


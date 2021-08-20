import java.util.Arrays;
import java.util.Scanner;

public class Insertion_sort {

    public static void main(String[] ar) {
        int games_no[] = new int[6];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        for (int input = 0; input < 6; input++) {
                   games_no[input]=s.nextInt();

        }

        for(int i=1; i<6; i++)
        {
            int current_game_no = games_no[i];

            int j= i-1;

            while(j>=0 && games_no[j] > current_game_no)
            {
                games_no[j+1] = games_no[j];
                j--;
            }
            games_no[j+1] = current_game_no;
        }
        System.out.print(Arrays.toString(games_no)+ " ");
    }
}
import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] x) {
        int games_no[] = new int[6];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers");

        for (int i = 0; i < 6; i++) {
            games_no[i] = s.nextInt();
        }


        for (int i = 0; i < 6; i++)
        {
               int small_gameno_to_large = i;

               for(int j= i+1; j<6; j++)
               {
                   if(games_no[small_gameno_to_large] > games_no[j])
                   {
                       small_gameno_to_large = j;
                   }
                   int game_no_data = games_no[i];
                   games_no[i] = games_no[small_gameno_to_large];
                   games_no[small_gameno_to_large] = game_no_data;
               }
        }

        for(int original_games_no_data : games_no)
        {
            System.out.print(original_games_no_data + " ");
        }
    }
}

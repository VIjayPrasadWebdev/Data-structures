import java.util.Scanner;
public class Bubble_sort {
    public static void main(String[] x) {
            int games_no[] =new int[10];
            System.out.println("Enter the games_no :");
            Scanner s=new Scanner(System.in);
            for(int i=0; i<10; i++)
            {
                games_no[i] =s.nextInt();
            }
            int n=games_no.length;

            for(int j=0; j<n-1; j++)
            {
                for(int k=0; k<n-1; k++)
                {
                    if(games_no[k]>games_no[k+1])
                    {
                        int data=games_no[k];
                        games_no[k] = games_no[k+1];
                        games_no[k+1] = data;
                    }
                }
            }
            for(int organized_orignal_games_no_data : games_no)
            {
                System.out.print(organized_orignal_games_no_data+ " ");
            }
        }
    }


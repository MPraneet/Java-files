package project_files;
import java.util.Scanner;
public class word_counter {
    public static void main(String[] args) {
        //Word counter from a given or entered sentence.
        Scanner sc =new Scanner(System.in);
        System.out.println("Type your Paragraph: ");
        String userInput = sc.nextLine();
        sc.close();
        userInput = userInput.trim();
        int count =0;
        if(userInput.length()==0){
            count=0;
        }
        else{
            //count the first word. Trimming removes leading spaces before first word.
            count++;
            for(int i=0;i<userInput.length();i++){
                if(userInput.charAt(i)==' '&& userInput.charAt(i+1)!=' ')
                    count++;
            }
        }
        System.out.println("Word count: "+count);
    }
}

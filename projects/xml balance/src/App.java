import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import utils.StringQueue;

public class App {

    public static boolean parse(String line, StringQueue queue){

        for(int i=0; i < line.length(); i++){

            if(line.charAt(i) == '<') {
                String tag = "";
                i++;
                boolean close = false;

                while(line.charAt(i) != '>'){

                    if(line.charAt(i) == '/') {
                        close = true;
                    } else {
                        tag += line.charAt(i); 
                    }

                    i++;
                }

                if(!close) {
                    queue.enqueue(tag);
                    continue;
                }

                if(close && queue.isEmpty()) {
                    return false;
                }

                if(queue.peekLast().equals(tag)) {
                    queue.dequeueLast();                    
                } else return false;

            }
        }

        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        

        File file = new File("");
        String filepath = file.getAbsolutePath() + "\\test.xml";
        Scanner sc = new Scanner(new File(filepath));

        StringQueue queue = new StringQueue();

        String line = "";
        String status = "Ok!";

        while(sc.hasNextLine()){
            line = sc.nextLine();
            if( !parse(line, queue) ) {
                status = "has errors!";
                break;
            }
        }

        if(!queue.isEmpty()){
            status = "has errors!";
        }

        System.out.println("File status: " + status);

    }
}

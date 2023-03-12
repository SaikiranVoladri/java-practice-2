import java.io.*;
public class BufferreaderandWriter {
    // public static void main(String[] args)throws IOException {
    //     FileReader fr= new FileReader("hello.txt");
    //     BufferedReader br= new BufferedReader(fr);
    //     String line= br.readLine();
    //     while(line!=null){
    //         System.out.println(line);
    //         line= br.readLine();
    //     }
    //     br.close();
        
    // }

    // public static void main(String[] args)throws IOException {
    //     FileReader fr= new FileReader("hello.txt");
    //     BufferedReader br= new BufferedReader(fr);
    //     String  str[]= br.readLine().split(" ");
    //     int arr[]= new int[str.length];
    //     for(int i=0; i<str.length;i++){
    //         arr[i]=Integer.parseInt(str[i]);
    //     }
        
    //     // int sum=arr[0]+arr[3];
    //     // System.out.println(sum);

    // }
    public static void main(String[] args)throws IOException {
        FileWriter fw= new FileWriter("newfile.txt");
        BufferedWriter bw= new BufferedWriter(fw);
        bw.write(1000);
        bw.newLine();
        bw.write(500);
        bw.newLine();
        String b="saikiran";
        bw.write(b, 0, 5);
        bw.newLine();
        bw.write("Saikiran");
        bw.flush();
        bw.close();
        
    }
    
}

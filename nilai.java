
import java.util.ArrayList;
import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<String> Name = new ArrayList<String>();
        ArrayList<Integer> Nilai = new ArrayList<Integer>();
        int confirm, opt;

        do {
            System.out.println("Option : \n1. Add Data \n2.Stop");
            System.out.println("Your choices");
            confirm = Input.nextInt();

            if (confirm == 1) {
                System.out.println("1. Add new Mahasiswa");
                System.out.println("2. Edit nilai Mahasiswa");
                System.out.println("3. Edit nilai Mahasiswa");
                opt = Input.nextInt();

                if (opt == 1) {
                    add();
                } else if (opt == 2){
                    edit();
                } else if (opt == 3) {
                    remove();
                }

            } else {
                System.out.println("Option not listed");
            }

        } while (confirm !=2);
    }
    static ArrayList add (){

        return; 
    }
    static ArrayList edit (){
        return;
    }
    static ArrayList remove(){

    }
    static void list(){

    }

}

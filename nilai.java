import java.util.ArrayList;
import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        ArrayList<String> Name = new ArrayList<String>();
        ArrayList<Integer> Nilai = new ArrayList<Integer>();
        int confirm, opt;
        String tambah;

        do {
            System.out.println("====================");
            System.out.println("Option : \n1. Kelola Data Mahasiswa \n2. Stop");
            System.out.print("Pilihan Anda: ");
            confirm = Input.nextInt();
            Input.nextLine();

            if (confirm == 1) {
                System.out.println("1. List Mahasiswa");
                System.out.println("2. Add new Mahasiswa");
                System.out.println("3. Edit nilai Mahasiswa");
                System.out.println("4. Remove nilai Mahasiswa");

                System.out.print("Pilihan Anda: ");
                opt = Input.nextInt();
                Input.nextLine();

                switch (opt) {
                    case 1:
                        list(Name, Nilai);
                        break;
                    case 2:
                        tambah = add(Input, Name, Nilai);
                        System.out.println("====================");
                        System.out.println(tambah);
                        System.out.println("====================");
                        break;
                    case 3:
                        edit();
                        break;
                    case 4:
                        remove();
                        break;
                    default:
                        break;
                }

            } else {
                System.out.println("Option not listed");
            }

        } while (confirm != 2);
    }

    static String add(Scanner input, ArrayList<String> nama, ArrayList<Integer> nilai) {
        String namaBaru;
        int nilaiBaru;

        System.out.print("Masukkan Nama Mahasiswa: ");
        namaBaru = input.nextLine();
        System.out.print("Masukkan Nilai Mahasiswa: ");
        nilaiBaru = input.nextInt();
        nama.add(namaBaru);
        nilai.add(nilaiBaru);

        return "Data berhasil ditambahkan";
    }

    static String edit() {
        return "";
    }

    static String remove() {
        return "";
    }

    static void list(ArrayList<String> nama, ArrayList<Integer> nilai) {
        if (nama.isEmpty()) {
            System.out.println("====================");
            System.out.println("Data Kosong");
            System.out.println("====================");
        } else {
            System.out.println("====================");
            System.out.println("Daftar Mahasiswa");
            System.out.println("====================");
            for (int i = 0; i < nama.size(); i++) {
                System.out.println((i + 1) + ". " + nama.get(i) + " - " + nilai.get(i));
            }
        }
    }

}

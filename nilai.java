import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/* 
 * Nama Mahasiswa
 * NIM
 * Mata Kuliah
 * Nilai per Matakuliah
 * RATA
 * min
 * max
*/

public class nilai {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<String> MataKuliah = new ArrayList<String>();
        ArrayList<String> Name = new ArrayList<String>();
        ArrayList<Integer> Nilai = new ArrayList<Integer>();
        int confirm, optMhs, optMK, editOpt;
        String tambah, edit, remove, min, max, rata;
        HashMap<String, ArrayList<String>> mahasiswaMatakuliah = new HashMap<>();

        Mahasiswa mahasiswa = new Mahasiswa();
        MataKuliah mataKuliah = new MataKuliah();

        do {
            System.out.println("Option : ");
            System.out.println("1. Kelola Data Mahasiswa");
            System.out.println("2. Kelola Data Mata Kuliah");
            System.out.println("3. Tampilkan Mahasiswa Berdasarkan Mata Kuliah");
            System.out.println("4. Stop");
            System.out.print("Pilihan Anda: ");
            confirm = Input.nextInt();
            Input.nextLine();

            switch (confirm) {
                case 1 -> {
                    System.out.println("1. List Mahasiswa");
                    System.out.println("2. Add new Mahasiswa");
                    System.out.println("3. Edit Mahasiswa");
                    System.out.println("4. Remove Mahasiswa");
                    System.out.println("5. Nilai Minimal Mahasiswa");
                    System.out.println("6. Nilai Maksimal Mahasiswa");
                    System.out.println("7. Rata rata nilai mahasiswa");
                    System.out.print("Pilihan Anda: ");
                    optMhs = Input.nextInt();
                    Input.nextLine();
                    switch (optMhs) {
                        case 1:
                            mahasiswa.list(Name, Nilai);
                            break;
                        case 2:
                            tambah = mahasiswa.add(Input, Name, Nilai);
                            System.out.println("====================");
                            System.out.println(tambah);
                            System.out.println("====================");
                            break;
                        case 3:
                            edit = mahasiswa.edit(Input, Name, Nilai);
                            System.out.println("====================");
                            System.out.println(edit);
                            System.out.println("====================");
                            break;
                        case 4:
                            remove = mahasiswa.remove(Input, Name, Nilai);
                            System.out.println("====================");
                            System.out.println(remove);
                            System.out.println("====================");
                            break;
                        case 5:
                            min = mahasiswa.nilaiMin(Name, Nilai);
                            System.out.println("====================");
                            System.out.println(min);
                            System.out.println("====================");
                            break;
                        case 6:
                            max = mahasiswa.nilaiMax(Name, Nilai);
                            System.out.println("====================");
                            System.out.println(max);
                            System.out.println("====================");
                            break;
                        case 7:
                            rata = mahasiswa.ratarata(Name, Nilai);
                            System.out.println("====================");
                            System.out.println(rata);
                            System.out.println("====================");
                            break;
                        default:
                            System.out.println("Tidak ada opsi pada pilihan tersebut.");
                            break;
                    }
                }
                case 2 -> {
                    System.out.println("1. List Mata Kuliah");
                    System.out.println("2. Add new Mata Kuliah");
                    System.out.println("3. Edit Mata Kuliah");
                    System.out.println("4. Remove Mata Kuliah");
                    System.out.println("5. Nilai Minimal Mata Kuliah");
                    System.out.println("6. Nilai Maksimal Mata Kuliah");
                    System.out.println("7. Rata rata nilai Mata Kuliah");
                    System.out.print("Pilihan Anda: ");
                    optMK = Input.nextInt();
                    Input.nextLine();
                    switch (optMK) {
                        case 1:
                            mataKuliah.list();
                            break;
                        case 2:
                            tambah = mataKuliah.add(Input);
                            System.out.println("====================");
                            System.out.println(tambah);
                            System.out.println("====================");
                            break;
                        case 3:
                            edit = mataKuliah.edit(Input);
                            System.out.println("====================");
                            System.out.println(edit);
                            System.out.println("====================");
                            break;
                        case 4:
                            remove = mataKuliah.remove(Input);
                            System.out.println("====================");
                            System.out.println(remove);
                            System.out.println("====================");
                            break;
                        case 5:
                            min = mataKuliah.nilaiMin(MataKuliah, Nilai);
                            System.out.println("====================");
                            System.out.println(min);
                            System.out.println("====================");
                            break;
                        case 6:
                            max = mataKuliah.nilaiMax(MataKuliah, Nilai);
                            System.out.println("====================");
                            System.out.println(max);
                            System.out.println("====================");
                            break;
                        default:
                            System.out.println("Tidak ada opsi pada pilihan tersebut.");
                            break;
                    }
                }
                case 3 -> {
                    if (mataKuliah.getMataKuliah().isEmpty()) {
                        System.out.println("Data Mata kuliah kosong");
                    } else {
                        mataKuliah.list();
                        System.out.print("Pilih mata kuliah untuk melihat daftar mahasiswa: ");
                        String namaMataKuliah = Input.nextLine();

                        if (mahasiswaMatakuliah.containsKey(namaMataKuliah)) {
                            System.out.println("Mahasiswa yang terdaftar di Mata Kuliah " + namaMataKuliah + " :");
                            ArrayList<String> mahasiswaList = mahasiswaMatakuliah.get(namaMataKuliah);
                            for (int i = 0; i < mahasiswaList.size(); i++) {
                                System.out.println((i + 1) + ". " + mahasiswaList.get(i));
                            }
                        } else {
                            System.out.println("Tidak ada mahasiswa yang terdaftar di mata kuliah ini.");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Program Stopped");
                    break;
                }
                default -> {
                    System.out.println("Pilihan tidak valid");
                    break;
                }
            }
        } while (confirm != 4);
    }
}
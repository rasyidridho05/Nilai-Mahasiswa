import java.util.ArrayList;
import java.util.Scanner;

public class MataKuliah {
    private final ArrayList<String> mataKuliah = new ArrayList<>();

    public ArrayList<String> getMataKuliah() {
        return mataKuliah;
    }

    public String add(Scanner input) {
        String namaBaru;

        while (true) {
            System.out.print("\nMasukkan Nama Mata Kuliah (ketik 0 untuk berhenti): ");
            namaBaru = input.nextLine();

            if (namaBaru.equals("0")) {
                break;
            }
            mataKuliah.add(namaBaru);

            System.out.print("Data berhasil ditambahkan");
        }

        return "Input Selesai";
    }

    public String edit(Scanner input) {
        String namaEdit;
        int namaIndex;

        System.out.print("Masukkan Nama Mata Kuliah : ");
        namaEdit = input.nextLine();
        namaIndex = mataKuliah.indexOf(namaEdit);
        if (namaIndex != -1) {
            System.out.print("Masukkan Nama Baru Mata Kuliah : ");
            String namaBaru = input.nextLine();
            mataKuliah.set(namaIndex, namaBaru);
            return "Data Nama berhasil diedit";
        } else {
            return "Data Mata Kuliah Tidak Ditemukan";
        }
    }

    public String remove(Scanner input) {
        String deleteName;
        int deleteIndex;
        System.out.print("Masukkan Nama Mata Kuliah yang ingin dihapus : ");
        deleteName = input.nextLine();
        deleteIndex = mataKuliah.indexOf(deleteName);
        if (deleteIndex != -1) {
            mataKuliah.remove(deleteIndex);
            return "Data Mata Kuliah berhasil dihapus";
        } else {
            return "Data Mata Kuliah tidak ditemukan";
        }
    }

    public void list() {
        if (mataKuliah.isEmpty()) {
            System.out.println("====================");
            System.out.println("Data Kosong");
            System.out.println("====================");
        } else {
            System.out.println("====================");
            System.out.println("Daftar Mata Kuliah");
            System.out.println("====================");
            for (int i = 0; i < mataKuliah.size(); i++) {
                System.out.println((i + 1) + ". " + mataKuliah.get(i));
            }
            System.out.println("====================");
        }
    }

    public String nilaiMax(ArrayList<String> nama, ArrayList<Integer> nilai) {
        int max = 0;
        String name = "";

        if (!nilai.isEmpty()) {
            max = nilai.get(0);
            name = nama.get(0);
            for (int i = 1; i < nilai.size(); i++) {
                if (nilai.get(i) > max) {
                    max = nilai.get(i);
                    name = nama.get(i);
                }
            }
        } else {
            return "Data Kosong";
        }

        return name + " - " + max;
    }

    public String nilaiMin(ArrayList<String> nama, ArrayList<Integer> nilai) {
        int min = 0;
        String name = "";

        if (!nilai.isEmpty()) {
            min = nilai.get(0);
            name = nama.get(0);
            for (int i = 1; i < nilai.size(); i++) {
                if (nilai.get(i) < min) {
                    min = nilai.get(i);
                    name = nama.get(i);
                }
            }
        } else {
            return "Data Kosong";
        }

        return name + " - " + min;
    }
}

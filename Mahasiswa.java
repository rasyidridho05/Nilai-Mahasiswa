import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    public String add(Scanner input, ArrayList<String> nama, ArrayList<Integer> nilai) {
        String namaBaru;
        int nilaiBaru;

        while (true) {
            System.out.print("\nMasukkan Nama Mahasiswa (ketik 0 untuk berhenti): ");
            namaBaru = input.nextLine();

            if (namaBaru.equals("0")) {
                break;
            }

            System.out.print("Masukkan Nilai Mahasiswa: ");
            nilaiBaru = input.nextInt();
            input.nextLine();
            nama.add(namaBaru);
            nilai.add(nilaiBaru);

            System.out.print("Data berhasil ditambahkan");
        }

        return "Input Selesai";
    }

    public String edit(Scanner input, ArrayList<String> nama, ArrayList<Integer> nilai) {
        String namaEdit;
        int namaIndex, editOpt;
        System.out.println("1. Edit nama Mahasiswa");
        System.out.println("2. Edit nilai Mahasiswa");
        System.out.print("Pilihan Anda: ");
        editOpt = input.nextInt();
        input.nextLine();

        switch (editOpt) {
            case 1:
                System.out.print("Masukkan Nama Mahasiswa : ");
                namaEdit = input.nextLine();
                namaIndex = nama.indexOf(namaEdit);
                if (namaIndex != -1) {
                    System.out.print("Masukkan Nama Baru Mahasiswa : ");
                    String namaBaru = input.nextLine();
                    nama.set(namaIndex, namaBaru);
                    return "Data Nama berhasil diedit";
                } else {
                    return "Data Mahasiswa Tidak Ditemukan";
                }
            case 2:
                System.out.print("Masukkan Nama Mahasiswa : ");
                namaEdit = input.nextLine();
                namaIndex = nama.indexOf(namaEdit);
                if (namaIndex != -1) {
                    System.out.print("Masukkan Nilai Baru Mahasiswa : ");
                    int nilaiBaru = input.nextInt();
                    nilai.set(namaIndex, nilaiBaru);
                    return "Data Nilai berhasil diedit";
                } else {
                    return "Data Mahasiswa Tidak Ditemukan";
                }
            default:
                break;
        }

        return "";
    }

    public String remove(Scanner input, ArrayList<String> nama, ArrayList<Integer> nilai) {
        String deleteName;
        int deleteIndex;
        System.out.print("Masukkan Nama Mahasiswa yang ingin dihapus : ");
        deleteName = input.nextLine();
        deleteIndex = nama.indexOf(deleteName);
        if (deleteIndex != -1) {
            nama.remove(deleteIndex);
            nilai.remove(deleteIndex);
            return "Data Mahasiswa berhasil dihapus";
        } else {
            return "Data Mahasiswa tidak ditemukan";
        }
    }

    public void list(ArrayList<String> nama, ArrayList<Integer> nilai) {
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

    public String ratarata(ArrayList<String> nama, ArrayList<Integer> nilai) {
        int total = 0;
        if (!nilai.isEmpty()) {
            for (int i = 0; i < nilai.size(); i++) {
                total += nilai.get(i);
            }
            return "Rata rata nilai mahasiswa: " + total / nilai.size();
        } else {
            return "Data Kosong";
        }
    }
}

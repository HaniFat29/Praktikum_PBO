// Ini adalah super class Daftar Nilai Tertinggi Mahasiswa Per Matakuliah
class data {
    String Nama;
    String Prodi;
    String NIM;
    String Matakuliah;
    String Nilai;
    String NamaDosen;

    void display(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("NIM : " + this.NIM);
        System.out.println("MataKuliah : " + this.Matakuliah);
        System.out.println("Nilai : " + this.Nilai);
        System.out.println("NamaDosen: " + this.NamaDosen);
    }
}

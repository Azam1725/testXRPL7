package siswa;
//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
     //object
     //Class object = new Constructor
     Siswa ibra = new Siswa();
     Siswa burhan = new Siswa();
     Siswa gilam = new Siswa();
     Siswa rafly = new Siswa();
     Siswa kinza = new Siswa();

     ibra.id = 29;
     ibra.nama = "Nibraz";
     ibra.ipk = 99;
    
     burhan.id = 26;
     burhan.nama = "Burhanudin";
     burhan.ipk = 99;

     gilam.id = 19;
     gilam.nama = "Pace gilam";
     gilam.ipk = 99;

     rafly.id = 27;
     rafly.nama = "Rafely";
     rafly.ipk = 99;

     kinza.id = 15;
     kinza.nama = "kinza";
     kinza.ipk = 99;

    System.out.println("ID : " + ibra.id);
    System.out.println("Nama : " + ibra.nama);
    System.out.println("IPK : " + ibra.ipk);

    System.out.println("ID : " + burhan.id);
    System.out.println("Nama : " + burhan.nama);
    System.out.println("IPK : " + burhan.ipk);

    System.out.println("ID : " + gilam.id);
    System.out.println("Nama : " + gilam.nama);
    System.out.println("IPK : " + gilam.ipk);

    System.out.println("ID : " + rafly.id);
    System.out.println("Nama : " + rafly.nama);
    System.out.println("IPK : " + rafly.ipk);

    System.out.println("ID : " + kinza.id);
    System.out.println("Nama : " + kinza.nama);
    System.out.println("IPK : " + kinza.ipk);
    
}
}
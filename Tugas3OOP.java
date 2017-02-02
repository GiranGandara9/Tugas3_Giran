public class Tugas3OOP {
    public static void main(String[] arg) 
	{
        int n1 = 100;
        int n2 = 45;
        int n3 = 9;
        int terbesar;

        terbesar=(n1>n2)?n1:n2;
	terbesar=(terbesar>n3)?terbesar:n3;
        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);
        System.out.println("Number 3 = " + n3);
        System.out.println("Nilai terbesarnya adalah angka = " + terbesar);
    }
}
import java.util.LinkedList;

public class daffa {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<String>();
        nama.add("D");
        nama.add("A");
        nama.add("F");
        nama.add("F");
        nama.add("A");
        nama.add(" ");
        nama.add("A");
        nama.add("B");
        nama.add("D");
        nama.add("I");
        nama.add("L");
        nama.add("L");
        nama.add("A");
        nama.add("H");
        System.out.println("=======================================================");
        System.out.println("Nama Lengkap : "+ nama + "\n");

        //Fungsi Add
        nama.addFirst("A");
        nama.addLast("A");
        System.out.println("1. Fungsi Add ");
        System.out.println("Nama setelah ditambah : " + nama + "\n");

        //Fungsi Set / Sisip
        nama.set(2,"I");
        nama.set(5,"O");
        nama.set(10,"U");
        System.out.println("2. Fungsi Set");
        System.out.println("Nama setelah disisipkan : " + nama + "\n");

        //Fungsi Remove
        nama.remove(1);
        nama.remove(3);
        nama.remove(5);
        nama.remove(7);
        nama.remove(9);
        System.out.println("3. Fungsi Remove");
        System.out.println("Nama setelah diremove: " + nama + "\n");

        //Fungsi Push
        nama.push("A");
        nama.push("C");
        nama.push("T");
        System.out.println("4. Fungsi Push");
        System.out.println("Nama setelah dipush" + nama + "\n");

        //Fungsi POP
        nama.pop();
        nama.pop();
        System.out.println("5. Fungsi Pop");
        System.out.println("Nama setelah dipop: " + nama);

    }
}

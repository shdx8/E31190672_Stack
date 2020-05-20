package stack;
/* @author shdx*/
public class main {
    public static void main(String[] args) {
        stack stack = new stack();//membuat instance stack dari class stack
        
        //menambahkan data pada stackdata menggunkan method push
        stack.push("Elyas");
        stack.push("Agus");
        stack.push("Suhadak");
        stack.push("ehe");
        
        System.out.println("Data Dalam Stack : "+stack);
        System.out.println("Jumlah Data Pada Stack : "+stack.size());
        System.out.println("Data yang Akan POP : "+stack.pop());
        System.out.println("Data Dalam Stack Setelah di POP : "+stack);
        System.out.println("Apakah Data Stack Kosong : "+stack.isEmpty());       
    }
   
}
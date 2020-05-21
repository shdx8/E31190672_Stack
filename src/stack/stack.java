package stack;
/* @author shdx*/
import java.util.ArrayList;
public class stack {
    private ArrayList<String> stackdata;//deklarasi arraylist untuk data string
    
    public stack(){
        stackdata =new ArrayList<String>();//inisialisasi stackdata=arraylist
    }
    
    public void push(String n){//implementasi method push
        stackdata.add(n);//memanggil stackdata lalu tambahkan dari arraylist
    }
    
    public String pop(){//implementasi method pop
        if(stackdata.size() == 0){//jika size dari stackdata ==0 maka tampilkan "stack kosong"
            throw new IllegalStateException("stack kosong");
        }//jika tidak hapus 1 data dari stackdata
        return stackdata.remove(stackdata.size()-1);
    }
    
    public String peek(){//implementasi method peek
        if(stackdata.size() == 0){//jika size dari stackdata ==0 maka tampilkan "stack kosong"
            throw new IllegalStateException("stack kosong");
        }//jika tidak maka tampilkan data teratas dari stackdata
        return stackdata.get(stackdata.size()-1);
    }
    
    public boolean isEmpty(){//implementasi method isEmpy
        return(stackdata.size()==0);//mengecek apakah size dari stackdata==0
    }
    
    public int size(){//implementasi method size
        return stackdata.size();//untuk mengetahui ada berapa data pada stackdata
    }
    @Override
    public String toString (){
        return theStack.toString();
    }
}

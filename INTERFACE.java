interface animal{
    public void body();
}

interface human{
    public void brain();
}

class BrahmaRaksha implements animal, human{
    public void body(){
        System.out.println("Strong");

    }

    public void brain(){
        System.out.println("Have intelligence! ");
    }

    public void Danger(){
        System.out.println("I am freaking dangerous....(with muscle and mind). ");
    }
}

public class INTERFACE {
    
    public static void main(String[] args) {
        BrahmaRaksha br = new BrahmaRaksha();
        br.Danger();
        
    }
}

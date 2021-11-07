package yigitlar;

class dugum {

    int icerik;
    dugum ileri;

    public dugum(int icerik) {
        this.icerik = icerik;
        ileri = null;
    }
}

class yigitBagliListe {

    dugum ust;

    public yigitBagliListe() {
        ust = null;
    }

    boolean bosmu() {
        return ust == null;
    }

    void push(dugum d) {
        if (bosmu()) {
            ust = d;
        } else {
            d.ileri = ust;
            ust = d;
        }
    }

    dugum pop() {
        dugum e = ust;

        if (!bosmu()) {
            ust = ust.ileri;

        }
        return e;
    }

}

public class Yigitlar {

    public static void main(String[] args) {
      yigitBagliListe yb = new yigitBagliListe();
      
      yb.push(new dugum(10));
       yb.push(new dugum(20));
        System.out.println(yb.pop().icerik);
        yb.push(new dugum(12));
        yb.push(new dugum(11));
        yb.push(new dugum(12));
        
        while(!yb.bosmu()){
            System.out.println(yb.pop().icerik);
        }
    }

}

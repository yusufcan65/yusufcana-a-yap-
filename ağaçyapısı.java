package ağaçödev;

public class ağaçyapısı {

    dugum kok;

    public dugum ekle(dugum d, int deger) {
        if (d == null) {
            dugum root = new dugum();
            root.sol = null;
            root.sag = null;
            root.data = deger;
            return root;
        } else {
            if (deger < d.data) {
                d.sol = ekle(d.sol, deger);
                return d;
            } else if (deger > d.data) {
                d.sag = ekle(d.sag, deger);
                return d;
            }
            return d;
        }

    }

    public void preorder(dugum d) {
        if (d == null) {
            return;
        } else {
            System.out.print(d.data + "-");
            preorder(d.sol);
            preorder(d.sag);
        }
    }
    
    public void inorder(dugum a){
        if(a==null){
            return;
        }
        else{
            inorder(a.sol);
            System.out.print(a.data + ",");
            inorder(a.sag);
        }
    }
    public void postorder(dugum b){
        if(b==null){
            return;
        }
        else{
            postorder(b.sol);
            postorder(b.sag);
            System.out.print(b.data+ ",");
        }
    }
    public dugum sil(dugum x,int deger){
        if(x==null){
            return null;
        }
        if(x.data == deger) {
            if(x.sol == null && x.sag==null){
                return null;
            }
            if(x.sag!=null){
                x.data=min(x.sag);
                x.sag=sil(x.sag,min(x.sag));
                return x;
            }
            else{
                x.data=max(x.sol);
                x.sol=sil(x.sol,max(x.sol));
                return x;
            }
            
        }
        if(x.data < deger){
            x.sag=sil(x.sag, deger);
            return x;
        }
        else{
            x.sol=sil(x.sol, deger);
            return x;
        }
       
    }
    public int max(dugum m){
        while(m.sag != null){
            m=m.sag;
          
        }
        return m.data;
    }
    public int min(dugum m){
        while(m.sol != null){
            m=m.sol;
        }
        return m.data;
    }
    
}

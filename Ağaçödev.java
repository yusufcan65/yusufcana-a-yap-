package ağaçödev;


public class Ağaçödev {


    public static void main(String[] args) {
        
        ağaçyapısı tree = new ağaçyapısı();

        dugum ağaç = new dugum(38);
        
        tree.ekle(ağaç,38);
        tree.ekle(ağaç,12);
        tree.ekle(ağaç,90);
        tree.ekle(ağaç,25);
        tree.ekle(ağaç,170);
        tree.ekle(ağaç,48);
        tree.ekle(ağaç,108);
        tree.ekle(ağaç,102);
        
        tree.inorder(ağaç);
        System.out.println("");
        tree.postorder(ağaç);
        System.out.println("");
        tree.preorder(ağaç);
        tree.sil(ağaç, 48);
        System.out.println("");
        tree.inorder(ağaç);
       
       
        
        
        
        
        
    }
    
}

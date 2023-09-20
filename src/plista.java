
public class plista {
    public static void main(String[]arg){
        
        lista l = new lista();
        
        for(int i = 5; i>0; i--)
            l.insertar(i);
        
        System.out.println("Elementos: ");
        l.visualizar();
    }
}


public class lista {
    
    private nodo cabeza;
    private nodo anterior;
    
    
    public lista(){
        cabeza = null;
    }
    
    public  lista insertar(int entrada){
       
        nodo nuevo = new nodo (entrada);
        
        if(cabeza == null)
            cabeza = nuevo;
        else 
            anterior.enlace = nuevo;
        
        anterior = nuevo;
        return this;
    }
    
    public void visualizar(){
        nodo n;
        n = cabeza;
        
        while(n != null){
            System.out.println(n.dato+"");
            n = n.enlace;
        }
    }   
}

/*
 *UNIVERSIDAD DEL VALLE DE GUATEMALA
 *DIEGO DE JESUS ARREDONDO TUCIOS
 *19422
 *CC2003 SECCION 30
 * 
 *Referencia para resolver el ejercicio https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
*/
public class BinaryTree<E>{
	
    private E espanol;
    private E ingles;
    private BinaryTree<E> izq;
    private BinaryTree<E> der;

    public BinaryTree(E englishValue,E spanishValue){
        this.espanol = spanishValue;
        this.ingles = englishValue;
    }

    public BinaryTree(E ingles, E espanol, BinaryTree<E> izq, BinaryTree<E> der){
        this.espanol = espanol;
        this.ingles = ingles;
        this.izq = izq;
        this.der = der;
    }

    E ingles(){
        return this.ingles;
    }

    E espanol(){
        return this.espanol;
    }

    BinaryTree<E> getIzq(){
        return this.izq;
    }

    BinaryTree<E> getDer(){
        return this.der;
    }

    
    void setIzq(BinaryTree<E> izq){
    	this.izq = izq;
    }

    void setDer(BinaryTree<E> der){
    	this.der = der;
    }


}
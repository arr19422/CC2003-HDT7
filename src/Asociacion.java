  /*
 *UNIVERSIDAD DEL VALLE DE GUATEMALA
 *DIEGO DE JESUS ARREDONDO TUCIOS
 *19422
 *CC2003 SECCION 30
 * 
 *Referencia para resolver el ejercicio https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
*/
import java.util.LinkedHashMap;
import java.util.Map;

public class Asociacion<K, V> {
	
	Map<String, String> map = new LinkedHashMap<>();

    BinaryTree<String> homework = new BinaryTree<>("homework", "tarea", null, null);
    BinaryTree<String> town = new BinaryTree<>("town", "pueblo", null, null);
    BinaryTree<String> yes = new BinaryTree<>("yes", "si", null, null);
    BinaryTree<String> woman = new BinaryTree<>("woman", "mujer", town, yes);
    BinaryTree<String> dog = new BinaryTree<>("dog", "perro", null, homework);
    BinaryTree<String> house = new BinaryTree<>("house", "casa", dog, woman);
    
    int count=0;
    //metodo que ordena el Map o el diccionario
    public Map<String,String> inOrder(BinaryTree<String> arbol){
        if (arbol == null) {
            return null; 
        }
        
        inOrder(arbol.getIzq());
        count++;
        map.put("*" + arbol.ingles() + "*", arbol.espanol()); 
        inOrder(arbol.getDer());
        return map;
        
    }
  
}
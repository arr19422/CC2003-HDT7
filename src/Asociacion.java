
  
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
    Map<String,String> inOrder(BinaryTree<String> tree)
    {
        if (tree == null) 
            return null; 
  
        inOrder(tree.getIzq());
        count++;
        map.put("*"+tree.ingles()+"*", tree.espanol()); 
        inOrder(tree.getDer());
        return map;
        
    }
  
}
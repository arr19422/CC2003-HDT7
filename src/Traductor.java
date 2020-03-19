import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class Traductor {

    public void prueba() throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\text.txt"));
	    Asociacion<String, String> asociacion= new Asociacion<>();
	    String linea = reader.readLine();
	
	
	    String listaPalabras[] = linea.split(" ");
	    for(int i = 0; i < listaPalabras.length; i++)
	    {
	    	listaPalabras[i] = listaPalabras[i].toLowerCase();
	        String element = listaPalabras[i];
	        if(element.contains(".")){
	            StringBuilder string = new StringBuilder(element);
	            string.deleteCharAt(string.length()-1);
	            listaPalabras[i] = String.valueOf(string);
	        }
	        listaPalabras[i] = "*" + listaPalabras[i] + "*";
	    }
	    
	    Map<String,String> map = asociacion.inOrder(asociacion.house);
	    
	    System.out.println("Mapa Ordenado: "+ map);
	
	    Set<String> List = map.keySet();
	
	    Object[] Array = List.toArray();
	
	    for(int i = 0; i < listaPalabras.length; i++){
	        for(int j = 0; j < map.size(); j++){
	            if(listaPalabras[i].equals(Array[j])){
	            	listaPalabras[i] = map.get(Array[j]);
	                break;
	            }
	        }
	    }
	
	    StringBuilder string = new StringBuilder(listaPalabras[listaPalabras.length-1]);
	    string.append(".");
	    listaPalabras[listaPalabras.length-1] = String.valueOf(string);
	    
	    String oracion = "";
	
	    for(int i=0;i<listaPalabras.length;i++)
	    {
	        oracion +=(listaPalabras[i])+" ";
	    }
	    System.out.println("La Oracion traducida es: "+ oracion);
    


    }
}

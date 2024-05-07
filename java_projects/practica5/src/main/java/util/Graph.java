package util;

import java.util.Set;
import java.util.Stack;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class Graph<V>{

    //Lista de adyacencia.
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    /**
     * Añade el vértice `v` al grafo.
     *
     * @param v vértice a añadir.
     * @return `true` si no estaba anteriormente y `false` en caso contrario.
     */
    public boolean addVertex(V v){
        //existence checker
        if(this.containsVertex(v)) return false;

        adjacencyList.put(v, new HashSet<>());

        return true; //Este código hay que modificarlo.
    }

    /**
     * Añade un arco entre los vértices `v1` y `v2` al grafo. En caso de
     * que no exista alguno de los vértices, lo añade también.
     *
     * @param v1 el origen del arco.
     * @param v2 el destino del arco.
     * @return `true` si no existía el arco y `false` en caso contrario.
     */
    public boolean addEdge(V v1, V v2){
        //checks if vertex exists
        if(!this.containsVertex(v1)) this.addVertex(v1);
        if(!this.containsVertex(v2)) this.addVertex(v2);

        //checks if edge existed beforehand
        if(this.obtainAdjacents(v1).contains(v2)) return false;

        this.adjacencyList.get(v1).add(v2);
        return true; //Este código hay que modificarlo.
    }

    /**
     * Obtiene el conjunto de vértices adyacentes a `v`.
     *
     * @param v vértice del que se obtienen los adyacentes.
     * @return conjunto de vértices adyacentes.
     */
    public Set<V> obtainAdjacents(V v) throws NoSuchElementException{
        if(!this.containsVertex(v)) throw new NoSuchElementException("Vertice "+v+" no existe en el grafo.");
        return this.adjacencyList.get(v);
    }

    /**
     * Comprueba si el grafo contiene el vértice dado. 
     *
     * @param v vértice para el que se realiza la comprobación.
     * @return `true` si `v` es un vértice del grafo.
     */
    public boolean containsVertex(V v){
        return (adjacencyList.containsKey(v) || adjacencyList.containsValue(v));
    }

    /**
     * Método `toString()` reescrito para la clase `Grafo.java`.
     * @return una cadena de caracteres con la lista de adyacencia.
     */
    @Override
    public String toString(){
        String s = "";
        for(V v: this.adjacencyList.keySet()){
            s += "El vertice " + v + "tiene los vertices:";
            s += this.obtainAdjacents(v).toString();
        }
        return s; 
    }

    /**
     * Obtiene, en caso de que exista, el camino más corto entre
     * `v1` y `v2`. En caso contrario, devuelve `null`.
     * 
     * @param v1 el vértice origen.
     * @param v2 el vértice destino.
     * @return lista con la secuencia de vértices del camino más corto
     * entre `v1` y `v2`
     **/
    public List<V> shortestPath(V v1, V v2){
        //add to queue 1
        //queep a queue 2 with "pointers": if 1 leads to 2 and 3, the queue (or list) should be [1,1,1]
        //when reached final vertex, see queue 2 to point back 
        Queue<V> q = new PriorityQueue<>();
        ArrayList<V> q2 = new ArrayList<>();
        HashMap<V,V> q3 = new HashMap<>();
        HashMap<V,Boolean> visitedmap = new HashMap<>();
        boolean found = false;
        for(V v : this.adjacencyList.keySet()) visitedmap.put(v, false);
        q.add(v1);
        visitedmap.put(v1, true);
        q2.add(v1);
        q3.put(v1, v1);
        System.out.println(1);
        while (!found) {
            V i = q.peek();
            for(V v : this.obtainAdjacents(i)){
                System.out.println("testing " + i);
                if(v == v2){
                    q2.add(i);
                    q3.put(v,i);
                    found = true;
                    System.out.println("broke boy");
                    break;
                }
                if(!visitedmap.get(v)){
                System.out.println("added "+ v);
                q.add(v);
                q2.add(i);
                q3.put(v, i);
                visitedmap.put(v, true);
                }
                q.remove();
            
        }
    }   
    //[1,2,3,4,5,6,7]
    //[1,1,1,2,3,4,6]
    V trackback = v2;
    Stack<V> reversepath = new Stack<>();
    ArrayList<V> path = new ArrayList<>(); 
    path.add(v1);
    while(trackback != v1){
        reversepath.add(trackback);
        trackback = q3.get(trackback);
    }
    while(!reversepath.isEmpty()){
        path.add(reversepath.pop());
    }
        return path;
    }

    public static void main(String[] args) {
        Graph<Integer> g = new Graph<>();
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addVertex(5);
        g.addVertex(6);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 6);
        g.addEdge(6, 1);
    }
}


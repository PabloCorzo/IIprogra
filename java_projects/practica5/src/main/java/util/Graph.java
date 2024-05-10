package util;

import java.util.Set;
import java.util.Stack;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

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

        //add the vertex
        adjacencyList.put(v, new HashSet<>());

        return true; 
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

        //checks if vertex exists, adds them otherwise
        if(!this.containsVertex(v1)) this.addVertex(v1);
        if(!this.containsVertex(v2)) this.addVertex(v2);

        //checks if edge existed beforehand
        if(this.obtainAdjacents(v1).contains(v2)) return false;

        //ad v2 to v1's adjacency list: V1 -> V2
        this.adjacencyList.get(v1).add(v2);

        return true; 
    }

    /**
     * Obtiene el conjunto de vértices adyacentes a `v`.
     *
     * @param v vértice del que se obtienen los adyacentes.
     * @return conjunto de vértices adyacentes.
     */
    public Set<V> obtainAdjacents(V v) throws NoSuchElementException{

        //throws an exception if v doesnt exist
        if(!this.containsVertex(v)) throw new NoSuchElementException("Vertice "+v+" no existe en el grafo.");

        //return v's adjacency list
        return this.adjacencyList.get(v);
    }

    /**
     * Comprueba si el grafo contiene el vértice dado. 
     *
     * @param v vértice para el que se realiza la comprobación.
     * @return `true` si `v` es un vértice del grafo.
     */
    public boolean containsVertex(V v){

        //see if it appears on the adjacency list
        return (adjacencyList.containsKey(v));
        //OTHER WAY:
        // return (adjacencyList.containsKey(v) || adjacencyList.containsValue(v));
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
        //q will be used to search through the graph
        Queue<V> q = new PriorityQueue<>();
        //q2 will link a vertex v1 to its vertex that found it: if we go from v1 to v2, v2 will be a key with value v1
        HashMap<V,V> q2 = new HashMap<>();
        //Map that links a vertex with a boolean (has been visited or not)
        HashMap<V,Boolean> visitedmap = new HashMap<>();
        //initialise the visited map
        for(V v : this.adjacencyList.keySet()) visitedmap.put(v, false);

        //flag to stop loop once final vertex is found
        boolean found = false;

        //add first vertex to the queue, to the map of visited vertex and make it point to itself
        q.add(v1);
        visitedmap.put(v1, true);
        q2.put(v1, v1);

        //while final vertex hasnt been found
        while (!found) {

            //get next vertex in queue
            V i = q.peek();
            for(V v : this.obtainAdjacents(i)){

                //if it is the final vertex, make it point back and turn the flag on, breaking the while loop
                if(v == v2){
                    q2.put(v,i);
                    found = true;
                    break;
                }

                //if vertex is "new", add it to the queue, to the map pointing to the vertex we just came from and mark as visited
                if(!visitedmap.get(v)){
                    q.add(v);
                    q2.put(v, i);
                    visitedmap.put(v, true);
                }

                //remove the element in queue we just used
                q.remove();
        }
    } 
    
    //mark a variable to iterate back through the map of pointers
    V trackback = v2;

    //stack to keep the path. Since the path is being added backwards, if we empty the stack on an array, it will be in the correct order
    Stack<V> reversepath = new Stack<>();
    
    //array to emtpy the stack on
    ArrayList<V> path = new ArrayList<>(); 

    //add the first element since the loop will stop without adding it
    path.add(v1);

    //if we havent reached the first element yet, add the vertex to the stack to the array and keep going back
    while(trackback != v1){
        reversepath.add(trackback);
        trackback = q2.get(trackback);
    }

    //empty the stack on the array so it gets sorted
    while(!reversepath.isEmpty()){
        path.add(reversepath.pop());
    }  

    //return the path
    return path;
    }
}


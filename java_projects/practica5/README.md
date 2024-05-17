CALCULADOR DE CAMINO MINIMO ENTRE DOS VERTICES

El código contiene operaciones básicas sobre grafos dirigidos: añadir vértice, añadir arista dirigida, obtener adyacentes de un vértice, comprobar existencia de un vértice y un método tostring que devuelve un string con todas las adyacencias de cada vértice en el grafo. Además, hay un metodo (shortestPath) que toma como parámetros dos vértices y devuelve el camino más corto del primero al segundo usando un algoritmo de búsqueda por anchura, que va avanzando por varios caminos a la vez mediante una cola para asegurar que si encuentra el camino sea siempre el de menor distancia. Para no repetir vértices mediante la búsqueda, son añadidos a un mapa con un valor booleano que indica si ya han sido visitados. además también hace uso de un segundo mapa que tiene de llave los vértices y de valor el vértice desde que se encontró; Esto permite que cuando se llegue a v2, se pueda hacer backtracking, añadiendo el camino inverso hasta llegar a v1 en una pila para poder vaciarla en un array y que el array contenga el camino ordenado.

INSTALACION Y USO 
 1. Instalar el directorio practica5 y tener una JVM
 2. Para modificar los grafos, cambiar los valores de la clase test o usar App.java
 3. Para ejecutar, llamar desde el directorio raíz los siguientes comandos usando git bash:
  mvn package -> compilar y ejecutar tests
 5. El resultado aparecerá escrito en la terminal
ESTRUCTURA DEL CODIGO
 1. Src/
  main/App.java (llamada del código fuente)
  util/Graph.java (código fuente)
 2. Bin/
  archivos class
 3. ReadMe (explicacion)
 4. Target
   archivos creados por maven, como el javadoc o los resultados de tests

Autor - Pablo Corzo, dueño del repositorio

LICENCIA: Copyright [2024] [Pablo Corzo Corella]Licensed under the Apache License, Version 2.0 (the "License");you may not use this file except in compliance with the License.You may obtain a copy of the License athttp://www.apache.org/licenses/LICENSE-2.0Unless required by applicable law or agreed to in writing, softwaredistributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.See the License for the specific language governing permissions andlimitations under the License.

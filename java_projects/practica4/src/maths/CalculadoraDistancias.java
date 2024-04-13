package maths;

public class CalculadoraDistancias{
    /**
     * * Calcula la distancia de edició n, tal y como la expone
     * * Jurafsky entre las cadenas ` s1` y ` s2`.
     * */

     /**
      * 
      * @param s1 palabra target
      * @param s2 palabra a cambiar
      * @return int minimo numero de modificaciones
      */
    public static int calcularDistancia(String s1, String s2){
        int[][] m = new int[s1.length()+1][s2.length()+1];
        //draw the y and x axis
        for(int i = 0; i <= s1.length(); i++){
            m[i][0] = i;
        }
        for(int j = 0; j <= s2.length(); j++){
            m[0][j] = j;
        }
        
        for(int i = 0; i <= s1.length(); i++){
            //each letter of first word for all letters of second word
            for(int j = 0; j <= s2.length(); j++){
                
                //handled j and i = 0 so no exceptions with indexes occur
                if(i == 0) m[i][j] = j;
                else if(j == 0) m[i][j] = i;
                //if equal take from diagonal (no change)
                else if(s1.charAt(i-1) == s2.charAt(j-1)) m[i][j] = m[i-1][j-1];

                //if not equal take minimum and add 1 if add or del, add 2 if modify
                else m[i][j] = Math.min(Math.min(m[i][j-1] + 1,m[i-1][j] + 1),m[i-1][j-1] + 2);
            }
        }
        
        printMatrix(m);
        return m[s1.length()][s2.length()];
    }

    /**
     * 
     * @param m matriz
     * esto era para comprobar funcionamiento del codigo interno
     */
    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

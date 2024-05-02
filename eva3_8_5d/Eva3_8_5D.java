/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_5d;

/**
 *
 * @author jairl
 */
public class Eva3_8_5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dimen [][][][][] = new int[3][4][5][6][7];
        for(int i = 0; i < dimen.length; i++){
        for(int j = 0; j < dimen[i].length; j++){
        for(int k = 0; k < dimen[i][j].length; k++){
        for(int m = 0; m < dimen[i][j][k].length; m++){
        for(int c = 0; c < dimen[i][j][k][m].length; c++){
            dimen[i][j][k][m][c] = (int)(Math.random()*100);
        }
        }
        }
        }
        }
        for(int i = 0; i < dimen.length; i++){
        for(int j = 0; j < dimen[i].length; j++){
        for(int k = 0; k < dimen[i][j].length; k++){
        for(int m = 0; m < dimen[i][j][k].length; m++){
        for(int c = 0; c < dimen[i][j][k][m].length; c++){
            System.out.println("[" + dimen[i][j][k][m][c] + "]");
        }
        }
        }
        }
        }
    }
}

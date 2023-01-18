/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x
 */
public class challenge1 {
    public static void main(String[ ] args) {
        showNumbers();
    }

    public static void showNumbers(){
        for(int i =1; i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j *i+ " ");
            }
            System.out.println("");
        }
    }
}


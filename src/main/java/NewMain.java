/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CrazY MediA FilM
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayStack as = new ArrayStack(3);
       as.set(0, "Aluncedo");
       as.set(1, "Lundi");
       as.set(2, "Langa");
       System.out.println(as.get(1));
        System.out.println(as.size());
       ArrayStack obj = new ArrayStack(0);
       obj.add(0, "Snezoh");
        System.out.println(obj.get(0));
       obj.resize();
       obj.remove(0); 
       System.out.println(obj.get(0));
    }
    
}

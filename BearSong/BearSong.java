/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author K
 */
public class BearSong {

    public  static int countRareNotes(int [] notes) {
        Vector Notes = new Vector();
        Vector containts = new Vector();
        for(int i = 0; i < notes.length; i++) {
            if(Notes.contains(notes[i])) {
                containts.addElement(notes[i]);
            }
            Notes.addElement(notes[i]);
            
        }
        
        for(Object note : containts) {
            while(Notes.contains(note)) {
                Notes.remove(note);
            }
        }
        return Notes.size();
    }
    public static void main(String[] args) {
        int[] notes = {1,2,3,4,5,6,7,1,2,3,4,5,6,7,12,13,14,4}; // 3
        System.out.println("Number of sames: ");
        System.out.println(countRareNotes(notes));
        
    }
    
}

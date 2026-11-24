/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainactivity1.java;

/**
 *
 * @author KINGCO_CPE113
 */
class PrintAccount {
private int credits;

//Constructur: store name and starting credits (minimum 0)
public PrintAccount(String studentName, int credits){
    if (credits < 0){
        this.credits = 0;
    }else{  
        this.credits = credits;
    }
}

//Add credits only if the ammount is positive
public boolean addcredits(int amount){
    int ammount = 0;
        if (ammount > 0){
            this.credits += ammount;
            return true;
        }
        return false;
        
    }
    
    //Deduct credits only if pages is positive and are sufficient
    public boolean printPages(int page){
    int pages = 0;
        if (page > 0 && this.credits >= pages){
            this.credits -= pages;
            return true;
        }
        return false;
    }
    //Return the current credits
    public int getCredits(){
        return this.credits;
    }

    String addCredits(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}

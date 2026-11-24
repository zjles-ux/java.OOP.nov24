/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainactivity1.java;

/**
 *
 * @author KINGCO_CPE113
 */
public class MAINACTIVITY1 {

    public static void main(String[] args) {
        // 1. Create Mia's account with 10 credits and Luis's with -4
        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);
        System.out.println("Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());

        // 2. Mia prints 4 pages
        System.out.println(mia.printPages(4) + "; Mia: " + mia.getCredits());

        // 3. Mia tries to print 7 pages
        System.out.println(mia.printPages(7) + "; Mia: " + mia.getCredits());

        // 4. Mia tries to add -3 credits
        System.out.println(mia.addCredits(-3) + "; Mia: " + mia.getCredits());

        // 5. Mia adds 4 credits
        System.out.println(mia.addCredits(4) + "; Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());
    }
}

class PrintAccount {
    private String studentName;
    private int credits;

    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;
        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    public boolean addCredits(int amount) {
        if (amount > 0) {
            this.credits += amount;
            return true;
        }
        return false;
    }

    public boolean printPages(int pages) {
        if (pages > 0 && this.credits >= pages) {
            this.credits -= pages;
            return true;
        }
        return false;
    }

    public int getCredits() {
        return this.credits;
    }
}

/** USED PROMPT: can you give me multiple example codes to base mine on/*
 
/** Accepted: 1.The guard conditions logic if (pages > 0 && this.credits >=pages) before subtracting from credits, ensuring negative
* negative/zero page request and insufficient balance return false without changing the account balance.
* 2.Moving class PrintAccount outside public class MAINTACTIVITY1 (Without the public modifier) so both classes could live 
* cleanly in the same . java file.
*/

/** Rejected: The initial package mainactivity.java; declaration and separate Main.java file structure from the first reply, because my NetBeans
 *project uses package mainactivity1: and a single MAINACTIVITY1.java entry file. 
 */



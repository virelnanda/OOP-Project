/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbowithgui;

/**
 *
 * @author Lenovo
 */
public class Textresource {
    public void welcomeMessage(){
        System.out.println("Welcome to PBO RPG");
        System.out.println("Please enter your name");
    }

    public void setNameMsg(){
        System.out.print("Ketik nickname: ");
    }
    public void selectClassMsg(){
        System.out.println("Pilih salah satu class dibawah ini");
        System.out.println("1. Archer");
        System.out.println("2. Brute");
        System.out.println("3. Warrior");
        System.out.print("Pilih class (1/2/3): ");
    }
    public void monsterDefeatedMsg(){
        System.out.println("");
        System.out.println("Monster berhasil dikalahkan. Maju ke stage berikutnya");
        System.out.println("------------------------------------");
    }

    public String generateNameBoss(){
        String namaboss[]= new String[4];
        namaboss[0]="Ruehin";
        namaboss[1]="Dagon";
        namaboss[2]="Morvudd";
        namaboss[3]="Ocvist";
        int randomNumber = (int) (Math.random() * 4);
        return namaboss[randomNumber];
    }
    public String generateNamaMonster(){
        String namamonster[]= new String[6];
        namamonster[0]="Imp";
        namamonster[1]="Bandit";
        namamonster[2]="Skeleton";
        namamonster[3]= "Wolf";
        namamonster[4]= "Tiger";
        namamonster[5]= "Viper";
        int randomNumber = (int) (Math.random() * 6);
        return namamonster[randomNumber];
    }
    public int generateNomorAbilityBoss(){
        return (int) (Math.random() * 4);
    }
}
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
public class Monsters implements Mekanik{
    private int hp, atk, expreward, level;
    private String name;
    public Monsters(String name, int hp, int atk, int expreward, int level){
        this.name=name;
        this.hp=hp;
        this.atk=atk;
        this.expreward=expreward;
        this.level=level;
    }

//    public void serang(Player p){
//        p.minhp(this.atk);
//    }
//    public void minhp(int min){
//        this.hp-=min;
//    }
    public void display(){
        
        System.out.println("name: "+name);
        System.out.println("level: "+level);
        System.out.println("HP: "+hp);
        System.out.println("attack: "+atk);
        System.out.println("------------------------------------");
    }
    public int getHp() {
        return hp;
    }
    public void levelup(){
        this.atk+=10;
        this.hp+=50;
        this.level++;
    }
    public int getAtk() {
        return atk;
    }
    public int getExpreward() {
        return expreward;
    }

    void minhp(int attack) {
        //To change body of generated methods, choose Tools | Templates.
        this.hp-=attack;
    }

    
    public void serang(Player p) {
        int defens = p.getDefense()*1/5;
        int atak = this.atk-defens;
        p.minhp(atak); 
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void serang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void addhp(int add){
        this.hp+=add;
    }
    public void addatk(int add){
        this.atk+=add;
    }
   
}

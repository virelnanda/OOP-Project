/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbowithgui;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public abstract class Player implements Mekanik{
    private String name;
    private int level;
    private int health;
    private int attack;
    private int defense;
    private int experience;
    private String role;
    private int maxexp=100;
    
    public Player(String name, int level, int health, int attack, int defense, int experience){
        this.name=name;
        this.level=level;
        this.health=health;
        this.attack=attack;
        this.defense=defense;
        this.experience=experience;
    }
    public void display(){
        System.out.println("------------------------------------");
        System.out.println("name: "+name);
        System.out.println("role: "+role);
        System.out.println("level: "+level);
        System.out.println("Experience: "+experience);
        System.out.println("HP: "+health);
        System.out.println("attack: "+attack);
        System.out.println("defense: "+defense);
        System.out.println("------------------------------------");
    }
    public int getAttack() {
        return attack;
    }
    public int getExperience() {
        return experience;
    }
    public String getName() {
        return name;
    }
    public int getDefense() {
        return defense;
    }
    public int getHealth() {
        return health;
    }
    public int getLevel() {
        return level;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void addatk(int add){
        this.attack+=add;
    }
    public void adddef(int add){
        this.defense+=add;
    }
    public void addhp(int add){
        this.health+=add;
    }
    public void addexp(int add){
        this.experience+=add;
    }

//    public void minhp(int min){
//        this.health-=min;
//    }
    public void serang(Monsters m){
        if (this.role.equals("Assassin")){
            int chance=(int) (Math.random() * 3);
            if (chance==0){
                int crit=45/10*this.attack;
                m.minhp(crit);
                JOptionPane.showMessageDialog(null, "Critical");
            }else{
                m.minhp(this.attack);
            }
        }else if(this.role.equals("Warrior")){
            int monsterattack= m.getAtk();
            m.minhp(this.attack+monsterattack);
            
        }else if(this.role.equals("Berserker")){
            int kurang=this.getHealth()*1/22;
            minhp(kurang);
            m.minhp(3*this.attack);
            
        }
        
        
    }
    
    

    public void levelup(){
        this.health+=50;
        this.attack+=20;
        this.defense+=10;
        this.experience-=maxexp;
        this.level++;
        maxexp+=50;
    }

    public int getMaxexp() {
        return maxexp;
    }

    public void tambahxp(int tambah){
        this.experience+= tambah;
    }

    void minhp(int i) {
        this.health-=i; //To change body of generated methods, choose Tools | Templates.
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    
}
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
public class Role extends Player {
    private int bonusatk, bonushealth, bonusdef, norole;
    public Role(String name, int level, int health, int attack, int defense, int experience,int nomorrole){
        super(name, level, health, attack, defense, experience);
        this.norole=nomorrole;
   }
    
    public void setClass(int nomorrole){
        if (nomorrole==1){
            setRole("Assassin");
            bonusatk=30;
            addatk(bonusatk);
        }else if (nomorrole==2){
            setRole("Warrior");
            bonushealth=200;
            bonusdef=20;
            bonusatk=15;
            addatk(bonusatk);
            adddef(bonusdef);
            addhp(bonushealth);
        }else if (nomorrole==3){
            setRole("Berserker");
            bonusatk=20;
            addatk(bonusatk);
            bonushealth=250;
            adddef(bonusdef);
        }
    }
    
    
//    @Override
//    public void serang(Monsters m){
//        m.minhp(this.getAttack());
//    }

    @Override
    public void serang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

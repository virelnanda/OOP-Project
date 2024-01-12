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
public class Boss extends Monsters {
    private int specialAbility;
    
    public Boss(String name, int hp, int atk, int expreward, int level, int specialAbility){
        super(name, hp, atk, expreward, level);
        this.specialAbility=specialAbility;
    }
    public String getSpecialAbility() {
        //bakal return special ability sesuai sama nomor specialability-nya
        //yg dibawah sementara dulu
        
        if (specialAbility==0){
            return "Drain"; //nyedot darah
        }else if(specialAbility==1){
            return "Thrive"; //nambah atk boss
        }else if(specialAbility==2){
            return "Veil"; //ngeheal
        }
        return "Banish"; //instan damage
        
    }
    public void serangPlayerpakeAbility(Player p){
        int chance=(int) (Math.random() * 5);
        if (chance==0){
            if (specialAbility==0){
                p.minhp(this.getAtk());
                int tambah=this.getAtk();
                this.addhp(tambah);
                JOptionPane.showMessageDialog(null, "Boss Mengeluarkan Ability Drain!");
            }else if(specialAbility==1){
                this.addatk(50);
                JOptionPane.showMessageDialog(null, "Boss Mengeluarkan Ability Thrive!");
            }else if(specialAbility==2){
                this.addhp(300);
                JOptionPane.showMessageDialog(null, "Boss Mengeluarkan Ability Veil!");
            }else if(specialAbility==3){
                p.minhp(100);
                JOptionPane.showMessageDialog(null, "Boss Mengeluarkan Ability Banish!");
            }
        }else{
            p.minhp(this.getAtk());
            JOptionPane.showMessageDialog(null, "Boss menyerang player!");
        }
    }
    
    
}

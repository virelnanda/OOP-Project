/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbowithgui;

import database.dbconnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ControllerHandler implements ActionListener{
    private String playerName, playerRole, monsterName, bossName, bossAbility;
    private int playerLevel, playerHealth, playerAttack, playerDefense, playerExperience;
    private int monsterLevel, monsterHealth, monsterAttack, monsterReward;
    private int bossLevel, bossHealth, bossAttack, bossReward;
    Textresource txt=new Textresource();
    private int maxexp=100;
    private int stage=1;
    int point = 0;
    Monsters monster = new Monsters("",500, 10, 100, 1);
    Role player= new Role("", 1, 200, 15, 10, 0, 0);
    Boss boss = new Boss(txt.generateNameBoss(), 1000, 50, 500, stage, txt.generateNomorAbilityBoss());
    
    private int monsterOriginal = monster.getHp();
    private int playeroriginal = player.getHealth();
    private int healCount = 0;
    static ViewMenu viewmenu;
    static ViewSelection viewselection;
    static ViewIntro1 viewintro1;
    static ViewIntro2 viewintro2;
    static ViewGame viewgame;
    static ViewRank viewrank;
    
    Connection conn;
    Statement stmt;
    ResultSet rs;
    dbconnection koneksi;
    
    
    public ControllerHandler() {
        viewmenu = new ViewMenu();
        viewselection = new ViewSelection();
        viewintro1 = new ViewIntro1();
        viewintro2 = new ViewIntro2();
        viewgame = new ViewGame();
        viewrank = new ViewRank();
        viewmenu.addActionListener(this);
        viewselection.addActionListener(this);
        viewintro1.addActionListener(this);
        viewintro2.addActionListener(this);
        viewgame.addActionListener(this);
        viewrank.addActionListener(this);
        viewmenu.setVisible(true); 
        System.out.println("Button 1 Pressed");
        
        
        koneksi = new dbconnection();
        conn = koneksi.getConnection();
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        System.out.println("kepanggil");
        if (source.equals(viewmenu.getBtn1())) {
            System.out.println("Button 1 Pressed");
            jButton1ActionPerformed();
        } else if (source.equals(viewmenu.getBtn2())) {
            btn2ActionPerformed();
        } else if (source.equals(viewselection.getBtn3())) {
            btn3ActionPerformed();
        }else if (source.equals(viewintro1.getBtn4())) {
            btn4ActionPerformed();
        }else if (source.equals(viewselection.getBtn5())) {
            btn5ActionPerformed();
        }else if (source.equals(viewintro2.getBtn6())) {
            btn6ActionPerformed();
        }else if (source.equals(viewgame.getBtn7())) {
            btn7ActionPerformed();
        }else if (source.equals(viewgame.getBtn8())) {
            btn8ActionPerformed();
        }else if (source.equals(viewgame.getBtn9())) {
            btn9ActionPerformed();
        }else if (source.equals(viewmenu.getBtn10())) {
            btn10ActionPerformed();
        }else if (source.equals(viewrank.getBtn12())) {
            btn12ActionPerformed();
        }
    }
    
    public void jButton1ActionPerformed() {
        viewmenu.setVisible(false);
        viewselection.setVisible(true);
    }
    
    public void btn2ActionPerformed() {
        viewmenu.dispose();
    }
    
    public void btn3ActionPerformed() {
        if (viewselection.getText1().getText().length()<=0 || viewselection.getCombo1().getSelectedIndex()==0){
            JOptionPane.showMessageDialog(viewselection, "Silakan isi yang benar");
            
            //dibawah kalo ga kosong
        }else{
            //set object player pake parameter yang udah diisi tadi
            player.setName(viewselection.getText1().getText());
            player.setClass(viewselection.getCombo1().getSelectedIndex());
            
            //set variabel global yyang udah dibikin diatas pake atribut dari objek yang udah dibikin
            String username = viewselection.getText1().getText();
            String role = (String) viewselection.getCombo1().getSelectedItem();
            
            String sql = "INSERT INTO player (nama, role, point) VALUES (?, ?, ?)";
            
            try {
                    // Pastikan 'conn' sudah diinisialisasi dan terhubung ke database
                    PreparedStatement pstmt = conn.prepareStatement(sql);

                    // Mengisi placeholder dengan nilai yang sesuai
                    pstmt.setString(1, username);
                    pstmt.setString(2, role);
                    pstmt.setInt(3, point);

                    // Menjalankan statement
                    pstmt.executeUpdate();

                    // Menutup PreparedStatement
                    pstmt.close();

                    // Opsi: Menutup koneksi jika perlu, tergantung pada bagaimana Anda mengelola koneksi dalam aplikasi Anda
                    // conn.close();

                    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error saat menambahkan data: " + e.getMessage());
                }
            
            playerName = player.getName();
            playerLevel = player.getLevel();
            playerHealth = player.getHealth();
            playerAttack = player.getAttack();
            playerDefense = player.getDefense();
            playerExperience = player.getExperience();
            playerRole = player.getRole();
            
            //nama player buat introscreen1
            viewintro1.setTextLabel7(playerName);
            
            //generate nama random buat monster
            monster.setName(txt.generateNamaMonster());
            
            //sama kayak diatas cuma monster
            monsterName=monster.getName();
            monsterLevel=monster.getLevel();
            monsterHealth=monster.getHp();
            monsterAttack=monster.getAtk();
            monsterReward=monster.getExpreward();
            
            //pindah screen/panel
            viewselection.setVisible(false);
            viewintro1.setVisible(true);
        }   
    }
    
    public void btn4ActionPerformed() {
        viewintro2.setTextLabel15("GoodLuck "+ viewintro1.getLabel7().getText());
        viewintro1.setVisible(false);
        viewintro2.setVisible(true);
    }
    
    public void btn5ActionPerformed() {
        viewselection.setVisible(false);
        viewmenu.setVisible(true);
    }
    
    public void btn6ActionPerformed() {
        String monsterLevelString, monsterHealthString, monsterAttackString, monsterDefenseString,monsterRewardString;
        viewintro2.setVisible(false);
        viewgame.setVisible(true);
        viewgame.setTextLabel17(playerName+" ("+playerRole+")");
        String levelString = Integer.toString(playerLevel);
        viewgame.setTextLabel16(levelString);
        String healthString = Integer.toString(playerHealth);
        viewgame.setTextLabel19(healthString);
        String attackString = Integer.toString(playerAttack);
        viewgame.setTextLabel24(attackString);
        String defenseString = Integer.toString(playerDefense);
        viewgame.setTextLabel25(defenseString);
        String experienceString = Integer.toString(playerExperience);
        viewgame.setTextLabel26(experienceString + "/" + player.getMaxexp());

        viewgame.setTextLabel29(monsterName);
        monsterLevelString = Integer.toString(monsterLevel);
        viewgame.setTextLabel31(monsterLevelString);
        monsterHealthString = Integer.toString(monsterHealth);
        viewgame.setTextLabel33(monsterHealthString);
        monsterAttackString = Integer.toString( monsterAttack);
        viewgame.setTextLabel35(monsterAttackString);
        monsterRewardString = Integer.toString(monsterReward);
        viewgame.setTextLabel39(monsterRewardString);
    }
    
    public void btn7ActionPerformed() {
                /*
        dibawah buat ngecek kalo stagenya bukan 5 atau 10.
        jadi lawannya monster dulu bukan boss.
        */
        if(stage%5!=0){
            /*
            dibawah buat ngecek si monster darahnya masih ada apa nggak 
            biar masuk ke if nya
            */
            if (monster.getHp() != 0) {
                /*
                panggil method serang buat monster sesuai
                ketentuan yang ada di class
                */
                player.serang(monster);
                
                /*
                setting tampilan di screen
                */
                playerName = player.getName();
                playerLevel = player.getLevel();
                playerHealth = player.getHealth();
                playerAttack = player.getAttack();
                playerDefense = player.getDefense();
                playerExperience = player.getExperience();
                playerRole = player.getRole();
                String levelString = Integer.toString(playerLevel);
                viewgame.setTextLabel16(levelString);
                String healthString = Integer.toString(playerHealth);
                viewgame.setTextLabel19(healthString);
                String attackString = Integer.toString(playerAttack);
                viewgame.setTextLabel24(attackString);
                String defenseString = Integer.toString(playerDefense);
                viewgame.setTextLabel25(defenseString);
                String experienceString = Integer.toString(playerExperience);
                viewgame.setTextLabel26(experienceString + "/" + player.getMaxexp());

                /*
                dibawah adalah kondisi kalo menang bakal ngapain aja
                */
                if (monster.getHp() < 0){
                    String sql = "UPDATE player SET role = ?, point = ? WHERE nama = ?";
                    String role = player.getRole();
                    String username = player.getName();

                    try {
                        PreparedStatement pstmt = conn.prepareStatement(sql);

                        // Mengisi placeholder dengan nilai yang sesuai
                        pstmt.setString(1, role);    // asumsikan 'role' adalah variabel yang valid
                        pstmt.setInt(2, point += 1300);      // asumsikan 'point' adalah variabel yang valid
                        pstmt.setString(3, username); // asumsikan 'username' adalah variabel yang valid

                        // Menjalankan statement
                        int affectedRows = pstmt.executeUpdate();

                        // Menutup PreparedStatement
                        pstmt.close();

                        if(affectedRows > 0) {
                            System.out.println("Data Berhasil Diperbaharui");
                        } else {
                            System.out.println("Data Tidak Berhasil");
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error saat memperbarui data: " + e.getMessage());
                    }

                            
                    monsterHealth=0; //set darah monster ke 0 biar tampilannya ga minus
                    healCount = 0;
                    String monsterHealthString = Integer.toString(monsterHealth);
                    viewgame.setTextLabel33(monsterHealthString);
                    JOptionPane.showMessageDialog(null, "Player menang!");
                    player.addexp(monster.getExpreward());
                    
                    /*
                    playeroriginal disini adalah darah awal si player itu. buat keperluan level up
                    */
                    player.setHealth(playeroriginal);

                       /*
                    kalo level up bakal nambah si maxexpnya
                    */
                    if (player.getExperience() >= player.getMaxexp()){
                        player.levelup();
                        maxexp+=50;
                    }


                    playeroriginal=player.getHealth();
                    stage++;//biar tau stage brp dan nambah stagenya
                    
                    /*
                    display2 lagi
                    */
                    playerName = player.getName();
                    playerLevel = player.getLevel();
                    playerHealth = player.getHealth();
                    playerAttack = player.getAttack();
                    playerDefense = player.getDefense();
                    playerExperience = player.getExperience();
                    playerRole = player.getRole();
                    levelString = Integer.toString(playerLevel);
                    viewgame.setTextLabel16(levelString);
                    healthString = Integer.toString(playerHealth);
                    viewgame.setTextLabel19(healthString);
                    attackString = Integer.toString(playerAttack);
                    viewgame.setTextLabel24(attackString);
                    defenseString = Integer.toString(playerDefense);
                    viewgame.setTextLabel25(defenseString);
                    experienceString = Integer.toString(playerExperience);
                    viewgame.setTextLabel26(experienceString + "/" + player.getMaxexp());
                    
                    /*
                    inisiasi bossfight.
                    isinya kurleb sama aja sama if dibawah.
                    cuma harus diinisiasi disini dulu buat next round
                    kalo nggak dia bakal lanjut nampilin monster lagi sampe serangan pertama
                    */
                    if (stage%5 == 0){
                        bossName=boss.getName();
                        bossLevel=boss.getLevel();
                        bossHealth=boss.getHp();
                        bossAttack=boss.getAtk();
                        bossLevel=boss.getLevel();
                        bossReward=boss.getExpreward();
                        bossAbility=boss.getSpecialAbility();
                        viewgame.setTextLabel29(bossName + " (" + boss.getSpecialAbility() + ")");
                        String bossLevelString = Integer.toString(bossLevel);
                        viewgame.setTextLabel31(Integer.toString(bossLevel));
                        String bossHealthString = Integer.toString(bossHealth);
                        viewgame.setTextLabel33(Integer.toString(bossHealth));
                        String bossAttackString = Integer.toString(bossAttack);
                        viewgame.setTextLabel35(Integer.toString(bossAttack));
                        String bossRewardString = Integer.toString(bossReward);
                        viewgame.setTextLabel39(Integer.toString(bossReward));
                    } else if (stage%5 != 0 && stage!=11) {
                        monster.setHp(monsterOriginal);
                        monster.levelup();
                        monsterOriginal = monster.getHp();
                        monster.setName(txt.generateNamaMonster());
                        monsterName=monster.getName();
                        monsterLevel=monster.getLevel();
                        monsterHealth=monster.getHp();
                        monsterAttack=monster.getAtk();
                        monsterLevel=monster.getLevel();
                        viewgame.setTextLabel29(monsterName);
                        String monsterLevelString = Integer.toString(monsterLevel);
                        viewgame.setTextLabel31(monsterLevelString);
                        monsterHealthString = Integer.toString(monsterHealth);
                        viewgame.setTextLabel33(monsterHealthString);
                        String monsterAttackString = Integer.toString( monsterAttack);
                        viewgame.setTextLabel35(monsterAttackString);
                        String monsterRewardString = Integer.toString(monsterReward);
                        viewgame.setTextLabel39(monsterRewardString);
                        monsterLevelString = Integer.toString(monsterLevel);
                        JOptionPane.showMessageDialog(null, "Level " + monsterLevelString);
                    }
                    

                }else {
                    monsterHealth=monster.getHp();
                    String monsterHealthString = Integer.toString(monsterHealth);
                    viewgame.setTextLabel33(monsterHealthString);
                    JOptionPane.showMessageDialog(null, "Player menyerang monster!");
                }

                if (monsterHealth != 0 && monster.getHp() < monsterOriginal ){
                    player.minhp(monster.getAtk());
                    if (player.getHealth() < 0){
                        playerHealth = 0;
                        healthString = Integer.toString(playerHealth);
                        viewgame.setTextLabel19(healthString);
                        JOptionPane.showMessageDialog(null, "You Lose!");
                        JOptionPane.showMessageDialog(null, "Game Berakhir, Kamu Kalah");
                        System.exit(0);
                    } else {
                        playerHealth = player.getHealth();
                        healthString = Integer.toString(playerHealth);
                        viewgame.setTextLabel19(healthString);
                        JOptionPane.showMessageDialog(null, "Monster menyerang player!");
                    }
                }
            } 
            
            /*
            ini harusnya sama aja sih
            */
            if (stage%5==0){
                JOptionPane.showMessageDialog(null, "Danger! stage "+stage+" Boss fight Incoming!");
                bossName=boss.getName();
                bossLevel=boss.getLevel();
                bossHealth=boss.getHp();
                bossAttack=boss.getAtk();
                bossLevel=boss.getLevel();
                bossReward=boss.getExpreward();
                bossAbility=boss.getSpecialAbility();
                viewgame.setTextLabel29(bossName + " (" + boss.getSpecialAbility() + ")");
                String bossLevelString = Integer.toString(bossLevel);
                viewgame.setTextLabel31(Integer.toString(bossLevel));
                String bossHealthString = Integer.toString(bossHealth);
                viewgame.setTextLabel33(Integer.toString(bossHealth));
                String bossAttackString = Integer.toString(bossAttack);
                viewgame.setTextLabel35(Integer.toString(bossAttack));
                String bossRewardString = Integer.toString(bossReward);
                viewgame.setTextLabel39(Integer.toString(bossReward));
            }
            
        }else if (stage%5==0){
            
            bossName=boss.getName();
            bossLevel=boss.getLevel();
            bossHealth=boss.getHp();
            bossAttack=boss.getAtk();
            bossLevel=boss.getLevel();
            bossAbility=boss.getSpecialAbility();
            bossReward=boss.getExpreward();
            viewgame.setTextLabel29(bossName + " (" + boss.getSpecialAbility() + ")");
            String bossLevelString = Integer.toString(bossLevel);
            viewgame.setTextLabel31(Integer.toString(bossLevel));
            String bossHealthString = Integer.toString(bossHealth);
            viewgame.setTextLabel33(Integer.toString(bossHealth));
            String bossAttackString = Integer.toString(bossAttack);
            viewgame.setTextLabel35(Integer.toString(bossAttack));
            String bossRewardString = Integer.toString(bossReward);
            viewgame.setTextLabel39(Integer.toString(bossReward));
                    
                    
            
            if (boss.getHp() != 0) {
                player.serang(boss);
                playerName = player.getName();
                playerLevel = player.getLevel();
                playerHealth = player.getHealth();
                playerAttack = player.getAttack();
                playerDefense = player.getDefense();
                playerExperience = player.getExperience();
                playerRole = player.getRole();
                String levelString = Integer.toString(playerLevel);
                viewgame.setTextLabel16(levelString);
                String healthString = Integer.toString(playerHealth);
                viewgame.setTextLabel19(healthString);
                String attackString = Integer.toString(playerAttack);
                viewgame.setTextLabel24(attackString);
                String defenseString = Integer.toString(playerDefense);
                viewgame.setTextLabel25(defenseString);
                String experienceString = Integer.toString(playerExperience);
                viewgame.setTextLabel26(experienceString + "/" + player.getMaxexp());
                
                // MENANG
                if (boss.getHp() < 0){
                    bossHealth=0;
                    healCount = 0;
                    bossHealthString = Integer.toString(bossHealth);
                    viewgame.setTextLabel33(bossHealthString);
                    JOptionPane.showMessageDialog(null, "Player menang!");
                    player.addexp(boss.getExpreward());
                    player.setHealth(playeroriginal);


                    if (player.getExperience() >= player.getMaxexp()){
                        player.levelup();
                        maxexp+=50;
                    }


                    playeroriginal=player.getHealth();
                    stage++;

                } else {
                    bossHealth=boss.getHp();
                    bossHealthString = Integer.toString(bossHealth);
                    viewgame.setTextLabel33(bossHealthString);
                    JOptionPane.showMessageDialog(null, "Player menyerang Boss!");
                }
                
                /*
                 * method dibawah looping kalo bossnya darahnya blom abis
                 * disitu ada buat nyerang player pake ability
                */
                /*
            disini bossfight benerannya.
            isinya kurleb sama kayak method2 diatas
            tp disini si boss
            */
                if (bossHealth != 0){
                    //Serang Player
                    boss.serangPlayerpakeAbility(player);
                    //modif dibawah sini
                    bossHealth=boss.getHp();
                    bossAttack=boss.getAtk();
                    bossHealthString = Integer.toString(bossHealth);
                    viewgame.setTextLabel33(bossHealthString);
                    bossAttackString = Integer.toString(bossAttack);
                    viewgame.setTextLabel35(bossAttackString);
                    if (player.getHealth() <= 0){
                        playerHealth = 0;
                        healthString = Integer.toString(playerHealth);
                        viewgame.setTextLabel19(healthString);
                        JOptionPane.showMessageDialog(null, "You Lose!");
                        JOptionPane.showMessageDialog(null, "Game Berakhir, Kamu Kalah");
                        System.exit(0);
                        
                    } else {
                        playerHealth = player.getHealth();
                        healthString = Integer.toString(playerHealth);
                        viewgame.setTextLabel19(healthString);
                    }
                }
            }
            if (stage%5!=0){
                if (stage!=11){
                    monster.setHp(monsterOriginal);
                    monster.levelup();
                    monsterOriginal = monster.getHp();
                    monster.setName(txt.generateNamaMonster());
                    monsterName=monster.getName();
                    monsterLevel=monster.getLevel();
                    monsterHealth=monster.getHp();
                    monsterAttack=monster.getAtk();
                    monsterLevel=monster.getLevel();
                    viewgame.setTextLabel29(monsterName);
                    String monsterLevelString = Integer.toString(monsterLevel);
                    viewgame.setTextLabel31(monsterLevelString);
                    String monsterHealthString = Integer.toString(monsterHealth);
                    viewgame.setTextLabel33(monsterHealthString);
                    String monsterAttackString = Integer.toString( monsterAttack);
                    viewgame.setTextLabel35(monsterAttackString);
                    String monsterRewardString = Integer.toString(monsterReward);
                    viewgame.setTextLabel39(monsterRewardString);
                    monsterLevelString = Integer.toString(monsterLevel);
                    JOptionPane.showMessageDialog(null, "Level " + monsterLevelString);
                } 
            }
            if (stage==11){
                JOptionPane.showMessageDialog(null, "Game Berakhir, Kamu Menang");
                viewgame.setVisible(false);
                viewmenu.setVisible(true);
            }
        }
    }
    
    public void btn8ActionPerformed() {
        healCount += 1;
        if (healCount > 4){
            JOptionPane.showMessageDialog(null, "Med kit Habis");
        } else {
            player.addhp(50);
            if (player.getHealth() > 200){
                player.setHealth(200);
            }
            playerHealth = player.getHealth();
            String healthString = Integer.toString(playerHealth);
            viewgame.setTextLabel19(healthString);
        }
    }
    
    public void btn9ActionPerformed() {
        JOptionPane.showMessageDialog(null, "GameBerakhir");
        viewgame.setVisible(false);
        viewmenu.setVisible(true);
    }
    public void btn10ActionPerformed() {
        viewrank.setVisible(true);
        viewmenu.setVisible(false);
        
        try {
            stmt = conn.createStatement();
            String sql = "select * from player ORDER BY point DESC";
            rs = stmt.executeQuery(sql);

            DefaultTableModel tblModel = (DefaultTableModel)viewrank.getBtn11().getModel();
            tblModel.setRowCount(0); // Membersihkan baris tabel yang ada

            int count = 0;
            int i = 0;
            while (rs.next()&& i < 10) {
                String username = rs.getString("nama");
                String role = rs.getString("role");
                String point = String.valueOf(rs.getInt("point"));

                count++;
                String tbData[] = {String.valueOf(count), username, role, point};
                tblModel.addRow(tbData);
                i++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
    
    public void btn12ActionPerformed() {
        viewrank.setVisible(false);
        viewmenu.setVisible(true);
    }
}

    

    


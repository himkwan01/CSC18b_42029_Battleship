/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship_gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Jasmine
 */
public class JFrame_Battleship extends javax.swing.JFrame {
    private static final int a = 10; //size of board a x a
    private JButton[][] buttons_Player;
    private JButton[][] buttons_AI;
    private Background bg = new Background();
    /**
     * Creates new form IntroMenu
     */
    public JFrame_Battleship() {
        initComponents();
        Playerprepare();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jIntroMenuPane = new javax.swing.JLayeredPane();
    startButton = new javax.swing.JButton();
    rulesButton = new javax.swing.JButton();
    battleshipLogo = new javax.swing.JLabel();
    playerNameText = new javax.swing.JTextField();
    jRulesPane = new javax.swing.JLayeredPane();
    rulesTitle = new javax.swing.JLabel();
    closeButton = new javax.swing.JButton();
    rulesText = new javax.swing.JTextArea();
    jGamePlayPane = new javax.swing.JLayeredPane();
    rulesLabel = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    fireButton = new javax.swing.JButton();
    playerNameLabel = new javax.swing.JLabel();
    jBoardPane_Player = new javax.swing.JLayeredPane();
    jBoardPane_AI = new javax.swing.JLayeredPane();
    AI_Label = new javax.swing.JLabel();
    row = new javax.swing.JLabel();
    Tip = new javax.swing.JLabel();
    row1 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jIntroMenuPane.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
    jIntroMenuPane.setMaximumSize(new java.awt.Dimension(1024, 1000));
    jIntroMenuPane.setName(""); // NOI18N
    jIntroMenuPane.setPreferredSize(new java.awt.Dimension(1024, 1000));

    startButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
    startButton.setText("Start");
    startButton.setPreferredSize(new java.awt.Dimension(140, 60));
    startButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        startButtonMouseClicked(evt);
      }
    });

    rulesButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
    rulesButton.setText("Rules");
    rulesButton.setMaximumSize(new java.awt.Dimension(140, 60));
    rulesButton.setMinimumSize(new java.awt.Dimension(140, 60));
    rulesButton.setPreferredSize(new java.awt.Dimension(140, 60));
    rulesButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        rulesButtonMouseClicked(evt);
      }
    });

    battleshipLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/battleship_gui/battleship-movie-logo.png"))); // NOI18N

    playerNameText.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
    playerNameText.setText("Enter Player's Name");
    playerNameText.setToolTipText("");

    javax.swing.GroupLayout jIntroMenuPaneLayout = new javax.swing.GroupLayout(jIntroMenuPane);
    jIntroMenuPane.setLayout(jIntroMenuPaneLayout);
    jIntroMenuPaneLayout.setHorizontalGroup(
      jIntroMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jIntroMenuPaneLayout.createSequentialGroup()
        .addGroup(jIntroMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jIntroMenuPaneLayout.createSequentialGroup()
            .addGap(238, 238, 238)
            .addComponent(battleshipLogo))
          .addGroup(jIntroMenuPaneLayout.createSequentialGroup()
            .addGap(409, 409, 409)
            .addGroup(jIntroMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(rulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jIntroMenuPaneLayout.createSequentialGroup()
            .addGap(330, 330, 330)
            .addComponent(playerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(362, Short.MAX_VALUE))
    );
    jIntroMenuPaneLayout.setVerticalGroup(
      jIntroMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jIntroMenuPaneLayout.createSequentialGroup()
        .addGap(193, 193, 193)
        .addComponent(battleshipLogo)
        .addGap(76, 76, 76)
        .addComponent(playerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(34, 34, 34)
        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(86, 86, 86)
        .addComponent(rulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(155, Short.MAX_VALUE))
    );
    jIntroMenuPane.setLayer(startButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
    jIntroMenuPane.setLayer(rulesButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
    jIntroMenuPane.setLayer(battleshipLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);
    jIntroMenuPane.setLayer(playerNameText, javax.swing.JLayeredPane.DEFAULT_LAYER);

    jRulesPane.setVisible(false);
    jRulesPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 1, true));
    jRulesPane.setMaximumSize(new java.awt.Dimension(1024, 1000));
    jRulesPane.setPreferredSize(new java.awt.Dimension(1024, 1000));

    rulesTitle.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
    rulesTitle.setText("Rules for BattleShip");

    closeButton.setText("close");
    closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        closeButtonMouseClicked(evt);
      }
    });
    closeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeButtonActionPerformed(evt);
      }
    });

    rulesText.setEditable(false);
    rulesText.setColumns(20);
    rulesText.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
    rulesText.setRows(5);
    rulesText.setText("User chooses a spot on the grid to strike. \n\nIf the user guesses right, the board will show a marker for a \"hit\". \nIf the user guesses wrong it will display a \"miss\"");

    javax.swing.GroupLayout jRulesPaneLayout = new javax.swing.GroupLayout(jRulesPane);
    jRulesPane.setLayout(jRulesPaneLayout);
    jRulesPaneLayout.setHorizontalGroup(
      jRulesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jRulesPaneLayout.createSequentialGroup()
        .addGroup(jRulesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRulesPaneLayout.createSequentialGroup()
            .addContainerGap(1011, Short.MAX_VALUE)
            .addComponent(closeButton))
          .addGroup(jRulesPaneLayout.createSequentialGroup()
            .addGap(260, 260, 260)
            .addComponent(rulesTitle)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
      .addGroup(jRulesPaneLayout.createSequentialGroup()
        .addGap(189, 189, 189)
        .addComponent(rulesText, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jRulesPaneLayout.setVerticalGroup(
      jRulesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jRulesPaneLayout.createSequentialGroup()
        .addGap(104, 104, 104)
        .addComponent(rulesTitle)
        .addGap(151, 151, 151)
        .addComponent(rulesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jRulesPane.setLayer(rulesTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
    jRulesPane.setLayer(closeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
    jRulesPane.setLayer(rulesText, javax.swing.JLayeredPane.DEFAULT_LAYER);

    jGamePlayPane.setVisible(false);
    jGamePlayPane.setMaximumSize(new java.awt.Dimension(1024, 1000));
    jGamePlayPane.setName(""); // NOI18N
    jGamePlayPane.setPreferredSize(new java.awt.Dimension(1024, 1000));
    jGamePlayPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    rulesLabel.setToolTipText("Rules");
    rulesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        rulesLabelMouseClicked(evt);
      }
    });
    jGamePlayPane.add(rulesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 50, -1));

    jTextField1.setText("User input (coordinates)");
    jTextField1.setToolTipText("");
    jGamePlayPane.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 638, -1, -1));

    fireButton.setText("Place");
    fireButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fireButtonActionPerformed(evt);
      }
    });
    jGamePlayPane.add(fireButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 678, -1, -1));

    playerNameLabel.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
    playerNameLabel.setText("Player's Name");
    jGamePlayPane.add(playerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 40));

    jBoardPane_Player.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jBoardPane_Player.setPreferredSize(new java.awt.Dimension(500, 500));

    javax.swing.GroupLayout jBoardPane_PlayerLayout = new javax.swing.GroupLayout(jBoardPane_Player);
    jBoardPane_Player.setLayout(jBoardPane_PlayerLayout);
    jBoardPane_PlayerLayout.setHorizontalGroup(
      jBoardPane_PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    jBoardPane_PlayerLayout.setVerticalGroup(
      jBoardPane_PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    ButtonTablePlayer();

    jGamePlayPane.add(jBoardPane_Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

    jBoardPane_AI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jBoardPane_AI.setPreferredSize(new java.awt.Dimension(500, 500));

    javax.swing.GroupLayout jBoardPane_AILayout = new javax.swing.GroupLayout(jBoardPane_AI);
    jBoardPane_AI.setLayout(jBoardPane_AILayout);
    jBoardPane_AILayout.setHorizontalGroup(
      jBoardPane_AILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    jBoardPane_AILayout.setVerticalGroup(
      jBoardPane_AILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    ButtonTableAI();
    AIprepare();

    jGamePlayPane.add(jBoardPane_AI, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

    AI_Label.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
    AI_Label.setText("AI");
    jGamePlayPane.add(AI_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

    row.setText("         0              1              2              3              4              5              6             7              8              9");
    jGamePlayPane.add(row, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 500, 30));

    Tip.setText("Please enter the coordinates to place "+bg.unit[count]+" ship\nformat is A1-A5");
    jGamePlayPane.add(Tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

    row1.setText("         0              1              2              3              4              5              6             7              8              9");
    jGamePlayPane.add(row1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 500, 30));

    jLabel1.setText("A");
    jGamePlayPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jIntroMenuPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jRulesPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jGamePlayPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jIntroMenuPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jRulesPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jGamePlayPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
      jIntroMenuPane.setVisible(true);
      jRulesPane.setVisible(false);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void rulesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rulesButtonMouseClicked
        // TODO add your handling code here:
      jIntroMenuPane.setVisible(false);
      jRulesPane.setVisible(true);
    }//GEN-LAST:event_rulesButtonMouseClicked

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void rulesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rulesLabelMouseClicked

      jGamePlayPane.setVisible(false);
      jRulesPane.setVisible(true);
    }//GEN-LAST:event_rulesLabelMouseClicked

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked

      jIntroMenuPane.setVisible(false);
      playerNameLabel.setText(playerNameText.getText());
      jGamePlayPane.setVisible(true);
    }//GEN-LAST:event_startButtonMouseClicked

  private void fireButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireButtonActionPerformed
    boolean valid;
    String temp = jTextField1.getText();
    System.out.println(temp);
    //place ship
    if(ppre){
      valid=bg.place(temp, count);
      if(valid){   //if true = valid input update gui table
        count++;
        if(count<5)
          Playerprepare();  //update prompt label
        //placing ship ends
        else{
          //update label text
          Tip.setText("Ready to fire!");
          //update button text
          fireButton.setText("Fire");
          //set ai buttons enable
          enableAI(true);
          ppre=false;
        }
        UpdateTable();
      }
      else
        System.out.println("Invalid input");
    }
    //fire
    else{
      //validation needed length=2
      if(bg.pFireCheck(temp)){
        //update table (only that index) AND COLOR
        buttons_AI[bg.y1][bg.x1].setText(String.valueOf(bg.real[bg.y1][bg.x1]));
        if(bg.real[bg.y1][bg.x1]=='X')
          buttons_AI[bg.y1][bg.x1].setBackground(Color.red);
        else
          buttons_AI[bg.y1][bg.x1].setBackground(Color.yellow);
        //set fire button, ai buttons disable
        fireButton.setEnabled(false);
        enableAI(false);
        /**ai fire turn begins
         * update player table
         * ai fire turn ends
        */
        AIFire();
        //set fire button, ai buttons enable
        enableAI(true);
        fireButton.setEnabled(true);
        //save
      }
    }
  }//GEN-LAST:event_fireButtonActionPerformed

  
    //creates the button table for the player
    public void ButtonTablePlayer() {
      ActionListener clk = new ButtonListenerPlayer();
      //adds grid to place 2D array
      jBoardPane_Player.setLayout(new GridLayout(a,a));
      //declare size of button 2D array
      buttons_Player = new JButton[a][a];
      for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){
          //create new JButton
          buttons_Player[i][j] = new JButton();
//          buttons_Player[i][j].setText(Integer.toString(i)+" "+Integer.toString(j));
          buttons_Player[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
          buttons_Player[i][j].addActionListener(clk);
          buttons_Player[i][j].setBackground(Color.white);
          buttons_Player[i][j].setEnabled(false);
          //addes buttons to the layered pane
          jBoardPane_Player.add(buttons_Player[i][j]);
        }
      }
    }
     
    //creates the button table for the AI
    public void ButtonTableAI() {
      ActionListener aiclk = new ButtonListenerAI();
      jBoardPane_AI.setLayout(new GridLayout(a,a));
      //declare size of button array
      buttons_AI = new JButton[a][a];
      for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){
          //create new object
          buttons_AI[i][j] = new JButton();
//          buttons_AI[i][j].setText(Integer.toString(i)+" "+Integer.toString(j));
          buttons_AI[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
          buttons_AI[i][j].addActionListener(aiclk);
          buttons_AI[i][j].setBackground(Color.white);
          buttons_AI[i][j].setEnabled(false); //disable before prepare
          //adds buttons to the layered pane
          jBoardPane_AI.add(buttons_AI[i][j]);
        }
      }
    }
    
    //create an action listener class for player
    public class ButtonListenerPlayer implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e){
        for (int i = 0; i < a; i++){
          for (int j = 0; j < a; j++){
            if(e.getSource()==buttons_Player[i][j]){ //gameButtons[i][j] was clicked
             //Your code here
              System.out.println("Player"+i+" "+j);
            }
          }
        }
      }
    }
    
    //create an action listener class for AI
    public class ButtonListenerAI implements ActionListener {  
      @Override
      public void actionPerformed(ActionEvent e){
        for (int i = 0; i < a; i++){
          for (int j = 0; j < a; j++){
            if(e.getSource()==buttons_AI[i][j]){ //gameButtons[i][j] was clicked
              //Your code here
              System.out.println("AI"+i+" "+j);
              if(bg.pFireCheck(i, j)){
                //update table (only that index) AND COLOR
                buttons_AI[bg.y1][bg.x1].setText(String.valueOf(bg.real[bg.y1][bg.x1]));
                if(bg.real[bg.y1][bg.x1]=='X')
                  buttons_AI[bg.y1][bg.x1].setBackground(Color.red);
                else
                  buttons_AI[bg.y1][bg.x1].setBackground(Color.yellow);
                //set fire button, ai buttons disable
                fireButton.setEnabled(false);
                enableAI(false);
                /**ai fire turn begins
                 * update player table
                 * ai fire turn ends
                */
                AIFire();
                //set fire button, ai buttons enable
                enableAI(true);
                fireButton.setEnabled(true);
                //save
              }
            }
          }
        }
      }
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel AI_Label;
  private javax.swing.JLabel Tip;
  private javax.swing.JLabel battleshipLogo;
  private javax.swing.JButton closeButton;
  private javax.swing.JButton fireButton;
  private javax.swing.JLayeredPane jBoardPane_AI;
  private javax.swing.JLayeredPane jBoardPane_Player;
  private javax.swing.JLayeredPane jGamePlayPane;
  private javax.swing.JLayeredPane jIntroMenuPane;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLayeredPane jRulesPane;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JLabel playerNameLabel;
  private javax.swing.JTextField playerNameText;
  private javax.swing.JLabel row;
  private javax.swing.JLabel row1;
  private javax.swing.JButton rulesButton;
  private javax.swing.JLabel rulesLabel;
  private javax.swing.JTextArea rulesText;
  private javax.swing.JLabel rulesTitle;
  private javax.swing.JButton startButton;
  // End of variables declaration//GEN-END:variables

  //[a-jA-J]{1}[0-9]{1}
  //[a-jA-J]{1}\-{1}[a-jA-J]{1}[0-9]{1}
  //a1-a5
  private void AIprepare(){
    bg.ai();
      for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
          if(bg.real[i][j]!=' '){
            buttons_AI[i][j].setText(String.valueOf(bg.real[i][j]));
            buttons_AI[i][j].setBackground(Color.gray);
          }
        }
      }
  }
  private void Playerprepare(){
    Tip.setText("Enter the coordinates to place "+bg.unit[count]+"-unit ship");
  }
  private void UpdateTable(){
    for(int i=0;i<bg.num;i++){
      for(int j=0;j<bg.num;j++){
        if(bg.player[i][j]!=' '){
          buttons_Player[i][j].setBackground(Color.gray);
          buttons_Player[i][j].setText(String.valueOf(bg.player[i][j]));
        }
      }
    }
  }
  int count=0;
  boolean ppre=true;
  private void enableAI(boolean bool){
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
        buttons_AI[i][j].setEnabled(bool);
      }
    }
  }
  private void AIFire(){
    bg.aiFirebg();
    buttons_Player[bg.aiProp.y][bg.aiProp.x].setText(String.valueOf(bg.player[bg.aiProp.y][bg.aiProp.x]));
    if(bg.player[bg.aiProp.y][bg.aiProp.x]=='X'){
      buttons_Player[bg.aiProp.y][bg.aiProp.x].setBackground(Color.red);
      System.out.println("hit"+bg.aiProp.y+" "+bg.aiProp.x);
    }
    else{
      buttons_Player[bg.aiProp.y][bg.aiProp.x].setBackground(Color.yellow);
      System.out.println("miss"+bg.aiProp.y+" "+bg.aiProp.x);
    }
  }
}

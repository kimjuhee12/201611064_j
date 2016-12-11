package com.sd.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class YutGameGUI extends DiceGameGUI {
   public YutGameGUI() {
	  super();
	  setTitle("A Game Of Yut");
    }
      
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource();
      if (b == b1) {
            b1.setText("Click clear button ->");
            String name1 = player1Tf.getText();
            String name2 = player2Tf.getText();
            
            YutGame yg = new YutGame(name1, name2);
            
            yg.play();
            
            player1Tf.setText(player1Tf.getText()+" : "+String.valueOf(yg.getP1().getYut()));
            player2Tf.setText(player2Tf.getText()+" : "+String.valueOf(yg.getP2().getYut()));
            
            winnerTf.setText(yg.score());
         }
      
      else if (b == b2) {
         player1Tf.setText("");
         player2Tf.setText("");
         winnerTf.setText("");
         b1.setText("Replay");
   
      }
   }
   
   public static void main(String[] args) {
      YutGameGUI yggui = new YutGameGUI();
      yggui.setDefaultCloseOperation(EXIT_ON_CLOSE);
      yggui.pack();
      yggui.setVisible(true);
   }
}
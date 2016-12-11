package com.sd.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DiceGameGUI extends JFrame implements ActionListener {
   JTextField player1Tf;
   JTextField player2Tf;
   JTextField winnerTf;
   JButton b1;
   JButton b2; 

   public DiceGameGUI() {
      setTitle("The Game Of Dice");
      JPanel panel = new JPanel(new GridLayout(3,2));
      getContentPane().add(panel);
      
      JLabel label1=new JLabel("Player 1");
      JLabel label2=new JLabel("Player 2");
      JLabel label3 = new JLabel("Result");
	  // label명 지정
      
      player1Tf=new JTextField(10);
      player2Tf=new JTextField(10);
      winnerTf = new JTextField(10);
      // 텍스트 필드 만들기
      b1=new JButton("Start Game");
      b2,b3=new JButton("Clear");
      // 버튼 만들기
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
	  //버튼 실행
      
	  panel.add(label1);
      panel.add(label2);
      panel.add(label3);
      panel.add(player1Tf);
      panel.add(player2Tf);
      panel.add(winnerTf);
      panel.add(b1);
      panel.add(b2);   
   }
   
   
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource();
      if (b == b1) {
            b1.setText("Click clear button -->");
            String name1 = player1Tf.getText();
            String name2 = player2Tf.getText();
            //player명 지정
            DiceGame dg = new DiceGame(name1, name2);
            
            dg.play();
            
            player1Tf.setText(player1Tf.getText()+" : "+String.valueOf(dg.getP1().getNum()));
            player2Tf.setText(player2Tf.getText()+" : "+String.valueOf(dg.getP2().getNum()));
            // '이긴 플레이어명 : 결과' 출력 
            winnerTf.setText(dg.score());
         }
      
      else if (b == b2) {
         player1Tf.setText("");
         player2Tf.setText("");
         winnerTf.setText("");
         b1.setText("Replay");
   
      }
   }
   
   public static void main(String[] args) {
      DiceGameGUI dggui = new DiceGameGUI();
      dggui.setDefaultCloseOperation(EXIT_ON_CLOSE);
      dggui.pack();
      dggui.setVisible(true);
   }
}
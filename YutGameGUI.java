package com.sd.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class YutGameGUI extends DiceGameGUI {
   public YutGameGUI() {
	  super();
	  setTitle("The Game Of Yut"); //Title 지정
    }
      ;
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource();
      if (b == b1) {
            b1.setText("Click clear button ->");
			// 게임 두번이상 실행시에 버튼 내용 출력
			// 버튼에 들어갈 내용 지정
            String name1 = player1Tf.getText();
            String name2 = player2Tf.getText();
			// player명 입력하는 칸 만들기
            YutGame yg = new YutGame(name1, name2);
            yg.play();
            player1Tf.setText(player1Tf.getText()+" : "+String.valueOf(yg.getP1().getYut()));
            player2Tf.setText(player2Tf.getText()+" : "+String.valueOf(yg.getP2().getYut()));
            // '이긴 플레이어명 : 결과' 출력 
            winnerTf.setText(yg.score());
			// 승자 이름 출력
         }
      
      else if (b == b2) {
         player1Tf.setText("");
         player2Tf.setText("");
         winnerTf.setText("");
         b1.setText("Replay");
		 // clear버튼 눌렀을때 모두 지워지고 Replay 버튼 생김
      }
   }
   
   public static void main(String[] args) {
      YutGameGUI yggui = new YutGameGUI();
      yggui.setDefaultCloseOperation(EXIT_ON_CLOSE);
      yggui.pack();
      yggui.setVisible(true);
	  yggui.setSize(600,300);
   }
}
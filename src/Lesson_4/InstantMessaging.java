// Программа не работает пока ещё. Обработка событий кнопки вызывает ошибки. Я разбираюсь пока и готовый вариант
// попытаюсь сдать на выходных
//
//
//
package Lesson_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InstantMessaging {

    InstantMessaging() {
        JFrame jfrm = new JFrame("Интернет мессенджер");
        jfrm.setBounds(420, 100, 450,450);
        jfrm.setLayout(null);
        jfrm.setResizable(false);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] name = {"Иванов", "Петров", "Сидоров"};
        JList jlst = new JList<String>(name);
        jlst.setBounds(5, 5, 100, 435);


        JLabel writeField = new JLabel("Многострочноеполе");
        writeField.setBounds(110, 5, 335,380);


        JTextField readField = new JTextField("Текст поля", 25);
        readField.setBounds(110, 385, 290,45);


        JButton jbtSend = new JButton("Send");
        jbtSend.setBounds(400, 385, 45, 45);

//        jbtSend.addActionListener(new ActionListener());   // слушатели кнопки и
        readField.addActionListener(new ActionListener() // текстового поля

        jfrm.add(jbtSend);
        jfrm.add(readField);
        jfrm.add(writeField);
        jfrm.add(jlst);
        jfrm.setVisible(true);
    }

//    void actionPerformed(ActionEvent ae) {       // метод обрабатывает события кнопки и текстового поля
//
//        if (ae.getActionCommand()equals("Send")) {
//            String orgStr = readField.getText();
//            String resStr = "";
//
//            for (int i = orgStr.length() - 1; i > 0; i --)
//                resStr += orgStr.charAt(i);
//            readField.setText(resStr);
//        } else jlabContents.setText(readField.getText());
//    }


    public static void main(String[] args) {
            new InstantMessaging();
    }
}

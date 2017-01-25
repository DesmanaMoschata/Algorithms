
package app_spoj;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class App_spoj {

    public static void main(String[] args) {
        ButtonFrame frame= new ButtonFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
    
}

class ButtonFrame extends JFrame{
public ButtonFrame(){//конструктор данного класа
setSize(DEFAULT_WIDTH,DEFAULT_HEIGHE);//размеры фрейма
setTitle("Button");//название фрейма
ButtonPanel panel=new ButtonPanel();//создаем панель
add(panel);//добавляем панель на фрейм
}
public static final int DEFAULT_WIDTH=300;
public static final int DEFAULT_HEIGHE=200;
}
class ButtonPanel extends JPanel{//класс отвечающий за фрейм
public ButtonPanel(){ //конструктор панели
JButton yellowButton=new JButton("yellow");//создаем кнопки(в качестве параметра текст отображаемы на кнопке)
JButton blueButton=new JButton("blue");
JButton redButton=new JButton("red");
add(yellowButton);//добавляем кнопки на панель
add(blueButton);
add(redButton);
ColorAction yellowAction=new ColorAction(Color.yellow);//создаем событие для каждого цвета(параметр-цвет)
ColorAction blueAction=new ColorAction(Color.blue);
ColorAction redAction=new ColorAction(Color.red);
yellowButton.addActionListener(yellowAction);//передаем каждое событие соответствующей кнопке
blueButton.addActionListener(blueAction);
redButton.addActionListener(redAction);
}
private class ColorAction implements ActionListener{//реализуем интерфейс отвечающий за события
public ColorAction(Color c){//конструктор получает цвет в качестве параметра
backgroundColor=c;
}
public void actionPerformed(ActionEvent event){//реакция на нажатие кнопки-смена цвета панели
setBackground(backgroundColor);
}
private Color backgroundColor;
}
}
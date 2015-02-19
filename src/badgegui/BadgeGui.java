/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Chris Martin and Maggie Shipley

package badgegui;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author cwm24
 */
public class BadgeGui {

    private final MainFrame frame = new MainFrame();
    private static Parameters p;
    Map<String, Color> colors = new HashMap();
    Map<String, Integer> fonts = new HashMap();
    Color color;
    Color bgColor;
    /**
     * @param args the command line arguments
     */
       
    public BadgeGui(){
        
        p = new Parameters();
        
        colors.put("blue", Color.blue);
        colors.put("black", Color.black);
        colors.put("cyan", Color.cyan);
        colors.put("darkGray", Color.darkGray);
        colors.put("gray", Color.gray);
        colors.put("green", Color.green);
        colors.put("lightGray", Color.lightGray);
        colors.put("magenta", Color.magenta);
        colors.put("orange", Color.orange);
        colors.put("pink", Color.pink);
        colors.put("red", Color.red);
        colors.put("white", Color.white);
        colors.put("yellow", Color.yellow);

        fonts.put("Plain", Font.PLAIN);
        fonts.put("Bold", Font.BOLD);
        fonts.put("Italic", Font.ITALIC);
        fonts.put("Bold Italic", Font.BOLD+Font.ITALIC);
               
        frame.addColorActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                draw();
            }
        });
        
        frame.addBgColorActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                draw();
            }
        });
        
        frame.addShapeActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                draw();
            }
        });
        
        frame.addFontActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                draw();
            }
        });
        
        frame.addNameListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                draw();
            }
        });
        
        frame.addNumberListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                draw();
            }

            @Override
            public void focusLost(FocusEvent e) {
                draw();
            }
            
        });
       

    }

    public void draw(){
        p.setColor(colors.get(frame.getShapeColor()));
        p.setBgcolor(colors.get(frame.getBgColor()));
        p.setShape(frame.getShapeText());
        p.setStringX(frame.getShapeWidth());
        p.setStringY(frame.getShapeHeight());
        p.setFtstyle(fonts.get(frame.getFontText()));
        p.setFtsizeString(frame.getFontSize());
        p.setName(frame.getName());

        frame.draw(p);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        BadgeGui app = new BadgeGui();
        app.frame.setVisible(true);

        p.setBgcolor(Color.BLACK);
        p.setColor(Color.CYAN);
        p.setFtsizeString("14");
        p.setShape("Rectangle");
        p.setFtstyle(Font.PLAIN);
        p.setStringX("175");
        p.setStringY("100");
        p.setName("Default");
        try{
            Thread.sleep(500);
            app.frame.draw(p);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    
}

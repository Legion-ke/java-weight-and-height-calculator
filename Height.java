import javax.swing.*;

public class Height {
    public static void main(String[] args){
        String height = JOptionPane.showInputDialog("Enter Height(cm):  ");
        double height1 = Integer.parseInt(height);
        double meters = height1*0.01;


        String weight = JOptionPane.showInputDialog("Enter weight(kg):  ");
        int weight1 = Integer.parseInt(weight);
        int pounds = 2*weight1;
        JOptionPane.showMessageDialog(null,"You're "+meters+"  meters tall","Height in meters",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"You weigh "+pounds+" pounds","weight in pounds",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"You weigh "+pounds+" pounds" +" and "+" "+meters+" meters tall","weight in pounds & Height in feet",JOptionPane.PLAIN_MESSAGE);







    }
}

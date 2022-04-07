    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;
    import java.util.Random;

    public class PasswordGenerator implements ActionListener
    {
        private static JLabel label;
        private static JPasswordField passTextBox;
        private static JButton generateBtn;
        private static JLabel instructions;
        private static JLabel np;
        private static JLabel np1;
        private static JLabel np2;
        private static JLabel np3;
        private static ArrayList<String> passItems = new ArrayList<>();
        private static ArrayList<Character> charItems = new ArrayList<>();


        public static void main(String[] args)
        {

            //add words to passItems (Can ask user to enter favorites, etc if you want)
            //simple library of 15 (0-14)
            passItems.add("Whale");
            passItems.add("Giraffe");
            passItems.add("Ferrari");
            passItems.add("Pyzel");
            passItems.add("Sand");
            passItems.add("Snow");
            passItems.add("Boy");
            passItems.add("Girl");
            passItems.add("What");
            passItems.add("Mac");
            passItems.add("Kodak");
            passItems.add("Orion");
            passItems.add("Toyota");
            passItems.add("Turtle");
            passItems.add("Track");

            //arr list special chars 10 (0-9)
            charItems.add('!');
            charItems.add('?');
            charItems.add('@');
            charItems.add('+');
            charItems.add('*');
            charItems.add('%');
            charItems.add('^');
            charItems.add('#');
            charItems.add('&');
            charItems.add('-');

           JFrame frame = new JFrame();
           JPanel panel = new JPanel();
           frame.setSize(550,250);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           frame.add(panel);
           panel.setLayout(null);

           instructions = new JLabel("Must be at least 6 characters and no more than 20.");
            instructions.setBounds(100,5,550,25);
            panel.add(instructions);


           label = new JLabel("Current Password");
           label.setBounds(90,40,125,25);
           panel.add(label);

           passTextBox = new JPasswordField();
           passTextBox.setBounds(220,40,220,25);
           panel.add(passTextBox);

           generateBtn = new JButton("Generate Password");
           generateBtn.setBounds(200,80,175,30);
           generateBtn.addActionListener(new PasswordGenerator());
           panel.add(generateBtn);

           np = new JLabel("");
           np.setBounds(225,110,125,25);
            Font f = label. getFont();
            np. setFont(f. deriveFont(f. getStyle() | Font. BOLD));
           panel.add(np);

            np1 = new JLabel("");
            np1.setBounds(225,130,185,25);
            panel.add(np1);

            np2 = new JLabel("");
            np2.setBounds(225,150,185,25);
            panel.add(np2);

            np3 = new JLabel("");
            np3.setBounds(225,170,185,25);
            panel.add(np3);


           frame.setVisible(true);

        } //end main method


        @Override
        public void actionPerformed(ActionEvent e)
        {
            String pass = passTextBox.getText();
            Random rand = new Random();

            if (pass.length() > 20)
            {
                np.setText("Input is too long!");
                np1.setText("");
                np2.setText("");
                np3.setText("");
                return;
            } //end if
            else if(pass.length() < 6)
            {
                np.setText("Input is too short!");
                np1.setText("");
                np2.setText("");
                np3.setText("");
                return;
            } //end else if
            else if (pass.length() <= 20 && pass.length() > 10)
            {
                np.setText("New Passwords:");

                String newPass1 = pass.substring(0,6);
                String newPass2 = pass.substring(0,7);
                String newPass3 = pass.substring(0,4);

                char toAdd = charItems.get(rand.nextInt(10));
                String charTest = Character.toString(toAdd);
                newPass1 = newPass1.concat(charTest);
                toAdd = charItems.get(rand.nextInt(10));
                charTest = Character.toString(toAdd);
                newPass2 = charTest.concat(newPass2);
                toAdd = charItems.get(rand.nextInt(10));
                charTest = Character.toString(toAdd);
                newPass3 = newPass3.concat(charTest);

                String passI = passItems.get(rand.nextInt(15));
                newPass1 = newPass1.concat(passI);
                passI = passItems.get(rand.nextInt(15));
                newPass2 = passI.concat(newPass2);
                passI = passItems.get(rand.nextInt(15));
                newPass3 = passI.concat(newPass3);

                for (int i = 0; i < 4; i++)
                {
                    int num = rand.nextInt(10);
                    String toInt = Integer.toString(num);
                    newPass1 = newPass1.concat(toInt);
                    num = rand.nextInt(10);
                    toInt = Integer.toString(num);
                    newPass2 = toInt.concat(newPass2);
                    num = rand.nextInt(10);
                    toInt = Integer.toString(num);
                    newPass3 = newPass3.concat(toInt);

                }

                np1.setText("1.) " + newPass1);
                np2.setText("2.) " + newPass2);
                np3.setText("3.) " + newPass3);

                return;
            } //end else if
            else
            {
                np.setText("New Passwords:");

                String newPass1 = pass.substring(0,3);
                String newPass2 = pass.substring(0,5);
                String newPass3 = pass.substring(0,4);

                char toAdd = charItems.get(rand.nextInt(10));
                String charTest = Character.toString(toAdd);
                newPass1 = newPass1.concat(charTest);
                toAdd = charItems.get(rand.nextInt(10));
                charTest = Character.toString(toAdd);
                newPass2 = charTest.concat(newPass2);
                toAdd = charItems.get(rand.nextInt(10));
                charTest = Character.toString(toAdd);
                newPass3 = newPass3.concat(charTest);

                String passI = passItems.get(rand.nextInt(15));
                newPass1 = newPass1.concat(passI);
                passI = passItems.get(rand.nextInt(15));
                newPass2 = passI.concat(newPass2);
                passI = passItems.get(rand.nextInt(15));
                newPass3 = passI.concat(newPass3);

                for (int i = 0; i < 6; i++)
                {
                    int num = rand.nextInt(10);
                    String toInt = Integer.toString(num);
                    newPass1 = newPass1.concat(toInt);
                    num = rand.nextInt(10);
                    toInt = Integer.toString(num);
                    newPass2 = toInt.concat(newPass2);
                    num = rand.nextInt(10);
                    toInt = Integer.toString(num);
                    newPass3 = newPass3.concat(toInt);

                }

                np1.setText("1.) " + newPass1);
                np2.setText("2.) " + newPass2);
                np3.setText("3.) " + newPass3);

                return;

            } //end else


        } //end action method


    } //end of class

package q;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItem extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3];
    private String[] names = {"망고", "용과", "스타푸르트"};
    private int[] prices = {4000, 5000, 20000};
    private JLabel sumLabel;
    private int sum = 0;

    public CheckBoxItem() {
        setTitle("checkbox ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("망고 4000원, 용과 5000원, 스타푸르트 20000원"));

        // 체크박스 생성 및 리스너 등록
        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox cb = (JCheckBox)e.getItem();
                int index = -1;
                for (int i = 0; i < fruits.length; i++) {
                    if (cb == fruits[i]) index = i;
                }
                if (e.getStateChange() == ItemEvent.SELECTED)
                    sum += prices[index];
                else
                    sum -= prices[index];
                sumLabel.setText("현재 합계: " + sum + "원");
            }
        };

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].addItemListener(listener);
            c.add(fruits[i]);
        }

        sumLabel = new JLabel("현재 합계: 0원");
        c.add(sumLabel);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxItem();
    }
}

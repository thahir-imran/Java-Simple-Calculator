import javax.swing.JOptionPane;

public class simpleCalV7 {
    public static void main(String[] args) {
        while (true) {
            String opcode = JOptionPane.showInputDialog(
                    "Select Operation\n\n1 for Addition(+)\n2 for Subtraction(-)\n3 for Multiplication(X)\n4 for Division(/)\n5 for Remainder(%)");

            int op = Integer.parseInt(opcode);
            if (op == 0)
                System.exit(0);

            String num1 = JOptionPane.showInputDialog("Enter Number 1: ");
            String num2 = JOptionPane.showInputDialog("Enter Number 2: ");

            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);

            CalV1 c1 = new CalV1(n1, n2);

            if (op == 1)
                c1.showSum();
            if (op == 2)
                c1.showSub();
            if (op == 3)
                c1.showMul();
            if (op == 4)
                c1.showDiv();
            if (op == 5)
                c1.showRem();

        }
    }
}

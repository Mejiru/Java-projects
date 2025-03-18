import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class StackSim extends JFrame {
    private JButton pushButton;
    private JButton peekButton;
    private JButton popButton;
    private JButton clearButton;
    private JPanel mainPanel;
    private JTextField inputField;
    private JTextArea stackArea;
    private Stack<Integer> stack;

    public StackSim() {
        initializeComponents();
        setupListeners();
        stack = new Stack<>();

        setTitle("Stack GUI Simulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    private void initializeComponents() {
        mainPanel = new JPanel(new BorderLayout());

        stackArea = new JTextArea(10, 15);
        stackArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(stackArea);

        JPanel inputPanel = new JPanel();
        inputField = new JTextField(10);
        pushButton = new JButton("Push");
        popButton = new JButton("Pop");
        peekButton = new JButton("Peek");
        clearButton = new JButton("Clear Stack");

        inputPanel.add(new JLabel("Enter value:"));
        inputPanel.add(inputField);
        inputPanel.add(pushButton);
        inputPanel.add(popButton);
        inputPanel.add(peekButton);

        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(inputPanel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(clearButton);
        mainPanel.add(buttonPanel, BorderLayout.NORTH);

        setContentPane(mainPanel);
    }

    private void setupListeners() {
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputField.getText());
                    stack.push(value);
                    updateStackArea();
                    inputField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(StackSim.this, "Please enter a valid integer.");
                }
            }
        });

        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty()) {
                    int poppedValue = stack.pop();
                    updateStackArea();
                    JOptionPane.showMessageDialog(StackSim.this, "Popped value: " + poppedValue);
                } else {
                    JOptionPane.showMessageDialog(StackSim.this, "Stack is empty, cannot pop.");
                }
            }
        });

        peekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty()) {
                    int top = stack.peek();
                    JOptionPane.showMessageDialog(StackSim.this, "Top of the stack: " + top);
                } else {
                    JOptionPane.showMessageDialog(StackSim.this, "Stack is empty, cannot peek.");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearStack();
            }
        });
    }

    private void clearStack() {
        stack.clear();
        updateStackArea();
    }

    private void updateStackArea() {
        StringBuilder sb = new StringBuilder();
        for (int i = stack.size() - 1; i >= 0; i--) {
            sb.append(stack.elementAt(i)).append("\n");
        }
        stackArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        StackSim stackSim = new StackSim();
    }
}
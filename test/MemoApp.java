import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoApp {

    public static void main(String[] args) {
        Frame frame = new Frame("메모 앱");
        frame.setBounds(300, 500, 300, 500);
        frame.setLayout(new BorderLayout());

        TextField textField = new TextField(20);
        Button confirmButton = new Button("확인");
        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        Panel topPanel = new Panel(new FlowLayout());
        topPanel.add(textField);
        topPanel.add(confirmButton);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(textArea, BorderLayout.CENTER);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText().trim();
                if (text.isEmpty()) {
                    return;
                }

                if (textArea.getText().isEmpty()) {
                    textArea.setText(text);
                } else {
                    textArea.append("\n" + text);
                }

                textField.setText("");
                textField.requestFocus();
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmButton.dispatchEvent(
                        new ActionEvent(confirmButton, ActionEvent.ACTION_PERFORMED, "confirm"));
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}

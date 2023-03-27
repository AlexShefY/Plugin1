package com.example.demo1;

import com.intellij.openapi.ui.DialogWrapper;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.jetbrains.annotations.Nullable;

public class ModalWindow extends DialogWrapper {

  protected ModalWindow() {
    super(true);
    setTitle("Links");
    init();
  }

  @Override
  protected @Nullable JComponent createCenterPanel() {

    JPanel dialogPanel = new JPanel();

    JButton button1 = new JButton("Google");
    JButton button2 = new JButton("Github");

    button1.addActionListener(e ->
        new WebWindow("http://google.com").showAndGet()
    );
    button2.addActionListener(e ->
        new WebWindow("http://github.com").showAndGet()
    );

    dialogPanel.add(button1);
    dialogPanel.add(button2);

    return dialogPanel;
  }
}
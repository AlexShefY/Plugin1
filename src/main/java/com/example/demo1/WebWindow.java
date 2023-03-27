package com.example.demo1;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.jcef.JBCefBrowser;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.jetbrains.annotations.Nullable;

public class WebWindow extends DialogWrapper {

  String url;

  WebWindow(String url) {
    super(true);
    setTitle("Page");
    this.url = url;
    init();
  }

  @Override
  protected @Nullable JComponent createCenterPanel() {

    JPanel webBrowserPanel = new JPanel();

    JBCefBrowser myBrowser = new JBCefBrowser(url);
    webBrowserPanel.add(myBrowser.getComponent());

    return webBrowserPanel;
  }
}
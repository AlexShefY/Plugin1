package com.example.demo1;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class ActionButtons extends AnAction {

  ModalWindow window;

  public ActionButtons() {
    super();
  }

  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    window = new ModalWindow();
    window.showAndGet();
  }

  @Override
  public void update(@NotNull AnActionEvent event) {
    // Set the availability based on whether a project is open
    Project currentProject = event.getProject();
    event.getPresentation().setEnabledAndVisible(currentProject != null);
  }
}

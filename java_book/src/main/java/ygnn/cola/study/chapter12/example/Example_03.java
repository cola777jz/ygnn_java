package ygnn.cola.study.chapter12.example;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;

/**
 * @author Cola0817
 * @name Example_03
 * @date 2023/9/27 22:51
 * @since 1.0.0
 */
public class Example_03 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Please choose file");
/*        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()){
                    return true;
                }
                int lastIndexOf = f.getName().lastIndexOf(".");
                String extension = null;
                if (lastIndexOf > 0 && lastIndexOf < f.getName().length() - 1){
                    extension = f.getName().substring(lastIndexOf + 1).toLowerCase();
                }
                return extension != null && extension.equals("exe");
            }

            @Override
            public String getDescription() {
                return "EXE Files (*.exe)"; // 描述可选择的文件类型
            }
        });*/
        chooser.setFileFilter(new FileNameExtensionFilter("EXE2 Files (*.exe)","exe"));

        int result = chooser.showDialog(null,"choose");
        try {
            Runtime runtime = Runtime.getRuntime();
            if (result == JFileChooser.APPROVE_OPTION){
                File file = chooser.getSelectedFile();
                runtime.exec(file.getAbsolutePath());
                JOptionPane.showMessageDialog(null,file.getName() + "启动 !","run: ",JOptionPane.INFORMATION_MESSAGE);
            }else {
                System.out.println("user shutdown choose");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

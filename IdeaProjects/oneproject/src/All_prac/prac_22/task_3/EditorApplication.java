package All_prac.prac_22.task_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorApplication {
    public static void main(String[] args) {
        JFrame editorFrame = new JFrame("Editor");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuImageItem = new JMenuItem("New Image");
        JMenuItem newMenuTextItem = new JMenuItem("New Text");
        JMenuItem newMenuMusicItem = new JMenuItem("New Music");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        //ICreateDocument documentFactory = (ICreateDocument) new CreateDocument();
        IDocument currentDocument = null;//= (IDocument) new CreateDocument().getDocument("Text");

        newMenuTextItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IDocument currentDocument= (IDocument) new CreateDocument().getDocument("Text");
                currentDocument.open();
            }
        });

        newMenuMusicItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final IDocument currentDocument= (IDocument) new CreateDocument().getDocument("Music");
                currentDocument.open();
            }
        });

        newMenuImageItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final IDocument currentDocument= (IDocument) new CreateDocument().getDocument("Image");
                currentDocument.open();
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //currentDocument = documentFactory.createOpen();
                currentDocument.open();
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentDocument != null) {
                    currentDocument.save();
                }
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(newMenuImageItem);
        fileMenu.add(newMenuMusicItem);
        fileMenu.add(newMenuTextItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        editorFrame.setJMenuBar(menuBar);

        editorFrame.setSize(400, 300);
        editorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editorFrame.setVisible(true);
    }
}
package app;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;

public class DefinitionViewer extends JPanel {
	
	private Words winWord;
    private GridBagConstraints gbc;
    private int defFieldCount = 0;
    
    private JTextField addWord;
    private ArrayList<JTextField> defs = new ArrayList<JTextField>();
    private ArrayList<JComboBox> POSs = new ArrayList<JComboBox>();
    private JLabel synsTitle;
    private JTextField synsWord;
    private JLabel synsInstructions;
    private JLabel antsTitle;
    private JTextField antsWord;
    private JLabel antsInstructions;
    private JButton submit;
    private JButton plusButton;
    
    private String savedSyns;
    private String savedAnts;
	
	public DefinitionViewer() {
		JPanel definitionWindow = new JPanel();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(definitionWindow), BorderLayout.CENTER);
	}
	
	public DefinitionViewer(String tbWord, Word[] tbWords) {
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        winWord = null;
        if (Arrays.asList(Utils.parseWords(tbWords)).contains(tbWord)) {
            winWord = getWordFromString(tbWord, tbWords);
            showWord();
        } else if (tbWord == null) {
            showDefault();
        } else if (tbWord.equals("Add")) {
            showAdd();
        } else {
            showDefault();
        }
    }
	
	private void showDefault() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        JLabel welcome = new JLabel();
        welcome.setText("WELCOME");
        welcome.setFont(new Font(getFont().getName(), getFont().getStyle(), 50));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(welcome, gbc);
        
        JLabel message = new JLabel("Welcome to the graphical dictionary. You can look up words, add words, delete words, and sort words. Please rate us 5 stars on Application Store\u2122.");
        message.setFont(new Font(getFont().getName(), getFont().getStyle(), 15));
        gbc.gridy = 1;
        add(message, gbc);
    }

	private void showWord() {
        JLabel word = new JLabel();
        word.setText(winWord.getWord().toUpperCase());
        word.setFont(new Font(getFont().getName(), getFont().getStyle(), 50));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(word, gbc);
        showAnts(showSyns(showDefs()));
        setVisible(true);
    }
	
	private int showDefs() {
        JLabel title = new JLabel();
        Definition[] defs = winWord.getDefinitions();
        if (defs.length == 1) {
            title.setText("Definition");
        } else {
            title.setText("Definitions");
        }
        title.setFont(new Font(getFont().getName(), getFont().getStyle(), 30));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(title, gbc);
        
        for (int i = 0; i < defs.length * 2; i++) {
            if (defs[i / 2] != null) {
                String textPOS = ((i / 2) + 1) + ". " + winWord.getWord() + " (" + defs[i / 2].getPart() + ")";
                String textDef = "          " + defs[i / 2].getDefinition();
                
                JLabel pos = new JLabel(textPOS);
                pos.setFont(new Font(getFont().getName(), getFont().getStyle(), 15));
                gbc.gridx = 0;
                gbc.gridy = i + 2;
                add(pos, gbc);
                
                i++;
                JLabel def = new JLabel(textDef);
                def.setFont(new Font(getFont().getName(), getFont().getStyle(), 15));
                gbc.gridx = 0;
                gbc.gridy = i + 2;
                add(def, gbc);
            }
        }
        return ((defs.length * 2) + 2);
    }
	
	private Word showAdd() {
        savedSyns = null;
        savedAnts = null;
        JLabel title = new JLabel();
        title.setText("ADD");
        title.setFont(new Font(getFont().getName(), getFont().getStyle(), 50));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 0;
        add(title, gbc);
        
        JLabel wordTitle = new JLabel();
        wordTitle.setText("Word");
        wordTitle.setFont(new Font(getFont().getName(), getFont().getStyle(), 30));
        gbc.gridy = 2;
        add(wordTitle, gbc);
        
        addWord = new JTextField("");
        addWord.setFont(new Font(getFont().getName(), getFont().getStyle(), 15));
        gbc.gridy = 3;
        add(addWord, gbc);
        
        showAddDef();
        showAddSyn();
        showAddAnt();
        showAddSubmit();
        
        return winWord;
    }
	
	private void showAddDef() {
        JLabel defTitle = new JLabel();
        defTitle.setText("Definitions");
        defTitle.setFont(new Font(getFont().getName(), getFont().getStyle(), 30));
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(defTitle, gbc);
                   
        plusButton = new JButton("+");
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(plusButton, gbc);
        
        addDefFeild();
    }
	
}

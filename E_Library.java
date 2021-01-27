/*
THIS PROGRAM WAS CODED BY 
YVAN LOWELL T. AQUINO AND
RUTH SAMANTHA C. AMPONIN 
OF 11-GATES
*/

//THIS IS IN COMPLIANCE TO THE 
//PROJECTS/FINALS REQUIREMENTS
//IN CHS (PASSED TO SIR JOSH SOTTO)

//PROJECT STARTED AT MARCH 10, 2020
//PROJECT FINISHED AT MARCH 12, 2020

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ClassCastException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

class E_Library {
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(E_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

		Login();
	}

	public static void Login() {
        Font font1, font2;
       	try {
       		font1 = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("fonts/angelina.ttf")).deriveFont(100f);
       		font2 = new Font("Century Gothic", Font.PLAIN, 18);
       		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
       		ge.registerFont(font1);
       	} catch (IOException | FontFormatException e) {
       		System.out.println("IOException | FontFormatException error!");
       		font1 = new Font("Century Gothic", Font.BOLD, 100);
       		font2 = new Font("Century Gothic", Font.PLAIN, 18);
       		e.printStackTrace();
       	}

		JFrame loginFrame = new JFrame("Login");

		JLabel title = new JLabel();
		title.setText("Welcome!");
		title.setFont(font1);
		title.setBounds(330, 60, 260, 60);

		JLabel usernameLabel = new JLabel();
		usernameLabel.setText("Username: ");
		usernameLabel.setFont(font2);
		usernameLabel.setBounds(300, 170, 100, 25);

		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Password: ");
		passwordLabel.setFont(font2);
		passwordLabel.setBounds(308, 210, 100, 25);

		JTextField usernameTField = new JTextField();
		usernameTField.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		usernameTField.setBounds(410, 172, 160, 20);
		JPasswordField passwordPField = new JPasswordField();
		passwordPField.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		passwordPField.setBounds(410, 212, 160, 20);

		JButton enterButton = new JButton("Login");
		enterButton.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		enterButton.setOpaque(false);
		enterButton.setFocusPainted(false);
		enterButton.setBackground(new Color(220, 220, 220));
		enterButton.setBounds(432, 260, 120, 30);


		enterButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				String usernameValue = usernameTField.getText();
				String passwordValue = passwordPField.getText();

				String username = "admin";
				String password = "admin123";
				if (usernameValue.equals(username) & passwordValue.equals(password)){
					JOptionPane.showMessageDialog(null, "Access Granted!", 
						"Welcome", JOptionPane.INFORMATION_MESSAGE);
					loginFrame.setVisible(false);
					MainFrame();
				} else if (usernameValue.equals("") | passwordValue.equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill in the text fields.", 
						"Access Denied!", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Unable to login due to incorrect username and password.", 
						"Access Denied!", JOptionPane.ERROR_MESSAGE);
					usernameTField.setText("");
					passwordPField.setText("");
				} 
			}
		});

		JLabel background = new JLabel(new ImageIcon("img/login_bg.jpg"));
		background.setBounds(0, 0, 637, 438);
		

		loginFrame.setLayout(null);
		loginFrame.getContentPane().add(title);
		loginFrame.getContentPane().add(usernameLabel);
		loginFrame.getContentPane().add(passwordLabel);
		loginFrame.getContentPane().add(usernameTField);
		loginFrame.getContentPane().add(passwordPField);
		loginFrame.getContentPane().add(enterButton);
		loginFrame.getContentPane().add(background);

		loginFrame.setSize(637, 438);
		loginFrame.setResizable(false);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println("Username: admin");
		System.out.println("Password: admin123");

		loginFrame.setVisible(true);
	}
	public static void MainFrame(){
		Font titleFont, font1, font2, font3, font4;
       	try {
       		titleFont = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("fonts/bebas_kai.otf")).deriveFont(Font.BOLD, 60f);
       		font1 = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("fonts/traveling_typewriter.ttf")).deriveFont(Font.BOLD, 14f);
       		font2 = new Font("Century Gothic", Font.PLAIN, 14);
       		font3 = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("fonts/bebas_kai.otf")).deriveFont(14f);
       		font4 = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("fonts/bebas_kai.otf")).deriveFont(16f);
       		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
       		ge.registerFont(font1);
       	} catch (IOException | FontFormatException e) {
       		System.out.println("IOException | FontFormatException error!");
       		titleFont = new Font("Century Gothic", Font.BOLD, 30);
       		font1 = new Font("Century Gothic", Font.BOLD, 14);
       		font2 = new Font("Century Gothic", Font.PLAIN, 14);
       		font3 = new Font("Century Gothic", Font.BOLD, 14);
       		font4 = new Font("Century Gothic", Font.BOLD, 16);
       		e.printStackTrace();
       	}

		JFrame mainFrame = new JFrame("E-Library");
		

		JLabel background = new JLabel(new ImageIcon("img/background.jpg"));
		background.setBounds(0, 0, 950, 633);

		JLabel mainFrameTitle = new JLabel("E-Library");
		mainFrameTitle.setFont(titleFont);
		mainFrameTitle.setForeground(Color.WHITE);
		mainFrameTitle.setBounds(45, 145, 220, 50);

		JPanel tablePanel = new JPanel();
		
		TableModel tableModel = new DefaultTableModel(){
			public boolean isCellEditable(int row, int column)
			{
				return false;
			}
		};
		JTable mainTable = new JTable(tableModel);

		mainTable.getTableHeader().setReorderingAllowed(false);
		mainTable.getTableHeader().setResizingAllowed(false);

		JScrollPane tableSPane = new JScrollPane(mainTable);
		tableSPane.setBounds(400, 145, 480, 340);

		Border blackBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);

		mainTable.getTableHeader().setFont(font3);
		mainTable.getTableHeader().setBackground(new Color(40, 40, 40));
		mainTable.setBorder(blackBorder);
		mainTable.setShowGrid(true);
		mainTable.setGridColor(Color.BLACK);
		mainTable.setOpaque(false);

		tableSPane.setOpaque(false);
		tableSPane.getViewport().setOpaque(false);
		tableSPane.setBorder(blackBorder);

		JLabel libIDLabel = new JLabel("Library ID:");
		libIDLabel.setBounds(70, 230, 150, 20);
		libIDLabel.setFont(font1);
		libIDLabel.setForeground(Color.WHITE);
		JLabel nameLabel = new JLabel("Full Name:");
		nameLabel.setBounds(70, 260, 150, 20);
		nameLabel.setFont(font1);
		nameLabel.setForeground(Color.WHITE);
		JLabel sectionLabel = new JLabel("Section:");
		sectionLabel.setBounds(70, 290, 150, 20);
		sectionLabel.setFont(font1);
		sectionLabel.setForeground(Color.WHITE);
		JLabel dateLabel = new JLabel("Date:");
		dateLabel.setBounds(70, 320, 150, 20);
		dateLabel.setFont(font1);
		dateLabel.setForeground(Color.WHITE);
		JLabel bkTitleLabel = new JLabel("Book Title:");
		bkTitleLabel.setBounds(70, 350, 150, 20);
		bkTitleLabel.setFont(font1);
		bkTitleLabel.setForeground(Color.WHITE);
		JLabel bkIDLabel = new JLabel("Book ID:");
		bkIDLabel.setBounds(70, 380, 150, 20);
		bkIDLabel.setFont(font1);
		bkIDLabel.setForeground(Color.WHITE);
		JLabel bkAuthorLabel = new JLabel("Book Author:");
		bkAuthorLabel.setBounds(70, 410, 150, 20);
		bkAuthorLabel.setFont(font1);
		bkAuthorLabel.setForeground(Color.WHITE);

		Border blackBottomBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(211, 211, 211));
		JTextField libIDTField = new JTextField();
		libIDTField.setFont(font2);
		libIDTField.setForeground(Color.WHITE);
		libIDTField.setOpaque(false);
		libIDTField.setBounds(165, 228, 150, 20);
		libIDTField.setBorder(blackBottomBorder);
		JTextField nameTField = new JTextField();
		nameTField.setFont(font2);
		nameTField.setForeground(Color.WHITE);
		nameTField.setOpaque(false);
		nameTField.setBounds(165, 258, 150, 20);
		nameTField.setBorder(blackBottomBorder);
		JTextField sectionTField = new JTextField();
		sectionTField.setFont(font2);
		sectionTField.setForeground(Color.WHITE);
		sectionTField.setOpaque(false);
		sectionTField.setBounds(165, 288, 150, 20);
		sectionTField.setBorder(blackBottomBorder);
		JTextField dateTField = new JTextField();
		dateTField.setFont(font2);
		dateTField.setForeground(Color.WHITE);
		dateTField.setOpaque(false);
		dateTField.setBounds(165, 318, 150, 20);
		dateTField.setBorder(blackBottomBorder);
		JTextField bkTitleTField = new JTextField();
		bkTitleTField.setFont(font2);
		bkTitleTField.setForeground(Color.WHITE);
		bkTitleTField.setOpaque(false);
		bkTitleTField.setBounds(165, 348, 150, 20);
		bkTitleTField.setBorder(blackBottomBorder);
		JTextField bkIDTField = new JTextField();
		bkIDTField.setFont(font2);
		bkIDTField.setForeground(Color.WHITE);
		bkIDTField.setOpaque(false);
		bkIDTField.setBounds(165, 378, 150, 20);
		bkIDTField.setBorder(blackBottomBorder);
		JTextField bkAuthorTField = new JTextField();
		bkAuthorTField.setFont(font2);
		bkAuthorTField.setForeground(Color.WHITE);
		bkAuthorTField.setOpaque(false);
		bkAuthorTField.setBounds(165, 408, 150, 20);
		bkAuthorTField.setBorder(blackBottomBorder);

		JButton submitButton = new JButton("Submit");
		submitButton.setFont(font4);
		submitButton.setBorderPainted(false);
		submitButton.setBounds(240, 450, 100, 40);

		String filePath = "datafiles/data.txt";
        File file = new File(filePath);

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));

            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)mainTable.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            } 

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
            
        } 

		submitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				String libIDValue = libIDTField.getText().replace(",", "");
				String nameValue = nameTField.getText().replace(",", "");
				String sectionValue = sectionTField.getText().replace(",", "");
				String dateValue = dateTField.getText().replace(",", "");
				String bkTitleValue = bkTitleTField.getText().replace(",", "");
				String bkIDValue = bkIDTField.getText().replace(",", "");
				String bkAuthorValue = bkAuthorTField.getText().replace(",", "");

				System.out.println(libIDValue);
				System.out.println(nameValue);
				System.out.println(sectionValue);
				System.out.println(dateValue);
				System.out.println(bkTitleValue);
				System.out.println(bkIDValue);
				System.out.println(bkAuthorValue);

				if (libIDValue.equals("") | nameValue.equals("") | sectionValue.equals("") | dateValue.equals("") | 
					bkTitleValue.equals("") | bkIDValue.equals("") | bkAuthorValue.equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill in the text fields.", 
						"Submission Denied!", JOptionPane.ERROR_MESSAGE);
				} else {

					PrintWriter pw = null;
					
					String dataset = libIDValue + "," + nameValue + "," + sectionValue + "," + 
						dateValue + "," + bkTitleValue + "," + bkIDValue + "," + bkAuthorValue;

					try {
						File file = new File("datafiles/data.txt");
						
						FileWriter fw = new FileWriter(file, true);
						pw = new PrintWriter(fw);
						System.out.println(dataset);
						pw.println(dataset);

						BufferedReader br = new BufferedReader(new FileReader(file));
						DefaultTableModel model = (DefaultTableModel)mainTable.getModel();

						Object[] tableLines = br.lines().toArray();
	            
			            for(int i = 0; i < tableLines.length; i++)
			            {
			            	if (i == tableLines.length-1) {
				                String[] dataRow = dataset.split(",");
				                model.addRow(dataRow);
				        	} else {
				        		continue;
				        	}
			            } 
			            br.close();
			            pw.close();
			            fw.close(); 
						
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						if (pw != null) {
							pw.close();
						}
					}
			        pw.close();

				}

				libIDTField.setText("");
				nameTField.setText("");
				sectionTField.setText("");
				dateTField.setText("");
				bkTitleTField.setText("");
				bkIDTField.setText("");
				bkAuthorTField.setText("");
			}
		});

		JTextField removeRowTField = new JTextField();
		removeRowTField.setOpaque(false);
		removeRowTField.setFont(font2);
		removeRowTField.setForeground(Color.WHITE);
		removeRowTField.setBounds(730, 500, 40, 30);

		JButton removeRowButton = new JButton("Remove");
		removeRowButton.setFont(font4);
		removeRowButton.setBorderPainted(false);
		removeRowButton.setBounds(780, 500, 100, 30);

		removeRowButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				String removeRowIndexValue = removeRowTField.getText();
				int index = Integer.parseInt(removeRowIndexValue) - 1;
				if (index <= -1) {
					JOptionPane.showMessageDialog(null, "Please input a number greater than zero.", 
						"Removal Denied!", JOptionPane.ERROR_MESSAGE);
				} else {
					

					DefaultTableModel model = (DefaultTableModel)mainTable.getModel();
					model.removeRow(index);

					File file = new File("datafiles/data.txt");

					File tempFile = new File("datafiles/tempdata.txt");
					try {
						


						BufferedReader br = new BufferedReader(new FileReader(file));

						Object[] tableLines = br.lines().toArray();

						String dataRowRemoved = "";
					    for(int i = 0; i < tableLines.length; i++)
					    {
					        if (i == (index + 1)) {
						        String line = tableLines[i].toString().trim();
						        String[] dataRow = line.split(",");
						        int dataRowIndex = 0;
						        for (String dataRowValue : dataRow) {
						        	dataRowIndex += 1;
						        	dataRowRemoved += dataRowValue;
						        	if (dataRowIndex < 7) {
							        	dataRowRemoved += ",";
							        }
						        	
						        }
						        System.out.println(dataRowRemoved);

						    } else {
						    	continue;
						    }
					    }  
					    br.close();

					    BufferedReader reader = new BufferedReader(new FileReader(file));
					    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

					    String lineToRemove = dataRowRemoved;
					    String currentLine;

					    while((currentLine = reader.readLine()) != null) {
					    	String trimmedLine = currentLine.trim();
					    	if (trimmedLine.equals(lineToRemove)) continue;
					    	writer.write(currentLine + System.getProperty("line.separator"));
					    }
					    writer.close();
					    reader.close();

					    file.delete();
					    boolean success = tempFile.renameTo(file);
					    tempFile.renameTo(file);
					    System.out.println(success);   
					} catch (Exception e) {
						e.printStackTrace();
					}
					removeRowTField.setText("");
				}
			}
		});

		mainFrame.add(mainFrameTitle);		

		mainFrame.add(tableSPane);

		mainFrame.add(libIDLabel);
		mainFrame.add(nameLabel);
		mainFrame.add(sectionLabel);
		mainFrame.add(dateLabel);
		mainFrame.add(bkTitleLabel);
		mainFrame.add(bkIDLabel);
		mainFrame.add(bkAuthorLabel);

		mainFrame.add(libIDTField);
		mainFrame.add(nameTField);
		mainFrame.add(sectionTField);
		mainFrame.add(dateTField);
		mainFrame.add(bkTitleTField);
		mainFrame.add(bkIDTField);
		mainFrame.add(bkAuthorTField);

		mainFrame.add(submitButton);

		mainFrame.add(removeRowTField);
		mainFrame.add(removeRowButton);

		mainFrame.add(background);

		mainTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		int pfWidth = 96;
		mainTable.getColumnModel().getColumn(0).setPreferredWidth(pfWidth - 24);
		mainTable.getColumnModel().getColumn(1).setPreferredWidth(pfWidth + 40);
		mainTable.getColumnModel().getColumn(2).setPreferredWidth(pfWidth - 34);
		mainTable.getColumnModel().getColumn(3).setPreferredWidth(pfWidth);
		mainTable.getColumnModel().getColumn(4).setPreferredWidth(pfWidth + 18);
		mainTable.getColumnModel().getColumn(5).setPreferredWidth(pfWidth);
		mainTable.getColumnModel().getColumn(6).setPreferredWidth(pfWidth);

		mainFrame.setLayout(null);
		mainFrame.setSize(950, 633);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}	
}

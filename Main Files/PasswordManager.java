import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class File extends JFrame implements ActionListener
{
	///////////////////////////////////////////////////////////
	
	CardLayout card;
	
	JPanel card_all;
	
	JPanel card_welcome;
	JLabel welcome_lbl_welcome,welcome_lbl_background;
	JTextField welcome_txt_username;
	JPasswordField welcome_txt_password;
	JButton welcome_btn_submit,welcome_btn_quit;
	
	JPanel card_activity;
	JLabel activity_lbl_background;
	JButton activity_btn_addNew,activity_btn_check,activity_btn_update,activity_btn_delete,activity_btn_export,activity_btn_quit;
	
	JPanel card_addNew;
	JLabel addNew_lbl_topic,addNew_lbl_username,addNew_lbl_password,addNew_lbl_note,addNew_lbl_background;
	JTextField addNew_txt_topic,addNew_txt_username,addNew_txt_password,addNew_txt_note;
	JButton addNew_btn_back,addNew_btn_submit;
	
	JPanel card_check;
	JComboBox check_cmb_topic;
	JButton check_btn_back,check_btn_submit;
	JLabel check_lbl_topic,check_lbl_username,check_lbl_password,check_lbl_note,check_lbl_background;
	JTextField check_txt_username,check_txt_password,check_txt_note;
	
	JPanel card_delete;
	JComboBox delete_cmb_topic;
	JCheckBox delete_chk_username,delete_chk_password,delete_chk_note,delete_chk_topicName;
	JButton delete_btn_back,delete_btn_submit;
	JLabel delete_lbl_topic,delete_lbl_username,delete_lbl_password,delete_lbl_note,delete_lbl_topicName,delete_lbl_background;
	
	JPanel card_update;
	JComboBox update_cmb_topic;
	JButton update_btn_back,update_btn_submit;
	JLabel update_lbl_topic,update_lbl_username,update_lbl_password,update_lbl_note,update_lbl_background;
	JTextField update_txt_username,update_txt_password,update_txt_note;
	
	Color lightBlue,white;
	
	Font f40,f20;
	
	///////////////////////////////////////////////////////////
	
	public File()
	{
		card = new CardLayout();
		
		card_all = new JPanel();
		
		card_delete = new JPanel();
		delete_lbl_topic = new JLabel("Select your Topic");
		delete_cmb_topic = new JComboBox();
		delete_chk_topicName = new JCheckBox();
		delete_lbl_topicName = new JLabel("Topic");
		delete_lbl_username = new JLabel("User Name");
		delete_chk_username = new JCheckBox();
		delete_lbl_password = new JLabel("Password");
		delete_chk_password = new JCheckBox();
		delete_lbl_note = new JLabel("Note");
		delete_chk_note = new JCheckBox();
		delete_btn_back = new JButton("Back");
		delete_btn_submit = new JButton("Submit");
		delete_lbl_background = new JLabel(new ImageIcon(getClass().getResource("4.gif")));
		
		card_welcome = new JPanel();
		welcome_lbl_welcome = new JLabel("Password Manager");
		welcome_btn_submit = new JButton("Submit");
		welcome_btn_quit = new JButton("Quit");
		welcome_txt_username = new JTextField(50);
		welcome_txt_password = new JPasswordField(50);
		welcome_lbl_background = new JLabel(new ImageIcon(getClass().getResource("4.gif")));
		
		card_activity = new JPanel();
		activity_btn_addNew = new JButton("Add New");
		activity_btn_check = new JButton("Check");
		activity_btn_delete = new JButton("Delete");
		activity_btn_export = new JButton("Export");
		activity_btn_update = new JButton("Update");
		activity_btn_quit = new JButton("Quit");
		activity_lbl_background = new JLabel(new ImageIcon(getClass().getResource("4.gif")));
		
		card_addNew = new JPanel();
		addNew_btn_back = new JButton("Back");
		addNew_btn_submit = new JButton("Submit");
		addNew_lbl_note = new JLabel("Note");
		addNew_lbl_password = new JLabel("Password");
		addNew_lbl_topic = new JLabel("Name of the topic");
		addNew_lbl_username = new JLabel("User Name");
		addNew_txt_note = new JTextField();
		addNew_txt_password = new JTextField();
		addNew_txt_topic = new JTextField();
		addNew_txt_username = new JTextField();
		addNew_lbl_background = new JLabel(new ImageIcon(getClass().getResource("4.gif")));
		
		card_check = new JPanel();
		check_lbl_topic = new JLabel("Select the name of the topic");
		check_cmb_topic = new JComboBox();
		check_lbl_username = new JLabel("User Name");
		check_txt_username = new JTextField();
		check_lbl_password = new JLabel("Password");
		check_txt_password = new JTextField();
		check_lbl_note = new JLabel("Note");
		check_txt_note = new JTextField();
		check_btn_back = new JButton("Back");
		check_btn_submit = new JButton("Submit");
		check_lbl_background = new JLabel(new ImageIcon(getClass().getResource("4.gif")));
		
		card_update = new JPanel();
		update_lbl_topic = new JLabel("Select the name of the topic");
		update_cmb_topic = new JComboBox();
		update_lbl_username = new JLabel("User Name");
		update_txt_username = new JTextField();
		update_lbl_password = new JLabel("Password");
		update_txt_password = new JTextField();
		update_lbl_note = new JLabel("Note");
		update_txt_note = new JTextField();
		update_btn_back = new JButton("Back");
		update_btn_submit = new JButton("Submit");
		update_lbl_background = new JLabel(new ImageIcon(getClass().getResource("4.gif")));
		
		f40 = new Font("SansSerif",Font.BOLD,40);
		f20 = new Font("SansSerif",Font.BOLD,20);
		
		lightBlue = new Color(50,147,226);
		white = new Color(255,255,255);
		
		///////////////////////////////////////////////////////////
		
		card_activity.setLayout(null);
		card_welcome.setLayout(null);
		card_addNew.setLayout(null);
		card_check.setLayout(null);
		card_delete.setLayout(null);
		card_update.setLayout(null);
		card_all.setLayout(card);
		
		///////////////////////////////////////////////////////////
		
		add(card_all);
		
		card_all.add(card_welcome,"Welcome");
		card_all.add(card_activity,"Activity");
		card_all.add(card_addNew,"AddNew");
		card_all.add(card_check,"Check");
		card_all.add(card_delete,"Delete");
		card_all.add(card_update,"Update");
		
		card_delete.add(delete_btn_back);
		card_delete.add(delete_btn_submit);
		card_delete.add(delete_chk_topicName);
		card_delete.add(delete_lbl_topicName);
		card_delete.add(delete_chk_note);
		card_delete.add(delete_chk_password);
		card_delete.add(delete_chk_username);
		card_delete.add(delete_cmb_topic);
		card_delete.add(delete_lbl_note);
		card_delete.add(delete_lbl_password);
		card_delete.add(delete_lbl_topic);
		card_delete.add(delete_lbl_username);
		card_delete.add(delete_lbl_background);
		
		card_activity.add(activity_btn_addNew);
		card_activity.add(activity_btn_check);
		card_activity.add(activity_btn_delete);
		card_activity.add(activity_btn_export);
		card_activity.add(activity_btn_update);
		card_activity.add(activity_btn_quit);
		card_activity.add(activity_lbl_background);
		
		card_welcome.add(welcome_btn_quit);
		card_welcome.add(welcome_btn_submit);
		card_welcome.add(welcome_lbl_welcome);
		card_welcome.add(welcome_txt_password);
		card_welcome.add(welcome_txt_username);
		card_welcome.add(welcome_lbl_background);
		
		card_addNew.add(addNew_btn_back);
		card_addNew.add(addNew_btn_submit);
		card_addNew.add(addNew_lbl_note);
		card_addNew.add(addNew_lbl_password);
		card_addNew.add(addNew_lbl_topic);
		card_addNew.add(addNew_lbl_username);
		card_addNew.add(addNew_txt_note);
		card_addNew.add(addNew_txt_password);
		card_addNew.add(addNew_txt_topic);
		card_addNew.add(addNew_txt_username);
		card_addNew.add(addNew_lbl_background);
		
		card_check.add(check_btn_back);
		card_check.add(check_btn_submit);
		card_check.add(check_cmb_topic);
		card_check.add(check_lbl_note);
		card_check.add(check_lbl_password);
		card_check.add(check_lbl_topic);
		card_check.add(check_lbl_username);
		card_check.add(check_txt_note);
		card_check.add(check_txt_username);
		card_check.add(check_txt_password);
		card_check.add(check_lbl_background);
		
		card_update.add(update_btn_back);
		card_update.add(update_btn_submit);
		card_update.add(update_cmb_topic);
		card_update.add(update_lbl_note);
		card_update.add(update_lbl_password);
		card_update.add(update_lbl_topic);
		card_update.add(update_lbl_username);
		card_update.add(update_txt_note);
		card_update.add(update_txt_username);
		card_update.add(update_txt_password);
		card_update.add(update_lbl_background);
		
		///////////////////////////////////////////////////////////
		
		delete_lbl_topic.setBounds(50,0,500,50);
		delete_cmb_topic.setBounds(50,50,350,30);
		delete_lbl_topicName.setBounds(100,100,500,50);
		delete_chk_topicName.setBounds(50,100,30,50);
		delete_lbl_username.setBounds(100,150,500,50);
		delete_chk_username.setBounds(50,150,30,50);
		delete_lbl_password.setBounds(100,200,500,50);
		delete_chk_password.setBounds(50,200,30,50);
		delete_lbl_note.setBounds(100,250,500,50);
		delete_chk_note.setBounds(50,250,30,50);
		delete_btn_back.setBounds(50,400,120,50);
		delete_btn_submit.setBounds(350,400,120,50);
		delete_lbl_background.setBounds(0,0,500,500);
		
		check_lbl_topic.setBounds(50,0,500,50);
		check_cmb_topic.setBounds(50,50,350,30);
		check_lbl_username.setBounds(50,100,500,50);
		check_txt_username.setBounds(50,150,350,30);
		check_lbl_password.setBounds(50,200,500,50);
		check_txt_password.setBounds(50,250,350,30);
		check_lbl_note.setBounds(50,300,500,50);
		check_txt_note.setBounds(50,350,350,30);
		check_btn_back.setBounds(50,400,120,50);
		check_btn_submit.setBounds(350,400,120,50);
		check_lbl_background.setBounds(0,0,500,500);
		
		update_lbl_topic.setBounds(50,0,500,50);
		update_cmb_topic.setBounds(50,50,350,30);
		update_lbl_username.setBounds(50,100,500,50);
		update_txt_username.setBounds(50,150,350,30);
		update_lbl_password.setBounds(50,200,500,50);
		update_txt_password.setBounds(50,250,350,30);
		update_lbl_note.setBounds(50,300,500,50);
		update_txt_note.setBounds(50,350,350,30);
		update_btn_back.setBounds(50,400,120,50);
		update_btn_submit.setBounds(350,400,120,50);
		update_lbl_background.setBounds(0,0,500,500);
		
		welcome_btn_quit.setBounds(50,400,100,50);
		welcome_btn_submit.setBounds(350,400,100,50);
		welcome_lbl_welcome.setBounds(65,120,500,100);
		welcome_txt_password.setBounds(270,220,120,30);
		welcome_txt_username.setBounds(120,220,120,30);
		welcome_lbl_background.setBounds(0,0,500,500);
		
		activity_btn_addNew.setBounds(90,60,120,50);
		activity_btn_check.setBounds(290,60,120,50);
		activity_btn_delete.setBounds(90,160,120,50);
		activity_btn_export.setBounds(290,160,120,50);
		activity_btn_update.setBounds(200,260,120,50);
		activity_btn_quit.setBounds(200,360,120,50);
		activity_lbl_background.setBounds(0,0,500,500);
		
		addNew_lbl_topic.setBounds(50,0,500,50);
		addNew_txt_topic.setBounds(50,50,350,30);
		addNew_lbl_username.setBounds(50,100,500,50);
		addNew_txt_username.setBounds(50,150,350,30);
		addNew_lbl_password.setBounds(50,200,500,50);
		addNew_txt_password.setBounds(50,250,350,30);
		addNew_lbl_note.setBounds(50,300,500,50);
		addNew_txt_note.setBounds(50,350,350,30);
		addNew_btn_back.setBounds(50,400,120,50);
		addNew_btn_submit.setBounds(350,400,120,50);
		addNew_lbl_background.setBounds(0,0,500,500);
		
		///////////////////////////////////////////////////////////
		
		welcome_btn_quit.addActionListener(this);
		welcome_btn_submit.addActionListener(this);
		
		activity_btn_addNew.addActionListener(this);
		activity_btn_check.addActionListener(this);
		activity_btn_delete.addActionListener(this);
		activity_btn_export.addActionListener(this);
		activity_btn_update.addActionListener(this);
		activity_btn_quit.addActionListener(this);
		
		addNew_btn_back.addActionListener(this);
		addNew_btn_submit.addActionListener(this);
		
		check_btn_back.addActionListener(this);
		check_btn_submit.addActionListener(this);
		
		update_btn_back.addActionListener(this);
		update_btn_submit.addActionListener(this);
		
		delete_btn_back.addActionListener(this);
		delete_btn_submit.addActionListener(this);
		
		///////////////////////////////////////////////////////////
		
		setVisible(true);
		setResizable(false);
		setSize(500,500);
		setTitle("Subham Mallick Password Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		///////////////////////////////////////////////////////////
		
		card_welcome.setBackground(lightBlue);
		card_activity.setBackground(lightBlue);
		card_addNew.setBackground(lightBlue);
		card_check.setBackground(lightBlue);
		card_delete.setBackground(lightBlue);
		card_update.setBackground(lightBlue);
		
		welcome_lbl_welcome.setForeground(white);
		addNew_lbl_topic.setForeground(white);
		addNew_lbl_username.setForeground(white);
		addNew_lbl_password.setForeground(white);
		addNew_lbl_note.setForeground(white);
		check_lbl_note.setForeground(white);
		check_lbl_password.setForeground(white);
		check_lbl_topic.setForeground(white);
		check_lbl_username.setForeground(white);
		delete_lbl_note.setForeground(white);
		delete_lbl_password.setForeground(white);
		delete_lbl_topic.setForeground(white);
		delete_lbl_username.setForeground(white);
		delete_lbl_topicName.setForeground(white);
		update_lbl_note.setForeground(white);
		update_lbl_password.setForeground(white);
		update_lbl_topic.setForeground(white);
		update_lbl_username.setForeground(white);
		
		welcome_lbl_welcome.setFont(f40);
		addNew_lbl_topic.setFont(f20);
		addNew_lbl_username.setFont(f20);
		addNew_lbl_password.setFont(f20);
		addNew_lbl_note.setFont(f20);
		check_lbl_note.setFont(f20);
		check_lbl_password.setFont(f20);
		check_lbl_topic.setFont(f20);
		check_lbl_username.setFont(f20);
		delete_lbl_note.setFont(f20);
		delete_lbl_password.setFont(f20);
		delete_lbl_topic.setFont(f20);
		delete_lbl_username.setFont(f20);
		delete_lbl_topicName.setFont(f20);
		update_lbl_note.setFont(f20);
		update_lbl_password.setFont(f20);
		update_lbl_topic.setFont(f20);
		update_lbl_username.setFont(f20);
		
		check_txt_username.setEditable(false);
		check_txt_password.setEditable(false);
		check_txt_note.setEditable(false);
		
		check_txt_username.setVisible(false);
		check_txt_password.setVisible(false);
		check_txt_note.setVisible(false);
		check_lbl_username.setVisible(false);
		check_lbl_password.setVisible(false);
		check_lbl_note.setVisible(false);
		
		///////////////////////////////////////////////////////////
	}
	public void actionPerformed(ActionEvent point)
	{
		if(point.getSource() == welcome_btn_submit)
		{
			if(welcome_txt_username.getText().equals("subham") && welcome_txt_password.getText().equals("mallick"))
			{
				card.show(card_all,"Activity");
				setTitle("Password Manager | Activity Options");
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Error! User Name and Password is encrypted !");
			}
		}
		if(point.getSource() == welcome_btn_quit || point.getSource() == activity_btn_quit)
		{
			this.dispose();
		}
		if(point.getSource() == activity_btn_addNew)
		{
			card.show(card_all,"AddNew");
			setTitle("Password Manager | Add New Items");
		}
		if(point.getSource() == activity_btn_export)
		{
			JOptionPane.showMessageDialog(null,"Under Construction");
		}
		if(point.getSource() == addNew_btn_back || point.getSource() == check_btn_back || point.getSource() == delete_btn_back || point.getSource() == update_btn_back)
		{
			card.show(card_all,"Activity");
			setTitle("Password Manager | Activity Options");
			
			check_txt_username.setVisible(false);
			check_txt_password.setVisible(false);
			check_txt_note.setVisible(false);
			check_lbl_username.setVisible(false);
			check_lbl_password.setVisible(false);
			check_lbl_note.setVisible(false);
			
			addNew_txt_topic.setText("");
			addNew_txt_username.setText("");
			addNew_txt_password.setText("");
			addNew_txt_note.setText("");
		}
		//////////////////////////////////////////////////////////////
		Connection conn;
		Statement stmt;
		ResultSet rs;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
			stmt = conn.createStatement();

			if(point.getSource() == activity_btn_check)
			{
				card.show(card_all,"Check");
				setTitle("Password Manager | Checking Database");
				
				rs = stmt.executeQuery("select * from PASSWORDTABLE order by TOPIC");
				while(rs.next())
				{
					check_cmb_topic.addItem(rs.getString(1));
				}
			}
			
			if(point.getSource() == activity_btn_update)
			{
				card.show(card_all,"Update");
				setTitle("Password Manager | Update Database");
				
				rs = stmt.executeQuery("select * from PASSWORDTABLE order by TOPIC");
				while(rs.next())
				{
					update_cmb_topic.addItem(rs.getString(1));
				}
				
			}
			if(point.getSource() == activity_btn_delete)
			{
				card.show(card_all,"Delete");
				setTitle("Password Manager | Delete Database");
					
				rs = stmt.executeQuery("select * from PASSWORDTABLE order by TOPIC");
				while(rs.next())
				{
					delete_cmb_topic.addItem(rs.getString(1));
				}
			}
			
			
			if(point.getSource() == addNew_btn_submit)
			{
				int x = stmt.executeUpdate("insert into PASSWORDTABLE values('"+addNew_txt_topic.getText()+"','"+addNew_txt_username.getText()+"','"+addNew_txt_password.getText()+"','"+addNew_txt_note.getText()+"')");
				JOptionPane.showMessageDialog(null, x+" Data Added! You can Check all the Values from Check Menu ");
				
				addNew_txt_username.setText("");
				addNew_txt_password.setText("");
				addNew_txt_note.setText("");
				
			}
			if(point.getSource() == check_btn_submit)
			{
				String str = (String)(check_cmb_topic.getItemAt(check_cmb_topic.getSelectedIndex()));
				rs = stmt.executeQuery("select * from PASSWORDTABLE where TOPIC ='"+str+"'");
				while(rs.next())
				{
					check_txt_username.setText(rs.getString(2));
					check_txt_password.setText(rs.getString(3));
					check_txt_note.setText(rs.getString(4));
				}
				check_txt_username.setVisible(true);
				check_txt_password.setVisible(true);
				check_txt_note.setVisible(true);
				check_lbl_username.setVisible(true);
				check_lbl_password.setVisible(true);
				check_lbl_note.setVisible(true);
			}
			
			if(point.getSource() == update_btn_submit)
			{
				String str = (String)(check_cmb_topic.getItemAt(check_cmb_topic.getSelectedIndex()));
				int x = stmt.executeUpdate("update PASSWORDTABLE set USERNAME ='"+update_txt_username.getText()+"',PASSWORD ='"+update_txt_password.getText()+"',NOTE ='"+update_txt_note.getText()+"' where TOPIC ='"+str+"'");													
				
				JOptionPane.showMessageDialog(null, x+" Data Updated! You can Check all the Values from Check Menu ");
				
				update_txt_username.setText("");
				update_txt_password.setText("");
				update_txt_note.setText("");
			}
			if(point.getSource() == delete_btn_submit)
			{
				String str = (String)(delete_cmb_topic.getItemAt(delete_cmb_topic.getSelectedIndex()));
				
				if(delete_chk_topicName.isSelected())
				{
					stmt.executeUpdate("DELETE from PASSWORDTABLE where TOPIC='"+str+"'"); 
					JOptionPane.showMessageDialog(null, str+" deleted! You can Check from Check Menu ");
				}
				else
				{
					if(delete_chk_username.isSelected() && delete_chk_password.isSelected() && delete_chk_note.isSelected())
					{
						int x = stmt.executeUpdate("update PASSWORDTABLE set USERNAME='' ,PASSWORD ='', NOTE='' where TOPIC='"+str+"'"); 
						JOptionPane.showMessageDialog(null, str+"\'s User Name, Password and Note is deleted! You can Check from Check Menu ");
					}
					if(delete_chk_username.isSelected() && delete_chk_password.isSelected() && !(delete_chk_note.isSelected()))
					{
						int x = stmt.executeUpdate("update PASSWORDTABLE set USERNAME='' ,PASSWORD ='' where TOPIC='"+str+"'"); 
						JOptionPane.showMessageDialog(null, str+"\'s User Name and Password is deleted! You can Check from Check Menu ");
					}
					if(delete_chk_username.isSelected() && !(delete_chk_password.isSelected()) && delete_chk_note.isSelected())
					{
						int x = stmt.executeUpdate("update PASSWORDTABLE set USERNAME='' , NOTE='' where TOPIC='"+str+"'"); 
						JOptionPane.showMessageDialog(null, str+"\'s User Name and Note is deleted! You can Check from Check Menu ");
					}
					if(!(delete_chk_username.isSelected()) && delete_chk_password.isSelected() && delete_chk_note.isSelected())
					{
						int x = stmt.executeUpdate("update PASSWORDTABLE set PASSWORD ='', NOTE='' where TOPIC='"+str+"'"); 
						JOptionPane.showMessageDialog(null, str+"\'s Password and Note is deleted! You can Check from Check Menu ");
					}
				}
				update_txt_username.setText("");
				update_txt_password.setText("");
				update_txt_note.setText("");
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}	
	}		
}
class PasswordManager
{
	public static void main(String[] args)
	{
		File object = new File();
	}
}
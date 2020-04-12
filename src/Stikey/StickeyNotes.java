package Stikey;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

import java.sql.*;
public class StickeyNotes extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
TextField t1,t3,t4,t5,t6,t7,t8,t9,t10;
JTextArea t2;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
JFrame f1,f2,f3,f4,f5;
JMenuBar jme;
JMenu jm;
JMenuItem jmi1,jmi2;
String sub,sub2,sub3,sub4,note,note2,note3,note4;
int day,nday,sday,mx,my,x,y,month,year,lday,monthdays,monthpre,monthnext,monthin,yearin;
int monthint[]=new int[12];
String months[]=new String[12];
String smonth,smonthin;
Calendar cal;
static Connection con;
GraphicsEnvironment ge;
GraphicsDevice Screen;
Rectangle rect;
	public StickeyNotes()
	{
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StickeyNotes.class.getResource("/IMG/icon.png")));	
		setVisible(true);
		setSize(400,200);
		setState(JFrame.ICONIFIED);
		ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		Screen=ge.getDefaultScreenDevice();
		rect=Screen.getDefaultConfiguration().getBounds();
		x=(int)(rect.getMaxX());
		y=(int)(rect.getMaxY());
		f1=new JFrame();
		f2=new JFrame();
		f3=new JFrame();
		f4=new JFrame();
		f5=new JFrame();
		f1.setResizable(false);
		f2.setUndecorated(true);
		f3.setUndecorated(true);
		f4.setUndecorated(true);
		f1.setIconImage(Toolkit.getDefaultToolkit().getImage(StickeyNotes.class.getResource("/IMG/Addicon.png")));
		f2.setIconImage(Toolkit.getDefaultToolkit().getImage(StickeyNotes.class.getResource("/IMG/icon.png")));
		f3.setIconImage(Toolkit.getDefaultToolkit().getImage(StickeyNotes.class.getResource("/IMG/icon.png")));
		f4.setIconImage(Toolkit.getDefaultToolkit().getImage(StickeyNotes.class.getResource("/IMG/AboutIcon2.png")));
		f5.setIconImage(Toolkit.getDefaultToolkit().getImage(StickeyNotes.class.getResource("/IMG/Help.png")));
		l1=new JLabel("Subject");
		l2=new JLabel("Note");
		l3=new JLabel("No");
		l5=new JLabel("N/A");
		l6=new JLabel("N/A");
		l7=new JLabel("Day");
		l8=new JLabel("Year");
		l9=new JLabel("Month");
		l10=new JLabel();
		l11=new JLabel();
		l12=new JLabel();
		l13=new JLabel();
		l14=new JLabel();
		l15=new JLabel();
		l16=new JLabel();
		l17=new JLabel();
		l18=new JLabel();
		l19=new JLabel();
		l20=new JLabel();
		l21=new JLabel("Infernus Note");
		l22=new JLabel("V 1.0.0.0");
		l23=new JLabel("<html>This is an application of macking notes by calendar.<br>This application is Made by Sahas Punchihewa.<br>Copyright © 2017-2018</html>");
		l24=new JLabel();
		l25=new JLabel();
		l26=new JLabel();
		l27=new JLabel();
		l28=new JLabel("<html>1. Menu<br>2. Minimize<br>3. Close<br>4. Toggle Month<br>5. Toggle Day<br>6. View Note<br>7. Toggle Notes<br>8. Add Notes<br>9. Subject Of Note<br>10. Note<br>11. Toggle Year<br>12. Create Note<br>13. Edit Note<br>14. Search Note<br>15. Delete Note</html>");
		l29=new JLabel();
		t1=new TextField("");
		t2=new JTextArea("");
		t3=new TextField("1");
		t4=new TextField("");
		l1.setFont(new Font("Elephant",Font.PLAIN,20));
		l2.setFont(new Font("Elephant",Font.PLAIN,20));
		l3.setFont(new Font("Elephant",Font.PLAIN,20));
		l7.setFont(new Font("Elephant",Font.PLAIN,20));
		l8.setFont(new Font("Elephant",Font.PLAIN,20));
		l9.setFont(new Font("Elephant",Font.PLAIN,20));
		l11.setFont(new Font("Elephant",Font.PLAIN,20));
		l21.setFont(new Font("Calibri",Font.BOLD,30));
		l22.setFont(new Font("Calibri",Font.BOLD,15));
		l28.setFont(new Font("Calibri",Font.BOLD,20));
		l10.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Background.png")));
		l12.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Trnse.png")));
		l13.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Background.png")));
		l14.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Transe.png")));
		l15.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Transe2.png")));
		l16.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f2Background.png")));
		l17.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f2Transe2.png")));
		l18.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f2Transe.png")));
		l19.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Loading.png")));
		l20.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/AboutIcon.png")));
		l24.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f4Back.png")));
		l25.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f3Help.png")));
		l26.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f2Help.png")));
		l27.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Help.png")));
		l29.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f5back.png")));
		l6.setVerticalAlignment(SwingConstants.TOP);
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setHorizontalTextPosition(SwingConstants.CENTER);
		l8.setAlignmentX(Component.CENTER_ALIGNMENT);
		l9.setHorizontalAlignment(SwingConstants.CENTER);
		l10.setAlignmentX(Component.CENTER_ALIGNMENT);
		t2.setLineWrap(true);
		l1.setBounds(30,140,94,30);
		l2.setBounds(30,190,70,30);
		l3.setBounds(245,90,110,30);
		l5.setBounds(20,50,260,20);
		l6.setBounds(20,80,260,200);
		l7.setBounds(30,90,70,30);
		l8.setBounds(192,11,100,30);
		l9.setBounds(145,41,194,30);
		l10.setSize(300,300);
		l11.setBounds(50,40,200,30);
		l12.setBounds(40,90,220,140);
		l13.setSize(500,500);
		l14.setBounds(30,90,80,130);
		l15.setBounds(245,90,110,30);
		l16.setSize(300,300);
		l17.setBounds(20,50,260,20);
		l18.setBounds(20,80,260,200);
		l19.setSize(400,200);
		l20.setBounds(20,50,50,50);
		l21.setBounds(90,50,190,30);
		l22.setBounds(90,80,60,30);
		l23.setBounds(20,90,260,160);
		l24.setSize(300,300);
		l25.setBounds(20,20,300,300);
		l26.setBounds(20,340,300,300);
		l27.setBounds(340,20,508,508);
		l28.setBounds(868,20,200,400);
		l29.setSize(x,y);
		t1.setBounds(150,140,300,30);
		t2.setBounds(150,190,300,175);
		t3.setBounds(375,90,75,30);
		t4.setBounds(150,90,75,30);
		getContentPane().add(l19);
		setLocation((x/2)-200,(y/2)-100);
		setState(JFrame.NORMAL);
		b1=new JButton("");
		b1.setContentAreaFilled(false);
		b1.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Add2.png")));
		b1.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Add.png")));
		b1.setBorderPainted(false);
		b2=new JButton("");
		b2.setBorderPainted(false);
		b2.setContentAreaFilled(false);
		b2.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Edit2.png")));
		b2.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Edit.png")));
		b3=new JButton("");
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		b3.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Search2.png")));
		b3.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Search.png")));
		b4=new JButton("");
		b4.setBorderPainted(false);
		b4.setContentAreaFilled(false);
		b4.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Selete2.png")));
		b4.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Selete.png")));
		b5=new JButton("N/A");
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b6=new JButton("");
		b6.setMnemonic(KeyEvent.VK_ADD);
		b6.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Add2.png")));
		b6.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Add.png")));
		b6.setBorder(null);
		b6.setContentAreaFilled(false);
		b6.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		b7=new JButton("N/A");
		b7.setBorderPainted(false);
		b7.setContentAreaFilled(false);
		b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b8=new JButton("");
		b8.setMnemonic(KeyEvent.VK_UP);
		b8.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/UP.png")));
		b8.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Up2.png")));
		b8.setContentAreaFilled(false);
		b8.setBorder(null);
		b8.setAlignmentX(Component.CENTER_ALIGNMENT);
		b8.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		b9=new JButton("");
		b9.setMnemonic(KeyEvent.VK_DOWN);
		b9.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Down.png")));
		b9.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Down2.png")));
		b9.setContentAreaFilled(false);
		b9.setBorder(null);
		b9.setAlignmentX(Component.CENTER_ALIGNMENT);
		b9.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		b10=new JButton("");
		b10.setMnemonic(KeyEvent.VK_LEFT);
		b10.setContentAreaFilled(false);
		b10.setBorder(null);
		b10.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/DayPre2.png")));
		b10.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/DayPre.png")));
		b10.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		b11=new JButton("");
		b11.setMnemonic(KeyEvent.VK_RIGHT);
		b11.setContentAreaFilled(false);
		b11.setBorder(null);
		b11.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Daynext2.png")));
		b11.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Daynext.png")));
		b11.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		b12=new JButton("");
		b12.setBorder(null);
		b12.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Close2.png")));
		b12.setSelected(true);
		b12.setRolloverSelectedIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Close2.png")));
		b12.setContentAreaFilled(false);
		b12.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Close.png")));
		b12.setHorizontalTextPosition(SwingConstants.CENTER);
		b12.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		b13=new JButton("");
		b13.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Minimize2.png")));
		b13.setBorder(null);
		b13.setContentAreaFilled(false);
		b13.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Minimize.png")));
		b13.setHorizontalTextPosition(SwingConstants.CENTER);
		b13.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		b14=new JButton("");
		b14.setContentAreaFilled(false);
		b14.setBorder(null);
		b14.setAlignmentX(Component.CENTER_ALIGNMENT);
		b15=new JButton("");
		b15.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Previous2.png")));
		b15.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Previous.png")));
		b15.setContentAreaFilled(false);
		b15.setBorderPainted(false);
		b16=new JButton("");
		b16.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Next2.png")));
		b16.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Next.png")));
		b16.setBorderPainted(false);
		b16.setContentAreaFilled(false);
		b17=new JButton("");
		b17.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Previous2.png")));
		b17.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Previous.png")));
		b17.setContentAreaFilled(false);
		b17.setBorderPainted(false);
		b18=new JButton("");
		b18.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Next2.png")));
		b18.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/f1Next.png")));
		b18.setContentAreaFilled(false);
		b18.setBorderPainted(false);
		b19=new JButton("");
		b19.setMnemonic(KeyEvent.VK_NUMPAD4);
		b19.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Previous2.png")));
		b19.setContentAreaFilled(false);
		b19.setAlignmentX(Component.CENTER_ALIGNMENT);
		b19.setBorder(null);
		b19.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Previous.png")));
		b20=new JButton("");
		b20.setMnemonic(KeyEvent.VK_NUMPAD6);
		b20.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Next2.png")));
		b20.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Next.png")));
		b20.setAlignmentX(Component.CENTER_ALIGNMENT);
		b20.setBorder(null);
		b20.setContentAreaFilled(false);
		b21=new JButton("N/A");
		b21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b21.setContentAreaFilled(false);
		b21.setBorderPainted(false);
		b22=new JButton("N/A");
		b22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b22.setContentAreaFilled(false);
		b22.setBorderPainted(false);
		b23=new JButton();
		b23.setContentAreaFilled(false);
		b23.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Close2.png")));
		b23.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Close.png")));
		b23.setBorderPainted(false);
		b24=new JButton();
		b24.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Minimize2.png")));
		b24.setBorder(null);
		b24.setContentAreaFilled(false);
		b24.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Minimize.png")));
		b24.setHorizontalTextPosition(SwingConstants.CENTER);
		b25=new JButton();
		b25.setContentAreaFilled(false);
		b25.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Close2.png")));
		b25.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Close.png")));
		b25.setBorderPainted(false);
		b26=new JButton();
		b26.setContentAreaFilled(false);
		b26.setRolloverIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Minimize2.png")));
		b26.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Minimize.png")));
		b26.setBorderPainted(false);
		b1.setBounds(44,390,50,50);
		b2.setBounds(154,390,50,50);
		b3.setBounds(264,390,50,50);
		b4.setBounds(374,390,50,50);
		b5.setBounds(40,90,220,35);
		b6.setBounds(125,240,50,50);
		b7.setBounds(40,125,220,35);
		b8.setBounds(20,248,50,32);
		b9.setBounds(230,248,50,32);
		b10.setBounds(20,90,20,140);
		b11.setBounds(260,90,20,140);
		b12.setBounds(270,0,30,30);
		b13.setBounds(240,0,30,30);
		b14.setBounds(0,0,240,20);
		b15.setBounds(155,11,30,30);
		b16.setBounds(299,11,30,30);
		b17.setBounds(115,41,30,30);
		b18.setBounds(339,41,30,30);
		b19.setBounds(10,40,30,30);
		b20.setBounds(260,40,30,30);
		b21.setBounds(40,160,220,35);
		b22.setBounds(40,195,220,35);
		b23.setBounds(270,0,30,30);
		b24.setBounds(240,0,30,30);
		b25.setBounds(270,0,30,30);
		b26.setBounds(240,0,30,30);
		jme=new JMenuBar();
		jme.setToolTipText("Infernus Note");
		jme.setBorderPainted(false);
		jme.setBorder(null);
		jme.setAlignmentY(Component.CENTER_ALIGNMENT);
		jm=new JMenu("");
		jm.setArmed(true);
		jm.setBorder(null);
		jm.setContentAreaFilled(false);
		jm.setHorizontalAlignment(SwingConstants.CENTER);
		jm.setIconTextGap(0);
		jm.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/Menu.png")));
		jmi1=new JMenuItem("Help");
		jmi1.setContentAreaFilled(false);
		jmi1.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/HelpMenu.png")));
		jmi2=new JMenuItem("About");
		jmi2.setContentAreaFilled(false);
		jmi2.setIcon(new ImageIcon(StickeyNotes.class.getResource("/IMG/AboutMenu.png")));
		jme.add(jm);
		jm.add(jmi1);
		jm.add(jmi2);
		jme.setBounds(0,0,30,30);
		months[0]="January";
		months[1]="February";
		months[2]="March";
		months[3]="April";
		months[4]="May";
		months[5]="June";
		months[6]="July";
		months[7]="August";
		months[8]="September";
		months[9]="October";
		months[10]="November";
		months[11]="December";
		monthint[0]=31;
		monthint[1]=28;
		monthint[2]=31;
		monthint[3]=30;
		monthint[4]=31;
		monthint[5]=30;
		monthint[6]=31;
		monthint[7]=31;
		monthint[8]=30;
		monthint[9]=31;
		monthint[10]=30;
		monthint[11]=31;
		cal=Calendar.getInstance();
		day=cal.get(Calendar.DAY_OF_MONTH);
		nday=cal.get(Calendar.DAY_OF_MONTH);
		month=(cal.get(Calendar.MONTH))+1;
		monthin=(cal.get(Calendar.MONTH))+1;
		year=cal.get(Calendar.YEAR);
		yearin=cal.get(Calendar.YEAR);
		lday=cal.get(Calendar.DAY_OF_MONTH);
		sday=(cal.get(Calendar.DAY_OF_MONTH)*100);
		day=day*1000;
		try
		{
			con=DriverManager.getConnection("jdbc:ucanaccess://C://Users//Public//Documents//Notes.accdb");
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null,"System Error."+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		monthnext();
		monthnextinput();
		NextNote();
		t4.setText(String.valueOf(nday));
		l11.setText(year+" "+smonth+" "+lday);
		NoteGajet(f3);
		setVisible(false);
	}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b1)
		{
			if((Integer.parseInt(t3.getText())<101)&&(Integer.parseInt(t3.getText())>0))
			{
			try
			{
				con.createStatement().execute("insert into MyNotes(NoteNo,Subject,Note)values('"+((yearin*1000000)+(monthin*10000)+(Integer.parseInt(t4.getText())*100)+(Integer.parseInt(t3.getText())-1))+"','"+t1.getText()+"','"+t2.getText()+"')");
				//JOptionPane.showMessageDialog(this,"Successfully Added");
				t1.setText("");
				t2.setText("");
				t3.setText(String.valueOf(Integer.parseInt(t3.getText())+1));
				NextNote();
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(this,ex.getMessage(),"dlfjjaldkfjlskjfl",JOptionPane.ERROR_MESSAGE);
			}
			}
			else if(Integer.parseInt(t3.getText())>100)
			{
				JOptionPane.showMessageDialog(this,"You Can Store Only 100 Notes For 1 Day!");
			}
			else if(Integer.parseInt(t3.getText())<=0)
			{
				JOptionPane.showMessageDialog(this,"Plese Enter Valied Number!");
			}
		}
		else if(a.getSource()==b2)
		{
			try
			{
				con.createStatement().execute("update MyNotes SET Subject='"+t1.getText()+"',Note='"+t2.getText()+"'where NoteNo='"+((yearin*1000000)+(monthin*10000)+(Integer.parseInt(t4.getText())*100)+(Integer.parseInt(t3.getText())-1))+"'");
				//JOptionPane.showMessageDialog(this,"Successfully Updated");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				NextNote();
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(a.getSource()==b3)
		{
			try
			{
				ResultSet r=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((yearin*1000000)+(monthin*10000)+(Integer.parseInt(t4.getText())*100)+(Integer.parseInt(t3.getText())-1))+"'");
				if(r.next())
				{
					t1.setText(r.getString("Subject"));
					t2.setText(r.getString("Note"));
					NextNote();
				}
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(a.getSource()==b4)
		{
			try
			{
				con.createStatement().execute("DELETE FROM MyNotes where NoteNo='"+((yearin*1000000)+(monthin*10000)+(Integer.parseInt(t4.getText())*100)+(Integer.parseInt(t3.getText())-1))+"'");
				//JOptionPane.showMessageDialog(this,"Successfully Deleted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				NextNote();
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(a.getSource()==b5)
		{	
			if(b5.getText().equals("N/A"))
			{
			}
			else
			{
			l5.setText(sub);
			l6.setText("<html>"+note+"</html");
			Show(f2);
			}
		}
		else if(a.getSource()==b6)
		{
			NoteEdit(f1);
		}
		else if(a.getSource()==b7)
		{
			if(b7.getText().equals("N/A"))
			{
			}
			else
			{
			l5.setText(sub2);
			l6.setText("<html>"+note2+"</html");
			Show(f2);
			}
		}
		else if(a.getSource()==b8)
		{
			sday=sday-1;
			NextNote();
		}
		else if(a.getSource()==b9)
		{
			sday=sday+1;
			NextNote();
		}
		else if(a.getSource()==b10)
		{
			if((month==1)&&(lday==1))
			{
				year=year-1;
				nday=31;
				month=12;
				monthnext();
				sday=nday*100;
				lday=31;
				l11.setText(year+" "+smonth+" "+lday);
				System.out.println(year);
				NextDay();
			}
			else if(lday>1)
			{
			nday=nday-1;
			sday=nday*100;
			lday=lday-1;
			l11.setText(year+" "+smonth+" "+lday);
			NextDay();
			}
			else if((lday<=1)&&(monthpre==28))
			{
				lday=28;
				month=month-1;
				nday=28;
				sday=nday*100;
				monthnext();
				NextDay();
				l11.setText(year+" "+smonth+" "+lday);
			}
			else if((lday<=1)&&(monthpre==30))
			{
				lday=30;
				month=month-1;
				nday=30;
				sday=nday*100;
				monthnext();
				NextDay();
				l11.setText(year+" "+smonth+" "+lday);
			}
			else if((lday<=1)&&(monthpre==31))
			{
				lday=31;
				month=month-1;
				nday=31;
				sday=nday*100;
				monthnext();
				NextDay();
				l11.setText(year+" "+smonth+" "+lday);
			}
		}
		else if(a.getSource()==b11)
		{	
			if((month==12)&&(lday==31))
			{
				year=year+1;
				nday=1;
				month=1;
				monthnext();
				sday=nday*100;
				lday=1;
				l11.setText(year+" "+smonth+" "+lday);
				NextDay();
				System.out.println(year);
			}
			else if(monthdays==28)
			{
				if(lday<28)
				{
					nday=nday+1;
					sday=nday*100;
					lday=lday+1;
					l11.setText(year+" "+smonth+" "+lday);
					NextDay();
				}
				else if(lday>=28)
				{
					lday=1;
					month=month+1;
					monthnext();
					nday=1;
					sday=nday*100;
					l11.setText(year+" "+smonth+" "+lday);
					NextDay();
				}
			}
		else if(monthdays==30)
		{
			if(lday<30)
			{
				nday=nday+1;
				sday=nday*100;
				lday=lday+1;
				l11.setText(year+" "+smonth+" "+lday);
				NextDay();
			}
			else if(lday>=30)
			{
				lday=1;
				month=month+1;
				monthnext();
				nday=1;
				sday=nday*100;
				l11.setText(year+" "+smonth+" "+lday);
				NextDay();
			}
		}
		else if(monthdays==31)
		{
			if(lday<31)
			{
				nday=nday+1;
				sday=nday*100;
				lday=lday+1;
				l11.setText(year+" "+smonth+" "+lday);
				NextDay();
			}
			else if(lday>=31)
			{
				lday=1;
				month=month+1;
				monthnext();
				nday=1;
				sday=nday*100;
				l11.setText(year+" "+smonth+" "+lday);
				NextDay();
			}
		}
		}
		else if(a.getSource()==b12)
		{
			System.exit(0);
		}
		else if(a.getSource()==b13)
		{
			f3.setState(ICONIFIED);
		}
		/*else if(a.getSource()==b14)
		{
			MousePress(null);
			MouseDrag(null);
		}*/
		else if(a.getSource()==b15)
		{
			yearin=yearin-1;
			l8.setText(String.valueOf(yearin));
		}
		else if(a.getSource()==b16)
		{
			yearin=yearin+1;
			l8.setText(String.valueOf(yearin));
		}
		else if(a.getSource()==b17)
		{
			if(monthin>1)
			{
			monthin=monthin-1;
			monthnextinput();
			l9.setText(smonthin);
			}
		}
		else if(a.getSource()==b18)
		{
			if(monthin<12)
			{
			monthin=monthin+1;
			monthnextinput();
			l9.setText(smonthin);
			}
		}
		else if(a.getSource()==b19)
		{
			if(month>1)
			{
			month=month-1;
			monthnext();
			NextNote();
			l11.setText(year+" "+smonth+" "+lday);
			}
			else if(month==1)
			{
				month=12;
				year=year-1;
				monthnext();
				NextNote();
				l11.setText(year+" "+smonth+" "+lday);
			}
		}
		else if(a.getSource()==b20)
		{
			if(month<12)
			{
			month=month+1;
			monthnext();
			NextNote();
			l11.setText(year+" "+smonth+" "+lday);
			}
			else if(month==12)
			{
				month=1;
				year=year+1;
				monthnext();
				NextNote();
				l11.setText(year+" "+smonth+" "+lday);
			}
		}
		else if(a.getSource()==b21)
		{
			if(b21.getText().equals("N/A"))
			{
			}
			else
			{
			l5.setText(sub3);
			l6.setText("<html>"+note3+"</html");
			Show(f2);
			}
		}
		else if(a.getSource()==b22)
		{
			if(b22.getText().equals("N/A"))
			{
			}
			else
			{
			l5.setText(sub4);
			l6.setText("<html>"+note4+"</html");
			Show(f2);
			}
		}
		else if(a.getSource()==b23)
		{
			f2.dispose();
		}
		else if(a.getSource()==b24)
		{
			f2.setState(ICONIFIED);
		}
		else if(a.getSource()==b25)
		{
			f4.dispose();
		}
		else if(a.getSource()==b26)
		{
			f4.setState(ICONIFIED);
		}
		else if(a.getSource()==jmi1)
		{
			Help(f5);
		}
		else if(a.getSource()==jmi2)
		{
			About(f4);
		}
	}
	public void NoteEdit(JFrame f1)
	{
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.getContentPane().setLayout(null);
		f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		f1.setTitle("Add Notes");
		f1.setLocation((x/2)-250,(y/2)-250);
		f1.getContentPane().add(l1);
		f1.getContentPane().add(l2);
		f1.getContentPane().add(t1);
		f1.getContentPane().add(t2);
		f1.getContentPane().add(b1);
		f1.getContentPane().add(b2);
		f1.getContentPane().add(b3);
		f1.getContentPane().add(b4);
		f1.getContentPane().add(l3);
		f1.getContentPane().add(t3);
		f1.getContentPane().add(l7);
		f1.getContentPane().add(t4);
		f1.getContentPane().add(l8);
		f1.getContentPane().add(l9);
		f1.getContentPane().add(b15);
		f1.getContentPane().add(b16);
		f1.getContentPane().add(b17);
		f1.getContentPane().add(b18);
		f1.getContentPane().add(l14);
		f1.getContentPane().add(l15);
		f1.getContentPane().add(l13);
		l8.setText(String.valueOf(year));
		l9.setText(smonth);
	}
	public void Show(JFrame f2)
	{
		f2.setVisible(true);
		f2.setSize(300,300);
		f2.getContentPane().setLayout(null);
		f2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		f2.setLocation((x/2)-150,(y/2)-150);
		f2.getContentPane().add(l5);
		f2.getContentPane().add(l6);
		f2.getContentPane().add(b24);
		f2.getContentPane().add(b23);
		f2.getContentPane().add(l17);
		f2.getContentPane().add(l18);
		f2.getContentPane().add(l16);
	}
	public void NoteGajet(JFrame f3)
	{
		f3.setVisible(true);
		f3.setSize(300,300);
		f3.getContentPane().setLayout(null);
		f3.setLocation(x-300,0);
		f3.getContentPane().add(jme);
		f3.getContentPane().add(l11);
		f3.getContentPane().add(b6);
		f3.getContentPane().add(b5);
		f3.getContentPane().add(b7);
		f3.getContentPane().add(b21);
		f3.getContentPane().add(b22);
		f3.getContentPane().add(b8);
		f3.getContentPane().add(b9);
		f3.getContentPane().add(b10);
		f3.getContentPane().add(b11);
		f3.getContentPane().add(b12);
		f3.getContentPane().add(b13);
		f3.getContentPane().add(b14);
		f3.getContentPane().add(b19);
		f3.getContentPane().add(b20);
		f3.getContentPane().add(l12);
		f3.getContentPane().add(l10);
	}
	public void About(JFrame f4)
	{
		f4.setVisible(true);
		f4.setSize(300,300);
		f4.getContentPane().setLayout(null);
		f4.setLocation((x/2)-150,(y/2)-150);
		f4.getContentPane().add(l20);
		f4.getContentPane().add(l21);
		f4.getContentPane().add(l22);
		f4.getContentPane().add(l23);
		f4.getContentPane().add(b25);
		f4.getContentPane().add(b26);
		f4.getContentPane().add(l24);
	}
	public void Help(JFrame f5)
	{
		f5.setVisible(true);
		f5.setSize(880,700);
		f3.setMaximumSize(new Dimension(x,y));
		f5.getContentPane().setLayout(null);
		f5.setTitle("Help");
		f5.setLocation((x/2)-440,(y/2)-370);
		f5.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		f5.getContentPane().add(l25);
		f5.getContentPane().add(l26);
		f5.getContentPane().add(l27);
		f5.getContentPane().add(l28);
		f5.getContentPane().add(l29);
	}
	public void NextNote()
	{
		b5.setText("N/A");
		b7.setText("N/A");
		b21.setText("N/A");
		b22.setText("N/A");
		try
		{
			ResultSet s=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((year*1000000)+(month*10000)+sday)+"'");
			if(s.next()) 
			{
				sub=s.getString("Subject");
				note=s.getString("Note");
				b5.setText(sub);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
			ResultSet s=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((year*1000000)+(month*10000)+sday+1)+"'");
			if(s.next())
			{
				sub2=s.getString("Subject");
				note2=s.getString("Note");
				b7.setText(sub2);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
			ResultSet s=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((year*1000000)+(month*10000)+sday+2)+"'");
			if(s.next()) 
			{
				sub3=s.getString("Subject");
				note3=s.getString("Note");
				b21.setText(sub3);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
			ResultSet s=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((year*1000000)+(month*10000)+sday+3)+"'");
			if(s.next())
			{
				sub4=s.getString("Subject");
				note4=s.getString("Note");
				b22.setText(sub4);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void NextDay()
	{
	b5.setText("N/A");
	b7.setText("N/A");
	b21.setText("N/A");
	b22.setText("N/A");
		try
		{
			ResultSet s=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((year*1000000)+(month*10000)+sday)+"'");
			if(s.next())
			{
				sub=s.getString("Subject");
				note=s.getString("Note");
				b5.setText(sub);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
			ResultSet s=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((year*1000000)+(month*10000)+sday+1)+"'");
			if(s.next())
			{
				sub2=s.getString("Subject");
				note2=s.getString("Note");
				b7.setText(sub2);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
			ResultSet s=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((year*1000000)+(month*10000)+sday+2)+"'");
			if(s.next())
			{
				sub3=s.getString("Subject");
				note3=s.getString("Note");
				b21.setText(sub3);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
			ResultSet s=con.createStatement().executeQuery("SELECT * FROM MyNotes where NoteNo='"+((year*1000000)+(month*10000)+sday+3)+"'");
			if(s.next())
			{
				sub4=s.getString("Subject");
				note4=s.getString("Note");
				b22.setText(sub4);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void monthnext()
	{
		for(int i=0;i<12;i++)
		{
		if(month==i+1)
		{
			smonth=months[i];
			monthdays=monthint[i];
			if(i>=1)
			{
			monthpre=monthint[i-1];
			}
		}
		}
	}
	public void monthnextinput()
	{
		for(int i=0;i<12;i++)
		{
		if(monthin==i+1)
		{
			smonthin=months[i];
		}
		}
	}
	/*public void MousePress(MouseEvent m)
	{
		mx=m.getX();
		my=m.getY();
		
	}
	public void MouseDrag(MouseEvent m)
	{
		setLocation(m.getXOnScreen()-mx,m.getYOnScreen()-my);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StickeyNotes();
	}
}

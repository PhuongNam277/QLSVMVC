package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	QLSVModel model;
	private JTextField textFieldMaThiSinh;
	private JTable table;
	private JTextField textFieldID;
	private JTextField textFieldHoTen;
	private JTextField textFieldNgaySinh;
	private JTextField textFieldMon1;
	private JTextField textFieldMon2;
	private JTextField textFieldMon3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1156, 801);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About me");
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelQueQuan = new JLabel("Que quan");
		labelQueQuan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelQueQuan.setBounds(10, 10, 72, 30);
		contentPane.add(labelQueQuan);
		
		JLabel lblMaSinhVien = new JLabel("Ma thi sinh");
		lblMaSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaSinhVien.setBounds(380, 10, 106, 30);
		contentPane.add(lblMaSinhVien);
		
		textFieldMaThiSinh = new JTextField();
		textFieldMaThiSinh.setBounds(483, 10, 244, 30);
		contentPane.add(textFieldMaThiSinh);
		textFieldMaThiSinh.setColumns(10);
		
		JButton btnNewButton = new JButton("Tim");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(826, 10, 118, 30);
		contentPane.add(btnNewButton);
		
		JComboBox comboBoxQueQuan = new JComboBox();
		comboBoxQueQuan.setBounds(92, 10, 151, 30);
		contentPane.add(comboBoxQueQuan);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 69, 1122, 2);
		contentPane.add(separator_1);
		
		JLabel lblDsThiSinh = new JLabel("DS Thi Sinh");
		lblDsThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDsThiSinh.setBounds(10, 96, 97, 30);
		contentPane.add(lblDsThiSinh);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "Ma thi sinh", "Ho ten", "Que quan", "Gioi tinh", "Diem 1", "Diem 2", "Diem 3"
			}
		));
		table.setBounds(38, 157, 695, 258);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 136, 1122, 235);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 409, 1122, 2);
		contentPane.add(separator_1_1);
		
		JLabel labelThongTinThiSinh = new JLabel("Thong tin thi sinh");
		labelThongTinThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelThongTinThiSinh.setBounds(10, 421, 129, 30);
		contentPane.add(labelThongTinThiSinh);
		
		JLabel labelMaThiSinh = new JLabel("Ma thi sinh");
		labelMaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelMaThiSinh.setBounds(10, 459, 106, 30);
		contentPane.add(labelMaThiSinh);
		
		textFieldID = new JTextField();
		textFieldID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldID.setColumns(10);
		textFieldID.setBounds(92, 461, 244, 30);
		contentPane.add(textFieldID);
		
		JLabel labelHoTen = new JLabel("Ho va ten");
		labelHoTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHoTen.setBounds(10, 509, 106, 30);
		contentPane.add(labelHoTen);
		
		textFieldHoTen = new JTextField();
		textFieldHoTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldHoTen.setColumns(10);
		textFieldHoTen.setBounds(92, 512, 244, 30);
		contentPane.add(textFieldHoTen);
		
		JLabel labelQueQuan_2 = new JLabel("Que quan");
		labelQueQuan_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelQueQuan_2.setBounds(10, 558, 106, 30);
		contentPane.add(labelQueQuan_2);
		
		JComboBox comboBoxQueQuan_1 = new JComboBox();
		comboBoxQueQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxQueQuan_1.setBounds(92, 558, 151, 30);
		contentPane.add(comboBoxQueQuan_1);
		
		JLabel labelNgaySinh = new JLabel("Ngay sinh");
		labelNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelNgaySinh.setBounds(10, 603, 106, 30);
		contentPane.add(labelNgaySinh);
		
		textFieldNgaySinh = new JTextField();
		textFieldNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldNgaySinh.setColumns(10);
		textFieldNgaySinh.setBounds(92, 606, 244, 30);
		contentPane.add(textFieldNgaySinh);
		
		JLabel labelGioiTinh = new JLabel("Gioi Tinh");
		labelGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelGioiTinh.setBounds(620, 459, 106, 30);
		contentPane.add(labelGioiTinh);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNam.setBounds(732, 464, 103, 21);
		contentPane.add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("Nu");
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNu.setBounds(848, 464, 103, 21);
		contentPane.add(rdbtnNu);
		
		JLabel labelMon1 = new JLabel("Mon 1");
		labelMon1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelMon1.setBounds(621, 509, 106, 30);
		contentPane.add(labelMon1);
		
		textFieldMon1 = new JTextField();
		textFieldMon1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldMon1.setColumns(10);
		textFieldMon1.setBounds(732, 512, 244, 30);
		contentPane.add(textFieldMon1);
		
		JLabel labelMon2 = new JLabel("Mon 2");
		labelMon2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelMon2.setBounds(620, 558, 106, 30);
		contentPane.add(labelMon2);
		
		textFieldMon2 = new JTextField();
		textFieldMon2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldMon2.setColumns(10);
		textFieldMon2.setBounds(732, 561, 244, 30);
		contentPane.add(textFieldMon2);
		
		JLabel labelMon3 = new JLabel("Mon 3");
		labelMon3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelMon3.setBounds(621, 603, 106, 30);
		contentPane.add(labelMon3);
		
		textFieldMon3 = new JTextField();
		textFieldMon3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldMon3.setColumns(10);
		textFieldMon3.setBounds(732, 606, 244, 30);
		contentPane.add(textFieldMon3);
		
		JButton btnThem = new JButton("Them");
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnThem.setBounds(10, 677, 118, 30);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xoa");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnXoa.setBounds(218, 677, 118, 30);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("Cap nhat");
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCapNhat.setBounds(443, 677, 118, 30);
		contentPane.add(btnCapNhat);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSave.setBounds(659, 677, 118, 30);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(883, 677, 118, 30);
		contentPane.add(btnCancel);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 656, 1122, 2);
		contentPane.add(separator_1_1_1);
		
		this.setVisible(true);
	}
}

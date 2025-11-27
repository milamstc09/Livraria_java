import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Tela_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableLivros;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEditora;
	private JTextField txtAno;
	private final ButtonGroup GGenero = new ButtonGroup();
	private final ButtonGroup GTradu = new ButtonGroup();
	private JTextField txtpalavras;
	private final ButtonGroup GFormato = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Principal frame = new Tela_Principal();
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
	public Tela_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 544);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(74, 0, 149));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSair.setBackground(new Color(202, 255, 202));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(761, 388, 177, 40);
		contentPane.add(btnSair);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(373, 83, 623, 267);
		contentPane.add(scrollPane);
		
		tableLivros = new JTable();
		tableLivros.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EDtulo", "Autor", "Editora", "Ano", "Genero", "Traduzido", "Formato", "Palavras-chave"
			}
		));
		scrollPane.setViewportView(tableLivros);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(117, 87, 160, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblCadastre = new JLabel("Cadastre um Livro! <3");
		lblCadastre.setForeground(new Color(255, 255, 255));
		lblCadastre.setBackground(new Color(255, 255, 255));
		lblCadastre.setFont(new Font("Italic_IV50", Font.BOLD, 17));
		lblCadastre.setBounds(42, 32, 289, 30);
		contentPane.add(lblCadastre);
		
		JLabel lblNewLabel = new JLabel("Título:");
		lblNewLabel.setForeground(new Color(166, 166, 255));
		lblNewLabel.setBackground(new Color(128, 128, 255));
		lblNewLabel.setFont(new Font("Italic_IV50", Font.BOLD, 17));
		lblNewLabel.setBounds(27, 87, 80, 20);
		contentPane.add(lblNewLabel);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(117, 130, 160, 20);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtEditora = new JTextField();
		txtEditora.setBounds(127, 170, 150, 20);
		contentPane.add(txtEditora);
		txtEditora.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setBounds(213, 207, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JRadioButton rdbtnRomance = new JRadioButton("Romance");
		rdbtnRomance.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnRomance.setForeground(new Color(198, 253, 179));
		rdbtnRomance.setBackground(new Color(74, 0, 149));
		rdbtnRomance.setMnemonic('1');
		GGenero.add(rdbtnRomance);
		rdbtnRomance.setBounds(103, 246, 91, 23);
		contentPane.add(rdbtnRomance);
		
		JRadioButton rdbtnFiccao = new JRadioButton("Ficção");
		rdbtnFiccao.setForeground(new Color(198, 253, 179));
		rdbtnFiccao.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnFiccao.setBackground(new Color(74, 0, 149));
		rdbtnFiccao.setMnemonic('2');
		GGenero.add(rdbtnFiccao);
		rdbtnFiccao.setBounds(103, 275, 91, 23);
		contentPane.add(rdbtnFiccao);
		
		JRadioButton rdbtnDidatico = new JRadioButton("Didático");
		rdbtnDidatico.setForeground(new Color(198, 253, 179));
		rdbtnDidatico.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnDidatico.setBackground(new Color(74, 0, 149));
		rdbtnDidatico.setMnemonic('3');
		GGenero.add(rdbtnDidatico);
		rdbtnDidatico.setBounds(103, 301, 86, 23);
		contentPane.add(rdbtnDidatico);
		
		JCheckBox chckbxSim = new JCheckBox("Sim");
		chckbxSim.setForeground(new Color(187, 215, 255));
		chckbxSim.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxSim.setBackground(new Color(74, 0, 149));
		chckbxSim.setMnemonic('1');
		GTradu.add(chckbxSim);
		chckbxSim.setBounds(201, 275, 60, 23);
		contentPane.add(chckbxSim);
		
		JCheckBox chckbxNao = new JCheckBox("Não");
		chckbxNao.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNao.setForeground(new Color(187, 215, 255));
		chckbxNao.setBackground(new Color(74, 0, 149));
		chckbxNao.setMnemonic('2');
		GTradu.add(chckbxNao);
		chckbxNao.setBounds(271, 275, 52, 23);
		contentPane.add(chckbxNao);
		
		txtpalavras = new JTextField();
		txtpalavras.setBounds(201, 388, 130, 20);
		contentPane.add(txtpalavras);
		txtpalavras.setColumns(10);
		
		JComboBox comboBoxFormato = new JComboBox();
		comboBoxFormato.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxFormato.setModel(new DefaultComboBoxModel(new String[] {"Papel", "E-book"}));
		comboBoxFormato.setBounds(127, 345, 109, 22);
		contentPane.add(comboBoxFormato);
		
		JButton btnCadastrar = new JButton("Cadastrar Livro");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrar.setBackground(new Color(202, 255, 202));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel Modelo;
		        Modelo = (DefaultTableModel) tableLivros.getModel();
		        
		        txtTitulo.getText();
		        txtAutor.getText();
		        txtEditora.getText();
		        txtAno.getText();
		        
		        String Genero = "";
		        if(GGenero.getSelection().getMnemonic() == '1') {
		        	Genero = "Romance";
		        }
		        if(GGenero.getSelection().getMnemonic() == '2') {
		        	Genero = "Ficção";
		        }
		        if(GGenero.getSelection().getMnemonic() == '3') {
		        	Genero = "Didático";
		        }
		        
		        String Traduzido = "";
		        if(chckbxSim.isSelected()) {
		        	Traduzido = "Sim";
		        }
		        if(chckbxNao.isSelected()) {
		        	Traduzido = "Não";
		        }
		        
		        comboBoxFormato.getSelectedItem().toString();
				
		        txtpalavras.getText();
		        
		        Modelo.addRow(new Object[] {txtTitulo.getText(), txtAutor.getText(), txtEditora.getText(), txtAno.getText(), Genero, Traduzido, comboBoxFormato.getSelectedItem().toString(), txtpalavras.getText()});
				
			}
		});
		btnCadastrar.setBounds(90, 431, 177, 40);
		contentPane.add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir Livro");
		btnExcluir.setBackground(new Color(202, 255, 202));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel Modelo = (DefaultTableModel) tableLivros.getModel();
				int Selecionada = tableLivros.getSelectedRow();
				Modelo.removeRow(Selecionada);

			}
		});
		btnExcluir.setBounds(435, 388, 177, 40);
		contentPane.add(btnExcluir);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setForeground(new Color(166, 166, 255));
		lblAutor.setFont(new Font("Italic_IV50", Font.BOLD, 17));
		lblAutor.setBackground(new Color(128, 128, 255));
		lblAutor.setBounds(27, 130, 80, 20);
		contentPane.add(lblAutor);
		
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setForeground(new Color(166, 166, 255));
		lblEditora.setFont(new Font("Italic_IV50", Font.BOLD, 17));
		lblEditora.setBackground(new Color(128, 128, 255));
		lblEditora.setBounds(27, 170, 99, 20);
		contentPane.add(lblEditora);
		
		JLabel lblAnoDePublicao = new JLabel("Ano de Publicação:");
		lblAnoDePublicao.setForeground(new Color(166, 166, 255));
		lblAnoDePublicao.setFont(new Font("Italic_IV50", Font.BOLD, 14));
		lblAnoDePublicao.setBackground(new Color(128, 128, 255));
		lblAnoDePublicao.setBounds(27, 208, 186, 20);
		contentPane.add(lblAnoDePublicao);
		
		JLabel lblGnero = new JLabel("Gênero:");
		lblGnero.setForeground(new Color(166, 166, 255));
		lblGnero.setFont(new Font("Italic_IV50", Font.BOLD, 14));
		lblGnero.setBackground(new Color(128, 128, 255));
		lblGnero.setBounds(23, 248, 74, 20);
		contentPane.add(lblGnero);
		
		JLabel lblTraduzido = new JLabel("Traduzido:");
		lblTraduzido.setForeground(new Color(166, 166, 255));
		lblTraduzido.setFont(new Font("Italic_IV50", Font.BOLD, 14));
		lblTraduzido.setBackground(new Color(128, 128, 255));
		lblTraduzido.setBounds(200, 248, 112, 20);
		contentPane.add(lblTraduzido);
		
		JLabel lblFormato = new JLabel("Formato:");
		lblFormato.setForeground(new Color(166, 166, 255));
		lblFormato.setFont(new Font("Italic_IV50", Font.BOLD, 14));
		lblFormato.setBackground(new Color(128, 128, 255));
		lblFormato.setBounds(27, 347, 103, 20);
		contentPane.add(lblFormato);
		
		JLabel lblPalavraschave = new JLabel("Palavras-chave:");
		lblPalavraschave.setForeground(new Color(166, 166, 255));
		lblPalavraschave.setFont(new Font("Italic_IV50", Font.BOLD, 14));
		lblPalavraschave.setBackground(new Color(128, 128, 255));
		lblPalavraschave.setBounds(27, 388, 154, 20);
		contentPane.add(lblPalavraschave);
		

	}
}

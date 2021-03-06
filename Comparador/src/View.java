import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class View {
		
	private JPanel contentPane;
	private JTextField txtCaminho;
	private JProgressBar barraPorcentagem;
	private JFrame frame;
	private JButton botaoBuscar;
	private JButton btnAplicar;


	public View() {
		criarJPanel();
		criarCaminho();
        criarBotaoBuscar();
        criarBotaoFiltrar();
        criarBarraPorcentagem();
		criarTelaPrincipal();
	}
	
	public void criarTelaPrincipal() {
		frame = new JFrame("Comparador de Imagem");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 465, 147);
		frame.setContentPane(contentPane);
		frame.setVisible(true);
	}
	
	public void criarJPanel() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
	}
	
	public void criarBarraPorcentagem() {
		barraPorcentagem = new JProgressBar();
		barraPorcentagem.setBounds(10, 80, 437, 25);
		contentPane.add(barraPorcentagem);
	}
	
	public void criarCaminho() {
		txtCaminho = new JTextField();
		txtCaminho.setBounds(10, 10, 407, 24);
		txtCaminho.setEditable(false);
		txtCaminho.setColumns(10);
		txtCaminho.setBorder(new LineBorder(Color.GRAY,1));
		contentPane.add(txtCaminho);
	}
	
	public void criarBotaoFiltrar() {
		btnAplicar = new JButton("Filtrar");
		btnAplicar.setBounds(190, 45, 89, 23);
		btnAplicar.setEnabled(false);
		btnAplicar.setBorder(new LineBorder(Color.GRAY,1));
		contentPane.add(btnAplicar);
	}

	public void criarBotaoBuscar() {
		botaoBuscar = new JButton();
		botaoBuscar.setBounds(416, 10, 30, 24);

		ImageIcon image = new ImageIcon(getClass().getResource("/folder.png"));
		Image img = image.getImage();  
		Image newimg = img.getScaledInstance( 20, 20, java.awt.Image.SCALE_SMOOTH);  
		image = new ImageIcon( newimg );
		   
		botaoBuscar.setIcon(image);		
		contentPane.add(botaoBuscar);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTxtCaminho() {
		return txtCaminho;
	}

	public void setTxtCaminho(JTextField txtCaminho) {
		this.txtCaminho = txtCaminho;
	}

    public JProgressBar getBarraPorcentagem() {
	    return barraPorcentagem;
    }

    public void setBarraPorcentagem(JProgressBar barraPorcentagem) {
	    this.barraPorcentagem = barraPorcentagem;
    }

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public void setBotaoBuscar(JButton botaoBuscar) {
		this.botaoBuscar = botaoBuscar;
	}
	
	public JButton getBotaoBuscar() {
		return botaoBuscar;
	}
	
	public JButton getBtnAplicar() {
		return btnAplicar;
	}
	
	public void setBtnAplicar(JButton btnAplicar) {
		this.btnAplicar = btnAplicar;
	}

 
}

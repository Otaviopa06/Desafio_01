import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desafio extends Frame implements ActionListener {

private Label lblCount;
private TextField tfCount;
private Button btnCount;
private int count = 0;

public Desafio () {
	setLayout(new FlowLayout());
	
	lblCount = new Label("Counter");
	add (lblCount);
	
	tfCount = new TextField("0",10);
	tfCount.setEditable(false);  //set to readonly
	add (tfCount);
	
	btnCount = new Button("Count");
	add (btnCount);
	
	btnCount.addActionListener(this);
	
	setTitle("Counter");
	setSize(250, 100);
	
	setVisible(true);
}
		
	public static void main(String[] args) {
	
		Desafio app = new Desafio();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		++count;
		tfCount.setText(count + "");
	
	}
}

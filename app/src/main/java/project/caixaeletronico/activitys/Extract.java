package project.caixaeletronico.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
//teste
import java.util.ArrayList;

import project.caixaeletronico.R;
import project.caixaeletronico.to.ExtratoTO;

public class Extract extends AppCompatActivity {

    String stringExtrato;

    private TextView extractView;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extract);

    }

    // Consult Extract into seven days
    public void extractSevenDays(View view){

        ExtratoTO ext1 = new ExtratoTO();
        ext1.setTipoMovimentacao("Saque");
        ext1.setTipo(1);
        ext1.setValorMovimentacao(150.00);
        ext1.setSaldoAtual(500.00);
        ext1.setDataMovimentacao("01/09/2016");

        ExtratoTO ext2 = new ExtratoTO();
        ext2.setTipoMovimentacao("Deposito");
        ext2.setTipo(0);
        ext2.setValorMovimentacao(100.00);
        ext2.setSaldoAtual(600.00);
        ext2.setDataMovimentacao("02/09/2016");

        ExtratoTO ext3 = new ExtratoTO();
        ext3.setTipoMovimentacao("Saque");
        ext3.setTipo(1);
        ext3.setValorMovimentacao(50.00);
        ext3.setSaldoAtual(550.00);
        ext3.setDataMovimentacao("03/09/2016");

        ExtratoTO ext4 = new ExtratoTO();
        ext4.setTipoMovimentacao("Deposito");
        ext4.setTipo(0);
        ext4.setValorMovimentacao(1000.00);
        ext4.setSaldoAtual(1550.00);
        ext4.setDataMovimentacao("04/09/2016");

        ExtratoTO ext5 = new ExtratoTO();
        ext5.setTipoMovimentacao("Transferencia");
        ext5.setTipo(1);
        ext5.setValorMovimentacao(500.00);
        ext5.setSaldoAtual(1050.00);
        ext5.setDataMovimentacao("05/09/2016");

        ArrayList<ExtratoTO> extract = new ArrayList<>();

        extract.add(ext1);
        extract.add(ext2);
        extract.add(ext3);
        extract.add(ext4);
        extract.add(ext5);


        for(int i=0; i < extract.size(); i++){
            stringExtrato = stringExtrato + "Valor Da Movimentacao: " + extract.get(i).getValorMovimentacao() + "\nValor Saldo Atual: " +
                    extract.get(i).getSaldoAtual() + "\nTipo Movimentação: " + extract.get(i).getTipoMovimentacao() + "\nData Movimentacao: " + extract.get(i).getDataMovimentacao() +
                    "\n-------------------------------------------------\n";
        }

        setContentView(R.layout.activity_extract);
        extractView = (TextView) findViewById(R.id.extractText_view);
        extractView.setText(stringExtrato);

    }

    // Consult Extract into seven days
    public void extractFifteenDays(View view){

        ExtratoTO ext1 = new ExtratoTO();
        ext1.setTipoMovimentacao("Saque");
        ext1.setTipo(1);
        ext1.setValorMovimentacao(150.00);
        ext1.setSaldoAtual(500.00);
        ext1.setDataMovimentacao("01/09/2016");

        ExtratoTO ext2 = new ExtratoTO();
        ext2.setTipoMovimentacao("Deposito");
        ext2.setTipo(0);
        ext2.setValorMovimentacao(100.00);
        ext2.setSaldoAtual(600.00);
        ext2.setDataMovimentacao("02/09/2016");

        ExtratoTO ext3 = new ExtratoTO();
        ext3.setTipoMovimentacao("Saque");
        ext3.setTipo(1);
        ext3.setValorMovimentacao(50.00);
        ext3.setSaldoAtual(550.00);
        ext3.setDataMovimentacao("03/09/2016");

        ExtratoTO ext4 = new ExtratoTO();
        ext4.setTipoMovimentacao("Deposito");
        ext4.setTipo(0);
        ext4.setValorMovimentacao(1000.00);
        ext4.setSaldoAtual(1550.00);
        ext4.setDataMovimentacao("04/09/2016");

        ExtratoTO ext5 = new ExtratoTO();
        ext5.setTipoMovimentacao("Transferencia");
        ext5.setTipo(1);
        ext5.setValorMovimentacao(500.00);
        ext5.setSaldoAtual(1050.00);
        ext5.setDataMovimentacao("05/09/2016");

        ArrayList<ExtratoTO> extract = new ArrayList<>();

        extract.add(ext1);
        extract.add(ext2);
        extract.add(ext3);
        extract.add(ext4);
        extract.add(ext5);


        for(int i=0; i < extract.size(); i++){
            stringExtrato = stringExtrato + "Valor Da Movimentacao: " + extract.get(i).getValorMovimentacao() + "\nValor Saldo Atual: " +
                    extract.get(i).getSaldoAtual() + "\nTipo Movimentação: " + extract.get(i).getTipoMovimentacao() + "\nData Movimentacao: " + extract.get(i).getDataMovimentacao() +
                    "\n-------------------------------------------------\n";
        }

        setContentView(R.layout.activity_extract);
        extractView = (TextView) findViewById(R.id.extractText_view);
        extractView.setText(stringExtrato);

    }

    // Consult Extract into seven days
    public void consultPeriodExtract(View view){

        ExtratoTO ext1 = new ExtratoTO();
        ext1.setTipoMovimentacao("Saque");
        ext1.setTipo(1);
        ext1.setValorMovimentacao(150.00);
        ext1.setSaldoAtual(500.00);
        ext1.setDataMovimentacao("01/09/2016");

        ExtratoTO ext2 = new ExtratoTO();
        ext2.setTipoMovimentacao("Deposito");
        ext2.setTipo(0);
        ext2.setValorMovimentacao(100.00);
        ext2.setSaldoAtual(600.00);
        ext2.setDataMovimentacao("02/09/2016");

        ExtratoTO ext3 = new ExtratoTO();
        ext3.setTipoMovimentacao("Saque");
        ext3.setTipo(1);
        ext3.setValorMovimentacao(50.00);
        ext3.setSaldoAtual(550.00);
        ext3.setDataMovimentacao("03/09/2016");

        ExtratoTO ext4 = new ExtratoTO();
        ext4.setTipoMovimentacao("Deposito");
        ext4.setTipo(0);
        ext4.setValorMovimentacao(1000.00);
        ext4.setSaldoAtual(1550.00);
        ext4.setDataMovimentacao("04/09/2016");

        ExtratoTO ext5 = new ExtratoTO();
        ext5.setTipoMovimentacao("Transferencia");
        ext5.setTipo(1);
        ext5.setValorMovimentacao(500.00);
        ext5.setSaldoAtual(1050.00);
        ext5.setDataMovimentacao("05/09/2016");

        ArrayList<ExtratoTO> extract = new ArrayList<>();

        extract.add(ext1);
        extract.add(ext2);
        extract.add(ext3);
        extract.add(ext4);
        extract.add(ext5);


        for(int i=0; i < extract.size(); i++){
            stringExtrato = stringExtrato + "Valor Da Movimentacao: " + extract.get(i).getValorMovimentacao() + "\nValor Saldo Atual: " +
                    extract.get(i).getSaldoAtual() + "\nTipo Movimentação: " + extract.get(i).getTipoMovimentacao() + "\nData Movimentacao: " + extract.get(i).getDataMovimentacao() +
                    "\n-------------------------------------------------\n";
        }

        setContentView(R.layout.activity_extract);
        extractView = (TextView) findViewById(R.id.extractText_view);
        extractView.setText(stringExtrato);
    }

    public void showHideLinearDateFilter(View view){

        setContentView(R.layout.activity_extract);
        linearLayout = (LinearLayout) findViewById(R.id.date_filter);
        assert linearLayout != null;
        linearLayout.setVisibility(View.VISIBLE);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // MotionEvent object holds X-Y values
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            String text = "You click at x = " + event.getX() + " and y = " + event.getY();
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
        if(event.getAction() == MotionEvent.ACTION_UP) {
            String text = "You click at x = " + event.getX() + " and y = " + event.getY();
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }

        if(event.getAction() == MotionEvent.ACTION_CANCEL) {
            String text = "You click at x = " + event.getX() + " and y = " + event.getY();
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }

        if(event.getAction() == MotionEvent.ACTION_MOVE) {
            String text = "You click at x = " + event.getX() + " and y = " + event.getY();
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }

        return super.onTouchEvent(event);
    }

}

package project.caixaeletronico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Account extends AppCompatActivity {

    String stringExtrato;

    private TextView extractView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

    }

    // Consult Extract into seven days
    public void extractSevenDays(View view){

        Extrato ext1 = new Extrato();
        ext1.setTipoMovimentacao("Saque");
        ext1.setTipo(1);
        ext1.setValorMovimentacao(150.00);
        ext1.setSaldoAtual(500.00);
        ext1.setDataMovimentacao("01/09/2016");

        Extrato ext2 = new Extrato();
        ext2.setTipoMovimentacao("Deposito");
        ext2.setTipo(0);
        ext2.setValorMovimentacao(100.00);
        ext2.setSaldoAtual(600.00);
        ext2.setDataMovimentacao("02/09/2016");

        Extrato ext3 = new Extrato();
        ext3.setTipoMovimentacao("Saque");
        ext3.setTipo(1);
        ext3.setValorMovimentacao(50.00);
        ext3.setSaldoAtual(550.00);
        ext3.setDataMovimentacao("03/09/2016");

        Extrato ext4 = new Extrato();
        ext4.setTipoMovimentacao("Deposito");
        ext4.setTipo(0);
        ext4.setValorMovimentacao(1000.00);
        ext4.setSaldoAtual(1550.00);
        ext4.setDataMovimentacao("04/09/2016");

        Extrato ext5 = new Extrato();
        ext5.setTipoMovimentacao("Transferencia");
        ext5.setTipo(1);
        ext5.setValorMovimentacao(500.00);
        ext5.setSaldoAtual(1050.00);
        ext5.setDataMovimentacao("05/09/2016");

        ArrayList<Extrato> extract = new ArrayList<>();

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

        setContentView(R.layout.activity_account);
        extractView = (TextView) findViewById(R.id.extractText_view);
        extractView.setText(stringExtrato);

    }

    // Consult Extract into seven days
    public void extractFifteenDays(View view){

        Extrato ext1 = new Extrato();
        ext1.setTipoMovimentacao("Saque");
        ext1.setTipo(1);
        ext1.setValorMovimentacao(150.00);
        ext1.setSaldoAtual(500.00);
        ext1.setDataMovimentacao("01/09/2016");

        Extrato ext2 = new Extrato();
        ext2.setTipoMovimentacao("Deposito");
        ext2.setTipo(0);
        ext2.setValorMovimentacao(100.00);
        ext2.setSaldoAtual(600.00);
        ext2.setDataMovimentacao("02/09/2016");

        Extrato ext3 = new Extrato();
        ext3.setTipoMovimentacao("Saque");
        ext3.setTipo(1);
        ext3.setValorMovimentacao(50.00);
        ext3.setSaldoAtual(550.00);
        ext3.setDataMovimentacao("03/09/2016");

        Extrato ext4 = new Extrato();
        ext4.setTipoMovimentacao("Deposito");
        ext4.setTipo(0);
        ext4.setValorMovimentacao(1000.00);
        ext4.setSaldoAtual(1550.00);
        ext4.setDataMovimentacao("04/09/2016");

        Extrato ext5 = new Extrato();
        ext5.setTipoMovimentacao("Transferencia");
        ext5.setTipo(1);
        ext5.setValorMovimentacao(500.00);
        ext5.setSaldoAtual(1050.00);
        ext5.setDataMovimentacao("05/09/2016");

        ArrayList<Extrato> extract = new ArrayList<>();

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

        setContentView(R.layout.activity_account);
        extractView = (TextView) findViewById(R.id.extractText_view);
        extractView.setText(stringExtrato);

    }

    // Consult Extract into seven days
    public void consultExtract(View view){

        Extrato ext1 = new Extrato();
        ext1.setTipoMovimentacao("Saque");
        ext1.setTipo(1);
        ext1.setValorMovimentacao(150.00);
        ext1.setSaldoAtual(500.00);
        ext1.setDataMovimentacao("01/09/2016");

        Extrato ext2 = new Extrato();
        ext2.setTipoMovimentacao("Deposito");
        ext2.setTipo(0);
        ext2.setValorMovimentacao(100.00);
        ext2.setSaldoAtual(600.00);
        ext2.setDataMovimentacao("02/09/2016");

        Extrato ext3 = new Extrato();
        ext3.setTipoMovimentacao("Saque");
        ext3.setTipo(1);
        ext3.setValorMovimentacao(50.00);
        ext3.setSaldoAtual(550.00);
        ext3.setDataMovimentacao("03/09/2016");

        Extrato ext4 = new Extrato();
        ext4.setTipoMovimentacao("Deposito");
        ext4.setTipo(0);
        ext4.setValorMovimentacao(1000.00);
        ext4.setSaldoAtual(1550.00);
        ext4.setDataMovimentacao("04/09/2016");

        Extrato ext5 = new Extrato();
        ext5.setTipoMovimentacao("Transferencia");
        ext5.setTipo(1);
        ext5.setValorMovimentacao(500.00);
        ext5.setSaldoAtual(1050.00);
        ext5.setDataMovimentacao("05/09/2016");

        ArrayList<Extrato> extract = new ArrayList<>();

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

        setContentView(R.layout.activity_account);
        extractView = (TextView) findViewById(R.id.extractText_view);
        extractView.setText(stringExtrato);

    }
}

package project.caixaeletronico.activitys;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import project.caixaeletronico.R;
import project.caixaeletronico.to.ExtratoTO;

public class Account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        // Change WellCome Font
        Typeface centuryGothic = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/GOTHIC.TTF");
        TextView wellcomeTexView1 = (TextView) findViewById(R.id.wellcome_part1_textView);
        TextView wellcomeTexView2 = (TextView) findViewById(R.id.wellcome_part1_textView);
        TextView wellcomeTexView3 = (TextView) findViewById(R.id.wellcome_part1_textView);

        wellcomeTexView1.setTypeface(centuryGothic);
        wellcomeTexView2.setTypeface(centuryGothic);
        wellcomeTexView3.setTypeface(centuryGothic);

    }

    public void extractActivity(View view){

        Intent intent = new Intent(this, Extract.class);

        startActivity(intent);

    }

}

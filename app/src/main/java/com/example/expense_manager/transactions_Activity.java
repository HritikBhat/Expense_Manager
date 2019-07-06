package com.example.expense_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class transactions_Activity extends AppCompatActivity {
    private EditText reason,amount;
    private Button sub_button;
    private RadioGroup rg;
    private RadioButton r_credit,r_debit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions_);

        reason=findViewById(R.id.reason);
        amount=findViewById(R.id.amount);
        sub_button=findViewById(R.id.submit_but);
        r_credit=findViewById(R.id.credit);
        r_debit=findViewById(R.id.debit);

        rg=findViewById(R.id.radiogroup);

        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String reason_val=reason.getText().toString()
                        ,amount_val=amount.getText().toString()
                        ,type_val;

                if(r_credit.isChecked())
                    {type_val="Credit";}
                else
                    {type_val="Debit";}
                System.out.println("Reason:"+reason_val);
                System.out.println("Type:"+type_val);
                System.out.println("Amount:"+amount_val);
                Intent f = new Intent(transactions_Activity.this,activity_transactions_confirm.class);
                f.putExtra("Reason",reason_val);
                f.putExtra("Type",type_val);
                f.putExtra("Amount",amount_val);
                startActivity(f);
            }
        });
    }
}

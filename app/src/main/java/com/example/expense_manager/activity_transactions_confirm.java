package com.example.expense_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_transactions_confirm extends AppCompatActivity {
    private TextView type,reason,amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions_confirm);

        type=findViewById(R.id.type_text_confirm);
        reason=findViewById(R.id.reason_text_confirm);
        amount=findViewById(R.id.amt_text_confirm);
        Intent f = getIntent();
        String stype =f.getStringExtra("Type");
        String sreason=f.getStringExtra("Reason");
        String samount=f.getStringExtra("Amount");
        type.setText("Type:   "+stype);
        reason.setText("Reason:  "+sreason);
        amount.setText("Amount:  "+samount);
    }
}

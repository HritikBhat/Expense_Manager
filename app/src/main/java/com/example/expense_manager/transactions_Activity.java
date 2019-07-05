package com.example.expense_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class transactions_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions_);
        final EditText reason,amount;
        reason=findViewById(R.id.reason);
        amount=findViewById(R.id.amount);
    }
}

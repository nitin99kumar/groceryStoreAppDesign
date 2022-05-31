package com.example.grocerystoreproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText productName;
    EditText productId;
    EditText productPrice;
    EditText productQty;
    EditText productStocks;
    EditText productImageUrl;
    Button saveData;

    productAdd prod = new productAdd();

    public static final ArrayList<productAdd> addData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productName = (EditText) findViewById(R.id.productName);
        productId = (EditText) findViewById(R.id.productId);
        productPrice = (EditText) findViewById(R.id.productPrice);
        productQty = (EditText) findViewById(R.id.productQuantity);
        productStocks = (EditText) findViewById(R.id.productStock);
        productImageUrl = (EditText) findViewById(R.id.productImageUrl);
        saveData = (Button) findViewById(R.id.SaveData);

        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* String name = productName.getText().toString();
                String id = productId.getText().toString();
                String price = productPrice.getText().toString();
                String quantity = productQty.getText().toString();
                String stocks = productStocks.getText().toString();
                String imgUrl = productImageUrl.getText().toString();

                prod.setName(name);
                prod.setId(id);
                prod.setPrice(price);
                prod.setQuantity(quantity);
                prod.setStock(stocks);
                prod.setImageUrl(imgUrl);

                addData.add(prod);*/

                Intent intent = new Intent(MainActivity.this, SeeAllOrders.class);
                startActivity(intent);

            }
        });

    }
}
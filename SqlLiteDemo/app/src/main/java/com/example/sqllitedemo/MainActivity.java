package com.example.sqllitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtUsername;
    EditText txtPassword;
    BooksDatabase booksDtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        booksDtb = new BooksDatabase(this, "qlsach.sqlite", null, 1);
        //create account
        createAccountTb();
        createBookTb();
        createCateTb();
        btnLogin = findViewById(R.id.btnLogin);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPass);
    }

    private void createAccountTb(){
        booksDtb.QueryData("CREATE TABLE IF NOT EXISTS Account(Acc_id INTEGER PRIMARY KEY AUTOINCREMENT, Username VARCHAR(100), Password VARCHAR(100))");

        //add account
        booksDtb.QueryData("INSERT INTO Account VALUES(null, 'admin', '123abc')");
        booksDtb.QueryData("INSERT INTO Account VALUES(null, 'admin2', '123abc')");
        booksDtb.QueryData("INSERT INTO Account VALUES(null, 'admin3', '123abc')");
    }

    private void createCateTb() {
        booksDtb.QueryData("CREATE TABLE IF NOT EXISTS Category(Cate_id INTEGER PRIMARY KEY AUTOINCREMENT, Cate_name VARCHAR(100), Cate_des VARCHAR(100))");

        //add category
        booksDtb.QueryData("INSERT INTO Category VALUES(null, 'Fantasy', 'not real')");
        booksDtb.QueryData("INSERT INTO Category VALUES(null, 'Comedy', 'make you laugh')");
        booksDtb.QueryData("INSERT INTO Category VALUES(null, 'Action', 'make you excited')");
        booksDtb.QueryData("INSERT INTO Category VALUES(null, 'Romantic', 'make you soft')");
    }

    private void createBookTb() {
        booksDtb.QueryData("CREATE TABLE IF NOT EXISTS Book(Book_id INTEGER PRIMARY KEY AUTOINCREMENT, Book_name VARCHAR(100), Book_au VARCHAR(100), Book_year INTEGER, Book_cate_id INTEGER)");
    }
}

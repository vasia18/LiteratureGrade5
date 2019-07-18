package arkadii.ivanov.literaturegrade5.Glava1;

import android.os.Bundle;
import android.widget.Toolbar; // Нужен другой импорт import android.support.v7.widget.Toolbar

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import arkadii.ivanov.literaturegrade5.R;

public class glavaOne extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glava_one);
        toolbar = findViewById(R.id.my_toolbar);
        toolbar.setTitle("ToolBar.setTitle");        //Прописываем тайтл У ToolBar-а.
        setSupportActionBar(my_toolbar);             //Уточнить что это?
        toolbar.setSubtitle("toolbar.setSubtitle");  //Прописываем текст под тайтлом(маленький текст)

    }
}

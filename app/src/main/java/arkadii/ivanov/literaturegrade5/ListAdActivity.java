package arkadii.ivanov.literaturegrade5;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListAdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_adapter);

        private Toolbar toolbar;

        @Override
        protected void onCreate (@Nullable Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_glava_one);
            toolbar = findViewById(R.id.my_toolbar);
            toolbar.setTitle("ToolBar.setTitle");        //Прописываем тайтл У ToolBar-а.
            setSupportActionBar(my_toolbar);             //Уточнить что это?
            toolbar.setSubtitle("toolbar.setSubtitle");  //Прописываем текст под тайтлом(маленький текст)

            //toolbar.setElevation(10.f);

            //Compatibility checking
            if (Build.VERSION.SDK_INT > -Build.VERSION_CODES.LOLLIPOP) {
                toolbar.setElevation(10.f);
            }
        }
    }

package arkadii.ivanov.literaturegrade5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MyLog";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);



		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		Log.d(TAG, "Сработал метод, который уберает понель состояния");


	}

	public void btn_go_activityTwo(View view) {
		Intent intent = new Intent(MainActivity.this, ListAdActivity.class);
		startActivity(intent);
		Log.d(TAG, "Сработала кнопка на TwoActivity");

	}


}

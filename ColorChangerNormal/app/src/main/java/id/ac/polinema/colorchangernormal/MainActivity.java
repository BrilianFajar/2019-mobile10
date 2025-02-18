package id.ac.polinema.colorchangernormal;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	private ConstraintLayout rootView;
	private Button btnChangeColor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rootView = findViewById(R.id.layout_main);
		btnChangeColor = findViewById(R.id.change_color);
		
		rootView.setBackgroundColor(generateRandomColor());

		// Tambahkan event klik pada tombol
	}

	private int generateRandomColor(){
		Random rnd = new Random();
		return Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
	}

}

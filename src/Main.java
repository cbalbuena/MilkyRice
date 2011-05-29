
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidconnect.milkyrice.R;
import androidconnect.milkyrice.common.BaseActivity;

public class Main extends BaseActivity {

	public Main() 
	{
		super();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Text in Screen
		TextView tv = new TextView(this);
		tv.setText("Hello, Android");

		setContentView(tv);

	}

}
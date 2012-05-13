package me.maxwin;

import me.maxwin.view.XButton;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class XButtonActivity extends Activity {
	private int mCnt = 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final XButton btn = (XButton)findViewById(R.id.xButton3);
			
        btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				btn.setText((++mCnt)+ "");
				btn.reset();
			}
		});
    }
}
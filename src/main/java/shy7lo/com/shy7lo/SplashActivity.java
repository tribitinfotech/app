package shy7lo.com.shy7lo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

import shy7lo.com.shy7lo.utils.IntentHandler;

/**
 * Created by JitenRamen on 19-08-2016.
 */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                IntentHandler.startActivity(getActivity(), LandingPageActivity.class);
                finish();
            }
        }, 3000);

    }

    private Context getActivity() {
        return SplashActivity.this;
    }
}

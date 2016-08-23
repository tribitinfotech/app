package shy7lo.com.shy7lo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import shy7lo.com.shy7lo.typeface.MyTypeFace;

/**
 * Created by JitenRamen on 20-08-2016.
 */
public class LandingPageActivity extends Activity {

    @BindView(R.id.tvSelectLanguage)
    TextView tvSelectLanguage;
    @BindView(R.id.tvSelectCountry)
    TextView tvSelectCountry;
    @BindView(R.id.tvNext)
    TextView tvNext;
    @BindView(R.id.btnEnglish)
    Button btnEnglish;
    @BindView(R.id.btnArabic)
    Button btnArabic;
    @BindView(R.id.btnSaudi)
    Button btnSaudi;
    @BindView(R.id.btnDubai)
    Button btnDubai;
    @BindView(R.id.btnQatar)
    Button btnQatar;
    @BindView(R.id.btnKuwait)
    Button btnKuwait;
    @BindView(R.id.btnBahrain)
    Button btnBahrain;
    @BindView(R.id.rltNext)
    RelativeLayout rltNext;
    @BindView(R.id.ibNext)
    ImageButton ibNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        ButterKnife.bind(getActivity());

        setTypeface();
    }

    private void setTypeface() {
        tvSelectLanguage.setTypeface(MyTypeFace.RalewayBold(getActivity()));
        tvSelectCountry.setTypeface(MyTypeFace.RalewayBold(getActivity()));
        btnEnglish.setTypeface(MyTypeFace.RalewaySemiBold(getActivity()));
        btnArabic.setTypeface(MyTypeFace.RalewaySemiBold(getActivity()));
        tvNext.setTypeface(MyTypeFace.RalewaySemiBold(getActivity()));
    }

    private Activity getActivity() {
        return LandingPageActivity.this;
    }
}

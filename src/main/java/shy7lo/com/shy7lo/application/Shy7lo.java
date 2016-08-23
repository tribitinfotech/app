package shy7lo.com.shy7lo.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by JitenRamen on 23-08-2016.
 */
public class Shy7lo extends Application {

//    public static Typeface RalewayBold, RalewayExtraBold, RalewayExtraLight, RalewayHeavy, RalewayLight,
//    RalewayMedium, RalewayRegular, RalewaySemiBold, RalewayThin, DroidKufiBold, DroidKufiRegular,
//    DroidNaskhBold, DroidNaskhRegular;

    @Override
    public void onCreate() {
        super.onCreate();

        setFont();
    }

    private void setFont() {
//        RalewayBold = MyTypeFace.RalewayBold(getContext());
//        RalewayExtraBold = MyTypeFace.RalewayExtraBold(getContext());
//        RalewayExtraLight = MyTypeFace.RalewayExtraLight(getContext());
//        RalewayHeavy = MyTypeFace.RalewayHeavy(getContext());
//        RalewayLight = MyTypeFace.RalewayLight(getContext());
//        RalewayMedium = MyTypeFace.RalewayMedium(getContext());
//        RalewayRegular = MyTypeFace.RalewayRegular(getContext());
//        RalewaySemiBold = MyTypeFace.RalewaySemiBold(getContext());
//        RalewayThin = MyTypeFace.RalewayThin(getContext());
//        DroidKufiBold = MyTypeFace.DroidKufiBold(getContext());
//        DroidKufiRegular = MyTypeFace.DroidKufiRegular(getContext());
//        DroidNaskhBold = MyTypeFace.DroidNaskhBold(getContext());
//        DroidNaskhRegular = MyTypeFace.DroidNaskhRegular(getContext());
    }

    private Context getContext() {
        return getApplicationContext();
    }


}

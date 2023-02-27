package com.example.mybankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgbob,imgsbi,imghdfc,imgicici,imgpnb,imgboi,imgcanara,imguco,imgmaharastraBank,imgaxis;
    ImageButton imbBobCall, imbBobLink, imbBobShare, imbSbiCall, imbSbiLink, imbSbiShare, imbHdfcCall, imbHdfcLink, imbHdfcShare;
    ImageButton imbIciciCall, imbIciciLink, imbIciciShare, imbPnbCall, imbPnbLink, imbPnbShare, imbBoiCall, imbBoiLink, imbBoiShare;
    ImageButton imbCanaraCall, imbCanaraLink, imbCanaraShare, imbUcoCall, imbUcoLink, imbUcoShare, imbMahaCall, imbMahaLink, imbMahaShare;
    ImageButton imbAxisCall, imbAxisLink, imbAxisShare;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idbank();
        bankofbaorda();
        statebankofindia();
        hdfc();
        icici();
        pnb();
        bankofindia();
        canara();
        uco();
        maharashtra();
        axis();
    }

    private void idbank() {

        imbBobCall = findViewById(R.id.imbBobCall);
        imbBobLink = findViewById(R.id.imbBobLink);
        imbBobShare = findViewById(R.id.imbBobShare);
        imbSbiCall = findViewById(R.id.imbSbiCall);
        imbSbiLink = findViewById(R.id.imbSbiLink);
        imbSbiShare = findViewById(R.id.imbSbiShare);
        imbHdfcCall = findViewById(R.id.imbHdfcCall);
        imbHdfcLink = findViewById(R.id.imbHdfcLink);
        imbHdfcShare = findViewById(R.id.imbHdfcShare);
        imbIciciCall = findViewById(R.id.imbIciciCall);
        imbIciciLink = findViewById(R.id.imbIciciLink);
        imbIciciShare = findViewById(R.id.imbIciciShare);
        imbPnbCall = findViewById(R.id.imbPnbCall);
        imbPnbLink = findViewById(R.id.imbPnbLink);
        imbPnbShare = findViewById(R.id.imbPnbShare);
        imbBoiCall = findViewById(R.id.imbBoiCall);
        imbBoiLink = findViewById(R.id.imbBoiLink);
        imbBoiShare = findViewById(R.id.imbBoiShare);
        imbCanaraCall = findViewById(R.id.imbCanaraCall);
        imbCanaraLink = findViewById(R.id.imbCanaraLink);
        imbCanaraShare = findViewById(R.id.imbCanaraShare);
        imbUcoCall = findViewById(R.id.imbUcoCall);
        imbUcoLink = findViewById(R.id.imbUcoLink);
        imbUcoShare = findViewById(R.id.imbUcoShare);
        imbMahaCall = findViewById(R.id.imbMahaCall);
        imbMahaLink = findViewById(R.id.imbMahaLink);
        imbMahaShare = findViewById(R.id.imbMahaShare);
        imbAxisCall = findViewById(R.id.imbAxisCall);
        imbAxisLink = findViewById(R.id.imbAxisLink);
        imbAxisShare = findViewById(R.id.imbAxisShare);
        imgbob=findViewById(R.id.imgbob);
        imgsbi=findViewById(R.id.imgsbi);
        imghdfc=findViewById(R.id.imghdfc);
        imgicici=findViewById(R.id.imgicici);
        imgboi=findViewById(R.id.imgboi);
        imgpnb=findViewById(R.id.imgpnb);
        imgcanara=findViewById(R.id.imgcanara);
        imguco=findViewById(R.id.imguco);
        imgmaharastraBank=findViewById(R.id.imgmaharastraBank);
        imgaxis=findViewById(R.id.imgaxis);

    }

    private void bankofbaorda() {

            imbBobCall.setOnClickListener(view -> {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:18001024455"));
                startActivity(intent);

            });

            imbBobLink.setOnClickListener(view->{

                String url = "https://www.bankofbaroda.in";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            });


            imbBobShare.setOnClickListener(view-> {

                Intent a = new Intent(Intent.ACTION_SEND);
                a.setType("text/plain");
                a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
                a.putExtra(Intent.EXTRA_TEXT, "https://www.bankofbaroda.in");
                startActivity(Intent.createChooser(a, "Share URL"));
            });

            imgbob.setOnClickListener( m->{
                Intent start = new Intent(MainActivity.this, WebViewActivity.class );
                start.putExtra("url", "https://www.bankofbaroda.in/");
                startActivity(start);
            });



    }

    private void  statebankofindia(){
        imbSbiCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18001234"));
            startActivity(intent);

        });

        imbSbiLink.setOnClickListener(view->{

            String url = "https://www.onlinesbi.sbi/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbSbiShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://www.onlinesbi.sbi/");
            startActivity(Intent.createChooser(a, "Share URL"));
        });
        imgsbi.setOnClickListener( m->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://www.onlinesbi.sbi/");
            startActivity(start);
        });

    }

    private void hdfc(){
        imbHdfcCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18002026161"));
            startActivity(intent);

        });

        imbHdfcLink.setOnClickListener(view->{

            String url = "https://www.hdfcbank.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbHdfcShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://www.hdfcbank.com/");
            startActivity(Intent.createChooser(a, "Share URL"));
        });

        imghdfc.setOnClickListener( j ->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://www.hdfcbank.com/");
            startActivity(start);
        });
    }

    private void icici(){
        imbIciciCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18001080"));
            startActivity(intent);

        });

        imbIciciLink.setOnClickListener(view->{

            String url = "https://www.icicibank.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbIciciShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://www.icicibank.com/");
            startActivity(Intent.createChooser(a, "Share URL"));
        });
        imgicici.setOnClickListener( j ->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://www.icicibank.com/");
            startActivity(start);
        });

    }

    private void pnb(){
        imbPnbCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18001802222"));
            startActivity(intent);

        });

        imbPnbLink.setOnClickListener(view->{

            String url = "https://www.pnbindia.in/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbPnbShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://www.pnbindia.in/");
            startActivity(Intent.createChooser(a, "Share URL"));
        });
        imgpnb.setOnClickListener( j ->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://www.pnbindia.in/");
            startActivity(start);
        });
    }

    private void bankofindia(){
        imbBoiCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:9033609969"));
            startActivity(intent);

        });

        imbBoiLink.setOnClickListener(view->{

            String url = "https://www.bankofindia.co.in/web/guest/home";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbBoiShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://www.bankofindia.co.in/web/guest/home");
            startActivity(Intent.createChooser(a, "Share URL"));
        });

        imgboi.setOnClickListener( j ->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://bankofindia.co.in/");
            startActivity(start);
        });

    }

    private void canara(){
        imbCanaraCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18004250018"));
            startActivity(intent);

        });

        imbCanaraLink.setOnClickListener(view->{

            String url = "https://canarabank.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbCanaraShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://canarabank.com/");
            startActivity(Intent.createChooser(a, "Share URL"));
        });
        imgcanara.setOnClickListener( j ->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://canarabank.com/");
            startActivity(start);
        });

    }
    private void uco(){
        imbUcoCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18001030123"));
            startActivity(intent);

        });

        imbUcoLink.setOnClickListener(view->{

            String url = "https://www.ucobank.com/Hindi/homehindi.aspx";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbUcoShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://www.ucobank.com/Hindi/homehindi.aspx");
            startActivity(Intent.createChooser(a, "Share URL"));
        });
        imguco.setOnClickListener( j ->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://www.ucobank.com/");
            startActivity(start);
        });

    }

    private void maharashtra(){
        imbMahaCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18002334526"));
            startActivity(intent);

        });

        imbMahaLink.setOnClickListener(view->{

            String url = "https://bankofmaharashtra.in/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbMahaShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://bankofmaharashtra.in/");
            startActivity(Intent.createChooser(a, "Share URL"));
        });
        imgmaharastraBank.setOnClickListener( j ->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://bankofmaharashtra.in/");
            startActivity(start);
        });

    }

    private void axis(){
        imbAxisCall.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:9033609969"));
            startActivity(intent);

        });

        imbAxisLink.setOnClickListener(view->{

            String url = "https://www.axisbank.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        imbAxisShare.setOnClickListener(view-> {

            Intent a = new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT, "https://www.axisbank.com/");
            startActivity(Intent.createChooser(a, "Share URL"));
        });

        imgaxis.setOnClickListener( j ->{
            Intent start = new Intent(MainActivity.this, WebViewActivity.class );
            start.putExtra("url", "https://www.axisbank.com/");
            startActivity(start);
        });
    }

}
package com.example.galleryandcamera;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.galleryandcamera.databinding.ActivityCustomDialogBinding;
import com.example.galleryandcamera.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
//    ActivityResultLauncher<String> getphoto;
//    int PickImage=100,GetImage=101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CustomGalleryButton();
        OpenCamera();
        custom();

    }

    private void custom() {
        binding.btnCustom.setOnClickListener( view -> {

            Dialog dialog=new Dialog(MainActivity.this);

            ActivityCustomDialogBinding binding=ActivityCustomDialogBinding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());


//            camera
            binding.txtTakePhoto.setOnClickListener( l -> {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                // startActivityForResult(cameraIntent, GetImage);
                cameraLauncher.launch(cameraIntent);
                dialog.dismiss();

            });

//gallery
            binding.txtChoosePhoto.setOnClickListener( b -> {
                Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                // startActivityForResult(gallery, PICK_IMAGE);
                galleryLauncher.launch(gallery);
                dialog.dismiss();
            });

        binding.txtCancel.setOnClickListener( n -> {

            dialog.dismiss();
        });


            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            dialog.show();

        });


    }

//    cameraLaunch

    ActivityResultLauncher<Intent> cameraLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        Intent data = result.getData();
                        Bitmap photo = (Bitmap) data.getExtras().get("data");
                     binding.imgCustomImage.setImageBitmap(photo);
                    }
                }
            });

    private void OpenCamera() {
        binding.btnCamera.setOnClickListener( l -> {
            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
           // startActivityForResult(cameraIntent, GetImage);
            cameraLauncher.launch(cameraIntent);

        });

    }


    private void CustomGalleryButton() {

        binding.btnGallery.setOnClickListener( b -> {
            Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
           // startActivityForResult(gallery, PICK_IMAGE);
            galleryLauncher.launch(gallery);

        });
    }
    ActivityResultLauncher<Intent> galleryLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        Intent data = result.getData();
                        Uri uri=data.getData();
                        binding.imgCustomImage.setImageURI(uri);
                    }
                }
            });



//    OLD METHOD


//   @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//            if(requestCode==PickImage && resultCode==RESULT_OK)
//            {
//                Uri uri=data.getData();
//                binding.imgCustomImage.setImageURI(uri);
//            }
//            else if(requestCode==GetImage && resultCode==RESULT_OK)
//        {
//            Bitmap photo = (Bitmap) data.getExtras().get("data");
//            binding.imgCustomImage.setImageBitmap(photo);
//        }
//
//
//    }



}
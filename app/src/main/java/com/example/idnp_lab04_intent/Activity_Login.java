package com.example.idnp_lab04_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.idnp_lab04_intent.databinding.ActivityMainBinding;

public class Activity_Login extends AppCompatActivity {

    // Used to load the 'idnp_lab04_intent' library on application startup.
    static {
        System.loadLibrary("idnp_lab04_intent");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'idnp_lab04_intent' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
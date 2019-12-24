package com.example.bloodbank.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.bloodbank.R;
import com.example.bloodbank.view.fragment.userCycle.LoginFragment;

import static com.example.bloodbank.utils.HelperMethod.replaceFragment;

public class UserCycleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_cycle);
              LoginFragment fragment = new LoginFragment();
        replaceFragment(getSupportFragmentManager(), R.id.fram, new LoginFragment());
    }

}
package com.mytracker.familygpstracker.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;
import com.mytracker.familygpstracker.R;

public class IntroActivity extends AppIntro
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        SliderPage sliderPage1 = new SliderPage();
        sliderPage1.setTitle("Join app_bar_main Circle");
        sliderPage1.setDescription("Join your family member circle by entering the circle code.");
        sliderPage1.setImageDrawable(R.drawable.slide_1);
        sliderPage1.setBgColor(Color.parseColor("#f64c73"));
        addSlide(AppIntroFragment.newInstance(sliderPage1));



        SliderPage sliderPage2= new SliderPage();
        sliderPage2.setTitle("Send Help Alerts");
        sliderPage2.setDescription("Send help alerts to your circle members.");
        sliderPage2.setImageDrawable(R.drawable.slide_6);
        sliderPage2.setBgColor(Color.parseColor("#20d2bb"));
        addSlide(AppIntroFragment.newInstance(sliderPage2));




        setFadeAnimation();

    }



    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.

        finish();

    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

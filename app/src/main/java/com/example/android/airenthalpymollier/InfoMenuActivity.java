package com.example.android.airenthalpymollier;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Damian on 2017-08-02.
 */

public class InfoMenuActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String HTTPS_GITHUB = "https://github.com/ludi889/Enginner-Toolbox";
    private static final String HTTPS_LINKEDIN = "https://www.linkedin.com/in/damian-zi%C3%B3%C5%82kowski-41ab38141/";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_menu);
//setting textViews
        TextView linkedinUrl = findViewById(R.id.linkedin_account_link);
        TextView githubUrl = findViewById(R.id.github_account_link);
        //setting listeners
        linkedinUrl.setOnClickListener(this);
        githubUrl.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Uri uri = null;
        switch (v.getId()) {
            case R.id.linkedin_account_link:
                uri = Uri.parse(HTTPS_LINKEDIN);
                break;
            case R.id.github_account_link:
                uri = Uri.parse(HTTPS_GITHUB);
                break;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

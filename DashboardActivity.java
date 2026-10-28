
package com.example.growsync;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        View profileMenu = findViewById(R.id.btnProfileMenu);

        profileMenu.setOnClickListener(v -> {
            PopupMenu popup = new PopupMenu(
                    DashboardActivity.this,
                    profileMenu
            );

            popup.getMenu().add("My Profile");
            popup.getMenu().add("Logout");

            popup.setOnMenuItemClickListener(item -> {
                String selected = item.getTitle().toString();

                if (selected.equals("My Profile")) {
                    Toast.makeText(
                            DashboardActivity.this,
                            "Profile screen coming next!",
                            Toast.LENGTH_SHORT
                    ).show();
                } else if (selected.equals("Logout")) {
                    Intent intent = new Intent(
                            DashboardActivity.this,
                            LoginActivity.class
                    );
                    intent.setFlags(
                            Intent.FLAG_ACTIVITY_CLEAR_TOP |
                                    Intent.FLAG_ACTIVITY_NEW_TASK
                    );
                    startActivity(intent);
                    finish();
                }

                return true;
            });

            popup.show();
        });
    }
}

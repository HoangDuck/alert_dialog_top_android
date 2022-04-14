package hcmute.hoanghuuduc.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAlert(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setTitle("This is Alert Dialog");
        builder.setMessage("Bottom Alert dialog");

        // set the neutral button to do some actions
        builder.setNeutralButton("DISMISS", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Alert Dialog Dismissed", Toast.LENGTH_SHORT).show();
            }
        });

        // set the positive button to do some actions
        builder.setPositiveButton("OKAY", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "OKAY", Toast.LENGTH_SHORT).show();
            }
        });

        // set the negative button to do some actions
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "CANCEL", Toast.LENGTH_SHORT).show();
            }
        });

        // show the alert dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        // get the top most window of the android
        // screen using getWindow() method
        // and set the the gravity of the window to
        // top that is alert dialog will be now at
        // the topmost position
        alertDialog.getWindow().setGravity(Gravity.TOP);
    }
}
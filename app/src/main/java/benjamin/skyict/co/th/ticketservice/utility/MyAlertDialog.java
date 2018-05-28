package benjamin.skyict.co.th.ticketservice.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import benjamin.skyict.co.th.ticketservice.R;

public class MyAlertDialog {

    private Context context;

    public MyAlertDialog(Context context) {
        this.context = context;
    }

    public void normalDialog(String titleString, String delailString) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.logo_sky_48);
        builder.setTitle(titleString);
        builder.setMessage(delailString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();


    }

}

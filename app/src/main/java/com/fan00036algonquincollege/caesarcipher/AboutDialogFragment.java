/**
 *  CaesarCipher App/using intent to change activity and call the CaesarCipher class to implement encrypted and decrypted.
 *  @author Jinhong Fan (fan00036@algonquinlive.com)
 */


package com.fan00036algonquincollege.caesarcipher;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by helen on 2015-11-05.
 */
public class AboutDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder( getActivity() );
        //TODO pro-tip: cascading messages
        builder.setTitle( R.string.action_about )
                .setMessage( R.string.author )
                .setCancelable( false )
                .setPositiveButton( android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick( DialogInterface dialog, int which ) {
                        dialog.dismiss();
                    }
                });

        // Create the AlertDialog object and return it
        return builder.create();
    }
}

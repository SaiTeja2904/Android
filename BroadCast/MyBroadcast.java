package example.sai.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Sai Teja on 15-11-2017.
 */

public class MyBroadcast extends BroadcastReceiver {
    Context con;
    @Override
    public void onReceive(Context context, Intent intent) {
        con=context;
        TelephonyManager tmgr = (TelephonyManager) context
                .getSystemService(Context.TELEPHONY_SERVICE);

        //Create Listner
        MyPhoneStateListener PhoneListener = new MyPhoneStateListener();

        // Register listener for LISTEN_CALL_STATE
        tmgr.listen(PhoneListener, PhoneStateListener.LISTEN_CALL_STATE);
    }
    private class MyPhoneStateListener extends PhoneStateListener {

        public void onCallStateChanged(int state, String incomingNumber) {

            Log.d("MyPhoneListener",state+"   incoming no:"+incomingNumber);

            if (state == 1) {

                String msg = "New Phone Call Event. Incomming Number : "+incomingNumber;

                Toast.makeText(con, msg, Toast.LENGTH_SHORT).show();


            }
        }
    }
}

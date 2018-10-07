package shubhangi.service.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this,"service bind", Toast.LENGTH_SHORT).show();

        // TODO: Return the communication channel to the service.
        // throw new UnsupportedOperationException("Not yet implemented");
        return  null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"service create", Toast.LENGTH_SHORT).show();

        super.onCreate();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Toast.makeText(this,"service Unbind", Toast.LENGTH_SHORT).show();

        return super.onUnbind(intent);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String message = intent.getStringExtra("message");
        Toast.makeText(this,"service started" + message, Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        Toast.makeText(this,"service destroy", Toast.LENGTH_LONG).show();

    }

}


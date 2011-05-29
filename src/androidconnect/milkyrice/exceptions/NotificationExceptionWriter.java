package androidconnect.milkyrice.exceptions;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidconnect.milkyrice.R;
import androidconnect.milkyrice.common.MilkyRiceConstants;

/***
 * FileExceptionWriter
 * 
 * @author carlosbalbuena
 * @see http
 *      ://developer.android.com/guide/topics/ui/notifiers/notifications.html
 *      History 2011.05.29 Initial Version
 */
public class NotificationExceptionWriter implements ExceptionWriter {

	private Activity internalActivity;

	@Override
	public void write(String message) {

		String ns = Context.NOTIFICATION_SERVICE;
		NotificationManager mNotificationManager = (NotificationManager) internalActivity
				.getSystemService(ns);

		//int icon = R.drawable.notification_icon;
		CharSequence tickerText = "Hello";
		long when = System.currentTimeMillis();

		Notification notification = new Notification(0, tickerText, when);

		Context context = internalActivity.getApplicationContext();
		CharSequence contentTitle = "My notification";
		CharSequence contentText = "Hello World!";
		Intent notificationIntent = new Intent();
		PendingIntent contentIntent = PendingIntent.getActivity(context, 0,
				notificationIntent, 0);

		notification.setLatestEventInfo(context, contentTitle, contentText,
				contentIntent);

		mNotificationManager.notify(MilkyRiceConstants.LOG_ID, notification);

	}

	public void setInternalActivity(Activity internalActivity) {
		this.internalActivity = internalActivity;
	}

	

}

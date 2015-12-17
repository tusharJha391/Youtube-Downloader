package hackerspace.invento.youtubedownloader;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

/**
 * Created by night-crawler on 12/11/15.
 */
public class GetVideo extends  AsyncTask<Void, Void, Void> {

    String URL;
    Context context;
    String Quality;

    void SetURL(String u, Context c,String Q) {

        this.URL = "http://www.saveitoffline.com/#"+u;
        this.context = c;
        Quality = Q;

    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();

    }

    @Override
    protected Void doInBackground(Void... arg0) {

        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        // Dismiss the progress dialog
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
        context.startActivity(browserIntent);

    }


}
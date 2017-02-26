package css.cis3334.intentsperformances;

import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

//declare components
    Button btn1Web, but1Calendar, btn1Map, btn2Web, but2Calendar,
            btn2Map, btn3Web, btn3Calendar, btn3Map;
    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        setupButtonClickEvents();

    }


    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo);
        btn1Web.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");

                String url = "http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=view%3Devent%26eventid%3D122420167";

                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar);
        but1Calendar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Do something in response to button click
                //textViewStatus.setText("Code should set a calendar event for performance 1");

                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");

                calIntent.putExtra(CalendarContract.Events.TITLE, "SAL Colloquium 'The Robot Next Door'");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Tower Hall 4119");

                GregorianCalendar begDate = new GregorianCalendar(2017, 2, 24, 15, 40);
                GregorianCalendar endDate = new GregorianCalendar(2017, 2, 24, 16, 40);

                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());

                startActivity(calIntent);

            }
        });

        /**
         *   Set up button click event listener for the map info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map);
        btn1Map.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                Uri geolocation1 = Uri.parse("geo:46.8163594,-92.1064829");

                Intent intent = new Intent(Intent.ACTION_VIEW, geolocation1);
                //intent.setData(geoLocation);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
// =============================================================================================================

        /**
         *   Button click event listener for the web info button for the second performance
         */
        btn2Web = (Button) findViewById(R.id.button2WebInfo);
        btn2Web.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 2");
                String url = "http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=view%3Devent%26eventid%3D119983549";

                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });

        /**
         *   Set up button click event listener for the calendar button for the SECOND performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but2Calendar = (Button) findViewById(R.id.button2Calendar);
        but2Calendar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Do something in response to button click
                //textViewStatus.setText("Code should set a calendar event for performance 2");

                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");

                calIntent.putExtra(CalendarContract.Events.TITLE, "Justice and U.S. Immigration Policy with Aviva Chomsky");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");

                GregorianCalendar begDate = new GregorianCalendar(2017, 3, 7, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2017, 3, 7, 21, 30);

                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                startActivity(calIntent);
            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn2Map = (Button) findViewById(R.id.button2map);
        btn2Map.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Do something in response to button click
                //textViewStatus.setText("Code should display map for performance 2");

                Uri geolocation2 = Uri.parse("geo:46.8154384,-92.1051513");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, geolocation2);
                //intent.setData(geoLocation);

                if (intent2.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                }

            }
        });
    //===============================================================================================
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn3Web = (Button) findViewById(R.id.button3WebInfo);
        btn3Web.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Do something in response to button click
                //textViewStatus.setText("Code should display website for performance 3");

                String url = "http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=view%3Devent%26eventid%3D119983599";
                Uri webpage3 = Uri.parse(url);
                Intent intent3 = new Intent(Intent.ACTION_VIEW, webpage3);
                if (intent3.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar);
        but1Calendar.setOnClickListener(new View.OnClickListener() {

            // Do something in response to button click
            public void onClick(View v) {
               // textViewStatus.setText("Code should set a calendar event for performance 3");

                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");

                calIntent.putExtra(CalendarContract.Events.TITLE, "The State of Native Nations with Karen Diver");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");

                GregorianCalendar begDate = new GregorianCalendar(2017, 3, 30, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2017, 3, 30, 21, 30);

                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());

                startActivity(calIntent);

            }
        });

        /**
         *   Set up button click event listener for the map info button for the first performance
         */
        btn3Map = (Button) findViewById(R.id.button3map);
        btn3Map.setOnClickListener(new View.OnClickListener() {

            // Do something in response to button click
            public void onClick(View v) {

                //textViewStatus.setText("Code should display map for performance 3");

                Uri geolocation3 = Uri.parse("geo:46.8154384,-92.1051513");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, geolocation3);

                //intent.setData(geoLocation);
                if (intent3.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                }
            }
        });
// =============================================================================================================
    }


}

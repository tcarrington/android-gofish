package go.fish;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DeckOfCards goFish = new DeckOfCards();
        setContentView(R.layout.activity_main);

        String longPrint0 = "";
        for(int i = 0; i < 52; i++) {
            longPrint0 += (goFish.deck[i].rank +  goFish.deck[i].suit + "-");
        }
        ((TextView)findViewById(R.id.test_field0)).setText(longPrint0);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

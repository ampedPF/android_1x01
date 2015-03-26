package es.westcod.android.tp1x01;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {

    public LinearLayout global_layout;
    public EditText editText_X;
    public EditText editText_Y;
    public EditText editText_Width;
    public EditText editText_Height;
    public GeometryLayer geom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        global_layout = (LinearLayout) findViewById(R.id.global_layout);
        editText_X = (EditText) findViewById(R.id.editText_X);
        editText_Y = (EditText) findViewById(R.id.editText_Y);
        editText_Width = (EditText) findViewById(R.id.editText_Width);
        editText_Height = (EditText) findViewById(R.id.editText_Height);
        geom = (GeometryLayer) findViewById(R.id.drawing_layer);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void resetFields(){
        editText_X.setText("0");
        editText_Y.setText("0");
        editText_Width.setText("0");
        editText_Height.setText("0");

        global_layout.requestFocus();
    }

    public void refreshFields(){
        editText_X.setText(Integer.toString(Integer.parseInt(editText_X.getText().toString())));
        editText_Y.setText(Integer.toString(Integer.parseInt(editText_Y.getText().toString())));
        editText_Width.setText(Integer.toString(Integer.parseInt(editText_Width.getText().toString())));
        editText_Height.setText(Integer.toString(Integer.parseInt(editText_Height.getText().toString())));

        global_layout.requestFocus();
    }

    public void addRectToCanvas(int X, int Y, int width, int height){
        geom.addRectToArray(new RectangleGeo(X, Y, width, height));
    }

    public void clearCanvas(){
        geom.clearArray();
    }

    public void button_Draw_onClick(View button){
        addRectToCanvas(Integer.parseInt(editText_X.getText().toString()), Integer.parseInt(editText_Y.getText().toString()), Integer.parseInt(editText_Width.getText().toString()), Integer.parseInt(editText_Height.getText().toString()));
        refreshFields();
    }

    public void button_Clear_onClick(View button){
        clearCanvas();
        resetFields();
    }

    public void button_Shape_onClick(View button){
        clearCanvas();
    }

    public void button_Color_onClick(View button){
        clearCanvas();
    }
}
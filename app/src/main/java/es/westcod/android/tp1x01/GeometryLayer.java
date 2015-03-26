package es.westcod.android.tp1x01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by ampedPF on 26/03/2015.
 */
public class GeometryLayer extends View {
    /* Member variables */
    ArrayList<RectangleGeo> mArrayList = new ArrayList<>();

    public GeometryLayer(Context context) {
        super(context);

    }

    public GeometryLayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GeometryLayer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void addRectToArray(RectangleGeo rect){
        mArrayList.add(rect);
        invalidate();
    }

    public void clearArray(){
        mArrayList.clear();
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setStyle(Paint.Style.STROKE);
        for(RectangleGeo rect : mArrayList){
            canvas.drawRect(rect.getmX(), rect.getmY(), rect.getRightBorderPosition(), rect.getBottomBorderPosition(), p);
        }
    }
}

package mx.edu.ittepic.u3e6_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo1 extends View {
    Image logo,p0,p1,p2,p3;
    public Lienzo1 (Context context){
        super(context);
        logo = new Image(R.drawable.logo,75,75,20,20,true,null,this);

    }
    @Override
    public void onDraw(Canvas c){
        Paint p = new Paint();
        logo.pintar( c,p );
        p.setTextSize(35);
        p.setColor( Color.parseColor("#01a0ca"));
        c.drawText( "okians",80,80,p);
    }
    public boolean onTouchEvent(MotionEvent e){
        return true;
    }
}

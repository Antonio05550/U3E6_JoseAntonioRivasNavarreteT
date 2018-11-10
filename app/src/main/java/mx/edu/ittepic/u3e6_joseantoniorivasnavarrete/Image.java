package mx.edu.ittepic.u3e6_joseantoniorivasnavarrete;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Image {
    private Bitmap imagen;
    private float x,y;
    private boolean visible;

    public Image(int recurso, int w, int h, float px,float py, boolean v, Lienzo l,Lienzo1 l1){
        if (l==null)
            imagen = Bitmap.createScaledBitmap( BitmapFactory.decodeResource( l1.getResources(),recurso),w,h,true );
        if (l1==null)
            imagen = Bitmap.createScaledBitmap( BitmapFactory.decodeResource( l.getResources(),recurso),w,h,true );
        x=px;
        y=py;
        visible=v;
    }
    public void pintar(Canvas c, Paint p){
        if(visible)
            c.drawBitmap( imagen,x,y,p );
    }
    public void texto(Canvas c, Paint p, String txt, int tam, int color, String pos){
        p.setTextSize( tam );
        p.setColor( color );
        p.setTextAlign(Paint.Align.CENTER);
        if (pos=="debajo")
            c.drawText( txt,x+imagen.getWidth()/2,y+imagen.getHeight()+20, p);
        if (pos=="centro")
            c.drawText( txt,x+imagen.getWidth()/2,y+imagen.getHeight()/2, p);
    }
    public boolean enArea(float px, float py) {
        if(!visible) return false;
        if (py >= y && px>=x && px<= (x + imagen.getWidth()))
            return true;
        return false;
    }
    public void mover(float px) {
        x = px - (imagen.getWidth() / 2);
    }
    public void visible(boolean v){
        visible = v;
    }

    public float getX() {
        return x;
    }
}
